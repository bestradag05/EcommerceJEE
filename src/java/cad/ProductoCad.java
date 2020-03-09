/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cad;

import JavaBeans.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Data
 */
public class ProductoCad {
    
    public static boolean registrarProducto(Producto p, ProductoMoneda cop, ProductoMoneda usd, ProductoMoneda pen)
    {
        
        try {
            String sql="{call sp_registrarproducto(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
            Connection c= Conexion.conectar();
            
            CallableStatement sentencia= (CallableStatement) c.prepareCall(sql);
            sentencia.setString( 1 ,p.getNombre() );
            sentencia.setFloat(2 ,p.getPrecio() );
            sentencia.setFloat( 3 ,p.getPrecionuevo());
            sentencia.setInt(4 ,p.getStock());
            sentencia.setBoolean(5 ,p.isNuevo());
            sentencia.setBoolean(6 ,p.isRecomendado());
            sentencia.setString( 7 ,p.getDescripcion());
            sentencia.setBoolean(8 ,p.isVisible());
            sentencia.setInt(9 ,p.getCodigo_marca());
            sentencia.setInt( 10 ,p.getCodigo_categoria());
            sentencia.setString( 11 ,p.getImg());
            
            sentencia.setString( 12, cop.getMoneda());
            sentencia.setFloat(13 ,cop.getPrecio());
            sentencia.setFloat( 14 ,cop.getPrecionuevo());
            
            sentencia.setString( 15, usd.getMoneda());
            sentencia.setFloat(16 ,usd.getPrecio());
            sentencia.setFloat( 17 ,usd.getPrecionuevo());
            
            sentencia.setString( 18, pen.getMoneda());
            sentencia.setFloat(19 ,pen.getPrecio());
            sentencia.setFloat( 20 ,pen.getPrecionuevo());
            
           
           
            return sentencia.executeUpdate()>0;
          
        } catch (Exception ex) {
         
            ex.printStackTrace();
            
            return false;
        } 
        
        
        
    }
    
    public static ArrayList<Producto> listarProductoRecomendados(String moneda)
    {
        
        try {
            String sql="{call sp_listarRecomendados(?)}";
            Connection c= Conexion.conectar();
            
            CallableStatement sentencia= (CallableStatement) c.prepareCall(sql);
            sentencia.setString( 1 ,moneda );
            
            ResultSet res=sentencia.executeQuery();
            ArrayList<Producto> lista=new ArrayList();
            while(res.next())
            {
                Producto p=new Producto();
                
                p.setWebid(res.getInt("webid"));
                p.setNombre(res.getString("nombre"));
                p.setImg(res.getString("img"));
                p.setStock(res.getInt("stock"));
                p.setNuevo(res.getBoolean("nuevo"));
                if(!moneda.equalsIgnoreCase("MXN"))
                {
                    p.setPrecio(res.getFloat("precio2"));
                    p.setPrecionuevo(res.getFloat("precioN2"));
                }else
                {
                    p.setPrecio(res.getFloat("precio"));
                    p.setPrecionuevo(res.getFloat("precionuevo"));
                }
                
                lista.add(p);
            }
            
            return lista;
          
        } catch (Exception ex) {
         
            ex.printStackTrace();
            
            return null;
        } 
        
        
        
    }
    
    
    public static ArrayList<Producto> listarProductoPorCategoria(String moneda, int cat)
    {
        
        try {
            String sql="{call sp_listarPorCategoria(?,?)}";
            Connection c= Conexion.conectar();
            
            CallableStatement sentencia= (CallableStatement) c.prepareCall(sql);
            sentencia.setString( 1 ,moneda );
            sentencia.setInt(2 ,cat );
            
            ResultSet res=sentencia.executeQuery();
            ArrayList<Producto> lista=new ArrayList();
            while(res.next())
            {
                Producto p=new Producto();
                
                p.setWebid(res.getInt("webid"));
                p.setNombre(res.getString("nombre"));
                p.setImg(res.getString("img"));
                p.setStock(res.getInt("stock"));
                p.setNuevo(res.getBoolean("nuevo"));
                if(!moneda.equalsIgnoreCase("MXN"))
                {
                    p.setPrecio(res.getFloat("precio2"));
                    p.setPrecionuevo(res.getFloat("precioN2"));
                }else
                {
                    p.setPrecio(res.getFloat("precio"));
                    p.setPrecionuevo(res.getFloat("precionuevo"));
                }
                
                lista.add(p);
            }
            
            return lista;
          
        } catch (Exception ex) {
         
            ex.printStackTrace();
            
            return null;
        } 
        
        
        
    }
    
    
    public static ArrayList<Producto> listarProductoPorMarca(String moneda, int marca)
    {
        
        try {
            String sql="{call sp_listarPorMarca(?,?)}";
            Connection c= Conexion.conectar();
            
            CallableStatement sentencia= (CallableStatement) c.prepareCall(sql);
            sentencia.setString( 1 ,moneda );
            sentencia.setInt(2 ,marca );
            
            ResultSet res=sentencia.executeQuery();
            ArrayList<Producto> lista=new ArrayList();
            while(res.next())
            {
                Producto p=new Producto();
                
                p.setWebid(res.getInt("webid"));
                p.setNombre(res.getString("nombre"));
                p.setImg(res.getString("img"));
                p.setStock(res.getInt("stock"));
                p.setNuevo(res.getBoolean("nuevo"));
                if(!moneda.equalsIgnoreCase("MXN"))
                {
                    p.setPrecio(res.getFloat("precio2"));
                    p.setPrecionuevo(res.getFloat("precioN2"));
                }else
                {
                    p.setPrecio(res.getFloat("precio"));
                    p.setPrecionuevo(res.getFloat("precionuevo"));
                }
                
                lista.add(p);
            }
            
            return lista;
          
        } catch (Exception ex) {
         
            ex.printStackTrace();
            
            return null;
        } 
        
        
        
    }
    
    
    public static Producto consultarProducto(String moneda, int webid)
    {
        
        try {
            String sql="{call sp_consultarProducto(?,?)}";
            Connection c= Conexion.conectar();
            
            CallableStatement sentencia= (CallableStatement) c.prepareCall(sql);
            sentencia.setString( 1 ,moneda );
            sentencia.setInt(2 ,webid );
            
            ResultSet res=sentencia.executeQuery();
            Producto p=null;
            if(res.next())
            {
                p=new Producto();
                
                p.setWebid(res.getInt("webid"));
                p.setNombre(res.getString("nombre"));
                p.setImg(res.getString("img"));
                p.setStock(res.getInt("stock"));
                p.setNuevo(res.getBoolean("nuevo"));
                if(!moneda.equalsIgnoreCase("MXN"))
                {
                    p.setPrecio(res.getFloat("precio2"));
                    p.setPrecionuevo(res.getFloat("precioN2"));
                }else
                {
                    p.setPrecio(res.getFloat("precio"));
                    p.setPrecionuevo(res.getFloat("precionuevo"));
                }
                
                
            }
            
            return p;
          
        } catch (Exception ex) {
         
            ex.printStackTrace();
            
            return null;
        } 
        
        
        
    }
    
}
