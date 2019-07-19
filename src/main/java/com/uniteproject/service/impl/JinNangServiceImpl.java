package com.uniteproject.service.impl;

import com.uniteproject.mapper.JinNangMapper;
import com.uniteproject.pojo.BannerUrl;
import com.uniteproject.service.JinNangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Service;

@Service
public class JinNangServiceImpl implements JinNangService {

    @Autowired
    JinNangMapper jinNangMapper;

    @Override
    public BannerUrl getBannerUrl() {
        BannerUrl banner = jinNangMapper.getBannerUrl();
        return banner;
    }
}
