CREATE DATABASE IF NOT EXISTS `student_db`;
USE `student_db`;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
DROP TABLE IF EXISTS `teacher`;

CREATE TABLE `student` (
                           `id` int(11) NOT NULL AUTO_INCREMENT,
                           `first_name` varchar(45) NOT NULL,
                           `last_name` varchar(45) NOT NULL,
                           `email` varchar(45) NOT NULL,
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


INSERT INTO `student` VALUES
                           (1,'George','Stavropoulos','georges@hua.gr'),
                           (2,'Stefanos','Sotiriou','stefanoss@hua.gr'),
                           (3,'Marios','Papanikolaou','mariosp@hua.gr'),
                           (4,'Panagiotis','Skordakis','panagiotiss@hua.gr'),
                           (5,'Ioannis','Maratos','ioannism@hua.gr');


CREATE TABLE `teacher` (
                           `id` int(11) NOT NULL AUTO_INCREMENT,
                           `first_name` varchar(45) NOT NULL,
                           `last_name` varchar(45) NOT NULL,
                           `email` varchar(45) NOT NULL,
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;      

INSERT INTO `teacher` VALUES
                           (1,'Argiris','Tsadimas','tsadimas@hua.gr'),
                           (2,'Mara','Nikolaidou','mara@hua.gr');                    