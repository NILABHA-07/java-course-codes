import java.sql.*;
import java.util.Scanner;


public class DemoJdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        String url="jdbc:postgresql://localhost:5432/DemoDb";
        String user="postgres";
        String password="Ghosh@2001";
//        String sql="SELECT * FROM public.\"Student\" ";
//        String insertQuery="INSERT INTO public.\"Student\" (id,\"name\",age)\n" +
//                "\tVALUES (8,'Kamini',29);";
//        String updateQuery="update \"Student\" set name='' where name=''";
//        String deleteQuery="delete from \"Student\" s where name=''";
        Connection con=DriverManager.getConnection(url,user,password);
//        System.out.println("Connection is established");
//        Statement st=con.createStatement();
//        ResultSet rs=st.executeQuery(sql);


//        while (rs.next()) {
//            System.out.print(rs.getInt(1)+" - ");
//            System.out.print(rs.getString(2)+" - ");
//            System.out.print(rs.getInt(3));
//            System.out.println();
//
//        }

//        boolean status=st.execute(insertQuery);
//        System.out.println(status);

//        boolean status=st.execute(updateQuery);
//        System.out.println(status);

//        rs.close();
        String insertQuery="insert into \"Student\" values (?,?,?)";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the id: ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name: ");
        String name=sc.nextLine();
        System.out.println("Enter the age: ");
        int age=sc.nextInt();
        PreparedStatement st=con.prepareStatement(insertQuery);
        st.setInt(1,id);
        st.setString(2,name);
        st.setInt(3,age);
        st.execute();


    }
}
