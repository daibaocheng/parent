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
        car.setShow(1);
        carMapper.insertCar(car);
    }

    @Override
    public void deleteCarById(Integer id) {
        carMapper.deleteCarById(id);
    }

    @Override
    public void hideCarById(Integer id) {
        Car car = new Car();
        car.setId(id);
        car.setShow(0);
        carMapper.updateCar(car);
    }

    @Override
    public void updateCar(Car car) {
        carMapper.updateCar(car);
    }

    @Override
    public Car selectCarById(Integer id) {
        return carMapper.selectCarById(id);
    }

    @Override
    public List<Car> selectAllCar() {
        return carMapper.selectAllCar();
    }

}
