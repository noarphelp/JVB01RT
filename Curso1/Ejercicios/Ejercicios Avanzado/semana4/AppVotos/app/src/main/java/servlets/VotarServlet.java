package servlets;

import controllers.VotoControllers;
import entities.Opcion;
import entities.Votos;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Map;

@WebServlet(urlPatterns = "/votarServlet")
public class VotarServlet extends HttpServlet {

    VotoControllers votoControllers = new VotoControllers();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Map<Opcion, Long> resultados = votoControllers.obtenerTotales();

        req.setAttribute("resultados", resultados);

        req.getRequestDispatcher("index.jsp").forward(req, resp);

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String valor = req.getParameter("opcion");
        Opcion opcionSeleccionada = Opcion.valueOf(valor);

        Votos votos = new Votos();
        votos.setOpcion(opcionSeleccionada);

        votoControllers.createVoto(votos);
        resp.sendRedirect("index.jsp?mensaje=ok");

    }
}
