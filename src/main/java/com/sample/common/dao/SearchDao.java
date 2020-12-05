package com.sample.common.dao;

import com.sample.common.entity.SearchEntity;
import com.sample.common.entity.SearchResponseEntity;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;
import org.seasar.doma.jdbc.SelectOptions;

import java.util.List;

@ConfigAutowireable
@Dao
public interface SearchDao {

    @Select
    Integer countSearchTargetBy(SearchEntity entity);

    @Select
    List<SearchResponseEntity> selectInformationListBy(SearchEntity entity, SelectOptions options);

    @Select
    List<Integer> selectInformationTypeListBy(Integer informationId);

}
