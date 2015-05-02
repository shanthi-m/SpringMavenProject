<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

  <h1>${headerMsg}</h1>
  
  <form:errors path="student1.*"/>
  <br/>
  <br/>
  
  <form action="/SpringMavenProject/submitAdmissionForm" method="post">
   
   <table>
	<tr> 
		<td>Student Name: </td><td> <input type="text" name="studentName"/></td>
	</tr>
	<tr> 
		<td>Student Hobby: </td><td><input type="text" name="studentHobby"/></td>
	</tr>
	<tr> 
		<td>Student Mobile: </td><td><input type="text" name="studentMobile"/></td>
	</tr>
	<tr> 
	    <td>Student DOB(mm/dd/yyyy): </td><td><input type="text" name="studentDOB"/></td>
	</tr>
	<tr> 
	     <td>Student Skillset: </td><td><select name="studentSkills" multiple>
	                      <option selected>Java Core</option>
	                      <option>Spring Core</option>
	                      <option>JSP</option>
	                      <option>Oracle</option>
	                      </select></td>
	</tr>
	
	</table>
	
	<table>
			<tr><td>Student's Address : </td></tr> 
		<tr>
			<td>country: <input type="text" name="studentAddress.country"/></td>
			<td>city: <input type="text" name="studentAddress.city" /></td>
			<td>street: <input type="text" name="studentAddress.street" /></td> 
			<td>pincode:<input type="text" name="studentAddress.pincode" /></td>
		</tr>
	</table>
		
	
	<input type="submit" value="   Submit  "/>
		
  </form>

</body>
</html>