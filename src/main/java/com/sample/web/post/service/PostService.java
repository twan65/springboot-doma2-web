package com.sample.web.post.service;

import com.sample.common.dao.InformationDao;
import com.sample.common.dao.InformationTypeDao;
import com.sample.web.post.model.PostRequestForm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostService {

    private final InformationDao searchDao;
    private final InformationTypeDao informationTypeDao;

    @Transactional(rollbackFor = Exception.class)
    public void save(PostRequestForm postRequestForm, String userId) {



    }
}
