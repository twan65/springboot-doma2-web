package com.sample.web.edit.service;

import com.sample.common.dao.InformationDao;
import com.sample.common.dao.InformationTypeDao;
import com.sample.common.entity.InformationEntity;
import com.sample.web.post.model.PostRequestForm;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.seasar.doma.jdbc.Result;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

/**
 * 編集サービス
 */
@Slf4j
@RequiredArgsConstructor
@Service
public class EditService {

  private final InformationDao informationDao;
  private final InformationTypeDao informationTypeDao;

  /**
   * お知らせ情報を返却する。
   * @param id お知らせID
   * @return お知らせ情報
   * @throws IllegalAccessException
   */
  public PostRequestForm findById(Integer id) throws IllegalAccessException {

    InformationEntity informationEntity = informationDao.selectNotDeleteById(id);
    if (Objects.isNull(informationEntity)) {
      throw new IllegalAccessException("該当お知らせがありません。ID = " + id);
    }

    List<Integer> informationTypeList = informationTypeDao.selectInformationTypeListBy(id);

    return PostRequestForm.builder()
        .entity(informationEntity)
        .informationTypeList(informationTypeList)
        .build();
  }

  /**
   * お知らせ更新処理を行う。
   * @param form お知らせ情報
   * @param userId ユーザーID
   * @throws IllegalAccessException
   */
  @Transactional(rollbackFor = Exception.class)
  public void edit(PostRequestForm form, String userId) throws IllegalAccessException {

    InformationEntity entity = form.toInformationEntity(userId);

    int editResult =
        informationDao.updateBy(entity, form.getUpdateDateTime());
    // 同時更新を防ぐために、削除されているまたは更新がされている場合は処理を行わない。
    if (editResult == 0) {
      throw new IllegalAccessException("既に更新されています。ID=" + form.getId());
    }

    // 該当お知らせタイプの削除
    informationTypeDao.deleteBy(form.getId());

    // お知らせタイプ追加
    form.getInformationTypeList().stream()
        .map(type -> form.toInformationTypeEntity(form.getId(), type, userId))
        .forEach(informationTypeDao::insertInformationType);
  }
}
