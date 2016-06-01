package com.example.dllo.lolproject.fragments.more2fragment;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dllo.lolproject.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by dllo on 16/6/1.
 */
public class AdapterForMore2MatchListview extends BaseAdapter{

    private Context context;
    private List<More2MatchBean.DataBean.MatchBean> data;



    @Override
    public int getCount() {
        return data!=null&&data.size()>0?data.size():0;
    }

    public void setData(List<More2MatchBean.DataBean.MatchBean> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    public AdapterForMore2MatchListview(Context context) {
        this.context = context;
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

            convertView= LayoutInflater.from(context).inflate(R.layout.grandsonmore2listview,parent,false);



            viewHolder1=new viewHolder(convertView);
            convertView.setTag(viewHolder1);


        }else{

            viewHolder1= (viewHolder) convertView.getTag();
        }
        Picasso.with(context).load(data.get(position).getTeams().get(0).getLogo()).into(viewHolder1.grandsonMore2Team1Picture);
        Picasso.with(context).load(data.get(position).getTeams().get(1).getLogo()).into(viewHolder1.grandsonMore2Team2Picture);
        viewHolder1.grandsonMore2MatchName.setText(data.get(position).getCompetitions().getName());
        viewHolder1.grandsonMore2Team1Name.setText(data.get(position).getTeams().get(0).getName());
        viewHolder1.grandsonMore2Team2Name.setText(data.get(position).getTeams().get(1).getName());
        viewHolder1.grandsonMore2Team1Score.setText(data.get(position).getTeams().get(0).getScore());
        viewHolder1.grandsonMore2Team2Score.setText(data.get(position).getTeams().get(1).getScore());
        if (data.get(position).getTeams().get(0).getScore()!=data.get(position).getTeams().get(1).getScore()){
            viewHolder1.grandsonMore2state.setText("已结束");
        }else{
            viewHolder1.grandsonMore2state.setText("未开始");
        }
        viewHolder1.grandsonMore2MatchTime.setText(data.get(position).getTime());
        viewHolder1.grandsonMore2Comment.setText(data.get(position).getComments());
        viewHolder1.grandsonMore2MatchStyle.setText(data.get(position).getDesc());







            return convertView;



    }

    public class viewHolder{

        ImageView grandsonMore2Team1Picture,grandsonMore2Team2Picture;
        TextView grandsonMore2MatchName,grandsonMore2Team1Name,grandsonMore2Team1Score,
                grandsonMore2state,grandsonMore2MatchTime,grandsonMore2Comment,
                grandsonMore2Team2Name,grandsonMore2Team2Score,grandsonMore2MatchStyle;


        public viewHolder(View itemView){
            grandsonMore2Team1Picture= (ImageView) itemView.findViewById(R.id.grandsonMore2Team1Picture);
            grandsonMore2Team2Picture= (ImageView) itemView.findViewById(R.id.grandsonMore2Team2Picture);
            grandsonMore2MatchName= (TextView) itemView.findViewById(R.id.grandsonMore2MatchName);
            grandsonMore2Team1Name= (TextView) itemView.findViewById(R.id.grandsonMore2Team1Name);
            grandsonMore2Team1Score= (TextView) itemView.findViewById(R.id.grandsonMore2Team1Score);
            grandsonMore2state= (TextView) itemView.findViewById(R.id.grandsonMore2state);
            grandsonMore2MatchTime= (TextView) itemView.findViewById(R.id.grandsonMore2MatchTime);
            grandsonMore2Comment= (TextView) itemView.findViewById(R.id.grandsonMore2Comment);
            grandsonMore2Team2Score= (TextView) itemView.findViewById(R.id.grandsonMore2Team2Score);
            grandsonMore2Team2Name= (TextView) itemView.findViewById(R.id.grandsonMore2Team2Name);
            grandsonMore2MatchStyle= (TextView) itemView.findViewById(R.id.grandsonMore2MatchStyle);






        }
    }






}
