package con.shiyun.paradise.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import con.shiyun.paradise.service.BrandService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@Controller
@RequestMapping("/brand/")
public class BrandController {

    @Resource
    private BrandService brandService;

    @RequestMapping("brand.do")
    public String User() {
        return "brand";
    }

    //查询品牌
    @RequestMapping("selectBrand.do")
    @ResponseBody
    public Map<String, Object> selectBrand() {
        Map<String, Object> result = new HashMap<String, Object>();

        List<Map<String, Object>> roles = brandService.selectBrand();
        int count = brandService.selectBrandCount();

        if (roles != null && roles.size() > 0) {

            result.put("count", count);
            result.put("code", 1);
            result.put("data", roles);
        } else {
            result.put("count", count);
            result.put("code", 0);
            result.put("msg", "无此品牌");
        }

        return result;
    }

}

