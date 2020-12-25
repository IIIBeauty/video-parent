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
@RequestMapping("video")
public class VideoController {
    @Autowired
    private VideoService videoService;

    @RequestMapping("findAll")
    public List<Video> findAll(){
        return videoService.findAll();
    }

    @RequestMapping("findPage")
    public PageInfo findPage(@RequestParam(defaultValue = "1") Integer pageNum,
                             @RequestParam(defaultValue = "5") Integer pageSize){

        PageHelper.startPage(pageNum,pageSize);


        List<Video> videos = videoService.findAll();

        PageInfo<Video> pageInfo = new PageInfo<>(videos);

        return pageInfo;
    }

    @RequestMapping("findById")
    public Video findById(String id) {
        return videoService.findById(id);
    }

    @RequestMapping("insertVideo")
    public String insert(Video video) {
        videoService.insertVideo(video);
        return "add success";
    }

    @RequestMapping("deleteById")
    public String delete(String id) {
        videoService.deleteById(id);
        return "delete success";
    }

    @RequestMapping("deleteByIds")
    public String deleteByIds(String [] ids) {
        videoService.deleteByIds(ids);
        return "deleteByIds success";
    }

    @RequestMapping("modifyVideo")
    public String modify(Video video) {
        videoService.updateVideo(video);
        return "modify success";
    }

}
