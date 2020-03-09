<%@page import="cad.MarcaCad"%>
<%@page import="JavaBeans.Marca"%>
<%@page import="cad.CategoriaCad"%>
<%@page import="JavaBeans.Categoria"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Gestión de productos |  Crea e-Commerce JAVA EE con pagos Online Paypal y Payu</title>
    <%@include file="../css.jsp" %>  
</head><!--/head-->

<body>
    <%@include file="../header.jsp" %>
    

	
        <section>
		<div class="container">
			<div class="row">
				<div class="col-sm-3">
				</div>
				
				<div class="col-sm-10 clearfix">
                                    
                                    ${mensaje}
					
                                    <h3>Gestionar Producto</h3>	
                                    
                                    <form action="ControlProducto" enctype="multipart/form-data" method="POST">
                                       <div class="form-one">
                                     
                                           Nombre:<br>
                                           <input type="text" name="nombre" placeholder="Nombre Producto" required><br>
                                           Precio (MXN):<br>
                                           <input type="number" name="precio" value="0" placeholder="Precio Producto" min="0"><br>
                                           Precio promo (MXN):<br>
                                           <input type="number" name="precionuevo" value="0" placeholder="Precio" min="0"><br>
                                           
                                            Precio (USD):<br>
                                           <input type="number" name="preciousd" value="0" placeholder="Precio Producto" min="0"><br>
                                           Precio promo (USD):<br>
                                           <input type="number" name="precionuevousd" value="0" placeholder="Precio" min="0"><br>
                                           
                                            Precio (COP):<br>
                                           <input type="number" name="preciocop" value="0" placeholder="Precio Producto" min="0"><br>
                                           Precio promo (COP):<br>
                                           <input type="number" name="precionuevocop" value="0" placeholder="Precio" min="0"><br>
                                           
                                            Precio (PEN):<br>
                                           <input type="number" name="preciopen" value="0" placeholder="Precio Producto" min="0"><br>
                                           Precio promo (PEN):<br>
                                           <input type="number" name="precionuevopen" value="0" placeholder="Precio" min="0"><br>
                                           
                                           Stock:<br>
                                           <input type="number" name="cantidad" placeholder="Cantidad"  value="1" min="1"><br>
                                           
                                           Marca:<br>
                                           <select name="marca">
                                              <option>Seleccionar Marca:</option>
                                              <%for(Marca marca: MarcaCad.listarTodoDeMarca()) {%>
                                               <option value="<%= marca.getCodigo() %>"><%=marca.getNombre() %> </option>
                                               
                                               <%}%>
                                           </select><br>
                                           
                                           Categoria: <br>
                                           <select name="categoria">
                                                <option>Seleccionar categoría</option>
                                               <%for(Categoria c: CategoriaCad.listarTodoDeCategorias()) {%>
                                               <option value="<%= c.getCodigo() %>"><%=c.getNombre() %> </option>
                                               
                                               <%}%>
                                           </select><br>
                                           
                                           Descripcion: <br>
                                           <textarea name="descripcion" rows="4" cols="20" placeholder="Descripción" required>
                                               
                                           </textarea><br>
                                           
                                           Nuevo?:
                                           <input type="checkbox" name="nuevo" value="ON" checked="checked" />
                                           Recomendado?:
                                           <input type="checkbox" name="recomendado" value="ON" />
                                           Visible?:
                                           <input type="checkbox" name="visible" value="ON" checked="checked"/>
                                           <hr>
                                           Seleccionar imgagen del producto: <input  type="file" name="imagen" >
                                           <hr>
                                           <input class="btn btn-success" type="submit" name="accion" value="Registrar" >
                                           <input class="btn btn-default" type="submit" name="accion" value="Consultar" >
                                           <input class="btn btn-warning" type="submit" name="accion" value="Actualizar" >
                                           <input class="btn btn-danger" type="submit" name="accion" value="Borrar" >
                                       </div> 
                                        
                                        
                                    </form>
                                    
					
					
					
					
				</div>
			</div>
		</div>
	</section>
	
        <%@include file="../footer.jsp" %>

  
    
</body>
</html>
