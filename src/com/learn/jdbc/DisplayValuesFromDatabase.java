package com.learn.jdbc;

import java.sql.*;

public class DisplayValuesFromDatabase {

    public static void main(String[] args) {

        // remember to add ojdbc.jar to class path (dependencies)

        final String DATABASE_URL = "jdbc:oracle:thin:@localhost:1521:XE";

        final String SELECT_QUERY = "SELECT * FROM DIG_ON_USER";

        // use try-with-resources to connect to and query the database
        // when you open a database, you need to close the resources when you no longer need them
        // the try-with-resources statement implements the auto-closeable interface
        try (
                Connection connection = DriverManager.getConnection(DATABASE_URL, "system", "root");
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(SELECT_QUERY))
        {
            // get ResultSet's meta data
            ResultSetMetaData metaData = resultSet.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            System.out.printf("DIG_ON_USER Table of Database:%n%n");

            // display the names of the columns in the ResultSet
            for (int i = 1; i <= numberOfColumns; i++)
                System.out.printf("%-8s\t", metaData.getColumnName(i));
            System.out.println();

            // display query results
            while (resultSet.next()){
                for (int i = 1; i <= numberOfColumns; i++)
                    System.out.printf("%-8s\t", resultSet.getObject(i));
                System.out.println();
            }
        } // Auto-closeable objects' close methods are called now
        catch (SQLException e){
            e.printStackTrace();
        }
    }

}
