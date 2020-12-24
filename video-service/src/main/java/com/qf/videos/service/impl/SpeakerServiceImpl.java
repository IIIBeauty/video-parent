package com.qf.videos.service.impl;

import com.qf.videos.pojo.Speaker;
import com.qf.videos.mapper.SpeakerMapper;
import com.qf.videos.service.SpeakerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
public class SpeakerServiceImpl extends ServiceImpl<SpeakerMapper, Speaker> implements SpeakerService {

    @Autowired
    private SpeakerMapper speakerMapper;

    @Override
    public List<Speaker> findAll() {
        return speakerMapper.selectList(null);
    }
}
