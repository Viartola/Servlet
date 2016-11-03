package servlet;

import java.io.File;
import java.nio.file.Paths;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ListarUsuarios {

	static File archivo = Paths.get(".").toAbsolutePath().normalize().toFile();
	static String ruta = archivo.toString() + "/src/main/resources/";

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "org.h2.Driver"; //org.h2.Driver
    static final String DB_URL = "jdbc:h2:" + ruta + "DBtest";

    //  Database credentials
    static final String USER = "sa";
    static final String PASS = "";

    public static void main (String[] args) {
 

    }// end main

    public static List listar(){
    	Connection conn = null;
    	List<user> listUsers= new ArrayList<user>();
		ResultSet resultSet = null;
		PreparedStatement prepareStatement = null;
		Statement stmt = null;

        try {
            //STEP 2: Register JDBC driver
            Class.forName("org.h2.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");

            //STEP 4: Execute a query
            System.out.println("Creating table in given database...");
             stmt = conn.createStatement();
    		
    		
    			prepareStatement = conn.prepareStatement("SELECT * FROM Alumnos");
    			resultSet = prepareStatement.executeQuery();
    			while(resultSet.next()){
    				user userInDatabase = new user();
    				userInDatabase.setNombre(resultSet.getString(1));
    				userInDatabase.setCourse(resultSet.getString(2));
    				userInDatabase.setAge(resultSet.getString(3));
    				
    				listUsers.add(userInDatabase);
    			}

                   
    		
            System.out.println("Created table in given database...");
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
        	 try {
                 if (stmt!=null)
                     conn.close();
             } catch (SQLException se) {
             } // do nothing
            try {
                if (conn!= null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            } // end finally try
            try {
    			resultSet.close();
    		} catch (SQLException e) {
    			e.printStackTrace();
    			throw new RuntimeException(e);
    		}
        } // end try
        return listUsers;
   }
} // end JDBCExample