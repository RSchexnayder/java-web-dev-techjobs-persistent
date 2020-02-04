## Part 1: Test it with SQL
ID int(11)
employer varchar(255)
name varchar(255)
skills varchar(255)

## Part 2: Test it with SQL
SELECT name FROM techjobs.employer;

## Part 3: Test it with SQL
DROP TABLE job

## Part 4: Test it with SQL
SELECT name, description
FROM job_skills
INNER JOIN  skill ON job_skills.skills_id = skill.id
ORDER BY name ASC;