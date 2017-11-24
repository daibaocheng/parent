package com.vankeytech.pmp.pms.test;

import com.vankeytech.pmp.pms.intf.PmsCommentariesIntf;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PmsCommentariesIntfTest {
    @Autowired
    private PmsCommentariesIntf pmsCommentariesIntf;

    @Test
    public void test(){
        pmsCommentariesIntf.updateAccordingStateById(1);
    }
}