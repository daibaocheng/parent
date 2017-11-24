package com.vankeytech.pmp.pms.service.impl;

import com.vankeytech.baseservice.impl.BaseService;
import com.vankeytech.pmp.pms.entity.PmsVisitors;
import com.vankeytech.pmp.pms.mapper.PmsCommentariesMapper;
import com.vankeytech.pmp.pms.mapper.PmsVisitorsMapper;
import com.vankeytech.pmp.pms.service.PmsVisitorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @author daibaocheng
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class PmsVisitorsServiceImpl  extends BaseService<PmsVisitors> implements PmsVisitorsService {
    public PmsVisitorsServiceImpl(PmsVisitorsMapper pmsVisitorsMapper) {
        super(pmsVisitorsMapper);
    }

    @Autowired
    private PmsVisitorsService pmsVisitorsService;

    @Override
    public List<PmsVisitors> selectPmsVisitorsByconditions(Map<String, Object> map) {
        return pmsVisitorsService.selectPmsVisitorsByconditions(map);
    }
}
