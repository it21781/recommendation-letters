CREATE DATABASE IF NOT EXISTS `student_db`;
USE `student_db`;

ALTER TABLE `authorities` DROP FOREIGN KEY `fk_authorities_users`;
DROP TABLE IF EXISTS `user`;
DROP TABLE IF EXISTS `authorities`;



CREATE TABLE IF NOT EXISTS `user` (
 `username` varchar(50) NOT NULL,
 `password` varchar(100) NOT NULL,
 `enabled` tinyInt(1) NOT NULL,
 `first_name` varchar(50) NOT NULL,
 `last_name` varchar(50) NOT NULL,
 `email` varchar(50) NOT NULL,
 PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;




CREATE TABLE IF NOT EXISTS `authorities` (
 `username` varchar(50) NOT NULL,
 `authority` varchar(50) NOT NULL,
 UNIQUE KEY `ix_auth_username` (`username`,`authority`),
 CONSTRAINT `fk_authorities_users` FOREIGN KEY (`username`) REFERENCES `user` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



INSERT INTO `user` (`username`, `password`, `enabled`, `first_name`, `last_name`, `email`) VALUES
   ('root', '$2a$12$dimZKNezfG8Yw08OFR/NLewVF/ZXj.NfP4hNcoFQyQiPNta6fkloO',1,'root','root','root@hua.gr'),
   ('george','$2a$12$ozkYdh5xfXb1SvRSzk9DHupREhIpyZJPhVUjWlkvGPa8im/co5P1W',1,'George','Stavropoulos','georges@hua.gr'),
   ('stef','$2a$12$iAfRChR2C3Dpx7eomGrJP.MCb/.lgApd4Hlo4zqKqbDRnHFbLASHK',1,'Stefanos','Sotiriou','stefanoss@hua.gr'),
   ('marios','$2a$12$tmx6nCaLOJBpqShHsfQd/ucE0KgDVNXaWSAMsiTS0mxoLSp.c9IzW',1,'Marios','Papanikolaou','mariosp@hua.gr'),
   ('panos','$2a$12$al7NQ.2lP8arpnhc4ZBWTuo2whjZOremAO0OSm3yRWxIgZcBtHWdu',1,'Panagiotis','Skordakis','panagiotiss@hua.gr'),
   ('giannis','$2a$12$IhqADUQq4Z4UhN9UtX21z.KC8.rq6FcND3VphzCth.pKIOVxDIj82',1,'Ioannis','Maratos','ioannism@hua.gr'),
   ('argiris','$2a$12$G89A/13zH0epmbi8yXj70u1coI5yAtX70w5qvxu9gnIVLPLMwYfVS',1,'Argiris','Tsadimas','tsadimas@hua.gr'),
   ('mara','$2a$12$zJvP21v5Ct/BCE3T21rV2euDS1uyaJ94oYYUCRzEZzyh5crnn9bEi',1,'Mara','Nikolaidou','mara@hua.gr');

INSERT INTO `authorities` (`username`, `authority`) VALUES
   ('root', 'ROLE_ADMIN'),
   ('george', 'ROLE_STUDENT'),
   ('stef', 'ROLE_STUDENT'),
   ('marios', 'ROLE_STUDENT'),
   ('panos', 'ROLE_STUDENT'),
   ('giannis', 'ROLE_STUDENT'),
   ('argiris', 'ROLE_TEACHER'),
   ('mara', 'ROLE_TEACHER');