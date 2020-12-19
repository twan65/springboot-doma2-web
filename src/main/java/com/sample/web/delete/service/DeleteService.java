package com.sample.web.delete.service;

import com.sample.common.dao.InformationDao;
import com.sample.common.entity.InformationEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

@RequiredArgsConstructor
@Service
public class DeleteService {

    private final InformationDao informationDao;

    /**
     * お知らせの削除を行う。
     * @param id お知らせID
     * @param userId ユーザー情報
     * @throws IllegalArgumentException
     */
    @Transactional(rollbackFor = Exception.class)
    public void remove(Integer id, String userId) throws IllegalArgumentException {

        InformationEntity informationEntity = informationDao.selectNotDeleteById(id);
        if (Objects.isNull(informationEntity)) {
            throw new IllegalArgumentException("該当お知らせがありません。ID = " + id);
        }

        informationEntity.delete(userId);
        informationDao.delete(informationEntity);
    }
}
