
<%@page import="java.util.List"%>
<%@page import="logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuarios</title>
    </head>
    <body>
        <h1>Lista de Usuarios</h1>
        
        <% 
            List<Usuario> usuariosLista = (List) request.getSession().getAttribute("usuarioLista");
            
            for(Usuario u : usuariosLista){ 
         %>   
         <p><b>Usuario con cedula: <%=u.getCedula()%></b></p>
         <p>Nombre: <%=u.getPrimer_nombre() + " " + u.getSegundo_nombre() %></p>
         <p>Apellido: <%=u.getPrimer_apellido() + " " + u.getSegundo_apellido()%></p>
         <p>-------------------------------------------------------------------------------</p>
            
            <% }
                %>
        
    </body>
</html>
