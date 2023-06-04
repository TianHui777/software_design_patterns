package com.soft.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.soft.Utils.MybatisUtil;
import com.soft.dao.SOrderMapper;
import com.soft.entity.SOrder;
import com.soft.entity.SUser;
import com.soft.dao.SUserMapper;
import com.soft.service.ISUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.ibatis.session.SqlSession;

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
public class SUserServiceImpl extends ServiceImpl<SUserMapper, SUser> implements ISUserService {
    static SqlSession sqlSession = MybatisUtil.buildSqlSessionFactory();
    SUserMapper mapper = sqlSession.getMapper(SUserMapper.class);

    @Override
    public int update(SUser sUser) {
        UpdateWrapper<SUser> updateWrapper = Wrappers.update();
        SUser q = new SUser();
        q.setUserId(sUser.getUserId());
        updateWrapper.setEntity(q);
        int ans = mapper.update(sUser, updateWrapper);
        sqlSession.commit();
        return ans;
    }

    @Override
    public int delete(SUser sUser) {
        UpdateWrapper<SUser> queryWrapper = Wrappers.update();
        SUser q=new SUser();
        q.setUserId(sUser.getUserId());
        queryWrapper.setEntity(q);
        int ans=mapper.delete(queryWrapper);
        sqlSession.commit();
        return ans;
    }

    @Override
    public List<SUser> queryAll() {
        QueryWrapper<SUser> queryWrapper = Wrappers.query();
        List<SUser> ans = new ArrayList<>();
        for (SUser selectObj : mapper.selectList(queryWrapper)) {
            ans.add(selectObj);
        }
        return ans;
    }

    @Override
    public SUser queryOne(SUser sUser) {
        QueryWrapper<SUser> queryWrapper = Wrappers.query();
        queryWrapper.setEntity(sUser);
        return mapper.selectOne(queryWrapper);
    }

    @Override
    public int insert(SUser sUser) {
        int ans = mapper.insert(sUser);
        sqlSession.commit();
        return ans;
    }
}
