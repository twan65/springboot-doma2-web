package com.sample.common.dao;

import com.sample.common.entity.InformationEntity;
import com.sample.common.entity.SearchEntity;
import com.sample.common.entity.SearchResponseEntity;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;
import org.seasar.doma.jdbc.SelectOptions;

import java.util.List;

@ConfigAutowireable
@Dao
public interface InformationDao {

    @Select
    InformationEntity selectNotDeleteById(Integer id);

    @Insert
    int insertInformation(InformationEntity entity);

    @Select
    Integer countSearchTargetBy(SearchEntity entity);

    @Select
    List<SearchResponseEntity> selectInformationListBy(SearchEntity entity, SelectOptions options);

}
