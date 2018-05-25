insert into SKILLS(skill_id, skill_name) values(1, 'java');
insert into SKILLS(skill_id, skill_name) values(2, 'angular');
insert into SKILLS(skill_id, skill_name) values(3, 'spring');

insert into ASSOCIATES(associate_id,name,email,status,level,remark,strength,weakness,mobile,gender) values (1,'hameedu','1@abc.com','GREEN','ONE','remark','strength','weakness','1234567890','M');
insert into ASSOCIATES(associate_id,name,email,status,level,remark,strength,weakness,mobile,gender) values (2,'sultan','12@abc.com','BLUE','TWO','remark','strength','weakness','9876543210','M');
insert into ASSOCIATES(associate_id,name,email,status,level,remark,strength,weakness,mobile,gender) values (3,'kader','123@abc.com','RED','THREE','remark','strength','weakness','1111122222','M');
insert into ASSOCIATES(associate_id,name,email,status,level,remark,strength,weakness,mobile,gender) values (4,'sultana','1234@abc.com','BLUE','TWO','remark','strength','weakness','5432112345','F');

insert into ASSOCIATE_SKILL(id,associate_id,skill_id,level) values(1,1,1,10);
insert into ASSOCIATE_SKILL(id,associate_id,skill_id,level) values(2,1,2,20);
insert into ASSOCIATE_SKILL(id,associate_id,skill_id,level) values(3,1,3,13);

insert into ASSOCIATE_SKILL(id,associate_id,skill_id,level) values(4,2,1,14);

insert into ASSOCIATE_SKILL(id,associate_id,skill_id,level) values(5,3,1,18);
insert into ASSOCIATE_SKILL(id,associate_id,skill_id,level) values(6,3,3,19);