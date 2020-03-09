/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cad;

import java.util.ArrayList;
import JavaBeans.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author Data
 */
public class CategoriaCad {
    
    
    public static ArrayList<Categoria> listar()
    {
        
        try {
            String sql="{call sp_listarCategoriaSuperior()}";
            Connection c= Conexion.conectar();
            
            CallableStatement sentencia= (CallableStatement) c.prepareCall(sql);
            ResultSet resultado=sentencia.executeQuery();
            ArrayList<Categoria> lista=new ArrayList<>();
            while(resultado.next())
            {
                Categoria cat=new Categoria();
                cat.setCodigo(resultado.getInt(1));
                cat.setNombre(resultado.getString(2));
                
                lista.add(cat);
            }
            return lista;
        } catch (SQLException ex) {
           return null;
        }
        
        
        
    }
    
    public static ArrayList<Categoria> listarSubCategorias(int catSuperior)
    {
        
        try {
            String sql="{call sp_listarSubCategoria(?)}";
            Connection c= Conexion.conectar();
            
            CallableStatement sentencia= (CallableStatement) c.prepareCall(sql);
            sentencia.setInt( 1 , catSuperior);
            ResultSet resultado=sentencia.executeQuery();
            ArrayList<Categoria> lista=new ArrayList<>();
            while(resultado.next())
            {
                Categoria cat=new Categoria();
                cat.setCodigo(resultado.getInt(1));
                cat.setNombre(resultado.getString(2));
                
                lista.add(cat);
            }
            return lista;
        } catch (SQLException ex) {
           return null;
        }
        
        
        
    }
    
    
    public static boolean esSuperior(int cat)
    {
        
        try {
            String sql="{call sp_contarSubCategorias(?)}";
            Connection c= Conexion.conectar();
            
            CallableStatement sentencia= (CallableStatement) c.prepareCall(sql);
            sentencia.setInt( 1 , cat);
            ResultSet resultado=sentencia.executeQuery();
            
            resultado.next();
            
            return resultado.getInt("cantidad")> 0;
           
        } catch (SQLException ex) {
           return false;
        }
        
        
        
    }
    
    public static ArrayList<Categoria> listarTodoDeCategorias()
    {
        
        try {
            String sql="{call sp_listartododeCategoria()}";
            Connection c= Conexion.conectar();
            
            CallableStatement sentencia= (CallableStatement) c.prepareCall(sql);
            ResultSet resultado=sentencia.executeQuery();
            ArrayList<Categoria> lista=new ArrayList<>();
            while(resultado.next())
            {
                Categoria cat=new Categoria();
                cat.setCodigo(resultado.getInt(1));
                cat.setNombre(resultado.getString(2));
                
                lista.add(cat);
            }
            return lista;
        } catch (SQLException ex) {
           return null;
        }
        
        
        
    }
    
}
