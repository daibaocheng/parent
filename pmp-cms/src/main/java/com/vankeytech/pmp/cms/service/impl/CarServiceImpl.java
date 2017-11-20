package com.vankeytech.pmp.cms.service.impl;

import com.vankeytech.pmp.cms.entity.Car;
import com.vankeytech.pmp.cms.mapper.CarMapper;
import com.vankeytech.pmp.cms.service.CarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Resource
    private CarMapper carMapper;

    @Override
    public void insertCar(Car car) {
        carMapper.insertCar(car);
    }

    @Override
    public void deleteCarById(Integer id) {
        carMapper.deleteCarById(id);
    }

    @Override
    public void updateCar(Car car) {
        carMapper.updateCar(car);
    }

    @Override
    public Car selectCarById(Integer id) {
        List<Car> carList = carMapper.selectCarById(id);
        if (carList.size() == 0) {
            return null;
        } else if (carList.size() != 1) {
            throw new RuntimeException();
        } else {
            return carList.get(0);
        }
    }

    @Override
    public List<Car> selectAllCar() {
        return carMapper.selectAllCar();
    }

}
