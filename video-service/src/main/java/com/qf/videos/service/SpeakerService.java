package com.qf.videos.service;

import com.qf.videos.pojo.Speaker;
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
public interface SpeakerService extends IService<Speaker> {

    List<Speaker> findAll();
}
