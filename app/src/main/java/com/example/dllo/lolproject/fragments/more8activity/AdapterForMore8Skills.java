package com.example.dllo.lolproject.fragments.more8activity;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.dllo.lolproject.R;
import com.example.dllo.lolproject.thesecondflor.MoreViewActivity;
import com.example.dllo.lolproject.tools.MyAPP;

import java.util.List;

/**
 * Created by dllo on 16/6/3.
 */
public class AdapterForMore8Skills extends RecyclerView.Adapter<AdapterForMore8Skills.myViewHolder>{

    private Context context;
    private List<Integer> data;


    public AdapterForMore8Skills(Context context) {
        this.context = context;
    }

    public void setData(List data) {
        this.data = data;
        notifyDataSetChanged();
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView= LayoutInflater.from(context).inflate(R.layout.more8skillslistviewpage,parent,false);
        myViewHolder myViewHolder=new myViewHolder(itemView);

        return  myViewHolder;



    }

    @Override
    public void onBindViewHolder(myViewHolder holder, final int position) {
        holder.more8SkillsRecyclerviewPicture.setImageResource(data.get(position));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             Intent intent=new Intent();
                intent.putExtra("more8detials",position+"");
                intent.setClass(context,More8SkillsDetails.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);


            }
        });


    }

    @Override
    public int getItemCount() {
        return data!=null&&data.size()>0?data.size():0;
    }

    class myViewHolder extends RecyclerView.ViewHolder{

    ImageView more8SkillsRecyclerviewPicture;


    public myViewHolder(View itemView) {
        super(itemView);

        more8SkillsRecyclerviewPicture= (ImageView) itemView.findViewById(R.id.more8SkillsRecyclerviewPicture);



    }
}

}
