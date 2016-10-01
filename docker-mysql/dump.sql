DROP TABLE IF EXISTS `test_table`;

CREATE TABLE `test_table` (
  `id` int(11) NOT NULL,
  `name` varchar(1024) NOT NULL,

  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `test_table` WRITE;
INSERT INTO `test_table` VALUES (1,'name1');
INSERT INTO `test_table` VALUES (2,'name2');
INSERT INTO `test_table` VALUES (3,'name3');
UNLOCK TABLES;
