<h1> Banking Application <h1>




<p>This is a Simple basic banking application that transfer funds within an account</p>




<p>
-- Create table --

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

</p>
