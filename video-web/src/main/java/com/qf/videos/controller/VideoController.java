package com.qf.videos.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.videos.pojo.Video;
import com.qf.videos.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author l
 * @since 2020-12-23
 */
@RestController
@RequestMapping("/video")
public class VideoController {
    @Autowired
    private VideoService videoService;

    @RequestMapping("/findAll")
    public List<Video> findAll(){
        return videoService.findAll();
    }

    @RequestMapping("/findByPage")
    public PageInfo findByPage(@RequestParam(defaultValue = "1") Integer pageNum,
                               @RequestParam(defaultValue = "5") Integer pageSize){

        PageHelper.startPage(pageNum,pageSize);
        List<Video> Videos = videoService.findAll();
        PageInfo<Video> pageInfo = new PageInfo<>(Videos);
        return pageInfo;
    }

}
