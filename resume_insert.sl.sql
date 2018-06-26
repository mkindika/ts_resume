INSERT INTO `ts_resume`.`user_type` 
(`user_type_text`)
VALUES('MEMBER');

INSERT INTO `ts_resume`.`user`
(`username`,`password`,`email`,`last_login`,`created_date_time`,`is_active`,`user_type`,`fk_user_type_id`)
VALUES
('indika','abc123','mkindika@gail.com',CURRENT_TIMESTAMP,curdate(),1,'NEW',1);

INSERT INTO `ts_resume`.`user`
(`username`,`password`,`email`,`last_login`,`created_date_time`,`is_active`,`user_type`,`fk_user_type_id`)
VALUES
('amal','abc123','mkindika@gail.com',CURRENT_TIMESTAMP,NOW(),1,'NEW',1);

INSERT INTO `ts_resume`.`resume`
(`user_id`,`resume_name`,`created_on_time`,`last_accessed_time`)
VALUES
(1,'teacher',NOW(),CURRENT_TIMESTAMP);

INSERT INTO `ts_resume`.`resume`
(`user_id`,`resume_name`,`created_on_time`,`last_accessed_time`)
VALUES
(1,'sse',NOW(),CURRENT_TIMESTAMP);


INSERT INTO `ts_resume`.`address`
(`street`,`city`,`state`,`postal_code`,`country`)
VALUES
('188','marassana','Kandy','20210','SL');


INSERT INTO `ts_resume`.`personal_info`
(`title`,`first_name`,`last_name`,`name_in_full`,`dob`,`email`,`mobile`,`profile_summary`,`address_id`,`home_phone`,`resume_id`)
VALUES
('Mr','indika','munaweera','indika munaweera kankanamge','1985-02-24','mkindika@gmail.com','966352889','Lead developers (8+ years) are expected to be the Architect for relatively smaller enterprise level projects and for larger projects, you are expected to work closely with the fellow architects to come up with the architecture and take it further.',1,'8533535553',1);


INSERT INTO `ts_resume`.`certificate`
(`name`,`authority`,`code_url`,`date_issued`,`description`,`resume_id`)
VALUES('SCJP- Sun Certified Java Programmer','Sun Microsystem','http:\\sun.com\cert\124','2014-02-05','java certification',2);

INSERT INTO `ts_resume`.`certificate`
(`name`,`authority`,`code_url`,`date_issued`,`description`,`resume_id`)
VALUES('SCWCD- Sun Certified Web Developer','Sun Microsystem','http:\\sun.com\cert\1234','2015-05-05','java web certification',2);


INSERT INTO `ts_resume`.`education`
(`school`,`degree`,`field_of_study`,`from_year`,`to_year`,`from_month`,`to_month`,`description`,`resume_id`)
VALUES
('University of Moratuwa','BSc - Computer Science','Computer Science','2014','2018','02','08','Bachelor in Science','2');

INSERT INTO `ts_resume`.`education`
(`school`,`degree`,`field_of_study`,`from_year`,`to_year`,`from_month`,`to_month`,`description`,`resume_id`)
VALUES
('University of Peradeniys','MSc - Computer Science','Computer Science','2017','2019','02','08','Master in Science','2');


INSERT INTO `ts_resume`.`experience`
(`company_name`,`position_held`,`from_year`,`to_year`,`from_month`,`to_month`,`description`,`resume_id`)
VALUES
('Rezgateway','Software Engineer','2015','2018','02','05',
'Software engineer with 7+ years experience, skilled in C++, ASP.NET, SQL, Java, Python, Javascript, C#, Perl, and PHP, looking for a position as a software developer for Oracle.',
'2');

INSERT INTO `ts_resume`.`experience`
(`company_name`,`position_held`,`from_year`,`to_year`,`from_month`,`to_month`,`description`,`resume_id`)
VALUES
('IT Center','IT Instructor','2014','2015','05','08','Instructor cum programmer, conducting training programs','2');

INSERT INTO `ts_resume`.`skill_category`
(`skill_category_text`)
VALUES
('Languages');

INSERT INTO `ts_resume`.`skill`
(`skill_name`,`skill_category_id`,`skill_level_id`,`description`,`resume_id`)
VALUES
('English','1','7','Proficiency in English Language','2');
