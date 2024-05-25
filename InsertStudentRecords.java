import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStudentRecords {
public static void main(String args[])
{

String url="jdbc:mysql://localhost:3360/arpita";
String username="root";
String password=" ";

Connection connection=null;
Statement statement=null;

try {

Class.forName("com.mysql.cj.jdbc.Driver");

connection=DriverManager.getConnection(url,username,password);
statement=connection.createStatement();
String[]insertQueries = {
"INSERT INTO student(roll number,name,dept,email,phonee)VALUES(1,'Arpita',Computer science','arpita308@gmail.com','7204737350')", 

statement.executeUpdate(createTableSQL);
System.out.println("Table 'student' created successfully.");

}
catch(ClassNotFoundException e)
{
e.printStackTrace();
}
catch (SQLException e)
{
e.printStackTrace();
}
finally {
try
{
if (statement != null) statement.close();
if (connection != null) connection.close();
 
}catch(SQLException e)
{
e.printStackTrace();
}
}
}
}

