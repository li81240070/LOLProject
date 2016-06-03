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
public class More6Firm3Fragment extends Fragment implements View.OnClickListener {
  private TextView MoreImageView1,MoreImageView2,MoreImageView3,
            MoreImageView4,MoreImageView5,MoreImageView6,MoreImageView7,
            MoreImageView8,MoreImageView9,MoreImageView10,MoreImageView11,
            MoreImageView12,MoreImageView13;
   private RelativeLayout more6FragmentBackground2;
    int a1=0,a2=0,a3=0,a4=0,a5=0,a6=0,a7=0,a8=0,a9=0,a10=0,a11=0,a12=0,a13=0,a14=0;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.more6fragment2page,container,false);

        MoreImageView1= (TextView) view.findViewById(R.id.more6ximageView);
        MoreImageView2= (TextView) view.findViewById(R.id.more6ximageView2);
        MoreImageView3= (TextView) view.findViewById(R.id.more6ximageView3);
        MoreImageView4= (TextView) view.findViewById(R.id.more6ximageView4);
        MoreImageView5= (TextView) view.findViewById(R.id.more6ximageView5);
        MoreImageView6= (TextView) view.findViewById(R.id.more6ximageView6);
        MoreImageView7= (TextView) view.findViewById(R.id.more6ximageView7);
        MoreImageView8= (TextView) view.findViewById(R.id.more6ximageView8);
        MoreImageView9= (TextView) view.findViewById(R.id.more6ximageView9);
        MoreImageView10= (TextView) view.findViewById(R.id.more6ximageView10);
        MoreImageView11= (TextView) view.findViewById(R.id.more6ximageView11);
        MoreImageView12= (TextView) view.findViewById(R.id.more6ximageView12);
        MoreImageView13= (TextView) view.findViewById(R.id.more6ximageView13);

        more6FragmentBackground2= (RelativeLayout) view.findViewById(R.id.more6FragmentBackground2);

        //设置图片
        more6FragmentBackground2.setBackgroundResource(R.mipmap.talent_page_3);
        MoreImageView1.setBackgroundResource(R.mipmap.talent_3_1_11);
        MoreImageView2.setBackgroundResource(R.mipmap.talent_3_1_21);
        MoreImageView3.setBackgroundResource(R.mipmap.talent_3_2_11);
        MoreImageView4.setBackgroundResource(R.mipmap.talent_3_2_21);
        MoreImageView5.setBackgroundResource(R.mipmap.talent_3_3_11);
        MoreImageView6.setBackgroundResource(R.mipmap.talent_3_3_21);
        MoreImageView7.setBackgroundResource(R.mipmap.talent_3_4_11);
        MoreImageView8.setBackgroundResource(R.mipmap.talent_3_4_21);
        MoreImageView9.setBackgroundResource(R.mipmap.talent_3_5_11);
        MoreImageView10.setBackgroundResource(R.mipmap.talent_3_5_21);
        MoreImageView11.setBackgroundResource(R.mipmap.talent_3_6_11);
        MoreImageView12.setBackgroundResource(R.mipmap.talent_3_6_21);
        MoreImageView13.setBackgroundResource(R.mipmap.talent_3_6_31);

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





        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.more6ximageView:
                if (a1<6){
                    a1++;

                    MoreImageView1.setText(a1+"/5");}

                break;
            case R.id.more6ximageView2:
                if (a2<6){
                    a2++;

                    MoreImageView2.setText(a2+"/5");}

                break;
            case R.id.more6ximageView3:
                if (a3<6){
                    a3++;

                    MoreImageView3.setText(a3+"/5");}

                break;
            case R.id.more6ximageView4:
                if (a4<6){
                    a4++;

                    MoreImageView4.setText(a4+"/5");}

                break;
            case R.id.more6ximageView5:
                if (a5<6){
                    a5++;

                    MoreImageView5.setText(a5+"/5");}

                break;
            case R.id.more6ximageView6:
                if (a6<6){
                    a6++;

                    MoreImageView6.setText(a6+"/5");}

                break;
            case R.id.more6ximageView7:
                if (a7<6){
                    a7++;

                    MoreImageView7.setText(a7+"/5");}

                break;
            case R.id.more6ximageView8:
                if (a8<6){
                    a8++;

                    MoreImageView8.setText(a8+"/5");}

                break;
            case R.id.more6ximageView9:
                if (a9<6){
                    a9++;

                    MoreImageView9.setText(a9+"/5");}

                break;
            case R.id.more6ximageView10:
                if (a10<6){
                    a10++;

                    MoreImageView10.setText(a10+"/5");}

                break;
            case R.id.more6ximageView11:
                if (a11<6){
                    a11++;

                    MoreImageView11.setText(a11+"/5");}

                break;
            case R.id.more6ximageView12:
                if (a12<6){
                    a12++;

                    MoreImageView12.setText(a12+"/5");}

                break;
            case R.id.more6ximageView13:
                if (a13<6){
                    a13++;

                    MoreImageView13.setText(a13+"/5");}

                break;
        }
    }
}
