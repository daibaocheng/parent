package com.vankeytech.pmp.pms.controller;

import com.vankeytech.pmp.pms.entity.PmsInformAnnouncement;
import com.vankeytech.pmp.pms.service.PmsInformAnnouncementService;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class PmsInformAnnouncementControllerTest {
    @Autowired
    private PmsInformAnnouncementService pmsInformAnnouncementService;

    @Test
    public void testGetPmsInformAnnouncementList(){
        try {
            System.out.println("开始");
            List<PmsInformAnnouncement> pmsList= pmsInformAnnouncementService.selectByIds("1");
        }catch (Exception e){

        }


   //     Assert.assertEquals(new Integer(1),pmsList.get(0).getState());
    }

}