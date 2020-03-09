/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import JavaBeans.Producto;
import JavaBeans.ProductoMoneda;
import cad.ProductoCad;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Data
 */
public class ControlProducto extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        
    }
   
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        recibirDatos(request);
        
        String url= request.getAttribute("imagen").toString();
        
        String nombre= request.getAttribute("nombre").toString();
        float precio= Float.parseFloat(request.getAttribute("precio").toString());
        float precioN=Float.parseFloat(request.getAttribute("precionuevo").toString());
        
        float preciocop= Float.parseFloat(request.getAttribute("preciocop").toString());
        float precioNcop= Float.parseFloat(request.getAttribute("precionuevocop").toString());
        
        float preciousd= Float.parseFloat(request.getAttribute("preciousd").toString());
        float precioNusd= Float.parseFloat(request.getAttribute("precionuevousd").toString());
        
        float preciopen= Float.parseFloat(request.getAttribute("preciopen").toString());
        float precioNpen= Float.parseFloat(request.getAttribute("precionuevopen").toString());
        
        int cantidad = Integer.parseInt(request.getAttribute("cantidad").toString());
        
        int marca = Integer.parseInt(request.getAttribute("marca").toString());
        
        int categoria= Integer.parseInt(request.getAttribute("categoria").toString());
        
        String descripcion = request.getAttribute("descripcion").toString();
        
        boolean n,recomendado,visible;
        
        try {
         n= request.getAttribute("nuevo").toString().equalsIgnoreCase("on");
        } catch (Exception e) {
            n=false;
        }
        
        try {
         recomendado = request.getAttribute("recomendado").toString().equalsIgnoreCase("on");
        } catch (Exception e) {
            recomendado=false;
            
        }
        
        try {
         visible = request.getAttribute("visible").toString().equalsIgnoreCase("on");
        } catch (Exception e) {
            visible=false;
        }

        
        
        
        
        String accion = request.getAttribute("accion").toString();
        
        Producto p=new Producto();
        p.setNombre(nombre);
        p.setPrecio(precio);
        p.setPrecionuevo(precioN);
        p.setCodigo_categoria(categoria);
        p.setCodigo_marca(marca);
        p.setDescripcion(descripcion);
        p.setImg(url);
        p.setNuevo(n);
        p.setRecomendado(recomendado);
        p.setStock(cantidad);
        p.setVisible(visible);
        
        ProductoMoneda cop=new ProductoMoneda();
        cop.setMoneda("COP");
        cop.setPrecio(preciocop);
        cop.setPrecionuevo(precioNcop);
        
        ProductoMoneda usd=new ProductoMoneda();
        usd.setMoneda("USD");
        usd.setPrecio(preciousd);
        usd.setPrecionuevo(precioNusd);
        
        ProductoMoneda pen=new ProductoMoneda();
        pen.setMoneda("PEN");
        pen.setPrecio(preciopen);
        pen.setPrecionuevo(precioNpen);
        
        if(accion.equalsIgnoreCase("Registrar"))
        {
            if(ProductoCad.registrarProducto(p, cop, usd, pen))
            {
                request.setAttribute("mensaje", "<p style='color:green'>Producto Registrado</p>");
                
            }else
            {
                request.setAttribute("mensaje", "<p style='color:green'>Producto NO Registrado</p>");
                
            }
            
            
        }else
        {
            request.setAttribute("<p style='color:green'>mensaje", "Accion desconocida</p>");
        }
        
        request.getRequestDispatcher("admin").forward(request, response);
        //response.sendRedirect("foto/"+url);
    }
    
    
     private void recibirDatos(HttpServletRequest request)
    {
        FileItemFactory fileFactory = new DiskFileItemFactory();// transforma la imagen en un item
        
        ServletFileUpload servletUpload = new ServletFileUpload(fileFactory);//leer los items
        String nombre="";
        try {
            List items=servletUpload.parseRequest(request);
            
            for(int i=0; i < items.size(); i++ )
            {
                FileItem item= (FileItem) items.get(i); //representa un archivo en memoria que puede ser pasado al servidor(temporal)
                if(!item.isFormField()) // si no es un archivo normal de formulario ..
                {
                    String ruta=request.getServletContext().getRealPath("/")+"foto/";//ruta donde se desplego el proyecto
                    SimpleDateFormat sdf=new SimpleDateFormat("ddMyyyyhhmmss"); // se crea el formato de el nombre de la foto
                    String fecha=sdf.format(new Date());
                    nombre=fecha+new Random().nextLong()+item.getName();
                    String nuevonombre=ruta+nombre;
                    File folder=new File(ruta);//se le asigna al objeto la ruta
                    if(!folder.exists()) // si no existe el objeto con esa ruta
                    {
                        folder.mkdirs(); // se crea el directorio
                    }
                    File imagen=new File(nuevonombre);
                    if(item.getContentType().contains("image"))// se verifica si es un archivo de imagen
                    {
                        item.write(imagen); // se escribe en el servidor
                        request.setAttribute(item.getFieldName(), nombre); // nombre del campo que se envio
                        
                    }
                }else
                {
                    request.setAttribute(item.getFieldName(), item.getString());
                    //crea atributos con los nombres en los formularios
                }
            }
            
        } catch (FileUploadException ex) {
            request.setAttribute("subida", false);
        } catch (Exception ex) {
            request.setAttribute("subida", false);
        }
       
    }
    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
