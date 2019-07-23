package com.uniteproject.utils;

import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import org.springframework.web.multipart.MultipartFile;


/**
 * 七牛上传工具类
 */
public class qiNiuUploadUtils {
    private static String accessKey="381vKim_D4-KZS-pevCaVzPoFkRZMEEk-0AniqD-";//七牛的akey密钥
    private static String secretKey="5C4uWdHkAO153XsvbQ_iqrmI1JzyZahAlfnOp3Y-";//七牛的sKey密钥
    private static String bucket="java_xuan";//存储空间名称
    private static String url="puzhmkv3i.bkt.clouddn.com";//七牛的外域连接


    /**
     * 上传 MultipartFile 文件
     * @return ： url 连接
     */
    public String upload(MultipartFile multipartFile) {
        //构造一个带指定Zone对象的配置类
        Configuration cfg = new Configuration(Zone.zone0());
        //...其他参数参考类注释
        UploadManager uploadManager = new UploadManager(cfg);
        //默认不指定key的情况下，以文件内容的hash值作为文件名
        String key = null;
        try {
            //byte[] uploadBytes = "hello qiniu cloud".getBytes("utf-8");
            byte[] bytes = multipartFile.getBytes();
            Auth auth = Auth.create(accessKey, secretKey);
            String upToken = auth.uploadToken(bucket);
            try {
                Response response = uploadManager.put(bytes, key, upToken);
                //解析上传成功的结果
                DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
                if (putRet!=null){

                    return url+"/"+putRet.hash;//返回直接能访问文件的url
                }
                System.out.println(putRet.key);
                System.out.println(putRet.hash);
            } catch (QiniuException ex) {
                Response r = ex.response;
                System.err.println(r.toString());
                try {
                    System.err.println(r.bodyString());
                } catch (QiniuException ex2) {
                    //ignore
                }
            }
        } catch (Exception e){

        }
        return null;
    }



}
