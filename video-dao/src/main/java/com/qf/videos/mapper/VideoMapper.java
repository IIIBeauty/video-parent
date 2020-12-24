package com.qf.videos.mapper;

import com.qf.videos.pojo.Video;
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
public interface VideoMapper extends BaseMapper<Video> {

    List<Video> findAll();
}
