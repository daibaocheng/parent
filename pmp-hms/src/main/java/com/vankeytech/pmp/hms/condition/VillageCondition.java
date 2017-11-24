package com.vankeytech.pmp.hms.condition;

/**
 * @author Administrator
 */
public class VillageCondition {

    /**
     * 地理位置编号
     */
    private String regionCode;

    /**
     * 小区名
     */
    private String VillageName;

    public VillageCondition() {
    }

    public VillageCondition(String regionCode, String villageName) {
        this.regionCode = regionCode;
        VillageName = villageName;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getVillageName() {
        return VillageName;
    }

    public void setVillageName(String villageName) {
        VillageName = villageName;
    }
}
