package com.vankeytech.pmp.common.intf;

import com.vankeytech.pmp.common.entity.Region;

import java.util.List;

/**
 * 通用接口
 * @author AlexWong
 */
public interface CommonIntf {
    List<Region> getProvinces();
    List<Region> getCities(String parentId);
}
