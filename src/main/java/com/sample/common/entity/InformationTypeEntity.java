package com.sample.common.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.seasar.doma.*;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "information_type")
public class InformationTypeEntity {

    @Id
    @Column(name = "information_type_id")
    private long tableId;

    @Id
    @Column(name = "information_type")
    private Integer informationType;

    @Column(name = "create_id")
    private String createId;

    @Column(name = "update_id")
    private String updateId;

    @Column(name = "create_date_time")
    private LocalDateTime createDateTime;

    @Column(name = "update_date_time")
    private LocalDateTime updateDateTime;

    @Builder
    public InformationTypeEntity(
            long tableId,
            Integer informationType,
            String createId,
            String updateId,
            LocalDateTime createDateTime,
            LocalDateTime updateDateTime) {

        this.tableId = tableId;
        this.informationType = informationType;
        this.createId = createId;
        this.updateId = updateId;
        this.createDateTime = createDateTime;
        this.updateDateTime = updateDateTime;
    }

}
