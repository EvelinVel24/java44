// Ubicado en src/com/ejemplo/sesion/ProcesaLogin.java
package com.ejemplo.sesion;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/ProcesaLogin")
public class ProcesaLogin extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Validación básica
        if ("usuario".equals(username) && "password".equals(password)) {
            HttpSession session = request.getSession();
            session.setAttribute("usuario", username);
            response.sendRedirect("welcome.jsp");
        } else {
            response.getWriter().println("Usuario o contraseña incorrectos. <a href='index.jsp'>Intentar de nuevo</a>");
        }
    }
}
