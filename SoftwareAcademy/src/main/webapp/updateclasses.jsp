<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ServletUpdateClasses" method="post">  
        <div class="container">   
        	 <label>Class Id : </label>   <br>
            <input type="text" placeholder="Enter Id" name="classid" required><br>  
           
            <label>Class Name : </label>   <br>
            <input type="text" placeholder="Enter Name" name="classname" required><br>  
            <button type="submit">Update Class</button>        
        </div>   
    </form>
</body>
</html>