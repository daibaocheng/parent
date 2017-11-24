package com.vankeytech.pmp.pms.intf;


import com.vankeytech.pmp.pms.entity.PmsInformAnnouncement;

import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Condition;

/**
 * @author daibaocheng
 */
public interface PmsInformAnnouncementIntf {
    /**
     * 条件查询
     * @param map
     * @return
     */
    List<PmsInformAnnouncement> selectPmsInformAnnouncementByCondition(Map<String,Object> map);
    /**
     * 查询所有公告信息
     * @return
     */
    List<PmsInformAnnouncement> selectAll() ;


    /**
     * 通过id查询公告信息
     * @param ids
     * @return
     */
    List<PmsInformAnnouncement> selectByIds(String ids);

    /**
     * 查询所有公告条数
     * @param pmsInformAnnouncement
     * @return
     */
    Integer selectCount(PmsInformAnnouncement pmsInformAnnouncement);

    /**
     * 增加单条公告
     * @param pmsInformAnnouncement
     * @return
     */
    Integer insertPmsInformAnnouncement(PmsInformAnnouncement pmsInformAnnouncement) ;

    /**
     * 增加多条公告
     * @param pmsInformAnnouncementList
     * @return
     */
    Integer insertPmsInformAnnouncementList(List<PmsInformAnnouncement> pmsInformAnnouncementList) ;

    /**
     * 修改单条公告
     * @param pmsInformAnnouncement
     * @return
     */
    Integer updatePmsInformAnnouncement(PmsInformAnnouncement pmsInformAnnouncement) ;

    /**
     * 通过主键删除单条公告
     * @param id
     * @return
     */
    Integer deleteByPrimaryKey(Integer id) ;

    /**
     * 通过主键删除多条公告
     * @param ids
     * @return
     */
    Integer deleteByIds(String ids) ;
}
