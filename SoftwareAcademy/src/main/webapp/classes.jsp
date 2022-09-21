<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="topnav">
		  <a href="addclasses.jsp">ADD</a>
		  <a href="updateclasses.jsp">UPDATE</a>
		  <a href="deleteclasses.jsp">DELETE</a>
		  <a class="active" href="classes.jsp">SHOW</a>
		  <a class="active" href=index.jsp>BACK</a>
	</div>
	
 	<form action="ServletAddClasses" method="post">  
        <div class="container">   
        	 <label>Class Id : </label>   <br>
            <input type="text" placeholder="Enter Id" name="classid" required><br>  
           
            <label>Class Name : </label>   <br>
            <input type="text" placeholder="Enter Name" name="classname" required><br>  
            <button type="submit">Add Class</button>        
        </div>   
    </form> 
	    
</body>
</html>