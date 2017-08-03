DROP DATABASE IF EXISTS "db8001" ;
CREATE DATABASE db8001 CHARACTER SET UTF8 ;
USE db8001 ;
CREATE TABLE dept (
	deptno		BIGINT		AUTO_INCREMENT ,
	dname		VARCHAR(50) ,
	loc			VARCHAR(50) ,
	CONSTRAINT pk_deptno PRIMARY KEY(deptno)
) ;
INSERT INTO dept(dname,loc) VALUES ('DEV',database()) ;
INSERT INTO dept(dname,loc) VALUES ('ACCOUNTING',database()) ;
INSERT INTO dept(dname,loc) VALUES ('MARKET',database()) ;
INSERT INTO dept(dname,loc) VALUES ('HR',database()) ;
