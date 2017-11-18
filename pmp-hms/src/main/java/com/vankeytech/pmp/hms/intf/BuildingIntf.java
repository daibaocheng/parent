package com.vankeytech.pmp.hms.intf;

import com.vankeytech.pmp.hms.entity.User;

import java.util.List;


/**
 * @author Administrator
 */
public interface BuildingIntf {

    public List<User> selectAll();
    public void add();
    public void update();
    public void delete();
}
