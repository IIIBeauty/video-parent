package com.qf.videos.mapper;

import com.qf.videos.pojo.Course;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author l
 * @since 2020-12-23
 */
@Repository
public interface CourseMapper extends BaseMapper<Course> {
    List<Course> findAll();

    Course findById(String id);

}
