USE study;
CREATE TABLE `slb_news` (
  `id`          BIGINT(20)   NOT NULL AUTO_INCREMENT,
  `title`       VARCHAR(30)  NOT NULL,
  `content`     VARCHAR(150) NOT NULL,
  `create_time` TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `creator`     VARCHAR(10)  NOT NULL,
  `visit_count` INT(11)      NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `title` (`title`),
  KEY `content` (`content`),
  KEY `visit_count` (`visit_count`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 2
  DEFAULT CHARSET = utf8
