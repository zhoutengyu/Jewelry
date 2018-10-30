package com.jewelry.model.vo;

import java.io.Serializable;

/**
 * Created by admin on 2018/7/20.
 */
public class User implements Serializable {
    private String name;
    private String dengluming;
    private String password;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (getAge() != user.getAge()) return false;
        if (!getName().equals(user.getName())) return false;
        if (!getDengluming().equals(user.getDengluming())) return false;
        return getPassword().equals(user.getPassword());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getDengluming().hashCode();
        result = 31 * result + getPassword().hashCode();
        result = 31 * result + getAge();
        return result;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
