package com.example.dllo.lolproject.bean;

import java.util.List;

/**
 * Created by dllo on 16/5/24.
 */
public class NewNewsJsonBeans {


    /**
     * data : [{"id":"66143","title":"【直播】LSPL夏季赛 5月23日","desc":"淘宝权和宣告所在的ING表现如何？","video_url":"http://qqlive.dnion.com:1863/105270401.flv?cdncode=%2f18907E7BE0798990%2f&time=1463990574&cdn=dilian&sdtfrom=v40221&platform=10202&scheduleflag=1&buname=qqlive&vkey=79096D034D3A2EE522849B70AE4D8DD7893C8EE518C74ADAE9140CFD1376E55EE3DCC706A1FA57D3E1C7877A105C7039E96697F743743B949C361A210981211974DE878A976EF726DE27A09D98B67E6577C795B72ADC6BC3","published":1463987363,"weight_new":"500","platform":"1","pic_url":"http://avatar.anzogame.com/pic_v1/lol/news/20160523/spic66143h5742b951.jpg","recommend":1},{"id":"66150","title":"国服5月24日更新6.10版本：岩雀来啦！","desc":"5月24日凌晨5点~11点进行全区停机版本更新！","video_url":"","published":1463994149,"weight_new":"400","platform":"1","pic_url":"","recommend":1},{"id":"66127","title":"腥红望月 双倍来袭活动即将开启","desc":"双倍开放时间：5月23日至5月26日19:00\u2014\u201421:59","video_url":"","published":1463972800,"weight_new":"50","platform":"1","pic_url":"","recommend":0},{"id":"66157","title":"英雄联盟之不死传说 26","desc":"因为你来了！我知道，我有信心，我们可以反杀！","video_url":"","published":1464037200,"weight_new":"0","platform":"1","pic_url":"","recommend":0},{"id":"66156","title":"大小姐的贴身撸神 132","desc":"\u201c林东哥，你真是太帅了，我对你的崇拜飙升到了100点了，可以亲你一口么？\u201d","video_url":"","published":1464037200,"weight_new":"0","platform":"1","pic_url":"","recommend":0},{"id":"66128","title":"贪婪暴怒？LOL中的七宗罪解析","desc":"傲慢、妒忌、暴怒、懒惰、贪婪、饕餮、色欲","video_url":"","published":1464003010,"weight_new":"0","platform":"1","pic_url":"","recommend":0},{"id":"66153","title":"大吐槽：你心目中的理想队友是怎样的？","desc":"虽然排位老遇到猪队友，但是梦想还是要有的嘛。","video_url":"","published":1464001200,"weight_new":"0","platform":"1","pic_url":"","recommend":0},{"id":"66136","title":"海克斯科技风女COS 小蛮腰大长腿","desc":"奶量十足！","video_url":"","published":1463999449,"weight_new":"0","platform":"1","pic_url":"","recommend":0},{"id":"66144","title":"每日一瞎：心悦玩家恶意送头称轻松解封","desc":"这个玩家表示自己是心悦会员，举报也会分分钟解封？","video_url":"","published":1463997613,"weight_new":"0","platform":"1","pic_url":"","recommend":0},{"id":"66149","title":"6.10中单胜率TOP5 乌鸦胜率登顶！","desc":"6.9中单英雄中胜率最低的乌鸦翻身当爸爸啦！","video_url":"","published":1463994182,"weight_new":"0","platform":"1","pic_url":"","recommend":0}]
     * code : 200
     * message : ok
     * api : 1
     */

    private int code;
    private String message;
    private int api;
    /**
     * id : 66143
     * title : 【直播】LSPL夏季赛 5月23日
     * desc : 淘宝权和宣告所在的ING表现如何？
     * video_url : http://qqlive.dnion.com:1863/105270401.flv?cdncode=%2f18907E7BE0798990%2f&time=1463990574&cdn=dilian&sdtfrom=v40221&platform=10202&scheduleflag=1&buname=qqlive&vkey=79096D034D3A2EE522849B70AE4D8DD7893C8EE518C74ADAE9140CFD1376E55EE3DCC706A1FA57D3E1C7877A105C7039E96697F743743B949C361A210981211974DE878A976EF726DE27A09D98B67E6577C795B72ADC6BC3
     * published : 1463987363
     * weight_new : 500
     * platform : 1
     * pic_url : http://avatar.anzogame.com/pic_v1/lol/news/20160523/spic66143h5742b951.jpg
     * recommend : 1
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
        private String id;
        private String title;
        private String desc;
        private String video_url;
        private int published;
        private String weight_new;
        private String platform;
        private String pic_url;
        private int recommend;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getVideo_url() {
            return video_url;
        }

        public void setVideo_url(String video_url) {
            this.video_url = video_url;
        }

        public int getPublished() {
            return published;
        }

        public void setPublished(int published) {
            this.published = published;
        }

        public String getWeight_new() {
            return weight_new;
        }

        public void setWeight_new(String weight_new) {
            this.weight_new = weight_new;
        }

        public String getPlatform() {
            return platform;
        }

        public void setPlatform(String platform) {
            this.platform = platform;
        }

        public String getPic_url() {
            return pic_url;
        }

        public void setPic_url(String pic_url) {
            this.pic_url = pic_url;
        }

        public int getRecommend() {
            return recommend;
        }

        public void setRecommend(int recommend) {
            this.recommend = recommend;
        }
    }
}
