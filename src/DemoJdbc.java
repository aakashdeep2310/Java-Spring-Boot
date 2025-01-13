import org.postgresql.Driver;

import java.sql.*;  // this is step1

public class DemoJdbc {
    public static void main(String[] args) throws SQLException {

        //There are 7 steps to connect java with the Database
        /*
        import package
        load and register
        create connection
        create statement
        execute statement
        process the results
        close
        */

        //load and reg driver // This is step 2
        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "punam@1108";
        String sql = "select * from student";
        // this below step is optional ***************
        try
        {
            Class.forName("org.postgresql.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        //********************************************
        // This is step 3


            Connection con = DriverManager.getConnection(url, uname, pass);


        System.out.println("Connection Established with the database");

        // Step 4
        Statement st = con.createStatement();

//        step 5
        ResultSet rs = st.executeQuery(sql);
//        System.out.println(rs.next()); // This will print true if desired data is there, otherwise false

//        rs.next(); // this will help the point to move to the first data
//        String name = rs.getString("sname"); // getString method points to before 1st data // see one line upper code
//        System.out.println("Name of a student is : " + name);

        while (rs.next()){

            System.out.print(rs.getInt(1) + " - ");
            System.out.print(rs.getString(2) + " - ");
            System.out.println(rs.getInt(3));
        }

        con.close();
        System.out.println("Connection Closed");

    }
}
