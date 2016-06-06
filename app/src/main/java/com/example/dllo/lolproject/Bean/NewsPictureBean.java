package com.example.dllo.lolproject.bean;

import java.util.List;

/**
 * Created by dllo on 16/6/6.
 */
public class NewsPictureBean {


    /**
     * data : [{"id":"66710","title":"女神真有料","desc":"女神真有料","goto_target":"item","goto_param":{"itemid":"66706","title":"女神真有料","desc":"女神真有料"},"platform":"1","pic_ad_url":"http://avatar.anzogame.com/pic_v1/lol/news/20160605/picad66710h575391bc.jpg"},{"id":"66563","title":"广告链接跳转","desc":"广告链接跳转","goto_target":"web","goto_param":{"url":"http://m.zhangyoubao.com/down/index"},"platform":"1","pic_ad_url":"http://avatar.anzogame.com/pic_v1/lol/news/20160602/picad66563h574f97dc.jpg"},{"id":"66550","title":"6月3日免费英雄更换公告","desc":"6月3日免费英雄更换公告","goto_target":"item","goto_param":{"itemid":"66546","title":"6月3日免费英雄更换公告","desc":"6月3日免费英雄更换公告"},"platform":"1","pic_ad_url":"http://avatar.anzogame.com/pic_v1/lol/news/20160601/picad66550h574ed5fa.jpg"},{"id":"66436","title":"6.11版本","desc":"6.11版本","goto_target":"item","goto_param":{"itemid":"66572","title":"6.11版本","desc":"6.11版本"},"platform":"1","pic_ad_url":"http://avatar.anzogame.com/pic_v1/lol/news/20160530/picad66436h574bc305.jpg"},{"id":"66155","title":"6.10版本","desc":"6.10版本","goto_target":"item","goto_param":{"itemid":"66150","title":"6.10版本","desc":"6.10版本"},"platform":"1","pic_ad_url":"http://avatar.anzogame.com/pic_v1/lol/news/20160523/picad66155h5742e142.jpg"}]
     * code : 200
     * message : ok
     * api : 1
     */

    private int code;
    private String message;
    private int api;
    /**
     * id : 66710
     * title : 女神真有料
     * desc : 女神真有料
     * goto_target : item
     * goto_param : {"itemid":"66706","title":"女神真有料","desc":"女神真有料"}
     * platform : 1
     * pic_ad_url : http://avatar.anzogame.com/pic_v1/lol/news/20160605/picad66710h575391bc.jpg
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
        private String goto_target;
        /**
         * itemid : 66706
         * title : 女神真有料
         * desc : 女神真有料
         */

        private GotoParamBean goto_param;
        private String platform;
        private String pic_ad_url;

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

        public String getGoto_target() {
            return goto_target;
        }

        public void setGoto_target(String goto_target) {
            this.goto_target = goto_target;
        }

        public GotoParamBean getGoto_param() {
            return goto_param;
        }

        public void setGoto_param(GotoParamBean goto_param) {
            this.goto_param = goto_param;
        }

        public String getPlatform() {
            return platform;
        }

        public void setPlatform(String platform) {
            this.platform = platform;
        }

        public String getPic_ad_url() {
            return pic_ad_url;
        }

        public void setPic_ad_url(String pic_ad_url) {
            this.pic_ad_url = pic_ad_url;
        }

        public static class GotoParamBean {
            private String itemid;
            private String title;
            private String desc;

            public String getItemid() {
                return itemid;
            }

            public void setItemid(String itemid) {
                this.itemid = itemid;
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
        }
    }
}
