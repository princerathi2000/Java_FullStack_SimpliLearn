<html>
<head>

		  <a class="active" href="classes.jsp">Classes</a>
		  <a href="subject.jsp">Subjects</a>
		  <a href="teacher.jsp">Teachers</a>
		  <a href="index.jsp">Back</a>
	
</head>
<body>
<h2>Learners Academy</h2>
<%
	String msg=(String)request.getAttribute("msg");
	if(msg!=null)
	{
		out.println(msg);
	}
%>

<br>
<a href="addclasses.jsp"><button>Add Classes</button></a>
</body>
</html>
