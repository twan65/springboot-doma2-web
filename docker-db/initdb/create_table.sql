SET CHARACTER utf8;
USER infodb;

CREATE TABLE information (
  id int NOT NULL AUTO_INCREMENT COMMENT 'お知らせID',
  title varchar(30) NOT NULL COMMENT 'タイトル',
  overview varchar(300) NOT NULL COMMENT '概要',
  display_start_date date NOT NULL COMMENT '掲載開始日',
  display_end_date date NOT NULL COMMENT '掲載終了日',
  is_delete int NOT NULL COMMENT '削除フラグ：０未削除、１：削除',
  create_id varchar(128) NOT NULL DEFAULT '' COMMENT '作成者',
  update_id varchar(128) NOT NULL DEFAULT '' COMMENT '更新者',
  create_date_time datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '作成日',
  update_date_time datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新日',
  constraint information_PKC primary key(id)
) COMMENT='お知らせ';

CREATE TABLE user (
  user_id varchar(128) NOT NULL COMMENT 'ユーザーID',
  password varchar(1024) NOT NULL COMMENT 'パスワード',
  name varchar(100) NOT NULL COMMENT '名前',
  is_delete int NOT NULL COMMENT '削除フラグ',
  create_id varchar(128) NOT NULL DEFAULT '' COMMENT '作成者',
  update_id varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '更新者',
  create_date_time datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '作成日',
  update_date_time datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新日',
  constraint user_PKC primary key(user_id)
) COMMENT='ユーザー';

CREATE TABLE information_type (
  information_type_id int NOT NULL AUTO_INCREMENT COMMENT 'お知らせ種別ID',
  information_type int NOT NULL COMMENT 'お知らせ種別',
  create_id varchar(128) NOT NULL COMMENT '作成者',
  update_id varchar(128) NOT NULL COMMENT '更新者',
  create_date_time datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '作成日',
  update_date_time datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新日',
  constraint information_type_PKC primary key(information_type_id, information_type)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='お知らせ種別';