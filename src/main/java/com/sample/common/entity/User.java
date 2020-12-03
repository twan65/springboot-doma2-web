package com.sample.common.entity;

import lombok.Builder;
import lombok.Getter;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

import java.time.LocalDateTime;

@Getter
@Entity(immutable = true)
@Table(name = "user")
public class User {

    @Id
    @Column(name = "user_id")
    private final String userId;

    @Column(name = "password")
    private final String password;

    @Column(name = "name")
    private final String name;

    @Column(name = "is_delete")
    private final Integer deleteFlg;

    @Column(name = "create_id")
    private final String createId;

    @Column(name = "update_id")
    private final String updateId;

    @Column(name = "create_date_time")
    private final LocalDateTime createDateTime;

    @Column(name = "update_date_time")
    private final LocalDateTime updateDateTime;

    @Builder
    public User(String userId, String password, String name, Integer deleteFlg, String createId, String updateId, LocalDateTime createDateTime, LocalDateTime updateDateTime) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.deleteFlg = deleteFlg;
        this.createId = createId;
        this.updateId = updateId;
        this.createDateTime = createDateTime;
        this.updateDateTime = updateDateTime;
    }
}
