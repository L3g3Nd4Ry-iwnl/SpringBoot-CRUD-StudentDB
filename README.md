# SpringBoot-CRUD-StudentDB

## About the project:
This project is used to demonstrate a simple Create-Read-Update-Delete operation on a student detail database, which will help me to reinforce what I had learned in SpringBoot.

## Technology stack used:
1. Front-end: JSP (HTML), CSS
2. Back-end: Spring Boot (Java)
3. Database: MongoDB

## Endpoints:
1. / - Home page.
2. /login - Login page. Basic string matching functions will be used to check the username and/or password.
    Default usernames, passwords:
    1. user1 - user1234
    2. user2 - user12345
3. /students - Dashboard for the teachers.
4. /students/create - A page to insert new student details
5. /students/view - A page to view the students in DB.
6. /students/update - A page to select a student whose detail is to be updated.
7. /students/update/{id} - A page where a student's detail can to be updated.
8. /students/update - A page to select a student whose detail is to be deleted.
9. /logout - An endpoint that will destroy the current session details and redirect the user to the home page.