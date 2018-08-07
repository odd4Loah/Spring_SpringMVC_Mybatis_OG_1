package com.lihoo.ssm.controller;

import com.lihoo.ssm.model.UploadImageFile;
import org.apache.commons.lang.RandomStringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * @author lihoo
 * @Title: UploadController
 * @ProjectName Spring_SpringMVC_Mybatis_OG_1
 * @Description: TODO
 * @date 2018/8/7-14:01
 */

@Controller
public class UploadController {

    @RequestMapping("/uploadImage")
    public ModelAndView upload(HttpServletRequest request, UploadImageFile file) throws Exception {
        String name = RandomStringUtils.randomAlphanumeric(10);
        String newFileName = name + ".jpg";
        File newFile = new File(request.getServletContext().getRealPath("/image"), newFileName);
        newFile.getParentFile().mkdirs();
        file.getImage().transferTo(newFile);

        ModelAndView mav = new ModelAndView("showUploadedFile");
        mav.addObject("imageName", newFileName);
        return mav;
    }

}
