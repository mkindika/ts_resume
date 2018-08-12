INSERT INTO `ts_resume`.`user_type` 
(`user_type_text`)
VALUES('MEMBER');

INSERT INTO `ts_resume`.`user`
(`username`,`password`,`email`,`last_login`,`created_date_time`,`is_active`,`user_type`)
VALUES
('indika','abc123','mkindika@gail.com',CURRENT_TIMESTAMP,curdate(),1,'NEW');

INSERT INTO `ts_resume`.`user`
(`username`,`password`,`email`,`last_login`,`created_date_time`,`is_active`,`user_type`)
VALUES
('amal','abc123','amal@gail.com',CURRENT_TIMESTAMP,NOW(),1,'NEW');

INSERT INTO `ts_resume`.`address`
(`street`,`city`,`state`,`postal_code`,`country`)
VALUES
('188','marassana','Kandy','20210','SL');

INSERT INTO `ts_resume`.`personal_info`
(`peronal_info_id`,`title`,`first_name`,`last_name`,`name_in_full`,`dob`,`email`,`mobile`,`profile_summary`,`address`,`home_phone`)
VALUES
(1,'Mr','indika','munaweera','indika munaweera kankanamge','1985-02-24','mkindika@gmail.com','966352889','Lead developers (8+ years) are expected to be the Architect for relatively smaller enterprise level projects and for larger projects, you are expected to work closely with the fellow architects to come up with the architecture and take it further.',1,'8533535553');


INSERT INTO `ts_resume`.`resume`
(`user_id`,`resume_name`,`template_id`,`created_on_time`,`last_accessed_time`)
VALUES
(1,'teacher','2',NOW(),CURRENT_TIMESTAMP);

INSERT INTO `ts_resume`.`resume`
(`user_id`,`resume_name`,`template_id`,`created_on_time`,`last_accessed_time`)
VALUES
(1,'sse','2',NOW(),CURRENT_TIMESTAMP);

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


INSERT INTO `ts_resume`.`education`
(`school`,`degree`,`field_of_study`,`from_year`,`to_year`,`from_month`,`to_month`,`description`,`resume_id`)
VALUES
('University of Moratuwa','BSc - Computer Science','Computer Science','2014','2018','02','08','Bachelor in Science','2');

INSERT INTO `ts_resume`.`education`
(`school`,`degree`,`field_of_study`,`from_year`,`to_year`,`from_month`,`to_month`,`description`,`resume_id`)
VALUES
('University of Peradeniys','MSc - Computer Science','Computer Science','2017','2019','02','08','Master in Science','2');

INSERT INTO `ts_resume`.`skill_category`
(`skill_category_text`)
VALUES
('Languages');

INSERT INTO `ts_resume`.`skill`
(`skill_name`,`skill_category_id`,`skill_level_id`,`description`,`resume_id`)
VALUES
('English','1','7','Proficiency in English Language','2');


INSERT INTO `ts_resume`.`certificate`
(`name`,`authority`,`code_url`,`date_issued`,`description`,`resume_id`)
VALUES('SCJP- Sun Certified Java Programmer','Sun Microsystem','http:\\sun.com\cert\124','2014-02-05','java certification',2);

INSERT INTO `ts_resume`.`certificate`
(`name`,`authority`,`code_url`,`date_issued`,`description`,`resume_id`)
VALUES('SCWCD- Sun Certified Web Developer','Sun Microsystem','http:\\sun.com\cert\1234','2015-05-05','java web certification',2);


INSERT INTO `ts_resume`.`patent`
(`title`,`patent_number`,`status`,`issue_date`,`patent_url`,`description`,`resume_id`)
VALUES
('my patent 01','AHSJ786SDF','I','2015-05-05',
'https://www.neustel.com/wp-content/uploads/2017/01/pdf/Sample-Patents/Sample-Patent_Advertising_Sales_Management_System.pdf',
'A system for providing an interface that allows access to
system used to sell time slots for advertisements in broadcast
programming. This system allows a user to access databases
to access information needed to sell the advertisements. The
system integrates the databases to allow easy access and
centralized storage of all needed information for selling time
slots for advertisements in broadcast programming.',2);

INSERT INTO `ts_resume`.`patent`
(`title`,`patent_number`,`status`,`issue_date`,`patent_url`,`description`,`resume_id`)
VALUES
('my patent 02','XFGD786SDF','I','2018-05-05',
'https://www.neustel.com/wp-content/uploads/2017/01/pdf/Sample-Patents/Sample-Patent_Advertising_Sales_Management_System.pdf',
'A system for providing an interface that allows access to
system used to sell time slots for advertisements in broadcast
programming. This system allows a user to access databases
to access information needed to sell the advertisements. The
system integrates the databases to allow easy access and
centralized storage of all needed information for selling time
slots for advertisements in broadcast programming.',2);


INSERT INTO `ts_resume`.`course`
(`course_title`,`course_number`,`vendor`,`date_completed`,`description`,`resume_id`)
VALUES
('Java Web Programming','JAVA-0001','Sun','2018-05-05','Java web programming- jee, spring, ejb',2);

INSERT INTO `ts_resume`.`course`
(`course_title`,`course_number`,`vendor`,`date_completed`,`description`,`resume_id`)
VALUES
('Spring Framework Training','SPRING-0001','Sun','2018-05-05','Spring web programming- security, spring, boot',2);


INSERT INTO `ts_resume`.`award`
(`award_title`,`date_awarded`,`award_url`,`issuer`,`description`,`resume_id`)
VALUES
('Best employee of the year','2018-05-05','https://www.neustel.com/wp-content','Salmat','Best employee of the year 2016',2);

INSERT INTO `ts_resume`.`achievement`
(`description`,`resume_id`)
VALUES
('Coordinated activities of in-house trades and construction staff and outside contractors assigned to projects to ensure compliance to specifications and project completion timetables.',
2);

INSERT INTO `ts_resume`.`achievement`
(`description`,`resume_id`)
VALUES
('Created an innovative database using Salesforce, resulting in a 50% reduction in response time for the processing of client queries.',
2);





