package com.vankeytech.pmp.api.param;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class CityIds {
    @NotNull
    @Pattern(regexp = "^\\d[,\\d]*$")
    private String ids;

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }
}
