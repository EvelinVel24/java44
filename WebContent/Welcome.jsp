<!-- Ubicado en WebContent/welcome.jsp -->
<%@ page session="true" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bienvenido</title>
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
    <h2>Bienvenido, <%= session.getAttribute("usuario") %></h2>
    <form action="Deslogueo" method="post">
        <button type="submit">Cerrar Sesión</button>
    </form>
</body>
</html>
