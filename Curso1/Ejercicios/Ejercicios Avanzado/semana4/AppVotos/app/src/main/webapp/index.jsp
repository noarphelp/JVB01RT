<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="entities.Votos" %>
<%@ page import="java.util.Map" %>
<%@ page import="entities.Opcion" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Votación</title>
    <link rel="stylesheet" href="public/css/style.css">
</head>
<body>
    <div class="card">
        <h1>🗳️ Votación</h1>
        <p class="subtitle">Elija su voto:</p>

        <!-- Formulario para votar -->
        <form action="/app/votarServlet" method="post" class="voto-form">
            <label>
                <input required type="radio" name="opcion" value="PARTIDO_A">
                🟥 Partido A
            </label>
            <label>
                <input required type="radio" name="opcion" value="PARTIDO_B">
                🟦 Partido B
            </label>
            <label>
                <input required type="radio" name="opcion" value="PARTIDO_C">
                🟩 Partido C
            </label>

            <div class="botones">
                <button type="submit" name="accion" value="votar" class="btn azul">Votar</button>
            </div>
        </form>


        <form action="/app/votarServlet" method="get">
            <div class="botones">
                <button type="submit" class="btn verde">Mostrar resultados</button>
            </div>
        </form>


        <% String mensaje = request.getParameter("mensaje"); %>
        <% if ("ok".equals(mensaje)) { %>
            <div class="alert success">✅ ¡Voto registrado correctamente!</div>
        <% } %>


        <!-- Sección de resultados -->
        <%
            Map<Opcion, Long> resultados = (Map<Opcion, Long>) request.getAttribute("resultados");
            if (resultados != null && !resultados.isEmpty()) {
        %>
            <div class="resultados">
                <h2>📊 Resultados</h2>
                <div class="grid">
                    <%
                        for (Opcion opcion : Opcion.values()) {
                            Long total = resultados.getOrDefault(opcion, 0L);
                    %>
                        <div class="resultado-item">
                            <%= opcion.name().replace("_", " ") %>: <strong><%= total %></strong> votos
                        </div>
                    <%
                        }
                    %>
                </div>
            </div>
        <% } %>
    </div>
</body>
</html>



