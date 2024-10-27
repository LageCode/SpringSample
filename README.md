# SpringSample

A Spring learning general sample

## Documentation

### REST API

- **REST**: Representational State Transfer. A REST API is an architectural style for an Application Programming Interface (API) that uses HTTP requests to access and use data.

- **API**: Application Programming Interface. An API defines interactions between multiple applications. It specifies the types of requests that can be made, how to execute them, the type of data to use, conventions to follow, and more.

## Getting started

1. Setup a postgresql database and configure user, password, and database in `/src/main/resources/application.properties` file.

    > [!warn] Configure user's permissions in `pg_hba.conf`

2. `mvn clean install`

3. `mvn spring-boot:run`

4. Run a post http request at `http://localhost:8080/api/employess` with a new employee json object as body:

    ```json
        {
        "id": 1,
        "firstName": "Xavier",
        "lastName": "Neujean",
        "email": "xavier.neujean@helb.fictive.be",
        "gender": "male",
        "birthDate": "2001-02-02"
        }
    ```

5. Check with psql the result in the table employees:

        ```
            springsample=> select * from employees;
            birth_date      | emp_id |             email              | first_name | gender | last_name 
            ---------------------+--------+--------------------------------+------------+--------+-----------
            2001-02-02 01:00:00 |      1 | xavier.neujean@helb.fictive.be | Xavier     | male   | Neujean
            (1 row)
        ```
