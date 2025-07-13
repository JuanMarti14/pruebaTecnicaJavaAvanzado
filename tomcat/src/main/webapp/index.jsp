<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import ="java.time.LocalTime" %>
<%@ page import ="java.time.temporal.ChronoUnit" %>

<html>
    <head>
    <title>TituloWeb</title>
    <style>
        body {
          background: #f0f4f8;
          font-family: 'Segoe UI', sans-serif;
          display: flex;
          justify-content: center;
          align-items: center;
          height: 100vh;
        }

        .pajarito {
          background: linear-gradient(to right, #6a11cb, #2575fc);
          color: white;
          padding: 30px;
          border-radius: 15px;
          box-shadow: 0 10px 20px rgba(0,0,0,0.2);
          text-align: center;
          width: 300px;
          transition: transform 0.3s ease;
        }

        .pajarito :hover {
          transform: scale(1.05);
        }

        .pajarito h1 {
          margin: 0;
          font-size: 24px;
        }

        .pajarito p {
          margin-top: 10px;
          font-size: 16px;
          opacity: 0.9;
        }
      </style>
    </head>
    <body>
    <div class="pajarito">
        <h1 style="color:#ec5076;">Bienvenido a JSP</h1>
        <%String nombre = "Juan";%>

        <p>Hola, <Strong><%= nombre %></Strong>! esta es tu primera página JSP</p>
        <p>Hola, la fechas es <%= LocalTime.now().truncatedTo(ChronoUnit.SECONDS) %></p>
    </div>
    </body>
</html>
