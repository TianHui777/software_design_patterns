package com.soft.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.soft.Utils.MybatisUtil;
import com.soft.entity.SOrder;
import com.soft.dao.SOrderMapper;
import com.soft.service.ISOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author th_js_wcx
 * @since 2023-05-31
 */

public class SOrderServiceImpl extends ServiceImpl<SOrderMapper, SOrder> implements ISOrderService {
    static SqlSession sqlSession = MybatisUtil.buildSqlSessionFactory();
    SOrderMapper mapper = sqlSession.getMapper(SOrderMapper.class);
    @Override
    public int update(SOrder sOrder) {
        UpdateWrapper<SOrder>  updateWrapper=Wrappers.update();
        SOrder q=new SOrder();
        q.setOrderId(sOrder.getOrderId());
        updateWrapper.setEntity(q);
        int ans=mapper.update(sOrder,updateWrapper);
        sqlSession.commit();
        return ans;
    }

    @Override
    public int delete(SOrder sOrder) {
        UpdateWrapper<SOrder> queryWrapper = Wrappers.update();
        SOrder q=new SOrder();
        q.setOrderId(sOrder.getOrderId());
        queryWrapper.setEntity(q);
        int ans=mapper.delete(queryWrapper);
        sqlSession.commit();
        return ans;
    }

    @Override
    public List<SOrder> queryAll() {
        QueryWrapper<SOrder> queryWrapper = Wrappers.query();
        List<SOrder> ans = new ArrayList<>();
        for (SOrder selectObj : mapper.selectList(queryWrapper)) {
            ans.add(selectObj);
        }
        return ans;
    }

    @Override
    public SOrder queryOne(SOrder sOrder) {
        QueryWrapper queryWrapper=Wrappers.query();
        queryWrapper.setEntity(sOrder);
        return mapper.selectOne(queryWrapper);
    }

    @Override
    public int insert(SOrder sOrder) {
        int ans=mapper.insert(sOrder);
        sqlSession.commit();
        return ans;
    }


}
