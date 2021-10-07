CREATE TABLE `user`
(
    `id`       int(11)     NOT NULL AUTO_INCREMENT COMMENT 'ID',
    `name`     varchar(20) NOT NULL COMMENT '用户名',
    `password` varchar(20) NOT NULL COMMENT '密码',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 3
  DEFAULT CHARSET = latin1;

INSERT INTO mybatis.user (id, name, password) VALUES (1, 'John', '123');
INSERT INTO mybatis.user (id, name, password) VALUES (2, 'Poll', '234');