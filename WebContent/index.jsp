<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    	               "http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>
    	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    	<title>GlassFish JSP Page</title>
  </head>
  <body>
    <h1>Hello World!</h1>

	Panel logowania: 
	
	<form action=UserServlet method=post>
	<input type=text name=login /><br>
	<input type="password" name=passw /><br>
	<input type=submit value=ok>	
	
	</form>

  </body>
</html> 


