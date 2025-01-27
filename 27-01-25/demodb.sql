create table EMP(
	EID int primary key,
	NAME varchar(15) NOT NULL,
	AGE smallint,
	SALARY decimal(8, 2) DEFAULT 15000.00,
	DESIGNATION varchar(20) NOT NULL
);

select * from EMP;

INSERT INTO EMP VALUES (23, 'Sanchit Patil', 21, 100000.00, 'Ceo');

update EMP set AGE = AGE - 1;

start transaction;

delete from EMP;

rollback;

commit;
