package com.vankeytech.pmp.pms.service.impl;

import com.vankeytech.baseservice.impl.BaseService;
import com.vankeytech.pmp.pms.entity.PmsCommentaries;
import com.vankeytech.pmp.pms.mapper.PmsCommentariesMapper;
import com.vankeytech.pmp.pms.service.PmsCommentariesService;
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
public class PmsCommentariesServiceImpl extends BaseService<PmsCommentaries> implements PmsCommentariesService {
    public PmsCommentariesServiceImpl(PmsCommentariesMapper pmsCommentariesMapper) {
        super(pmsCommentariesMapper);
    }

    @Autowired
    private PmsCommentariesMapper pmsCommentariesMapper;

    @Override
    public List<PmsCommentaries> selectByconditions(Map<String, Object> map) {
        return pmsCommentariesMapper.selectByCondition(map);
    }

    @Override
    public Integer updateAccordingStateById(Integer id) {
        return pmsCommentariesMapper.updateAccordingStateById(id);
    }

//    @Override
//    public List<Map<String, Object>> selectAllByConcatenon() {
//        return pmsCommentariesMapper.selectAllByConcatenon();
//    }
}
