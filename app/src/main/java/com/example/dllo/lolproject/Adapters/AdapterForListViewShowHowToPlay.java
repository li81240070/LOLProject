package com.example.dllo.lolproject.adapters;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dllo.lolproject.R;
import com.example.dllo.lolproject.bean.ShowHowToPlayBean;

import java.util.List;

/**
 * Created by dllo on 16/5/30.
 */


public class AdapterForListViewShowHowToPlay extends BaseAdapter{
private List<ShowHowToPlayBean.DataBean>data;
    private Context context;


    public AdapterForListViewShowHowToPlay(Context context) {
        this.context = context;
    }

    public void setData(List<ShowHowToPlayBean.DataBean> data) {
        this.data = data;
    }

    @Override
    public int getCount() {
        return data!=null&&data.size()>0?data.size():0;
    }

    @Override
    public Object getItem(int position) {
        return data != null && data.size() > 0 ? data.get(position) : 0;
    }


        @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        viewHolder viewHolder=null;
        if (convertView==null){

            convertView= LayoutInflater.from(context).inflate(R.layout.listviewforshowhowtoplay,parent,false);
            viewHolder=new viewHolder(convertView);
            convertView.setTag(viewHolder);

        }else{

            viewHolder= (AdapterForListViewShowHowToPlay.viewHolder) convertView.getTag();



        }
        viewHolder.showHowToPlayListviewName.setText("发布者:"+data.get(position).getSummoner());
        viewHolder.showHowToPlayListviewTitle.setText(data.get(position).getTitle());
        viewHolder.showHowToPlayListviewStyle.setText(data.get(position).getMap());
        viewHolder.showHowToPlayListviewWho.setText(data.get(position).getArea());

        return convertView;

    }



    public  class  viewHolder{
        ImageView showHowToPlayListviewPicture,showHowToPlayimage1,showHowToPlayimage2,showHowToPlayimage3,
                showHowToPlayimage4,showHowToPlayimage5,showHowToPlayimage6;
        TextView showHowToPlayListviewName,showHowToPlayListviewTitle,showHowToPlayListviewStyle,showHowToPlayListviewWho;

        public  viewHolder(View itemView){

            showHowToPlayListviewPicture= (ImageView) itemView.findViewById(R.id.showHowToPlayListviewPicture);
            showHowToPlayimage1= (ImageView) itemView.findViewById(R.id.showHowToPlayimage1);
            showHowToPlayimage2= (ImageView) itemView.findViewById(R.id.showHowToPlayimage2);
            showHowToPlayimage3= (ImageView) itemView.findViewById(R.id.showHowToPlayimage3);
            showHowToPlayimage4= (ImageView) itemView.findViewById(R.id.showHowToPlayimage4);
            showHowToPlayimage5= (ImageView) itemView.findViewById(R.id.showHowToPlayimage5);
            showHowToPlayimage6= (ImageView) itemView.findViewById(R.id.showHowToPlayimage6);
            showHowToPlayListviewName= (TextView) itemView.findViewById(R.id.showHowToPlayListviewName);
            showHowToPlayListviewTitle= (TextView) itemView.findViewById(R.id.showHowToPlayListviewTitle);
            showHowToPlayListviewStyle= (TextView) itemView.findViewById(R.id.showHowToPlayListviewStyle);
            showHowToPlayListviewWho= (TextView) itemView.findViewById(R.id.showHowToPlayListviewWho);




        }

    }


}
