INSERT INTO `roles`(role_name) VALUES ('ADMIN');
INSERT INTO `roles`(role_name) VALUES ('CUSTOMER');
INSERT INTO `roles`(role_name) VALUES ('MEMBER');
INSERT INTO `roles`(role_name) VALUES ('EMPLOYEE');


INSERT INTO `account`(account_id, address, date_of_birth, email, full_name, gender, identity_card, image, password, phone_number, register_date, status, username, role_id) VALUES ('ACC0001', 'HaNoi', '1990-01-01', 'minh@gmail.com', 'Tong Cong Minh', 'male', '123456789', NULL, '$2a$10$Ei6prvGyuXo7zxom7J1RkeDBTszLj0VD2AjoqP28GedakJVDg5K/6', '0944444444', '2021-12-08', NULL, 'minh', '1');
INSERT INTO `account`(account_id, address, date_of_birth, email, full_name, gender, identity_card, image, password, phone_number, register_date, status, username, role_id) VALUES ('ACC0002', 'HCM', '1995-01-01', 'minh1@gmail.com', 'Tong Cong Minh1', 'male', '123456788', NULL, '$2a$10$yHQdTpzXwywtWJZ6dYnLDeCgDQcXLIg4N06ods4.EIW0Q11EeMdI.', '0911111111', '2021-12-08', NULL, 'minh1', '2');
INSERT INTO `account`(account_id, address, date_of_birth, email, full_name, gender, identity_card, image, password, phone_number, register_date, status, username, role_id) VALUES ('ACC0003', 'HN', '1992-01-01', 'minh2@gmail.com', 'Tong Cong Minh2', 'female', '123456787', NULL, '$2a$10$yHQdTpzXwywtWJZ6dYnLDeCgDQcXLIg4N06ods4.EIW0Q11EeMdI.', '0911111112', '2021-12-08', NULL, 'minh2', '3');
INSERT INTO `account`(account_id, address, date_of_birth, email, full_name, gender, identity_card, image, password, phone_number, register_date, status, username, role_id) VALUES ('ACC0004', 'HCM', '1995-03-01', 'minh3@gmail.com', 'Tong Cong Minh3', 'female', '123456786', NULL, '$2a$10$yHQdTpzXwywtWJZ6dYnLDeCgDQcXLIg4N06ods4.EIW0Q11EeMdI.', '0911111113', '2021-12-08', NULL, 'minh3', '4');


INSERT INTO `movie_theatre`.`member`(`member_id`,`score`,`account_id`) VALUES ('MEM0001',5,'ACC0003');


INSERT INTO `movie_theatre`.`employee`(`employee_id`,`account_id`) VALUES ('EMP0001','ACC0004');



