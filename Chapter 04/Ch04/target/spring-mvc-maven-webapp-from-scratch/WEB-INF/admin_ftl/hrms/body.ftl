<#list model["allUsers"] as user>
  	<tr>
  		<td>${user.hrmsEmployeeDetails.empId}</td> 
  		<td>${user.username}</td>
  		<td>${user.password}</td>
  		<td>${user.role}</td>
  	</tr>
 </#list>