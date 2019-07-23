package com.uniteproject.controller;

import com.uniteproject.pojo.Baby;
import com.uniteproject.pojo.BabyDid;
import com.uniteproject.pojo.Community;
import com.uniteproject.pojo.UserImage;
import com.uniteproject.service.BabyService;
import com.uniteproject.service.UserService;
import com.uniteproject.utils.qiNiuUploadUtils;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @ApiOperation("图片上传,image_file要和提交文件的input框中的name值保持一致")
    @RequestMapping("/upLoadImg")
    public String upLoadImage(UserImage userImage, MultipartFile file) throws IOException {

        String oldFilename = file.getOriginalFilename();
        System.out.println(oldFilename);

        //只是为得到一个新的名字
        String suffixName = oldFilename.substring(oldFilename.lastIndexOf("."));
        String newFileName = UUID.randomUUID().toString().replace("-", "") + suffixName;

        //为了将图片进行归类，我们可以以时间的形式进行文件夹的创建
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dirName = dateFormat.format(date);


        String targetName = imageDir + dirName;
        File file1 = new File(targetName);
        if (!file1.exists()) {
            file1.mkdirs();
        }
        file.transferTo(new File(targetName, newFileName));

        /*
        String babyId = (String) session.getAttribute("babyAccount");*/
        int userId = userImage.getUserId();
        //保存到数据库
        String userDesc = userImage.getImgDesc();
        int result2 = babyService.insertUserImage(imageURL + dirName + "/" + newFileName, userDesc, userId);

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
