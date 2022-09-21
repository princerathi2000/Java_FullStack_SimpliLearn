<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ServletAddTeacher" method="post">  
        <div class="container">   
        	 <label>Teacher Id : </label>   <br>
            <input type="text" placeholder="Enter Id" name="teacherid" required><br>  
           
            <label>Teacher Name : </label>   <br>
            <input type="text" placeholder="Enter Name" name="teachername" required><br>  
            <button type="submit">Add Teacher</button>        
        </div>   
    </form>
</body>
</html>