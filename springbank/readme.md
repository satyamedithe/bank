Banking Application

<p>This is a Simple basic banking application that transfer funds within an account</p>

# bank application

The following application is a simple banking application

The application can change the customer information 

The application transfers money between different accounts

Please download the application
https://github.com/satyamedithe/bank.git 

click on clone or download option 

Import the application as maven application from the download location after unzipping

The springbank application is the pom that will import the application

Once done either update maven or simply goto the main class and right click and run as java application

once the JVM starts just goto a web browser and type http://localhost:8081/

click on the menu links like customer information, accounts, send money etc. 

The application starts from localhost:8081 not 8080

Thanks i have attached the screenshot for the application as well. 



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
