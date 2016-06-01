package com.example.dllo.lolproject.fragments.more2fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.dllo.lolproject.R;

import java.util.List;

/**
 * Created by dllo on 16/6/1.
 */
public class AdapterForImportantNews extends BaseAdapter{
    private List<ImportantNewsBean.DataBean>data;
    private Context context;

    public AdapterForImportantNews(Context context) {
        this.context = context;
    }


    public void setData(List<ImportantNewsBean.DataBean> data) {
        this.data = data;
    }

    @Override
    public int getCount() {
        return data!=null&&data.size()>0?data.size():0;
    }

    @Override
    public Object getItem(int position) {
        return data!=null&&data.size()>0?data.get(position):0;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       viewHolder viewHolder1=null;
        if (convertView==null){

            convertView= LayoutInflater.from(context).inflate(R.layout.importantnewlistview,parent,false);
            viewHolder1=new viewHolder(convertView);
            convertView.setTag(viewHolder1);


        }else{

            viewHolder1= (viewHolder) convertView.getTag();


        }

        viewHolder1.importantNewsTitle.setText(data.get(position).getTitle());
        viewHolder1.importantNewsDesc.setText(data.get(position).getDesc());

        return convertView;
    }


    public  class  viewHolder{

        TextView importantNewsTitle,importantNewsDesc;



        public  viewHolder(View itemView){

            importantNewsTitle= (TextView) itemView.findViewById(R.id.importantNewsTitle);
            importantNewsDesc= (TextView) itemView.findViewById(R.id.importantNewsDesc);




        }

    }




}
