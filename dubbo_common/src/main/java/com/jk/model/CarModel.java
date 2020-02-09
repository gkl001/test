package com.jk.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class CarModel implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer carid;

    private String carname;

    private Long carprice;

    private String carshow;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date cartime;

    private String carurl;

    private String  name;

    private Integer value;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname == null ? null : carname.trim();
    }

    public Long getCarprice() {
        return carprice;
    }

    public void setCarprice(Long carprice) {
        this.carprice = carprice;
    }

    public String getCarshow() {
        return carshow;
    }

    public void setCarshow(String carshow) {
        this.carshow = carshow == null ? null : carshow.trim();
    }

    public Date getCartime() {
        return cartime;
    }

    public void setCartime(Date cartime) {
        this.cartime = cartime;
    }

    public String getCarurl() {
        return carurl;
    }

    public void setCarurl(String carurl) {
        this.carurl = carurl == null ? null : carurl.trim();
    }
}