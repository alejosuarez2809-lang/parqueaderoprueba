<%-- 
    Document   : panel
    Created on : 26/03/2026, 10:49:58 a. m.
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro exitoso</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body class="bg-light">
         <%
            if(session.getAttribute("propietario")==null) {
            response.sendRedirect("index.html");
            return;
            }
            %>
        
            <div class="container mt-5"> 
                <div class="row justify-content-center"> 
                    <div class="col-md-6text-center"> 
                        <div class="alert alert-succes shadow-sm"> 
        
                            <h3 class="mb-0"> Vehículo registrado correctamente</h3>
                        </div>
                        <div class="card shadow mt-4"> 
                            <div class="card-body text-start"> 
                                <h5 class="card-title border-bottom pb-2">Detalles del Registro</h5>
                                <p class="mb-2"><strong>ID:</strong> ${id_res}</p>
                                <p class="mb-2"><strong>Placa:</strong><span class="badge bg-dark">${placa_res}</span></p>
                                <p class="mb-2"><strong>Tipo:</strong> ${tipo_res}</p>
                                <p class="mb-0"><strong>Propietario:</strong> <span class="text-primary fw-bold">${propietario}</span></p>
                            </div>
                            <div class="card-footer bg-white">
                                <a href="index.html" class="btn btn-outline-primary w-100"> Registrar otro vehículo</a>
                            </div>
                            </div>
                            
                            </div>
                            </div>
                            </div>
                            
                            <script src="http://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
                            
        
        
        
    </body>
</html>
