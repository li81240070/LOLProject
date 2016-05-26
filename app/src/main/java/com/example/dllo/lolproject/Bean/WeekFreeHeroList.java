package com.example.dllo.lolproject.bean;

import java.util.List;

/**
 * Created by dllo on 16/5/26.
 */
public class WeekFreeHeroList {


    /**
     * currenttitle : 本期周免
     * currentdate : 5/20-5/27
     * currentperiod : [{"id":"38"},{"id":"20"},{"id":"51"},{"id":"105"},{"id":"107"},{"id":"63"},{"id":"17"},{"id":"74"},{"id":"90"},{"id":"115"},{"id":"69"},{"id":"95"},{"id":"35"}]
     * nexttitle : 下期周免
     * nextdate : 5/27-6/3
     * nextperiod : [{"id":"9"},{"id":"114"},{"id":"70"},{"id":"45"},{"id":"22"},{"id":"111"},{"id":"97"},{"id":"129"},{"id":"28"},{"id":"85"},{"id":"69"},{"id":"35"},{"id":"95"}]
     */

    private DataBean data;
    /**
     * data : {"currenttitle":"本期周免","currentdate":"5/20-5/27","currentperiod":[{"id":"38"},{"id":"20"},{"id":"51"},{"id":"105"},{"id":"107"},{"id":"63"},{"id":"17"},{"id":"74"},{"id":"90"},{"id":"115"},{"id":"69"},{"id":"95"},{"id":"35"}],"nexttitle":"下期周免","nextdate":"5/27-6/3","nextperiod":[{"id":"9"},{"id":"114"},{"id":"70"},{"id":"45"},{"id":"22"},{"id":"111"},{"id":"97"},{"id":"129"},{"id":"28"},{"id":"85"},{"id":"69"},{"id":"35"},{"id":"95"}]}
     * code : 200
     * message : ok
     * api : 1
     */

    private int code;
    private String message;
    private int api;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

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

    public static class DataBean {
        private String currenttitle;
        private String currentdate;
        private String nexttitle;
        private String nextdate;
        /**
         * id : 38
         */

        private List<CurrentperiodBean> currentperiod;
        /**
         * id : 9
         */

        private List<NextperiodBean> nextperiod;

        public String getCurrenttitle() {
            return currenttitle;
        }

        public void setCurrenttitle(String currenttitle) {
            this.currenttitle = currenttitle;
        }

        public String getCurrentdate() {
            return currentdate;
        }

        public void setCurrentdate(String currentdate) {
            this.currentdate = currentdate;
        }

        public String getNexttitle() {
            return nexttitle;
        }

        public void setNexttitle(String nexttitle) {
            this.nexttitle = nexttitle;
        }

        public String getNextdate() {
            return nextdate;
        }

        public void setNextdate(String nextdate) {
            this.nextdate = nextdate;
        }

        public List<CurrentperiodBean> getCurrentperiod() {
            return currentperiod;
        }

        public void setCurrentperiod(List<CurrentperiodBean> currentperiod) {
            this.currentperiod = currentperiod;
        }

        public List<NextperiodBean> getNextperiod() {
            return nextperiod;
        }

        public void setNextperiod(List<NextperiodBean> nextperiod) {
            this.nextperiod = nextperiod;
        }

        public static class CurrentperiodBean {
            private String id;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }
        }

        public static class NextperiodBean {
            private String id;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }
        }
    }
}
