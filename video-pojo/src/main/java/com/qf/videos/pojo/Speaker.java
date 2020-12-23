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
public class Speaker implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 主讲人姓名
     */
    private String speakerName;

    /**
     * 主讲人简介
     */
    private String speakerDesc;

    /**
     * 职位
     */
    private String speakerJob;

    private String headImgUrl;


}
