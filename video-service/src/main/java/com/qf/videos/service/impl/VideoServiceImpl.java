package com.qf.videos.service.impl;

import com.qf.videos.pojo.Video;
import com.qf.videos.mapper.VideoMapper;
import com.qf.videos.service.VideoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
