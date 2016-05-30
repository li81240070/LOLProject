package com.example.dllo.lolproject.bean;

import java.util.List;

/**
 * Created by dllo on 16/5/30.
 */
public class ShowHowToPlayBean {


    /**
     * data : [{"id":"712218","role_id":"15","map":"经典模式-召唤师峡谷","userid":"16704106","title":"中单","equips":"13032,13132,13143,13061,14092,13148,","good":"0","comment":"0","hot":"0","content_md5":"fe999af15f83308a3d0f25be9d6ce394","json":"file/lol/user_plays/fe/fe999af15f83308a3d0f25be9d6ce394","season":"8","created":1464591353,"area":"艾欧尼亚","summoner":"对面德玛西亚的爸","zdl":"4220","nickname":"我非宛如为何奇葩","avatar":"http://avatar.zhangyoubao.com/pic/user/avatar/b2/56026fe916704106s.crop_image","file_url":"http://anzo-file.oss-cn-qingdao.aliyuncs.com/file/lol/user_plays/fe/fe999af15f83308a3d0f25be9d6ce394"},{"id":"712217","role_id":"50","map":"经典模式-召唤师峡谷","userid":"23572853","title":"一脚瞎","equips":"12999,14097,13064,14123,14092,13062,","good":"0","comment":"0","hot":"0","content_md5":"17f2e6293d8434baa67da8719a479eca","json":"file/lol/user_plays/17/17f2e6293d8434baa67da8719a479eca","season":"8","created":1464590501,"area":"战争学院","summoner":"Antonio丶男神经","zdl":"10991","nickname":"Antonio丶男神","avatar":"http://avatar.zhangyoubao.com/pic/user/avatar/defaults.jpg","file_url":"http://anzo-file.oss-cn-qingdao.aliyuncs.com/file/lol/user_plays/17/17f2e6293d8434baa67da8719a479eca"},{"id":"712216","role_id":"117","map":"经典模式-召唤师峡谷","userid":"23572853","title":"就是旋风嗦","equips":"13037,13021,13036,14040,13146,13133,","good":"0","comment":"0","hot":"0","content_md5":"a5ffcec24c7f18e141155a6c96feea67","json":"file/lol/user_plays/a5/a5ffcec24c7f18e141155a6c96feea67","season":"8","created":1464590118,"area":"战争学院","summoner":"Antonio丶男神经","zdl":"10991","nickname":"Antonio丶男神","avatar":"http://avatar.zhangyoubao.com/pic/user/avatar/defaults.jpg","file_url":"http://anzo-file.oss-cn-qingdao.aliyuncs.com/file/lol/user_plays/a5/a5ffcec24c7f18e141155a6c96feea67"},{"id":"712215","role_id":"13","map":"经典模式-召唤师峡谷","userid":"23572853","title":"就是一个打五个","equips":"12996,13021,13036,13129,14092,13132,","good":"0","comment":"0","hot":"0","content_md5":"44b2e014fc561eb979ca64692210b841","json":"file/lol/user_plays/44/44b2e014fc561eb979ca64692210b841","season":"8","created":1464589791,"area":"战争学院","summoner":"Antonio丶男神经","zdl":"10991","nickname":"Antonio丶男神","avatar":"http://avatar.zhangyoubao.com/pic/user/avatar/defaults.jpg","file_url":"http://anzo-file.oss-cn-qingdao.aliyuncs.com/file/lol/user_plays/44/44b2e014fc561eb979ca64692210b841"},{"id":"712214","role_id":"107","map":"经典模式-召唤师峡谷","userid":"23545612","title":"上单","equips":"13143,13064,13012,13036,13129,13101,","good":"0","comment":"0","hot":"0","content_md5":"4fd75602f4649cfa21b52202dc2d7c01","json":"file/lol/user_plays/4f/4fd75602f4649cfa21b52202dc2d7c01","season":"8","created":1464588953,"area":"暗影岛","summoner":"垃圾丶对手","zdl":"7458","nickname":"垃圾丶对手","avatar":"http://avatar.zhangyoubao.com/pic/user/avatar/defaults.jpg","file_url":"http://anzo-file.oss-cn-qingdao.aliyuncs.com/file/lol/user_plays/4f/4fd75602f4649cfa21b52202dc2d7c01"}]
     * code : 200
     * message : ok
     * api : 1
     */

    private int code;
    private String message;
    private int api;
    /**
     * id : 712218
     * role_id : 15
     * map : 经典模式-召唤师峡谷
     * userid : 16704106
     * title : 中单
     * equips : 13032,13132,13143,13061,14092,13148,
     * good : 0
     * comment : 0
     * hot : 0
     * content_md5 : fe999af15f83308a3d0f25be9d6ce394
     * json : file/lol/user_plays/fe/fe999af15f83308a3d0f25be9d6ce394
     * season : 8
     * created : 1464591353
     * area : 艾欧尼亚
     * summoner : 对面德玛西亚的爸
     * zdl : 4220
     * nickname : 我非宛如为何奇葩
     * avatar : http://avatar.zhangyoubao.com/pic/user/avatar/b2/56026fe916704106s.crop_image
     * file_url : http://anzo-file.oss-cn-qingdao.aliyuncs.com/file/lol/user_plays/fe/fe999af15f83308a3d0f25be9d6ce394
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
        private String role_id;
        private String map;
        private String userid;
        private String title;
        private String equips;
        private String good;
        private String comment;
        private String hot;
        private String content_md5;
        private String json;
        private String season;
        private int created;
        private String area;
        private String summoner;
        private String zdl;
        private String nickname;
        private String avatar;
        private String file_url;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getRole_id() {
            return role_id;
        }

        public void setRole_id(String role_id) {
            this.role_id = role_id;
        }

        public String getMap() {
            return map;
        }

        public void setMap(String map) {
            this.map = map;
        }

        public String getUserid() {
            return userid;
        }

        public void setUserid(String userid) {
            this.userid = userid;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getEquips() {
            return equips;
        }

        public void setEquips(String equips) {
            this.equips = equips;
        }

        public String getGood() {
            return good;
        }

        public void setGood(String good) {
            this.good = good;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public String getHot() {
            return hot;
        }

        public void setHot(String hot) {
            this.hot = hot;
        }

        public String getContent_md5() {
            return content_md5;
        }

        public void setContent_md5(String content_md5) {
            this.content_md5 = content_md5;
        }

        public String getJson() {
            return json;
        }

        public void setJson(String json) {
            this.json = json;
        }

        public String getSeason() {
            return season;
        }

        public void setSeason(String season) {
            this.season = season;
        }

        public int getCreated() {
            return created;
        }

        public void setCreated(int created) {
            this.created = created;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getSummoner() {
            return summoner;
        }

        public void setSummoner(String summoner) {
            this.summoner = summoner;
        }

        public String getZdl() {
            return zdl;
        }

        public void setZdl(String zdl) {
            this.zdl = zdl;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getFile_url() {
            return file_url;
        }

        public void setFile_url(String file_url) {
            this.file_url = file_url;
        }
    }
}
