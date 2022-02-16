CREATE DATABASE IF NOT EXISTS `student_db`;
USE `student_db`;

DROP TABLE IF EXISTS `letters`;

CREATE TABLE IF NOT EXISTS `letters` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `student_fn` varchar(50) NOT NULL,
    `student_ln` varchar(50) NOT NULL,
    `teacher_fn` varchar(50) NOT NULL,
    `teacher_ln` varchar(50) NOT NULL,
    `email` varchar(50) NOT NULL,
    `approved` tinyInt(1),
    PRIMARY KEY (`id`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `letters` VALUES
                          (1,'Stefanos','Sotiriou','Argiris','Tsadimas','info@microsoft.com',0);

