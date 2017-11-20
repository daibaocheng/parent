package com.vankeytech.pmp.cms.service;

import com.vankeytech.pmp.cms.entity.Car;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CarServiceTest {

    @Resource
    private CarService carService;

    @Test
    public void insertCar() throws Exception {
        Car car = new Car();
        car.setLicensePlateId("川AP1121");
        car.setLicensePlateTypeId(1);
        car.setLicensePlateColorId(1);
        car.setColorId("BLACK");
        car.setTypeId(1);
        car.setUid(1121);
        carService.insertCar(car);
    }

    @Test
    public void deleteCarById() throws Exception {
        carService.deleteCarById(1);
    }

    @Test
    public void updateCar() throws Exception {
        Car car = new Car();
        car.setId(2);
        car.setLicensePlateId("川AP1121");
        car.setLicensePlateTypeId(2);
        car.setLicensePlateColorId(3);
        car.setColorId("YELLOW");
        car.setTypeId(1);
        car.setUid(1121);
        carService.updateCar(car);
    }

    @Test
    public void selectCarById() throws Exception {
       Car car = carService.selectCarById(2);
       System.out.println(car);
    }

    @Test
    public void selectAllCar() throws Exception {
        List<Car> carList = carService.selectAllCar();
        System.out.println(carList);
    }

}