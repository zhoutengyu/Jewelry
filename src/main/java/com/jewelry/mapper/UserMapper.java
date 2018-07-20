package com.jewelry.mapper;

import com.jewelry.common.BaseMapper;
import com.jewelry.model.vo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by admin on 2018/7/20.
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
    List<User> getList();
}
