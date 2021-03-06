package com.qf.videos.mapper;

import com.qf.videos.pojo.Subject;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 学科表，存储各个学科的名字 Mapper 接口
 * </p>
 *
 * @author l
 * @since 2020-12-23
 */
@Repository

public interface SubjectMapper extends BaseMapper<Subject> {

}
