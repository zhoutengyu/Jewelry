package com.jewelry.model.vo;

import java.io.Serializable;

/**
 * Created by admin on 2018/7/20.
 */
public class User implements Serializable {
    private String name;
    private String dengluming;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDengluming() {
        return dengluming;
    }

    public void setDengluming(String dengluming) {
        this.dengluming = dengluming;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
