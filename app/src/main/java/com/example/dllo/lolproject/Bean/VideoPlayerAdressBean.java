package com.example.dllo.lolproject.bean;

import java.util.List;

/**
 * Created by dllo on 16/5/28.
 */
public class VideoPlayerAdressBean {


    /**
     * api : 1
     * message : ok
     * code : 200
     * data : {"last_parse_time":"1464420172","iframe_width":"0","video_sizes":{"multi_mp4_sd":0,"multi_mp4_hd":0,"shd":0,"multi_mp4_shd":0,"hd":0,"sd":40645299},"title":"最适合使用黑切的6大ADC","iframe_src":"","parse_type":"2","video_type":"m3u8","source_url":"http://v.qq.com/page/u/o/v/u0302i8kzov.html","video_height":"0","is_live":"0","iframe_height":"0","image_url":"http://avatar.anzogame.com/pic_v1/lol/news/20160528/mpic66352h57492d1d.jpg","video_urls":{"multi_mp4_sd":[],"multi_mp4_hd":[],"shd":"","multi_mp4_shd":[],"hd":"","sd":"http://video.dispatch.tc.qq.com/47658885/u0302i8kzov.mp4?vkey=DB7F909AA6A17E06CEFE0C7251D9097E43375594A91264647DCD49394F3BB8FD07599E579FC470910F72F846293814F007DD0DCC71B3B9915B92832D5B98F5EA0B5C26E0D8131D3F7FE10F664ADF22B792DB77946B5B10FC&br=60&platform=2&fmt=auto&level=0&sdtfrom=v5010"},"video_width":"0","id":"66352"}
     */

    private int api;
    private String message;
    private int code;
    /**
     * last_parse_time : 1464420172
     * iframe_width : 0
     * video_sizes : {"multi_mp4_sd":0,"multi_mp4_hd":0,"shd":0,"multi_mp4_shd":0,"hd":0,"sd":40645299}
     * title : 最适合使用黑切的6大ADC
     * iframe_src :
     * parse_type : 2
     * video_type : m3u8
     * source_url : http://v.qq.com/page/u/o/v/u0302i8kzov.html
     * video_height : 0
     * is_live : 0
     * iframe_height : 0
     * image_url : http://avatar.anzogame.com/pic_v1/lol/news/20160528/mpic66352h57492d1d.jpg
     * video_urls : {"multi_mp4_sd":[],"multi_mp4_hd":[],"shd":"","multi_mp4_shd":[],"hd":"","sd":"http://video.dispatch.tc.qq.com/47658885/u0302i8kzov.mp4?vkey=DB7F909AA6A17E06CEFE0C7251D9097E43375594A91264647DCD49394F3BB8FD07599E579FC470910F72F846293814F007DD0DCC71B3B9915B92832D5B98F5EA0B5C26E0D8131D3F7FE10F664ADF22B792DB77946B5B10FC&br=60&platform=2&fmt=auto&level=0&sdtfrom=v5010"}
     * video_width : 0
     * id : 66352
     */

    private DataBean data;

    public int getApi() {
        return api;
    }

    public void setApi(int api) {
        this.api = api;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private String last_parse_time;
        private String iframe_width;
        /**
         * multi_mp4_sd : 0
         * multi_mp4_hd : 0
         * shd : 0
         * multi_mp4_shd : 0
         * hd : 0
         * sd : 40645299
         */

        private VideoSizesBean video_sizes;
        private String title;
        private String iframe_src;
        private String parse_type;
        private String video_type;
        private String source_url;
        private String video_height;
        private String is_live;
        private String iframe_height;
        private String image_url;
        /**
         * multi_mp4_sd : []
         * multi_mp4_hd : []
         * shd :
         * multi_mp4_shd : []
         * hd :
         * sd : http://video.dispatch.tc.qq.com/47658885/u0302i8kzov.mp4?vkey=DB7F909AA6A17E06CEFE0C7251D9097E43375594A91264647DCD49394F3BB8FD07599E579FC470910F72F846293814F007DD0DCC71B3B9915B92832D5B98F5EA0B5C26E0D8131D3F7FE10F664ADF22B792DB77946B5B10FC&br=60&platform=2&fmt=auto&level=0&sdtfrom=v5010
         */

        private VideoUrlsBean video_urls;
        private String video_width;
        private String id;

        public String getLast_parse_time() {
            return last_parse_time;
        }

        public void setLast_parse_time(String last_parse_time) {
            this.last_parse_time = last_parse_time;
        }

        public String getIframe_width() {
            return iframe_width;
        }

        public void setIframe_width(String iframe_width) {
            this.iframe_width = iframe_width;
        }

        public VideoSizesBean getVideo_sizes() {
            return video_sizes;
        }

        public void setVideo_sizes(VideoSizesBean video_sizes) {
            this.video_sizes = video_sizes;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getIframe_src() {
            return iframe_src;
        }

        public void setIframe_src(String iframe_src) {
            this.iframe_src = iframe_src;
        }

        public String getParse_type() {
            return parse_type;
        }

        public void setParse_type(String parse_type) {
            this.parse_type = parse_type;
        }

        public String getVideo_type() {
            return video_type;
        }

        public void setVideo_type(String video_type) {
            this.video_type = video_type;
        }

        public String getSource_url() {
            return source_url;
        }

        public void setSource_url(String source_url) {
            this.source_url = source_url;
        }

        public String getVideo_height() {
            return video_height;
        }

        public void setVideo_height(String video_height) {
            this.video_height = video_height;
        }

        public String getIs_live() {
            return is_live;
        }

        public void setIs_live(String is_live) {
            this.is_live = is_live;
        }

        public String getIframe_height() {
            return iframe_height;
        }

        public void setIframe_height(String iframe_height) {
            this.iframe_height = iframe_height;
        }

        public String getImage_url() {
            return image_url;
        }

        public void setImage_url(String image_url) {
            this.image_url = image_url;
        }

        public VideoUrlsBean getVideo_urls() {
            return video_urls;
        }

        public void setVideo_urls(VideoUrlsBean video_urls) {
            this.video_urls = video_urls;
        }

        public String getVideo_width() {
            return video_width;
        }

        public void setVideo_width(String video_width) {
            this.video_width = video_width;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class VideoSizesBean {
            private int multi_mp4_sd;
            private int multi_mp4_hd;
            private int shd;
            private int multi_mp4_shd;
            private int hd;
            private int sd;

            public int getMulti_mp4_sd() {
                return multi_mp4_sd;
            }

            public void setMulti_mp4_sd(int multi_mp4_sd) {
                this.multi_mp4_sd = multi_mp4_sd;
            }

            public int getMulti_mp4_hd() {
                return multi_mp4_hd;
            }

            public void setMulti_mp4_hd(int multi_mp4_hd) {
                this.multi_mp4_hd = multi_mp4_hd;
            }

            public int getShd() {
                return shd;
            }

            public void setShd(int shd) {
                this.shd = shd;
            }

            public int getMulti_mp4_shd() {
                return multi_mp4_shd;
            }

            public void setMulti_mp4_shd(int multi_mp4_shd) {
                this.multi_mp4_shd = multi_mp4_shd;
            }

            public int getHd() {
                return hd;
            }

            public void setHd(int hd) {
                this.hd = hd;
            }

            public int getSd() {
                return sd;
            }

            public void setSd(int sd) {
                this.sd = sd;
            }
        }

        public static class VideoUrlsBean {
            private String shd;
            private String hd;
            private String sd;
            private List<?> multi_mp4_sd;
            private List<?> multi_mp4_hd;
            private List<?> multi_mp4_shd;

            public String getShd() {
                return shd;
            }

            public void setShd(String shd) {
                this.shd = shd;
            }

            public String getHd() {
                return hd;
            }

            public void setHd(String hd) {
                this.hd = hd;
            }

            public String getSd() {
                return sd;
            }

            public void setSd(String sd) {
                this.sd = sd;
            }

            public List<?> getMulti_mp4_sd() {
                return multi_mp4_sd;
            }

            public void setMulti_mp4_sd(List<?> multi_mp4_sd) {
                this.multi_mp4_sd = multi_mp4_sd;
            }

            public List<?> getMulti_mp4_hd() {
                return multi_mp4_hd;
            }

            public void setMulti_mp4_hd(List<?> multi_mp4_hd) {
                this.multi_mp4_hd = multi_mp4_hd;
            }

            public List<?> getMulti_mp4_shd() {
                return multi_mp4_shd;
            }

            public void setMulti_mp4_shd(List<?> multi_mp4_shd) {
                this.multi_mp4_shd = multi_mp4_shd;
            }
        }
    }
}
