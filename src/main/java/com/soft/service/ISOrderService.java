package com.soft.service;

import com.soft.entity.SOrder;
import com.baomidou.mybatisplus.extension.service.IService;

import java.io.IOException;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author th_js_wcx
 * @since 2023-05-31
 */
public interface ISOrderService extends IService<SOrder> {

    void insert(SOrder sOrder) throws IOException;
}
