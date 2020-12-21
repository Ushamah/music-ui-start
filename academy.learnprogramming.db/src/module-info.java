module academy.learnprogramming.db {
    requires java.sql;
    requires sqlite.jdbc;

    //This grants modules that require from this module access to modules underneath it
    //The UI module is gets access to the COMMON module without mentioning it in its module-info file
    requires transitive academy.learnprogramming.common;

    exports academy.learnprogramming.db;
}