package com.example.dllo.lolproject.bean;

import java.util.List;

/**
 * Created by dllo on 16/5/26.
 */
public class AllHeroBean {


    /**
     * data : [{"role_id":"9","name":"傲之追猎者","url":"http://pic.woqugame.com/lol/roles/Rengar.jpg","debut":"4.10","win":"48.40"},{"role_id":"14","name":"诺克萨斯之手","url":"http://pic.woqugame.com/lol/roles/Darius.jpg","debut":"3.75","win":"49.38"},{"role_id":"37","name":"琴瑟仙女","url":"http://pic.woqugame.com/lol/roles/Sona.jpg","debut":"3.40","win":"53.30"},{"role_id":"73","name":"无极剑圣","url":"http://pic.woqugame.com/lol/roles/yi.jpg","debut":"3.39","win":"50.94"},{"role_id":"122","name":"复仇之矛","url":"http://pic.woqugame.com/lol/roles/Kalista.jpg","debut":"3.27","win":"46.94"},{"role_id":"69","name":"寒冰射手","url":"http://pic.woqugame.com/lol/roles/Ashe.jpg","debut":"3.14","win":"52.85"},{"role_id":"117","name":"疾风剑豪","url":"http://pic.woqugame.com/lol/roles/Yasuo.jpg","debut":"3.09","win":"50.69"},{"role_id":"50","name":"盲僧","url":"http://pic.woqugame.com/lol/roles/Leesin.jpg","debut":"2.78","win":"48.85"},{"role_id":"76","name":"蒸汽机器人","url":"http://pic.woqugame.com/lol/roles/Blitzcrank.jpg","debut":"2.77","win":"52.39"},{"role_id":"53","name":"暗夜猎手","url":"http://pic.woqugame.com/lol/roles/Vayne.jpg","debut":"2.64","win":"51.55"},{"role_id":"68","name":"迅捷斥候","url":"http://pic.woqugame.com/lol/roles/Teemo.jpg","debut":"2.59","win":"51.21"},{"role_id":"5","name":"影流之主","url":"http://pic.woqugame.com/lol/roles/Zed.jpg","debut":"2.47","win":"50.19"},{"role_id":"39","name":"光辉女郎","url":"http://pic.woqugame.com/lol/roles/Lux.jpg","debut":"2.37","win":"50.05"},{"role_id":"113","name":"冰霜女巫","url":"http://pic.woqugame.com/lol/roles/Lissandra.jpg","debut":"2.30","win":"50.08"},{"role_id":"2","name":"魂锁典狱长","url":"http://pic.woqugame.com/lol/roles/Thresh.jpg","debut":"2.26","win":"50.68"},{"role_id":"101","name":"探险家","url":"http://pic.woqugame.com/lol/roles/Ezreal.jpg","debut":"2.25","win":"51.34"},{"role_id":"90","name":"瘟疫之源","url":"http://pic.woqugame.com/lol/roles/Twitch.jpg","debut":"2.20","win":"47.98"},{"role_id":"116","name":"暴走萝莉","url":"http://pic.woqugame.com/lol/roles/Jinx.jpg","debut":"2.18","win":"54.08"},{"role_id":"95","name":"德玛西亚之力","url":"http://pic.woqugame.com/lol/roles/Garen.jpg","debut":"2.16","win":"52.03"},{"role_id":"36","name":"不祥之刃","url":"http://pic.woqugame.com/lol/roles/Katarina.jpg","debut":"2.08","win":"52.10"},{"role_id":"45","name":"荒漠屠夫","url":"http://pic.woqugame.com/lol/roles/Renekton.jpg","debut":"1.96","win":"50.75"},{"role_id":"77","name":"众星之子","url":"http://pic.woqugame.com/lol/roles/Soraka.jpg","debut":"1.92","win":"54.65"},{"role_id":"126","name":"河流之王","url":"http://pic.woqugame.com/lol/roles/Tamm.jpg","debut":"1.89","win":"49.66"},{"role_id":"112","name":"生化魔人","url":"http://pic.woqugame.com/lol/roles/Zac.jpg","debut":"1.82","win":"49.90"},{"role_id":"80","name":"堕落天使","url":"http://pic.woqugame.com/lol/roles/Morgana.jpg","debut":"1.80","win":"51.91"},{"role_id":"12","name":"未来守护者","url":"http://pic.woqugame.com/lol/roles/Jayce.jpg","debut":"1.79","win":"50.36"},{"role_id":"70","name":"黑暗之女","url":"http://pic.woqugame.com/lol/roles/Annie.jpg","debut":"1.76","win":"50.91"},{"role_id":"111","name":"赏金猎人","url":"http://pic.woqugame.com/lol/roles/Missfortune.jpg","debut":"1.76","win":"50.87"},{"role_id":"115","name":"圣枪游侠","url":"http://pic.woqugame.com/lol/roles/Lucian.jpg","debut":"1.69","win":"50.25"},{"role_id":"72","name":"武器大师","url":"http://pic.woqugame.com/lol/roles/Jax.jpg","debut":"1.60","win":"51.44"},{"role_id":"71","name":"麦林炮手","url":"http://pic.woqugame.com/lol/roles/Tristana.jpg","debut":"1.51","win":"50.43"},{"role_id":"105","name":"圣锤之毅","url":"http://pic.woqugame.com/lol/roles/poppy.jpg","debut":"1.48","win":"52.48"},{"role_id":"44","name":"皮城女警","url":"http://pic.woqugame.com/lol/roles/Caitlyn.jpg","debut":"1.45","win":"49.02"},{"role_id":"107","name":"德邦总管","url":"http://pic.woqugame.com/lol/roles/Xinzhao.jpg","debut":"1.42","win":"54.04"},{"role_id":"75","name":"牛头酋长","url":"http://pic.woqugame.com/lol/roles/Alistar.jpg","debut":"1.38","win":"49.36"},{"role_id":"33","name":"曙光女神","url":"http://pic.woqugame.com/lol/roles/Leona.jpg","debut":"1.31","win":"55.05"},{"role_id":"40","name":"诡术妖姬","url":"http://pic.woqugame.com/lol/roles/Leblanc.jpg","debut":"1.29","win":"49.03"},{"role_id":"29","name":"放逐之刃","url":"http://pic.woqugame.com/lol/roles/Riven.jpg","debut":"1.25","win":"51.28"},{"role_id":"60","name":"蛮族之王","url":"http://pic.woqugame.com/lol/roles/Tryndamere.jpg","debut":"1.24","win":"55.27"},{"role_id":"78","name":"沙漠死神","url":"http://pic.woqugame.com/lol/roles/Nasus.jpg","debut":"1.16","win":"53.92"},{"role_id":"87","name":"卡牌大师","url":"http://pic.woqugame.com/lol/roles/Twisted.jpg","debut":"1.15","win":"52.37"},{"role_id":"63","name":"熔岩巨兽","url":"http://pic.woqugame.com/lol/roles/Malphite.jpg","debut":"1.15","win":"52.47"},{"role_id":"64","name":"战争女神","url":"http://pic.woqugame.com/lol/roles/Sivir.jpg","debut":"1.11","win":"53.68"},{"role_id":"91","name":"恶魔小丑","url":"http://pic.woqugame.com/lol/roles/Shaco.jpg","debut":"1.10","win":"46.62"},{"role_id":"7","name":"虚空掠夺者","url":"http://pic.woqugame.com/lol/roles/Khazix.jpg","debut":"1.10","win":"48.49"},{"role_id":"26","name":"法外狂徒","url":"http://pic.woqugame.com/lol/roles/Graves.jpg","debut":"1.07","win":"52.71"},{"role_id":"25","name":"潮汐海灵","url":"http://pic.woqugame.com/lol/roles/Fizz.jpg","debut":"1.04","win":"51.65"},{"role_id":"100","name":"狂野女猎手","url":"http://pic.woqugame.com/lol/roles/Nidalee.jpg","debut":"1.04","win":"48.74"},{"role_id":"15","name":"惩戒之箭","url":"http://pic.woqugame.com/lol/roles/Varus.jpg","debut":"1.03","win":"55.43"},{"role_id":"23","name":"九尾妖狐","url":"http://pic.woqugame.com/lol/roles/Ahri.jpg","debut":"0.98","win":"53.94"},{"role_id":"24","name":"雷霆咆哮","url":"http://pic.woqugame.com/lol/roles/Volibear.jpg","debut":"0.97","win":"55.89"},{"role_id":"79","name":"嗜血猎手","url":"http://pic.woqugame.com/lol/roles/Warick.jpg","debut":"0.96","win":"51.35"},{"role_id":"125","name":"时间刺客","url":"http://pic.woqugame.com/lol/roles/Ekko.jpg","debut":"0.96","win":"48.95"},{"role_id":"119","name":"弗雷尔卓德之心","url":"http://pic.woqugame.com/lol/roles/Braum.jpg","debut":"0.86","win":"54.29"},{"role_id":"94","name":"兽灵行者","url":"http://pic.woqugame.com/lol/roles/Udyr.jpg","debut":"0.85","win":"51.12"},{"role_id":"104","name":"战争之王","url":"http://pic.woqugame.com/lol/roles/Pantheon.jpg","debut":"0.85","win":"49.51"},{"role_id":"58","name":"邪恶小法师","url":"http://pic.woqugame.com/lol/roles/Veigar.jpg","debut":"0.79","win":"47.68"},{"role_id":"19","name":"深海泰坦","url":"http://pic.woqugame.com/lol/roles/Nautilus.jpg","debut":"0.76","win":"51.72"},{"role_id":"66","name":"审判天使","url":"http://pic.woqugame.com/lol/roles/Kayle.jpg","debut":"0.74","win":"51.53"},{"role_id":"93","name":"暗影之拳","url":"http://pic.woqugame.com/lol/roles/Akali.jpg","debut":"0.72","win":"51.63"},{"role_id":"13","name":"荣耀行刑官","url":"http://pic.woqugame.com/lol/roles/Draven.jpg","debut":"0.70","win":"52.77"},{"role_id":"51","name":"复仇焰魂","url":"http://pic.woqugame.com/lol/roles/Brand.jpg","debut":"0.69","win":"55.86"},{"role_id":"57","name":"殇之木乃伊","url":"http://pic.woqugame.com/lol/roles/Amumu.jpg","debut":"0.69","win":"53.16"},{"role_id":"55","name":"虚空恐惧","url":"http://pic.woqugame.com/lol/roles/Chagath.jpg","debut":"0.69","win":"50.26"},{"role_id":"106","name":"暮光之眼","url":"http://pic.woqugame.com/lol/roles/Shen.jpg","debut":"0.68","win":"52.97"},{"role_id":"27","name":"龙血武姬","url":"http://pic.woqugame.com/lol/roles/Shyvana.jpg","debut":"0.67","win":"51.33"},{"role_id":"124","name":"星界游神","url":"http://pic.woqugame.com/lol/roles/Bard.jpg","debut":"0.65","win":"45.62"},{"role_id":"102","name":"酒桶","url":"http://pic.woqugame.com/lol/roles/Gragas.jpg","debut":"0.64","win":"50.84"},{"role_id":"61","name":"祖安狂人","url":"http://pic.woqugame.com/lol/roles/Mundo.jpg","debut":"0.63","win":"54.10"},{"role_id":"17","name":"仙灵女巫","url":"http://pic.woqugame.com/lol/roles/Lulu.jpg","debut":"0.62","win":"44.66"},{"role_id":"10","name":"皎月女神","url":"http://pic.woqugame.com/lol/roles/Diana.jpg","debut":"0.61","win":"54.55"},{"role_id":"4","name":"唤潮鲛姬","url":"http://pic.woqugame.com/lol/roles/Nami.jpg","debut":"0.61","win":"53.89"},{"role_id":"35","name":"流浪法师","url":"http://pic.woqugame.com/lol/roles/Ryze.jpg","debut":"0.60","win":"46.76"},{"role_id":"18","name":"无双剑姬","url":"http://pic.woqugame.com/lol/roles/Fiora.jpg","debut":"0.60","win":"44.14"},{"role_id":"114","name":"暗裔剑魔","url":"http://pic.woqugame.com/lol/roles/Aatrox.jpg","debut":"0.59","win":"52.30"},{"role_id":"46","name":"天启者","url":"http://pic.woqugame.com/lol/roles/Karma.jpg","debut":"0.58","win":"48.48"},{"role_id":"85","name":"风暴之怒","url":"http://pic.woqugame.com/lol/roles/Janna.jpg","debut":"0.58","win":"51.33"},{"role_id":"92","name":"大发明家","url":"http://pic.woqugame.com/lol/roles/Haimdinger.jpg","debut":"0.57","win":"51.56"},{"role_id":"3","name":"皮城执法官","url":"http://pic.woqugame.com/lol/roles/Vi.jpg","debut":"0.57","win":"51.35"},{"role_id":"32","name":"齐天大圣","url":"http://pic.woqugame.com/lol/roles/Monkeyking.jpg","debut":"0.56","win":"51.78"},{"role_id":"83","name":"亡灵战神","url":"http://pic.woqugame.com/lol/roles/Sion.jpg","debut":"0.53","win":"53.78"},{"role_id":"30","name":"刀锋之影","url":"http://pic.woqugame.com/lol/roles/Talon.jpg","debut":"0.53","win":"52.80"},{"role_id":"74","name":"英勇投弹手","url":"http://pic.woqugame.com/lol/roles/Corki.jpg","debut":"0.53","win":"48.78"},{"role_id":"81","name":"披甲龙龟","url":"http://pic.woqugame.com/lol/roles/Rammus.jpg","debut":"0.50","win":"51.07"},{"role_id":"1","name":"德玛西亚之翼","url":"http://pic.woqugame.com/lol/roles/QuinnandValor.jpg","debut":"0.49","win":"50.96"},{"role_id":"48","name":"德玛西亚皇子","url":"http://pic.woqugame.com/lol/roles/Jarvan.jpg","debut":"0.49","win":"53.24"},{"role_id":"108","name":"猩红收割者","url":"http://pic.woqugame.com/lol/roles/Vladimir.jpg","debut":"0.48","win":"53.03"},{"role_id":"121","name":"沙漠皇帝","url":"http://pic.woqugame.com/lol/roles/Azir.jpg","debut":"0.48","win":"44.31"},{"role_id":"65","name":"末日使者","url":"http://pic.woqugame.com/lol/roles/Fiddlesticks.jpg","debut":"0.47","win":"51.91"},{"role_id":"62","name":"海洋之灾","url":"http://pic.woqugame.com/lol/roles/Gangplank.jpg","debut":"0.47","win":"54.45"},{"role_id":"97","name":"深渊巨口","url":"http://pic.woqugame.com/lol/roles/Kogmaw.jpg","debut":"0.47","win":"52.38"},{"role_id":"120","name":"迷失之牙","url":"http://pic.woqugame.com/lol/roles/Gnar.jpg","debut":"0.47","win":"52.00"},{"role_id":"118","name":"虚空之眼","url":"http://pic.woqugame.com/lol/roles/Velkoz.jpg","debut":"0.43","win":"52.89"},{"role_id":"54","name":"发条魔灵","url":"http://pic.woqugame.com/lol/roles/Oriana.jpg","debut":"0.43","win":"49.86"},{"role_id":"84","name":"瓦洛兰之盾","url":"http://pic.woqugame.com/lol/roles/Taric.jpg","debut":"0.40","win":"51.93"},{"role_id":"103","name":"狂战士","url":"http://pic.woqugame.com/lol/roles/Olaf.jpg","debut":"0.39","win":"41.77"},{"role_id":"56","name":"雪人骑士","url":"http://pic.woqugame.com/lol/roles/Nunu.jpg","debut":"0.36","win":"39.00"},{"role_id":"42","name":"巨魔之王","url":"http://pic.woqugame.com/lol/roles/Trundle.jpg","debut":"0.36","win":"48.34"},{"role_id":"98","name":"虚空先知","url":"http://pic.woqugame.com/lol/roles/Malzahar.jpg","debut":"0.34","win":"57.93"},{"role_id":"49","name":"永恒梦魇","url":"http://pic.woqugame.com/lol/roles/Nocturne.jpg","debut":"0.34","win":"49.83"},{"role_id":"86","name":"时光守护者","url":"http://pic.woqugame.com/lol/roles/Zilean.jpg","debut":"0.34","win":"48.10"},{"role_id":"6","name":"蜘蛛女皇","url":"http://pic.woqugame.com/lol/roles/Elise.jpg","debut":"0.33","win":"54.45"},{"role_id":"16","name":"战争之影","url":"http://pic.woqugame.com/lol/roles/Hecarim.jpg","debut":"0.32","win":"51.87"},{"role_id":"20","name":"爆破鬼才","url":"http://pic.woqugame.com/lol/roles/Ziggs.jpg","debut":"0.31","win":"52.65"},{"role_id":"41","name":"刀锋意志","url":"http://pic.woqugame.com/lol/roles/Irelia.jpg","debut":"0.31","win":"52.09"},{"role_id":"82","name":"虚空行者","url":"http://pic.woqugame.com/lol/roles/Kassadin.jpg","debut":"0.31","win":"53.28"},{"role_id":"96","name":"狂暴之心","url":"http://pic.woqugame.com/lol/roles/Kennen.jpg","debut":"0.30","win":"49.01"},{"role_id":"59","name":"炼金术士","url":"http://pic.woqugame.com/lol/roles/Singed.jpg","debut":"0.30","win":"52.34"},{"role_id":"67","name":"冰晶凤凰","url":"http://pic.woqugame.com/lol/roles/Anivia.jpg","debut":"0.27","win":"56.90"},{"role_id":"21","name":"凛冬之怒","url":"http://pic.woqugame.com/lol/roles/Sejuani.jpg","debut":"0.27","win":"54.87"},{"role_id":"22","name":"机械先驱","url":"http://pic.woqugame.com/lol/roles/Viktor.jpg","debut":"0.26","win":"50.23"},{"role_id":"28","name":"远古巫灵","url":"http://pic.woqugame.com/lol/roles/Xerath.jpg","debut":"0.25","win":"50.47"},{"role_id":"88","name":"寡妇制造者","url":"http://pic.woqugame.com/lol/roles/Evelynn.jpg","debut":"0.25","win":"49.76"},{"role_id":"123","name":"虚空遁地兽","url":"http://pic.woqugame.com/lol/roles/Reksai.jpg","debut":"0.24","win":"42.21"},{"role_id":"47","name":"扭曲树精","url":"http://pic.woqugame.com/lol/roles/Maokai.jpg","debut":"0.24","win":"54.95"},{"role_id":"8","name":"暗黑元首","url":"http://pic.woqugame.com/lol/roles/Syndra.jpg","debut":"0.23","win":"42.63"},{"role_id":"99","name":"铁铠冥魂","url":"http://pic.woqugame.com/lol/roles/Mordekaiser.jpg","debut":"0.21","win":"44.13"},{"role_id":"11","name":"荆棘之兴","url":"http://pic.woqugame.com/lol/roles/Zyra.jpg","debut":"0.21","win":"53.98"},{"role_id":"89","name":"死亡颂唱者","url":"http://pic.woqugame.com/lol/roles/Karthus.jpg","debut":"0.18","win":"54.84"},{"role_id":"52","name":"机械公敌","url":"http://pic.woqugame.com/lol/roles/Rumble.jpg","debut":"0.17","win":"43.84"},{"role_id":"43","name":"魔蛇之拥","url":"http://pic.woqugame.com/lol/roles/Cassiopeia.jpg","debut":"0.16","win":"52.24"},{"role_id":"38","name":"策士统领","url":"http://pic.woqugame.com/lol/roles/Swain.jpg","debut":"0.16","win":"51.88"},{"role_id":"34","name":"掘墓者","url":"http://pic.woqugame.com/lol/roles/Yorick.jpg","debut":"0.13","win":"53.27"},{"role_id":"110","name":"首领之傲","url":"http://pic.woqugame.com/lol/roles/Urgot.jpg","debut":"0.10","win":"47.67"},{"role_id":"109","name":"哨兵之殇","url":"http://pic.woqugame.com/lol/roles/Galio.jpg","debut":"0.09","win":"46.15"},{"role_id":"31","name":"水晶先锋","url":"http://pic.woqugame.com/lol/roles/Skarner.jpg","debut":"0.09","win":"43.24"}]
     * code : 200
     * message : ok
     * api : 1
     */

    private int code;
    private String message;
    private int api;
    /**
     * role_id : 9
     * name : 傲之追猎者
     * url : http://pic.woqugame.com/lol/roles/Rengar.jpg
     * debut : 4.10
     * win : 48.40
     */

    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getApi() {
        return api;
    }

    public void setApi(int api) {
        this.api = api;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private String role_id;
        private String name;
        private String url;
        private String debut;
        private String win;

        public String getRole_id() {
            return role_id;
        }

        public void setRole_id(String role_id) {
            this.role_id = role_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getDebut() {
            return debut;
        }

        public void setDebut(String debut) {
            this.debut = debut;
        }

        public String getWin() {
            return win;
        }

        public void setWin(String win) {
            this.win = win;
        }
    }
}
