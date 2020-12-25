package com.qf.videos.service.impl;

import com.qf.videos.pojo.Course;
import com.qf.videos.mapper.CourseMapper;
import com.qf.videos.service.CourseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author l
 * @since 2020-12-23
 */
@Service
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course> implements CourseService {
    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<Course> findAll() {
        return courseMapper.findAll();
    }

    @Override
    public Course findById(String id) {
        return courseMapper.findById(id);
    }

    @Override
    public void insert(Course course) {
        courseMapper.insert(course);
    }

    @Override
    public void modify(Course course) {
        courseMapper.updateById(course);
    }

    @Override
    public void deleteById(String id) {
        courseMapper.deleteById(id);
    }

    @Override
    public void deleteByIds(String[] ids) {
        courseMapper.deleteBatchIds(Arrays.asList(ids));
    }
}
