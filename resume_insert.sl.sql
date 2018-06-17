INSERT INTO `ts_resume`.`user_type`
(`user_type_text`)
VALUES
('MEMBER');

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
(2,'teacher',NOW(),CURRENT_TIMESTAMP);

INSERT INTO `ts_resume`.`address`
(`street`,`city`,`postal_code`,`country`)
VALUES
('188','marassana','20210','SL');


INSERT INTO `ts_resume`.`peronal_info`
(`title`,`first_name`,`last_name`,`name_in_full`,`email`,`mobile`,`profile_summary`,`address_id`,`home_phone`,`resume_id`)
VALUES
('Mr','indika','munaweera','kankanamge','mkindika@gmail.com','966352889','Lead developers (8+ years) are expected to be the Architect for relatively smaller enterprise level projects and for larger projects, you are expected to work closely with the fellow architects to come up with the architecture and take it further.',1,'8533535553',1);





