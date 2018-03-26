package test;

import java.util.List;

/**
 * OkGo测试java bean对象
 */

public class TestBean {


    /**
     * message : ok
     * nu : 3352441116109
     * ischeck : 1
     * condition : F00
     * com : shentong
     * status : 200
     * state : 3
     * data : [{"time":"2018-02-03 15:13:50","ftime":"2018-02-03 15:13:50","context":"北京市 本人签收-已签收，感谢您选择申通快递，期待再次为您服务。","location":""},{"time":"2018-02-03 06:44:27","ftime":"2018-02-03 06:44:27","context":"北京市 北京中关村一公司(010-80462111-832)-邱建国(18010217653)-派件中","location":""},{"time":"2018-02-03 05:44:12","ftime":"2018-02-03 05:44:12","context":"北京市 已到达-北京中关村一公司","location":""},{"time":"2018-02-02 23:14:06","ftime":"2018-02-02 23:14:06","context":"北京市 北京中转部-已发往-北京中关村一公司","location":""},{"time":"2018-02-01 06:34:09","ftime":"2018-02-01 06:34:09","context":"深圳市 广东深圳罗湖中转部-已发往-北京中转部","location":""},{"time":"2018-02-01 05:12:20","ftime":"2018-02-01 05:12:20","context":"深圳市 广东深圳罗湖中转部-已发往-北京中转部","location":""},{"time":"2018-01-31 20:47:33","ftime":"2018-01-31 20:47:33","context":"深圳市 广东深圳罗湖市场二部(0755-61886600)-李兆富-已收件","location":""}]
     */

    private String message;
    private String nu;
    private String ischeck;
    private String condition;
    private String com;
    private String status;
    private String state;
    private List<DataBean> data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getNu() {
        return nu;
    }

    public void setNu(String nu) {
        this.nu = nu;
    }

    public String getIscheck() {
        return ischeck;
    }

    public void setIscheck(String ischeck) {
        this.ischeck = ischeck;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getCom() {
        return com;
    }

    public void setCom(String com) {
        this.com = com;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * time : 2018-02-03 15:13:50
         * ftime : 2018-02-03 15:13:50
         * context : 北京市 本人签收-已签收，感谢您选择申通快递，期待再次为您服务。
         * location :
         */

        private String time;
        private String ftime;
        private String context;
        private String location;

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getFtime() {
            return ftime;
        }

        public void setFtime(String ftime) {
            this.ftime = ftime;
        }

        public String getContext() {
            return context;
        }

        public void setContext(String context) {
            this.context = context;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }


    }

    @Override
    public String toString() {
        return "TestBean{" +
                "message='" + message + '\'' +
                ", nu='" + nu + '\'' +
                ", ischeck='" + ischeck + '\'' +
                ", condition='" + condition + '\'' +
                ", com='" + com + '\'' +
                ", status='" + status + '\'' +
                ", state='" + state + '\'' +
                ", data=" + data +
                '}';
    }
}
