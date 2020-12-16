package com.sample.web.edit.service;

import com.sample.common.dao.InformationDao;
import com.sample.common.dao.InformationTypeDao;
import com.sample.common.entity.InformationEntity;
import com.sample.web.post.model.PostRequestForm;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Slf4j
@RequiredArgsConstructor
@Service
public class EditService {

  private final InformationDao informationDao;
  private final InformationTypeDao informationTypeDao;

  public PostRequestForm findById(Integer id) throws IllegalAccessException {

    InformationEntity informationEntity = informationDao.selectNotDeleteById(id);
    if (Objects.isNull(informationEntity)) {
      throw new IllegalAccessException();
    }

    List<Integer> informationTypeList = informationTypeDao.selectInformationTypeListBy(id);

    return PostRequestForm.builder()
        .entity(informationEntity)
        .informationTypeList(informationTypeList)
        .build();
  }
}
