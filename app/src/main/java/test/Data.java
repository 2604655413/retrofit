package test;

import java.io.Serializable;

public class Data implements Serializable {
    private String time;
    private String ftime;
    private String context;
    private String location;
    public void setTime(String time) {
        this.time = time;
    }
    public String getTime() {
        return time;
    }

    public void setFtime(String ftime) {
        this.ftime = ftime;
    }
    public String getFtime() {
        return ftime;
    }

    public void setContext(String context) {
        this.context = context;
    }
    public String getContext() {
        return context;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Data{" +
                "time='" + time + '\'' +
                ", ftime='" + ftime + '\'' +
                ", context='" + context + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
