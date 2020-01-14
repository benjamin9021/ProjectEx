CREATE TABLE cuser(
did varchar2(6) PRIMARY KEY,
name varchar2(12) not null,
age number(2) default 19,
constraint chk_cuser_age_81_down check (age<81)
)

CREATE TABLE cinfo(
did varchar2(12),
cnum number(4) primary key,
cclr varchar2(12)
)
ALTER TABLE cinfo ADD CONSTRAINT id_fk FOREIGN KEY (did)  
REFERENCES cuser(did) ON DELETE CASCADE

insert into cuser values('d02','kim',22);
insert into cuser values('d03','lee',32);
insert into cuser values('d04','oh',52);
insert into cuser values('d05','ho',62);
insert into cuser values('d07','hee',64);
insert into cuser values('d08','huk',78);
insert into cuser values('d09','kim',78);

insert into cinfo values('d02',7577,'blue');
insert into cinfo values('d09',8877,'blue');
insert into cinfo values('d03',8327,'blue');
insert into cinfo values('d04',8527,'blue');
insert into cinfo values('d07',7351,'red');
insert into cinfo values('d08',8727,'gray');
insert into cinfo values('d09',8888,'gray');
commit

select * from cuser natural join cinfo
select * table cuser

=================================================
drop table cuser
drop table cinfo