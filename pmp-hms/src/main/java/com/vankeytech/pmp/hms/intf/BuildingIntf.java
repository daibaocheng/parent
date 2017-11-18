package com.vankeytech.pmp.hms.intf;

import com.vankeytech.pmp.hms.entity.Building;
import com.vankeytech.pmp.hms.entity.User;

import java.util.List;


/**
 * @author Administrator
 */
public interface BuildingIntf {

    List<Building> selectAll();
}
