package com.soft.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
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
@TableName("s_order")
public class SOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId
    private Integer orderId;

    private String destination;

    private String departure;

    private Date time;

    private String orderName;

    private String payerName;

    private Integer cost;

    private String transport;


}
