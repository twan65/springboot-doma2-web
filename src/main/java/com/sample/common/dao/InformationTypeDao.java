package com.sample.common.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import java.util.List;

@ConfigAutowireable
@Dao
public interface InformationTypeDao {

    @Select
    List<Integer> selectInformationTypeListBy(Integer informationId);
}
