package cn.evilcoder.tutorials.service;

import cn.evilcoder.tutorials.dao.UserDao;
import cn.evilcoder.tutorials.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by huangshanqi on 2017/7/26.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public UserEntity findById(Long id) {
        return userDao.findById(id);
    }
}
