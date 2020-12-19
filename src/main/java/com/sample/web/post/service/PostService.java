package com.sample.web.post.service;

import com.sample.common.dao.InformationDao;
import com.sample.common.dao.InformationTypeDao;
import com.sample.common.entity.InformationEntity;
import com.sample.web.post.model.PostRequestForm;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@RequiredArgsConstructor
@Service
public class PostService {

  private final InformationDao informationDao;
  private final InformationTypeDao informationTypeDao;

  /**
   * お知らせ登録処理を行う。
   * @param postRequestForm お知らせ情報
   * @param userId ユーザーID
   */
  @Transactional(rollbackFor = Exception.class)
  public void save(PostRequestForm postRequestForm, String userId) {

    InformationEntity entity = postRequestForm.toInformationEntity(userId);
    val informationId = informationDao.insertInformation(entity);

    for (Integer type : postRequestForm.getInformationTypeList()) {
      informationTypeDao.insertInformationType(
          postRequestForm.toInformationTypeEntity(informationId, type, userId));
    }

    log.info("お知らせ登録ID：" + informationId);
  }
}