package com.soft.service.impl;

import com.soft.Utils.MybatisUtil;
import com.soft.entity.SOrder;
import com.soft.dao.SOrderMapper;
import com.soft.service.ISOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author th_js_wcx
 * @since 2023-05-31
 */

public class SOrderServiceImpl extends ServiceImpl<SOrderMapper, SOrder> implements ISOrderService {

    @Override
    public void insert(SOrder sOrder) throws IOException {
        SqlSession sqlSession = MybatisUtil.buildSqlSessionFactory();
        SOrderMapper mapper = sqlSession.getMapper(SOrderMapper.class);
        mapper.insert(sOrder);
        sqlSession.commit();
        sqlSession.close();

    }
}
