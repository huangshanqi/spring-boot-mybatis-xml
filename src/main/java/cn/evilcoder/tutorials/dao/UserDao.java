package cn.evilcoder.tutorials.dao;

import cn.evilcoder.tutorials.entity.UserEntity;
import cn.evilcoder.tutorials.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by huangshanqi on 2017/7/26.
 */
@Repository
public class UserDao extends BaseDao {

    @Autowired
    private UserMapper userMapper;


    public UserEntity findById(Long id) {
        return userMapper.findById(id);
    }
}
