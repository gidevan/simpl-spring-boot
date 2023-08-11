package org.vsanyc.rest.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.vsanyc.rest.domain.Item;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vano on 3.10.16.
 */
@Repository
public class ItemDaoImpl  implements ItemDao {
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    //  Database credentials
    private static final String USER = "root";
    private static final String PASS = "mypassword";

    @Value("${database.url}")
    private String dbUrl;

    @Override
    public List<Item> getItems() {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(dbUrl, USER, PASS);

            stmt = conn.createStatement();
            String sql;
            sql = "SELECT id, name FROM test_table";
            ResultSet rs = stmt.executeQuery(sql);
            List<Item> items = new ArrayList<>();
            while(rs.next()){
                //Retrieve by column name
                int id  = rs.getInt("id");
                String name = rs.getString("name");

                System.out.print("ID: " + id);
                System.out.print(", Name: " + name);

                Item item = new Item(id, name, name);
                items.add(item);
            }

            rs.close();
            stmt.close();
            conn.close();
            return items;
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }
        return null;
    }
}
