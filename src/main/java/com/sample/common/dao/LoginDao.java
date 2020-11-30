package com.sample.common.dao;

import com.sample.common.entity.User;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;

@Dao
public interface LoginDao {

    @Select
    User selectLoginUserByUserId(String userId);
}
