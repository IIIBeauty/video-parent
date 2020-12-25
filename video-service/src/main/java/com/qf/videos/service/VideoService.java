package com.qf.videos.service;

import com.qf.videos.pojo.Video;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author l
 * @since 2020-12-23
 */
public interface VideoService extends IService<Video> {

    List<Video> findAll();

    Video findById(String id);

    void insertVideo(Video video);

    void deleteById(String id);

    void deleteByIds(String[] ids);

    void updateVideo(Video video);
}
