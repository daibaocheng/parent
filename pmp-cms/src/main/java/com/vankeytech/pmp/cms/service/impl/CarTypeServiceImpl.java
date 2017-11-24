package com.vankeytech.pmp.cms.service.impl;

import com.vankeytech.pmp.cms.entity.CarType;
import com.vankeytech.pmp.cms.mapper.CarTypeMapper;
import com.vankeytech.pmp.cms.service.CarTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CarTypeServiceImpl implements CarTypeService {

    @Resource
    private CarTypeMapper carTypeMapper;

    @Override
    public CarType selectCarTypeById(Integer id) {
        return carTypeMapper.selectCarTypeById(id);
    }

    @Override
    public List<CarType> selectAllCarType() {
        return carTypeMapper.selectAllCarType();
    }
}
