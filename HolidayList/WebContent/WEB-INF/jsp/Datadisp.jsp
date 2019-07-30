<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String id = request.getParameter("userid");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:sqlserver://WKSBAN29RBW1468\\MSSQLSERVER:1433/";
String database = "SLADB";
String userid = "sa";
String password = "5J2Yn.7I-";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<!DOCTYPE html>
<html>
<body>
<style type="text/css">
body{
	background-image: url('https://esellercafe-lzwl1hcgxb5juum.netdna-ssl.com/wp-content/uploads/2018/08/fedex-plane-mountains-dawn.jpg');
	 background-repeat: no-repeat;
  background-position: center;
  background-attachment: fixed;
   background-size: 100% 100%;
	}
</style>	

<h1>Retrieve data from database in jsp</h1>
<table border="1">
<tr>
<td>Country</td>
<td>Holiday</td>
<td>City name</td>
<td>Date of Holiday</td>

</tr>
<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from sla";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr>
<td><%=resultSet.getString("Country") %></td>
<td><%=resultSet.getString("Holiday") %></td>
<td><%=resultSet.getString("city_name") %></td>
<td><%=resultSet.getString("Date") %></td>
</tr>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
</body>
</html>