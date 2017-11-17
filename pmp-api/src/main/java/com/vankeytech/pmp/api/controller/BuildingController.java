package com.vankeytech.pmp.api.controller;

import com.vankeytech.pmp.hms.entity.User;
import com.vankeytech.pmp.hms.intf.BuildingIntf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/building")
public class BuildingController {

    @Autowired
    private BuildingIntf buildingIntf;

    @RequestMapping("/selectAll")
    public String selectAll(){
        List<User> users = buildingIntf.selectAll();
        System.out.println("users = " + users);
        return users.toString();
    }
}
