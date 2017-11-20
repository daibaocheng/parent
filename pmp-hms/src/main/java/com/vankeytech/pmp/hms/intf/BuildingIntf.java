package com.vankeytech.pmp.hms.intf;

import com.vankeytech.pmp.hms.entity.HmsBuilding;

import java.util.List;


/**
 * @author Administrator
 */
public interface BuildingIntf {

    List<HmsBuilding> selectAll();
}
