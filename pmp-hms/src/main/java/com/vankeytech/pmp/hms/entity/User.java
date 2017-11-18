package com.vankeytech.pmp.hms.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Administrator
 */
public class User implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id;

    private String username;

    private Short pid;

    /**
     * @return id
     */
    public Short getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Short id) {
        this.id = id;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return pid
     */
    public Short getPid() {
        return pid;
    }

    /**
     * @param pid
     */
    public void setPid(Short pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", pid=" + pid +
                '}';
    }
}