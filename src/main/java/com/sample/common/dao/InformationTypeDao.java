package com.sample.common.dao;

import com.sample.common.entity.InformationTypeEntity;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import java.util.List;

@ConfigAutowireable
@Dao
public interface InformationTypeDao {

    @Insert
    int insertInformationType(InformationTypeEntity entity);

    @Delete(sqlFile = true)
    int deleteBy(Integer informationId);

    @Select
    List<Integer> selectInformationTypeListBy(Integer informationId);
}
