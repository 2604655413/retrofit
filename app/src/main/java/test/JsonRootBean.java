package test;


import java.util.List;

public class JsonRootBean<T> {


    private String message;
    private String nu;
    private String ischeck;
    private String condition;
    private String com;
    private String status;
    private String state;
    private List<T> data;
    public void setMessage(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }

    public void setNu(String nu) {
        this.nu = nu;
    }
    public String getNu() {
        return nu;
    }

    public void setIscheck(String ischeck) {
        this.ischeck = ischeck;
    }
    public String getIscheck() {
        return ischeck;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
    public String getCondition() {
        return condition;
    }

    public void setCom(String com) {
        this.com = com;
    }
    public String getCom() {
        return com;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }

    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
    public List<T> getData() {
        return data;
    }

    @Override
    public String toString() {
        return "JsonRootBean{" +
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
