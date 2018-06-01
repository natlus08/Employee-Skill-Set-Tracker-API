# Employee-Skill-Set-Tracker-API
A spring boot, micro service project providing API support to the Employee Skill Set Tracker UI project

#Step to Run
Run as a Spring boot app (will run in default profile) to use inbuilt H2 DB
(or)
Set up a run config with (--spring.profiles.active=prod) to use mySQL.

Application will run on http://localhost:8090/ 

Associate-Api URL - http://localhost:8090/associate-api/associates (lists all associates)
Skill-Api URL - http://localhost:8090/skill-api/skills (lists all skills)

Note: Application runs on embedded Tomcat server