package com.soft.service;

import com.soft.entity.SOrder;
import com.soft.entity.SUser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author th_js_wcx
 * @since 2023-05-31
 */
public interface ISUserService extends IService<SUser> {
    int insert(SUser sUser);
    int update(SUser sUser);
    int delete(SUser sUser);
    List<SUser> queryAll();
    public SUser queryOne(SUser sUser);

}
