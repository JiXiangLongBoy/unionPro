package com.uniteproject.controller;

import com.uniteproject.pojo.Baby;
import com.uniteproject.pojo.BabyDid;
import com.uniteproject.pojo.UserImage;
import com.uniteproject.service.BabyService;
import com.uniteproject.service.UserService;
import com.uniteproject.utils.qiNiuUploadUtils;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin//允许跨域访问
@RequestMapping(method = {RequestMethod.GET,RequestMethod.POST})
public class BabyController {

    @Autowired
    BabyService babyService;

    @Autowired
    UserService userService;

    @Value("C:\\AMD\\")
    String imageDir;

    @Value("http://10.8.157.38:80/img/")
    String imageURL;



    @ApiOperation("展示的宝宝的信息,点击照片和成长记录的信息都可以取到,包括宝宝的成长记录")
    @RequestMapping("/showBaby")
    public Baby showBaby(int userId){

     Baby baby =  babyService.selectBabyById(userId);

      return baby;
    }



    @ApiOperation("展示相册的所有照片，需要用户的id，通过id找到相片相对应的url")
    @RequestMapping("/showAllImg")
    public List<UserImage> showAllImg(int userId){

        List<UserImage> list = babyService.showAllImg(userId);

        return list;

    }

    @ApiOperation("图片上传,image_file要和提交文件的input框中的name值保持一致，图片保存在云服务器上")
    @RequestMapping("/upLoadImg")
    public String upLoadImage(UserImage userImage, MultipartFile file) throws IOException {

        System.out.println("执行方法");
        qiNiuUploadUtils qiNiuUploadUtils = new qiNiuUploadUtils();
        String upload =qiNiuUploadUtils.upload(file);//获得用户上换头像
        System.out.println("lianjie:"+upload);

        userImage.setImgUrl(upload);
        int result2 = babyService.saveAndInsertImage(userImage);
        return result2 > 0 ? "success" : "fail";
    }

    @ApiOperation("展示成就")
    @RequestMapping("/showbabydid")
    public List<BabyDid> showbaydid(int userId){

       List<BabyDid> list = babyService.selectbabydid(userId);

        return list;

    }

    @ApiOperation("添加宝宝信息,需要用户的id，知道为哪个宝宝添加信息")
    @RequestMapping("/addBaby")
    public String addBaby(int userId){

       int info = babyService.insertBaby(userId);
       //info大于0则返回插入成功，反之失败
       return info > 0 ? "success":"false";
    }



}
