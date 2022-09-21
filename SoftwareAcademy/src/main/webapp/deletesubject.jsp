<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ServletDeleteSubject" method="post">  
        <div class="container">   
        	 <label>Subject Id : </label>   <br>
            <input type="text" placeholder="Enter Id" name="subjectid" required><br>  
           
            <button type="submit">Delete Subject</button>        
        </div>   
    </form>
</body>
</html>