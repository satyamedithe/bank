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


####################################################################################

modified 


create table BANK_ACCOUNT
(
  ID        BIGINT not null,
  ACCOUNT_TYPE VARCHAR(128) not null,
  BALANCE   DOUBLE not null
) ;

--  
alter table BANK_ACCOUNT
  add constraint BANK_ACCOUNT_PK primary key (ID);

Insert into Bank_Account(ID, ACCOUNT_TYPE, Balance) values (1, 'Current', 1000);
Insert into Bank_Account(ID, ACCOUNT_TYPE, Balance) values (2, 'Savings', 2000);
Insert into Bank_Account(ID, ACCOUNT_TYPE, Balance) values (3, 'Money market', 3000);


########################################################################################


create table CUSTOMER(

ID BIGINT not null,

FIRST_NAME VARCHAR(128) not null,

LAST_NAME VARCHAR(128) not null,

ADDRESS  VARCHAR(128) not null,

PHONE INT not null,

SSN  INT not null

);

alter table CUSTOMER
  add constraint CUSTOMER_PK primary key (ID);


Insert into Bank_Account(ID, FIRST_NAME, LAST_NAME, ADDRESS, PHONE, SSN  ) 
values (1, 'SAM', 'SMITH', '122 MANGNOLIA AVE, NJ, USA', 123456789, 123 456 7890);

Insert into Bank_Account(ID, Full_Name, Balance) values (2, 'Savings', 2000);
Insert into Bank_Account(ID, Full_Name, Balance) values (3, 'Money market', 3000);

#########################################################################################