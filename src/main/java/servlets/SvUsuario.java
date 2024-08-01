
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;
import logica.Usuario;

@WebServlet(name = "SvUsuario", urlPatterns = {"/SvUsuario"})
public class SvUsuario extends HttpServlet {

    Controladora control = new Controladora();
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Usuario> usuarioLista = new ArrayList<>();
        
        usuarioLista = control.traerUsuarios();
        
        HttpSession sesion = request.getSession();
        sesion.setAttribute("usuarioLista", usuarioLista);
        
        response.sendRedirect("mostrarUsuarios.jsp");
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String cedula = request.getParameter("cedula");
        String primer_nombre = request.getParameter("primer_nombre");
        String segundo_nombre = request.getParameter("segundo_nombre");
        String primer_apellido = request.getParameter("primer_apellido");
        String segundo_apellido = request.getParameter("segundo_apellido");
        
        Usuario u = new Usuario();
        u.setCedula(cedula);
        u.setPrimer_nombre(primer_nombre);
        u.setSegundo_nombre(segundo_nombre);
        u.setPrimer_apellido(primer_apellido);
        u.setSegundo_apellido(segundo_apellido);
        
        control.crearUsuario(u);
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
