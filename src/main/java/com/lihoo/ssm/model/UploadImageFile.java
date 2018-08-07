package com.lihoo.ssm.model;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author lihoo
 * @Title: UploadImageFile
 * @ProjectName Spring_SpringMVC_Mybatis_OG_1
 * @Description: TODO
 * @date 2018/8/7-13:59
 */


public class UploadImageFile {
    MultipartFile image;

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }
}
