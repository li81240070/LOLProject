package com.example.dllo.lolproject.fragments.more3activity;

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
 * Created by dllo on 16/6/2.
 */
public class AdapterForMore3HeroCount extends BaseAdapter{

    private Context context;
    private List<More3HeroCountBean.DataBean>data;


    public AdapterForMore3HeroCount(Context context) {
        this.context = context;
    }

    public void setData(List<More3HeroCountBean.DataBean> data) {
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



//        viewHolder viewHolder1=null;
//        if (convertView==null){
//
//
//            convertView= LayoutInflater.from(context).inflate(R.layout.more3listviewpage,parent,false);
//
//
//
//        }

        convertView=LayoutInflater.from(context).inflate(R.layout.more3listviewpage,parent,false);





        ImageView more3HandPicture;
        TextView more3Rank,more3HeroName,more3LoadPicture,more3VictoryPicture,
                more3LoadNum,more3VictoryNum;

        more3HandPicture= (ImageView) convertView.findViewById(R.id.more3HandPicture);

        more3Rank= (TextView) convertView.findViewById(R.id.more3Rank);
        more3HeroName= (TextView) convertView.findViewById(R.id.more3HeroName);
        more3LoadPicture= (TextView) convertView.findViewById(R.id.more3LoadPicture);
        more3VictoryPicture= (TextView) convertView.findViewById(R.id.more3VictoryPicture);
        more3LoadNum= (TextView) convertView.findViewById(R.id.more3LoadNum);
        more3VictoryNum= (TextView) convertView.findViewById(R.id.more3VictoryNum);




       Integer a= position+1;
      String b= a.toString();


        Picasso.with(context).load(data.get(position).getUrl()).into(more3HandPicture);
       more3HeroName.setText(data.get(position).getName());
      more3Rank.setText(b);
      more3LoadNum.setText(data.get(position).getDebut());
        more3VictoryNum.setText(data.get(position).getWin());

        float fl= Float.parseFloat(data.get(position).getDebut());
        ViewGroup.LayoutParams params=more3LoadPicture.getLayoutParams();
        params.width= (int) (params.width*(fl/5));
        more3LoadPicture.setLayoutParams(params);


        float fa= Float.parseFloat(data.get(position).getWin());
        ViewGroup.LayoutParams params2=more3VictoryPicture.getLayoutParams();
        params2.width= (int) (params2.width*(fa/60));
        more3VictoryPicture.setLayoutParams(params2);




        return convertView;





    }

//    public class viewHolder{
//
//
//
//        public  viewHolder (View itemView){
//            more3HandPicture= (ImageView) itemView.findViewById(R.id.more3HandPicture);
//
//            more3Rank= (TextView) itemView.findViewById(R.id.more3Rank);
//            more3HeroName= (TextView) itemView.findViewById(R.id.more3HeroName);
//            more3LoadPicture= (TextView) itemView.findViewById(R.id.more3LoadPicture);
//            more3VictoryPicture= (TextView) itemView.findViewById(R.id.more3VictoryPicture);
//            more3LoadNum= (TextView) itemView.findViewById(R.id.more3LoadNum);
//            more3VictoryNum= (TextView) itemView.findViewById(R.id.more3VictoryNum);
//
//
//
//        }
//
//
//    }


}
