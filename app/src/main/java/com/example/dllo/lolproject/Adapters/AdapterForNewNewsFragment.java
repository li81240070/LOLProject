package com.example.dllo.lolproject.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dllo.lolproject.bean.NewNewsJsonBeans;
import com.example.dllo.lolproject.R;
import com.squareup.picasso.Picasso;

/**
 * Created by dllo on 16/5/24.
 */
public class AdapterForNewNewsFragment extends BaseAdapter{

    private Context context;
    private NewNewsJsonBeans data;


    public AdapterForNewNewsFragment(Context context) {
        this.context = context;
    }

    public Context getContext() {
        return context;
    }

    public void setData(NewNewsJsonBeans data) {
        this.data = data;
    }

    @Override
    public int getCount() {
        return data!=null&&data.getData().size()>0?data.getData().size():0;
    }

    @Override
    public Object getItem(int position) {
        return data!=null&&data.getData().size()>0?data.getData().size():0;
    }

    @Override
    public long getItemId(int position) {
        return Long.parseLong(data.getData().get(position).getId());
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        viewHolder viewHolder=null;
        if (convertView==null){

            convertView= LayoutInflater.from(context).inflate(R.layout.listviewfornewnewsfragmentpage,parent,false);
            viewHolder=new viewHolder(convertView);
            convertView.setTag(viewHolder);


        }else{
            viewHolder= (AdapterForNewNewsFragment.viewHolder) convertView.getTag();
        }

        viewHolder.newNewsListviewTitle.setText(data.getData().get(position).getTitle());
        viewHolder.newNewsListviewDisc.setText(data.getData().get(position).getDesc());

        if (data.getData().get(position).getPic_url()!=""){
            Picasso.with(context).load(data.getData().get(position).getPic_url()).into(viewHolder.newNewsListviewPicture);


        }else {viewHolder.newNewsListviewPicture.setVisibility(View.GONE);}



    return convertView;

    }

    public class viewHolder{

        TextView newNewsListviewTitle,newNewsListviewDisc;
        ImageView newNewsListviewPicture;

        public  viewHolder(View itemView){
            newNewsListviewPicture= (ImageView) itemView.findViewById(R.id.newNewsListviewPicture);
            newNewsListviewTitle= (TextView) itemView.findViewById(R.id.newNewsListviewTitle);
            newNewsListviewDisc= (TextView) itemView.findViewById(R.id.newNewsListviewDisc);

        }



    }
}
