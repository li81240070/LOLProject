package com.example.dllo.lolproject.fragments.more12activity;

import java.util.List;

/**
 * Created by dllo on 16/6/12.
 */
public class More12IntentBean {


    /**
     * data : [{"item_id":"66938","title":"大小姐的贴身撸神 150","desc":"要是没有林伟涵的抢大龙，林东也不一定能推完水晶，并且发出嘲讽...","published":1465592400},{"item_id":"66965","title":"英雄联盟之不死传说 44","desc":"确定好战队的名字后，张子豪一行人便走进了联盟网咖里。","published":1465678800},{"item_id":"66939","title":"英雄联盟之不死传说 43","desc":"\u201c好吧。\u201d张子豪转头盯着王磊看了一眼：\u201c下一个，该你了。\u201d","published":1465592400},{"item_id":"66901","title":"英雄联盟之不死传说 42","desc":"\u201c没，没，没，我没这个意思，你别误会啊子豪。\u201d刘强摇了摇头，连忙解释了一句。","published":1465506000},{"item_id":"66864","title":"英雄联盟之不死传说 41","desc":"沈默耸了耸肩，一脸随意的说了句：\u201c我啊？也不行，不过就是电一的王者而已。\u201d","published":1465419600},{"item_id":"66819","title":"英雄联盟之不死传说 40","desc":"\u201c这个，默哥你玩不玩英雄联盟啊？\u201d张子豪弱弱的问道。","published":1465333200},{"item_id":"66779","title":"英雄联盟之不死传说 39","desc":"张子豪在听到White说的这句话后，有一种特别揪心的感觉。","published":1465246800},{"item_id":"66740","title":"英雄联盟之不死传说 38","desc":"在德成高中，如果老师发现有学生在厕所抽烟。","published":1465160400},{"item_id":"66701","title":"英雄联盟之不死传说 37","desc":"一些看热闹的不嫌事儿大的同学，还在一旁瞎JB起哄。","published":1465074000},{"item_id":"66652","title":"英雄联盟之不死传说 36","desc":"\u201c我又没问你叫什么。\u201d张子豪瞥了沈默一眼，面无表情的说道。","published":1464987600}]
     * code : 200
     * message : ok
     * api : 1
     */

    private int code;
    private String message;
    private int api;
    /**
     * item_id : 66938
     * title : 大小姐的贴身撸神 150
     * desc : 要是没有林伟涵的抢大龙，林东也不一定能推完水晶，并且发出嘲讽...
     * published : 1465592400
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
        private String item_id;
        private String title;
        private String desc;
        private int published;

        public String getItem_id() {
            return item_id;
        }

        public void setItem_id(String item_id) {
            this.item_id = item_id;
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

        public int getPublished() {
            return published;
        }

        public void setPublished(int published) {
            this.published = published;
        }
    }
}
