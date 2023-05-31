package com.soft.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author th_js_wcx
 * @since 2023-05-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("s_user")
public class SUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer userId;

    private String userName;

    private String password;

    private Integer isVip;


}
