package com.soft.service;

import com.soft.entity.SOrder;
import com.baomidou.mybatisplus.extension.service.IService;

import java.io.IOException;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author th_js_wcx
 * @since 2023-05-31
 */
public interface ISOrderService extends IService<SOrder> {

    int insert(SOrder sOrder);
    int update(SOrder sOrder);
    int delete(SOrder sOrder);
    List<SOrder> queryAll();
    SOrder queryOne(SOrder sOrder);


}
