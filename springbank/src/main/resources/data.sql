DROP TABLE IF EXISTS BANK_ACCOUNT CASCADE;
-- Create table
create table BANK_ACCOUNT
(
  ID        BIGINT not null,
  FULL_NAME VARCHAR(128) not null,
  BALANCE   DOUBLE not null
) ;
--  
alter table BANK_ACCOUNT
  add constraint BANK_ACCOUNT_PK primary key (ID);
 
 
Insert into Bank_Account(ID, Full_Name, Balance) values (1, 'Current', 1000);
Insert into Bank_Account(ID, Full_Name, Balance) values (2, 'Savings', 2000);
Insert into Bank_Account(ID, Full_Name, Balance) values (3, 'Money market', 3000);
 
commit;


DROP TABLE IF EXISTS CUSTOMER_INFORMATION;
 
CREATE TABLE CUSTOMER_INFORMATION (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  address VARCHAR(250) DEFAULT NULL,
  phone BIGINT NOT NULL,
  socialsecurity BIGINT NOT NULL
);

INSERT INTO 
	CUSTOMER_INFORMATION (first_name, last_name, address,phone,socialsecurity) 
VALUES
  	('John', 'Doe', '123 Madison Lane,NJ','123446789','1234568890');