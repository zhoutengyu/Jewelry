package com.jewelry.service.impl;

import com.jewelry.mapper.UserMapper;
import com.jewelry.model.vo.User;
import com.jewelry.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by admin on 2018/7/20.
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> getList() {
        return userMapper.getList();
    }
}
