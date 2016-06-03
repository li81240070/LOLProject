package com.example.dllo.lolproject.fragments.more6fors6;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.dllo.lolproject.R;

/**
 * Created by dllo on 16/6/3.
 */
public class More6Ferocious1Fragment extends Fragment implements View.OnClickListener {
    private TextView MoreImageView1,MoreImageView2,MoreImageView3,
            MoreImageView4,MoreImageView5,MoreImageView6,MoreImageView7,
            MoreImageView8,MoreImageView9,MoreImageView10,MoreImageView11,
            MoreImageView12,MoreImageView13,MoreImageView14;
    private RelativeLayout more6FragmentBackground1;
    int a1=0,a2=0,a3=0,a4=0,a5=0,a6=0,a7=0,a8=0,a9=0,a10=0,a11=0,a12=0,a13=0,a14=0;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.more6fragment1page,container,false);
        MoreImageView1= (TextView) view.findViewById(R.id.more6imageView01);
        MoreImageView2= (TextView) view.findViewById(R.id.more6imageView202);
        MoreImageView3= (TextView) view.findViewById(R.id.more6imageView303);
        MoreImageView4= (TextView) view.findViewById(R.id.more6imageView704);
        MoreImageView5= (TextView) view.findViewById(R.id.more6imageView405);
        MoreImageView6= (TextView) view.findViewById(R.id.more6imageView506);
        MoreImageView7= (TextView) view.findViewById(R.id.more6imageView607);
        MoreImageView8= (TextView) view.findViewById(R.id.more6imageView808);
        MoreImageView9= (TextView) view.findViewById(R.id.more6imageView909);
        MoreImageView10= (TextView) view.findViewById(R.id.more6imageView1010);
        MoreImageView11= (TextView) view.findViewById(R.id.more6imageView1111);
        MoreImageView12= (TextView) view.findViewById(R.id.more6imageView12);
        MoreImageView13= (TextView) view.findViewById(R.id.more6imageView13);
        MoreImageView14= (TextView) view.findViewById(R.id.more6imageView14);
        more6FragmentBackground1= (RelativeLayout) view.findViewById(R.id.more6FragmentBackground1);

        //设置图片
        more6FragmentBackground1.setBackgroundResource(R.mipmap.talent_page_1);

        MoreImageView1.setBackgroundResource(R.mipmap.talent_1_1_11);
        MoreImageView2.setBackgroundResource(R.mipmap.talent_1_1_21);
        MoreImageView3.setBackgroundResource(R.mipmap.talent_1_2_11);
        MoreImageView4.setBackgroundResource(R.mipmap.talent_1_2_21);
        MoreImageView5.setBackgroundResource(R.mipmap.talent_1_2_11);
        MoreImageView6.setBackgroundResource(R.mipmap.talent_1_3_11);
        MoreImageView7.setBackgroundResource(R.mipmap.talent_1_3_21);
        MoreImageView8.setBackgroundResource(R.mipmap.talent_1_4_11);
        MoreImageView9.setBackgroundResource(R.mipmap.talent_1_4_21);
        MoreImageView10.setBackgroundResource(R.mipmap.talent_1_5_11);
        MoreImageView11.setBackgroundResource(R.mipmap.talent_1_5_21);
        MoreImageView12.setBackgroundResource(R.mipmap.talent_1_6_11);
        MoreImageView13.setBackgroundResource(R.mipmap.talent_1_6_21);
        MoreImageView14.setBackgroundResource(R.mipmap.talent_1_6_31);


        MoreImageView1.setOnClickListener(this);
        MoreImageView2.setOnClickListener(this);
        MoreImageView3.setOnClickListener(this);
        MoreImageView4.setOnClickListener(this);
        MoreImageView5.setOnClickListener(this);
        MoreImageView6.setOnClickListener(this);
        MoreImageView7.setOnClickListener(this);
        MoreImageView8.setOnClickListener(this);
        MoreImageView9.setOnClickListener(this);
        MoreImageView10.setOnClickListener(this);
        MoreImageView11.setOnClickListener(this);
        MoreImageView12.setOnClickListener(this);
        MoreImageView13.setOnClickListener(this);
        MoreImageView14.setOnClickListener(this);






        return view;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.more6imageView01:
                if (a1<6){
                               a1++;

                MoreImageView1.setText(a1+"/5");}

                break;
            case R.id.more6imageView202:
                if (a2<6){
                a2++;

                MoreImageView2.setText(a2+"/5");}

                break;
            case R.id.more6imageView303:
                if (a3<6){
                a3++;

                MoreImageView3.setText(a3+"/5");}

                break;
            case R.id.more6imageView704:
                if (a4<6){
                a4++;

                MoreImageView4.setText(a4+"/5");}

                break;
            case R.id.more6imageView405:
                if (a5<6){
                a5++;

                MoreImageView5.setText(a5+"/5");}

                break;
            case R.id.more6imageView506:
                if (a6<6){
                a6++;

                MoreImageView6.setText(a6+"/5");}

                break;
            case R.id.more6imageView607:
                if (a7<6){
                a7++;

                MoreImageView7.setText(a7+"/5");}

                break;
            case R.id.more6imageView808:
                if (a8<6){
                a8++;

                MoreImageView8.setText(a8+"/5");}

                break;
            case R.id.more6imageView909:
                if (a9<6){
                a9++;

                MoreImageView9.setText(a9+"/5");}

                break;
            case R.id.more6imageView1010:
                if (a10<6){
                a10++;

                MoreImageView10.setText(a10+"/5");}

                break;
            case R.id.more6imageView1111:
                if (a11<6){
                a11++;

                MoreImageView11.setText(a11+"/5");}

                break;
            case R.id.more6imageView12:
                if (a12<6){
                a12++;

                MoreImageView12.setText(a12+"/5");}

                break;
            case R.id.more6imageView13:
                if (a13<6){
                a13++;

                MoreImageView13.setText(a13+"/5");}

                break;

            case R.id.more6imageView14:
                if (a14<6){
                a14++;

                MoreImageView14.setText(a14+"/5");}

                break;




        }

    }
}
