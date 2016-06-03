package com.example.dllo.lolproject.fragments.more8activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dllo.lolproject.R;

/**
 * Created by dllo on 16/6/3.
 */
public class More8SkillsDetails extends Activity{
    private TextView more8DetilsName,more8DetilsDesc;
    private ImageView more8DetilsPicture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.more8detils);
        more8DetilsName= (TextView) findViewById(R.id.more8DetilsName);
        more8DetilsDesc= (TextView) findViewById(R.id.more8DetilsDesc);
        more8DetilsPicture= (ImageView) findViewById(R.id.more8DetilsPicture);



Intent intent=getIntent();
    int a= Integer.parseInt(intent.getStringExtra("more8detials"));

        switch (a){

            case 0:
                more8DetilsName.setText("屏障");
                more8DetilsDesc.setText("为你的英雄套上护盾，吸收115-455（取决于英雄等级）点伤害，持续2秒。");
                more8DetilsPicture.setImageResource(R.mipmap.more81);



                break;
            case 1:
                more8DetilsName.setText("净化");
                more8DetilsDesc.setText("移除身上的所有限制效果和召唤师技能的减益效果，并且若在接下来的3秒里再次被施加限制效果时，新效果的持续时间会减少65%。");
                more8DetilsPicture.setImageResource(R.mipmap.more82);


                break;
            case 2:
                more8DetilsName.setText("洞察");
                more8DetilsDesc.setText("将地图上任意一块区域暴露给你的队伍，持续5秒。");
                more8DetilsPicture.setImageResource(R.mipmap.more83);


                break;
            case 3:
                more8DetilsName.setText("引燃");
                more8DetilsDesc.setText("引燃是对单体敌方目标施放的持续性伤害技能，在5秒的持续时间里造成70-410（取决于英雄等级）真实伤害，获得目标的视野，并减少目标所受的治疗和回复效果。");
                more8DetilsPicture.setImageResource(R.mipmap.more84);


                break;
            case 4:
                more8DetilsName.setText("虚弱");
                more8DetilsDesc.setText("虚弱目标敌方英雄，降低目标英雄30%的移动速度和攻击速度，以及10护甲与魔法抗性，并且他们所造成的伤害减少40%，持续2.5秒。");
                more8DetilsPicture.setImageResource(R.mipmap.more85);


                break;
            case 5:
                more8DetilsName.setText("闪现");
                more8DetilsDesc.setText("使英雄朝着你的指针所停的区域瞬间传送一小段距离。");
                more8DetilsPicture.setImageResource(R.mipmap.more86);


                break;
            case 6:
                more8DetilsName.setText("幽灵疾步");
                more8DetilsDesc.setText("你的英雄在移动时会无视单位的碰撞体积，移动速度增加27%，持续10秒。");
                more8DetilsPicture.setImageResource(R.mipmap.more87);


                break;
            case 7:
                more8DetilsName.setText("治疗术");
                more8DetilsDesc.setText("为你和目标友军英雄回复95-345（取决于英雄等级）生命值，并为你和目标友军英雄提供30%移动速度加成，持续1秒。若目标近期已受到过其它治疗术的影响，则治疗术对目标产生的治疗效果减半。");
                more8DetilsPicture.setImageResource(R.mipmap.more88);


                break;
            case 8:
                more8DetilsName.setText("清晰术");
                more8DetilsDesc.setText("为你的英雄和周围的友军回复40%的最大法力值。");
                more8DetilsPicture.setImageResource(R.mipmap.more89);


                break;
            case 9:
                more8DetilsName.setText("卫戍部队");
                more8DetilsDesc.setText("我方防御塔：回复速度得到巨幅提高，持续8秒。敌方防御塔：减少80%的攻击力，持续8秒。");
                more8DetilsPicture.setImageResource(R.mipmap.more810);


                break;
            case 10:
                more8DetilsName.setText("护驾！");
                more8DetilsDesc.setText("快速位移到魄罗之王旁边。");
                more8DetilsPicture.setImageResource(R.mipmap.more811);


                break;




            case 11:
                more8DetilsName.setText("魄罗投掷");
                more8DetilsDesc.setText("把一个魄罗投向你的敌人。如果它命中了一名敌人，那么你接下来就可以快速位移到被命中的敌人旁边。");
                more8DetilsPicture.setImageResource(R.mipmap.more812);


                break;
            case 12:
                more8DetilsName.setText("惩戒");
                more8DetilsDesc.setText("对目标史诗野怪、大型野怪或敌方小兵造成390-1000（取决于英雄等级）点真实伤害。");
                more8DetilsPicture.setImageResource(R.mipmap.more813);


                break;
            case 13:
                more8DetilsName.setText("标记");
                more8DetilsDesc.setText("沿直线扔出一个雪球。如果雪球命中了一个敌人，那么这个敌人会被【标记】，并且你的英雄接下来可以快速突进到被【标记】的目标旁边。");
                more8DetilsPicture.setImageResource(R.mipmap.more814);


                break;
            case 14:
                more8DetilsName.setText("传送");
                more8DetilsDesc.setText("在引导3.5秒后，将英雄传送到友方建筑物、小兵或守卫旁边。");
                more8DetilsPicture.setImageResource(R.mipmap.more815);


                break;




        }


    }
}
