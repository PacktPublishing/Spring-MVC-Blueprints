<%@ page isELIgnored="false"%>

<html xmlns:form="http://www.springframework.org/tags/form">

<body>
	<form action="${flowExecutionUrl}&_eventId=loginCredentialsEntered"
		method="post">

		<input type="hidden" name="_flowExecutionKey"
			value="${flowExecutionKey}" /> <br /> Enter login name as <b>alba</b>
		and password as <b>pass</b> for successfull login. <br /> Use any
		other login name and password for login error. <br /> <br />
		<table>
			<tr>
				<td>Login Name:</td>
				<td><input type="text" name="loginName" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="text" name="password" /></td>
			</tr>
		</table>

		<br /> <input type="submit" value="Login" />

	</form>
</body>
</html>