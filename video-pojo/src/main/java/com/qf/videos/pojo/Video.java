package com.qf.videos.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author l
 * @since 2020-12-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Video implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 简介
     */
    private String detail;

    /**
     * 时长
     */
    private Integer time;

    /**
     * 关联主讲人
     */
    private Integer speakerId;

    /**
     * 关联课程表
     */
    private Integer courseId;

    /**
     * 视频播放地址
     */
    private String videoUrl;

    /**
     * 封面地址
     */
    private String imageUrl;

    /**
     * 播放次数
     */
    private Integer playNum;

    private Speaker speaker;
<<<<<<< HEAD
=======
    private Course course;
>>>>>>> origin/master

    private Course course;
}
