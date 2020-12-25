package com.qf.videos.service.impl;

import com.qf.videos.pojo.Video;
import com.qf.videos.mapper.VideoMapper;
import com.qf.videos.service.VideoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author l
 * @since 2020-12-23
 */
@Service
public class VideoServiceImpl extends ServiceImpl<VideoMapper, Video> implements VideoService {

    @Autowired
    private VideoMapper videoMapper;

    @Override
    public List<Video> findAll() {
        return videoMapper.findAll();

    }

    @Override
    public Video findById(String id) {
        return videoMapper.findById(id);
    }

    @Override
    public void insertVideo(Video video) {
        videoMapper.insert(video);
    }

    @Override
    public void deleteById(String id) {
        videoMapper.deleteById(id);
    }

    @Override
    public void deleteByIds(String[] ids) {
        videoMapper.deleteBatchIds(Arrays.asList(ids));
    }

    @Override
    public void updateVideo(Video video) {
        videoMapper.updateById(video);

    }
}
