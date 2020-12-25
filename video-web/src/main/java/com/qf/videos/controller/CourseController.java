package com.qf.videos.controller;


import com.qf.videos.pojo.Course;
import com.qf.videos.pojo.Video;
import com.qf.videos.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

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
@RequestMapping("//course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @RequestMapping("findAll")
    public List<Course> findAll() {
        return courseService.findAll();
    }

    @RequestMapping("findById")
    public Course findById(String id) {
        return courseService.findById(id);
    }

    @RequestMapping("insert")
    public String insert(Course course) {
        courseService.insert(course);
        return "insert success";
    }

    @RequestMapping("modify")
    public String modify(Course course) {
        courseService.modify(course);
        return "modify success";

    }

    @RequestMapping("deleteById")
    public String deleteById(String id) {
        courseService.deleteById(id);
        return "delete success";

    }

    @RequestMapping("deleteByIds")
    public String deleteByIds(String [] ids) {
        courseService.deleteByIds(ids);
        return "deleteByIds success";

    }

}
