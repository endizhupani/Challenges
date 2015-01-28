#README

This exercise is supposed to show the connection of a Java program with Database. You can use [MySQL](http://www.mysql.com/) as a RDBMS.

##Classes and methods to implement
The most important class to implement is `DbHelper.java`, which is the Java class that will commit all the actions with database. It should contain methods like:

```java
DbHelper db = new DbHelper(); //or other kind of constructor

// ...

db.execQuery(sqlQuery);
db.insert(table, values);
db.bulkInsert(table, listOfValues);
```

- The `execQuery(sqlQuery)` method should return a `ResultSet` with the return values of the raw SQL query executed, which is passed as a parameter.
- The `insert(table,values)` method should insert the values in a specified table given, where `values` is a list of key-value pairs, with a key as column name, and value as value to insert.
- The `bulkInsert(table, listOfValues)` method should insert a list of values in a specified table.

The `Main.java` file is the main class of the project, where you should test the methods implemented at the `DbHelper.java`

Also, it would be better if you normalize the database created.

Compiling and running the code is similiar to [this other application](https://github.com/thingslab/Challenges/tree/master/Java/MyString#compilation-and-running-the-code)

##Submitting your code

[Here](https://github.com/thingslab/Challenges#submitting-your-code) you can check how to submit your code when you finish.
