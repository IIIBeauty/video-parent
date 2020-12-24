package com.qf.videos.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.videos.pojo.Speaker;
import com.qf.videos.pojo.Video;
import com.qf.videos.service.SpeakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author l
 * @since 2020-12-23
 */
@RestController
@RequestMapping("//speaker")
public class SpeakerController {

    @Autowired
    private SpeakerService speakerService;

    @RequestMapping("/findAll")
    public List<Speaker> findAll(){
        return speakerService.findAll();
    }

    @RequestMapping("/findByPage")
    public PageInfo findByPage(@RequestParam(defaultValue = "1") Integer pageNum,
                               @RequestParam(defaultValue = "5") Integer pageSize){

        PageHelper.startPage(pageNum,pageSize);
        List<Speaker> Speakers = speakerService.findAll();
        PageInfo<Speaker> pageInfo = new PageInfo<>(Speakers);
        return pageInfo;
    }


}
