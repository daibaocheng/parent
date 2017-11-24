package com.vankeytech.pmp.cms.intf.impl;

import com.vankeytech.pmp.cms.entity.CarType;
import com.vankeytech.pmp.cms.intf.CarTypeIntf;
import com.vankeytech.pmp.cms.service.CarTypeService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class CarTypeIntfImpl implements CarTypeIntf {

    @Resource
    private CarTypeService carTypeService;

    @Override
    public CarType selectCarTypeById(Integer id) {
        return carTypeService.selectCarTypeById(id);
    }

    @Override
    public List<CarType> selectAllCarType() {
        return carTypeService.selectAllCarType();
    }
}
