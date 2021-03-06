package com.example.dllo.lolproject.fragments.more10activity;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.dllo.lolproject.R;

import java.io.IOException;
import java.util.List;

/**
 * Created by dllo on 16/6/2.
 */
public class AdapterForMore10Music extends BaseAdapter{

    private Context context;
    private List<More10MusicBean.DataBean>data;


    public AdapterForMore10Music(Context context) {
        this.context = context;
    }

    public void setData(List<More10MusicBean.DataBean> data) {
        this.data = data;

        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return data != null && data.size() > 0 ? data.size() : 0;
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
    public View getView(final int position, View convertView, ViewGroup parent) {

        viewHolder viewHolder1=null;
        if (convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.more10listviewpage,parent,false);

            viewHolder1=new viewHolder(convertView);
            convertView.setTag(viewHolder1);


        }else{
            viewHolder1= (viewHolder) convertView.getTag();


        }

        viewHolder1.more10Title.setText(data.get(position).getName());
        viewHolder1.palyMp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = new MediaPlayer();
                try {
                    mp.setDataSource(data.get(position).getPath_url());
                    mp.prepare();
                    mp.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener(){

                    @Override

                    public void onCompletion(MediaPlayer mp) {

                        mp.release();

                    }

                });

            }


        });

        return convertView;


    }







    public class viewHolder{

        TextView more10Title;
        Button palyMp3;

        public viewHolder(View itemView){

            more10Title= (TextView) itemView.findViewById(R.id.more10Title);
            palyMp3= (Button) itemView.findViewById(R.id.palyMp3);

        }

    }
}
