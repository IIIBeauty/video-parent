package com.qf.videos.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
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
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String email;

    @TableField("phoneNum")
    private String phoneNum;

    private String password;

    private String code;

    /**
     * 昵称
     */
    @TableField("nickName")
    private String nickName;

    private String sex;

    private String birthday;

    private String address;

    @TableField("imgUrl")
    private String imgUrl;

    @TableField("createTime")
    private LocalDateTime createTime;


}
