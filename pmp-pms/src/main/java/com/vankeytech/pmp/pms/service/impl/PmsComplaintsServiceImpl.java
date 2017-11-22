package com.vankeytech.pmp.pms.service.impl;

import com.vankeytech.baseservice.impl.BaseService;
import com.vankeytech.pmp.pms.entity.PmsComplaints;
import com.vankeytech.pmp.pms.mapper.PmsComplaintsMapper;
import com.vankeytech.pmp.pms.mapper.PmsInformAnnouncementMapper;
import com.vankeytech.pmp.pms.service.PmsComplaintsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author daibaocheng
 */
@Service
public class PmsComplaintsServiceImpl extends BaseService<PmsComplaints> implements PmsComplaintsService {
    public PmsComplaintsServiceImpl(PmsComplaintsMapper pmsComplaintsMapper) {
        super(pmsComplaintsMapper);
    }

    @Autowired
    private PmsComplaintsMapper pmsComplaintsMapper;

    @Override
    public List<PmsComplaints> selectByconditions(Map<String, Object> map) {
        return pmsComplaintsMapper.selectByCondition(map);
    }
}
