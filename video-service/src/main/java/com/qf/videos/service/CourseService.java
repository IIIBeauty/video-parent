package com.qf.videos.service;

import com.qf.videos.pojo.Course;
import com.baomidou.mybatisplus.extension.service.IService;
import com.qf.videos.pojo.Video;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author l
 * @since 2020-12-23
 */
public interface CourseService extends IService<Course> {

    List<Course> findAll();

    Course findById(String id);

    void insert(Course course);

    void modify(Course course);

    void deleteById(String id);

    void deleteByIds(String[] ids);
}
