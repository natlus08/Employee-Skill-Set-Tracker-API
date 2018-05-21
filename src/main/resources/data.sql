insert into SKILLS(skill_id, skill_name) values(1, 'java');
insert into SKILLS(skill_id, skill_name) values(2, 'angular');
insert into SKILLS(skill_id, skill_name) values(3, 'spring');

insert into ASSOCIATES(associate_id,name,email,status,level,remark,strength,weakness) values (1,'hameedu','1@abc.com','GREEN','ONE','remark','strength','weakness');
insert into ASSOCIATES(associate_id,name,email,status,level,remark,strength,weakness) values (2,'sultan','12@abc.com','BLUE','TWO','remark','strength','weakness');
insert into ASSOCIATES(associate_id,name,email,status,level,remark,strength,weakness) values (3,'kader','123@abc.com','RED','THREE','remark','strength','weakness');

insert into ASSOCIATE_SKILL(associate_id,skill_id) values(1,1);
insert into ASSOCIATE_SKILL(associate_id,skill_id) values(1,2);
insert into ASSOCIATE_SKILL(associate_id,skill_id) values(1,3);

insert into ASSOCIATE_SKILL(associate_id,skill_id) values(2,1);

insert into ASSOCIATE_SKILL(associate_id,skill_id) values(3,1);
insert into ASSOCIATE_SKILL(associate_id,skill_id) values(3,3);