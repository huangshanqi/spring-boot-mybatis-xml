package cn.evilcoder.tutorials.mapper;

import cn.evilcoder.tutorials.entity.UserEntity;

/**
 * Created by huangshanqi on 2017/7/25.
 */
public interface UserMapper {

    UserEntity findById(Long id);

}
