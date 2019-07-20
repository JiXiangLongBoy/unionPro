package com.uniteproject.controller;

import com.uniteproject.pojo.Baby;
import com.uniteproject.pojo.UserImage;
import com.uniteproject.service.BabyService;
import com.uniteproject.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
public class BabyController {

    @Autowired
    BabyService babyService;

    @Autowired
    UserService userService;

    @Value("C:\\AMD\\")
    String imageDir;

    @Value("http://10.8.157.38:80/img/")
    String imageURL;

    @ApiOperation("展示的宝宝的信息,点击照片和成长记录的信息都可以取到")
    @RequestMapping("/showBaby")
    public Baby showBaby(int babyId){

     Baby baby =  babyService.selectBabyById(babyId);

      return baby;
    }


    /*@ApiOperation("展示相册的所有照片，需要用户的id，通过id找到相片相对应的url")
    @RequestMapping("/showAllImg")
    public List<UserImage> showAllImg(int userId){

        List<UserImage> list = userService.showAllImg(userId);

        return list;

    }*/

    @ApiOperation("图片上传")
    @RequestMapping("/upLoadImg")

    public String upLoadImage(HttpServletRequest request, MultipartFile image_file, HttpSession session) throws IOException {

        String oldFilename = image_file.getOriginalFilename();
        System.out.println(oldFilename);

        //只是为得到一个新的名字
        String suffixName = oldFilename.substring(oldFilename.lastIndexOf("."));
        String newFileName = UUID.randomUUID().toString().replace("-","")+suffixName;

        //为了将图片进行归类，我们可以以时间的形式进行文件夹的创建
        Date date =new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dirName = dateFormat.format(date);


        String targetName = imageDir +dirName;
        File file = new File(targetName);
        if(!file.exists()){
            file.mkdirs();
        }
        image_file.transferTo(new File(targetName,newFileName));


        String babyId = (String) session.getAttribute("userAccount");
        //保存到数据库
        int result2 = babyService.insertUserImageByBabyId(imageURL+dirName+"/"+newFileName,babyId);

        return result2 >0 ? "success" : "fail";
    }




}
