package com.vankeytech.pmp.api.common;

import com.github.crab2died.ExcelUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/common")
public class ExcelApiController {

    @PostMapping("/import")
    public void excelExport(@RequestParam Integer template, MultipartFile file, HttpServletResponse res) {
        ExcelUtils excelUtils = ExcelUtils.getInstance();

    }
}
