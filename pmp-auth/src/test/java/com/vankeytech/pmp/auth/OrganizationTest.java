package com.vankeytech.pmp.auth;


import com.vankeytech.pmp.auth.entity.Organization;
import com.vankeytech.pmp.auth.intf.OrganizationIntf;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrganizationTest {


    @Autowired
    private OrganizationIntf organizationIntf;

    @Test
    public void insertOrgan(){
        Organization organization=new Organization();
        organization.setPid(0L);
        organization.setOrganizationType("独立组织");
        organization.setOrganizationPhone("12345678");
        organization.setOrganizationName("钥匙");
        organization.setOrganizationLocation("成都市武侯区");
        organization.setOrganizationAddress("杨开大道");
        organization.setOrganizationDescribe("fdfdsfds");
        organization.setCreatedAt(new Date());
        organization.setPid(5L);
        organizationIntf.insert(organization);
    }

    @Test
    public void updateOrg(){
        Organization organization = new Organization();
        organization.setPid(0L);
        organization.setOrganizationId(3L);
        organization.setUpdatedAt(new Date());
        organization.setOrganizationName("商务");
        organization.setCreatedAt(new Date());
        organizationIntf.updateName(organization);
    }

    @Test
    public void getAll(){
        List<Organization> list=organizationIntf.getOrganizationAll();
        List<Organization> orList=listToTree(list,0L);
    }

    /**
     *
     * @param list
     * @param pid
     * @return
     */
    public List<Organization> listToTree(List<Organization> list, Long pid){
        List<Organization> organizations=new ArrayList<Organization>();
        for(Organization or: list){
            long oid=or.getOrganizationId();

            if(oid == pid){
                List<Organization> cds=listToTree(list,or.getOrganizationId());
                if(cds.size() > 0){
                    or.setOrganizationList(cds);
                }
                organizations.add(or);
            }
        }
        return organizations;
    }

}
