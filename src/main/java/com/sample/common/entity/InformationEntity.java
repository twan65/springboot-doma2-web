package com.sample.common.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.seasar.doma.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "information")
public class InformationEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String title;

  private String overview;

  @Column(name = "display_start_date")
  private LocalDate displayStartDate;

  @Column(name = "display_end_date")
  private LocalDate displayEndDate;

  @Column(name = "is_delete")
  private long isDelete;

  @Column(name = "create_id")
  private String createId;

  @Column(name = "update_id")
  private String updateId;

  @Column(name = "create_date_time")
  private LocalDateTime createDateTime;

  @Column(name = "update_date_time")
  private LocalDateTime updateDateTime;

  @Builder
  public InformationEntity(
      String title,
      String overview,
      LocalDate displayStartDate,
      LocalDate displayEndDate,
      long isDelete,
      String createId,
      String updateId,
      LocalDateTime createDateTime,
      LocalDateTime updateDateTime) {

    this.title = title;
    this.overview = overview;
    this.displayStartDate = displayStartDate;
    this.displayEndDate = displayEndDate;
    this.isDelete = isDelete;
    this.createId = createId;
    this.updateId = updateId;
    this.createDateTime = createDateTime;
    this.updateDateTime = updateDateTime;
  }

  public void update(
      String title,
      String overview,
      LocalDate displayStartDate,
      LocalDate displayEndDate,
      String updateId) {
    this.title = title;
    this.overview = overview;
    this.displayStartDate = displayStartDate;
    this.displayEndDate = displayEndDate;
    this.updateId = updateId;
    this.updateId = updateId;
    this.updateDateTime = LocalDateTime.now();
  }
}
