<%-- 
    Document   : consumidor
    Created on : 09-feb-2017, 11:54:36
    Author     : jose
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ejemplo de consumidor de Web Service</h1>
        <%
        int numero1=18;
        int numero2=25;
          
    try {
	ws.Calculadora_Service service = new ws.Calculadora_Service();
	ws.Calculadora port = service.getCalculadoraPort();
	int result = port.suma(numero1, numero2);
	out.println("Resultado = "+result);
    } catch (Exception ex) {
	}
    %>
    </body>
</html>
