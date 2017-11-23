package com.vankeytech.pmp.cms.service.impl;

import com.vankeytech.pmp.cms.entity.Car;
import com.vankeytech.pmp.cms.mapper.CarMapper;
import com.vankeytech.pmp.cms.service.CarService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Resource
    private CarMapper carMapper;

    @Override
    @Transactional
    public void insertCar(Car car) {
        car.setHide(0);
        carMapper.insertCar(car);
    }

    @Override
    @Transactional
    public void deleteCarById(Integer id) {
        carMapper.deleteCarById(id);
    }

    @Override
    @Transactional
    public void hideCarById(Integer id) {
        Car car = new Car();
        car.setId(id);
        car.setHide(1);
        carMapper.updateCar(car);
    }

    @Override
    @Transactional
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
