package Ass6.dbcon;

import java.sql.*;

public class Database {
    private static Database instance;
    Connection con = null;
    public String url = "jdbc:postgresql://localhost:5432/postgres";
    public String username = "postgres";
    public String password = "2002";

  private Database() throws SQLException{
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, username,password);
            System.out.println("Connected");
        } catch (ClassNotFoundException e) {
            System.out.println("Database Connection Failed: " + e.getMessage());
        }

    }


//    public  Connection getConnection(){
//      return  con;
//    }


    public static  Database  getInstance() throws Exception {
//        if (con == null) {
//            acquireThreadLock()
//        }

        if (instance == null) {
            instance = new Database();
   }
        return instance;
    }

    public  void query(String sql) throws Exception {

        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while(resultSet.next()){
            System.out.println(resultSet.getString("id") + " "+resultSet.getString("name") + " "+
                    resultSet.getString("surname") +" " +  resultSet.getString("position"));
        }
}


}
