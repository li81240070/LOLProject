package com.example.dllo.lolproject.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dllo.lolproject.R;
import com.example.dllo.lolproject.bean.FindFriendBean;
import com.example.dllo.lolproject.interfaces.FindFriend;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by dllo on 16/5/30.
 */
public class AdapterForFindFriend extends BaseAdapter{
    private List<FindFriendBean.DataBean>data;
    private Context context;

    public AdapterForFindFriend(Context context) {
        this.context = context;
    }


    public void setData(List<FindFriendBean.DataBean> data) {
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


        viewHolder viewHolder=null;
        if (convertView==null){

            convertView= LayoutInflater.from(context).inflate(R.layout.findfriendlistviewpage,parent,false);
            viewHolder=new viewHolder(convertView);
            convertView.setTag(viewHolder);

        }else{

            viewHolder= (AdapterForFindFriend.viewHolder) convertView.getTag();


        }
        viewHolder.findFriendBB.setText(data.get(position).getSlogan());
        viewHolder.findFriendName.setText(data.get(position).getSummoner());
        viewHolder.findFriendTime.setText(data.get(position).getCreated());
        viewHolder.findFriendWhere.setText(data.get(position).getArea());
        viewHolder.findFriendFight.setText(data.get(position).getZdl());
        viewHolder.findFriendLanguage.setText(data.get(position).getEnable_voice());
        viewHolder.findFriendCity.setText(data.get(position).getCity());
        Picasso.with(context).load(data.get(position).getAvatar()).into(viewHolder.findFriendPicture);

        return convertView;




    }




    public class viewHolder{

        ImageView findFriendPicture,findFriendSex;
        TextView findFriendName,findFriendTime,findFriendWhere,findFriendFight,findFriendLanguage,
                findFriendCity,findFriendBB;


        public viewHolder(View itemView){
            findFriendPicture= (ImageView) itemView.findViewById(R.id.findFriendPicture);
            findFriendSex= (ImageView) itemView.findViewById(R.id.findFriendSex);
            findFriendTime= (TextView) itemView.findViewById(R.id.findFriendTime);
            findFriendWhere= (TextView) itemView.findViewById(R.id.findFriendWhere);
            findFriendFight= (TextView) itemView.findViewById(R.id.findFriendFight);
            findFriendLanguage= (TextView) itemView.findViewById(R.id.findFriendLanguage);
            findFriendCity= (TextView) itemView.findViewById(R.id.findFriendCity);
            findFriendBB= (TextView) itemView.findViewById(R.id.findFriendBB);
            findFriendName= (TextView) itemView.findViewById(R.id.findFriendName);



        }



    }
}
