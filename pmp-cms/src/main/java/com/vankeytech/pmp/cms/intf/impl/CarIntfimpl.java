package com.vankeytech.pmp.cms.intf.impl;

import com.vankeytech.pmp.cms.entity.Car;
import com.vankeytech.pmp.cms.intf.CarIntf;
import com.vankeytech.pmp.cms.service.CarService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class CarIntfimpl implements CarIntf {

    @Resource
    private CarService carService;

    @Override
    public void insertCar(Car car) {
        carService.insertCar(car);
    }

    @Override
    public void deleteCarById(Integer id) {
        carService.deleteCarById(id);
    }

    @Override
    public void hideCarById(Integer id) {
        carService.hideCarById(id);
    }

    @Override
    public void updateCar(Car car) {
        carService.updateCar(car);
    }

    @Override
    public Car selectCarById(Integer id) {
        return carService.selectCarById(id);
    }

    @Override
    public List<Car> selectAllCar() {
        return carService.selectAllCar();
    }

}
