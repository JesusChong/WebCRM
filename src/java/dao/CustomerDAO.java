/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Customer;

/**
 *
 * @author Lenovo Y50-70
 */
public class CustomerDAO {
    
       ///metodo para egistrar
    public static boolean registrar(Customer cus){
        
        
        ///encerrar dentro de try catch si no se ejecuta la consulta de manera adecuada o se rompa el tiempo de ejecucucion, la tabla no exista, valores repetidos etc;
        try {
            String SQL="INSERT INTO customer(name) VALUES('?');";
            
            //HACER CONEXION - cuando se conecte que se guarde en cus
            Connection con = Conexion.conectar(); //referencia a la base de datos
            //preparar sentencia o consulta
            PreparedStatement st = con.prepareStatement(SQL);
            ///enviar el parametro a esa consulta sql, st es la consulta preparada, hay 1 variable que se espera y aun no se envia, se obtiene cus.getNombre
            st.setString(1, cus.getName()); // a esa consulta preparada hay un parametro es el valor de cat cuando se envie ese valor
            
            ///si st.executeupdte(cambio en la informacion, por ejemplo insertar informacion nueva) si regresa mayor a 0 entonces si se hizo una insercion
            if(st.executeUpdate()>0){
                return true;
            }else {
                return false;
            }
            
        } catch (SQLException ex) {
           return false;
        }
        
        
        
    }
    
    
    
    //----
    
    
     public static ArrayList<Customer> listar(){
        
        
        ///encerrar dentro de try catch si no se ejecuta la consulta de manera adecuada o se rompa el tiempo de ejecucucion, la tabla no exista, valores repetidos etc;
        try {
            String SQL="SELECT * FROM categorias";
            
            //HACER CONEXION - cuando se conecte que se guarde en c,
            Connection con = Conexion.conectar(); //referencia a la base de datos
            //preparar sentencia o consulta
            PreparedStatement st = con.prepareStatement(SQL);
           
       //     st.setString(1, cat.getNombre()); // a esa consulta preparada hay un parametro es el valor de cat cuando se envie ese valor
            

            //aqui se ejctua y se guardará el resultado de la consulta SQL, 
            ResultSet resultado = st.executeQuery();
            
            ArrayList<Customer> lista = null;
            //se crea objeto de tipo categoria
            Customer cus;
            //mientras encuentre un dato dentro de resultado, se ira llenando esa lista
            while(resultado.next()){
                cus = new Customer(); //se crea una nueva Categoria 
                cus.setId(resultado.getInt("id"));
                cus.setName(resultado.getString("name")); //se asigna con set, se obtiene con get el valor de la variable
                cus.setEmail(resultado.getString("email"));
                cus.setAddress(resultado.getString("address"));
                cus.setPhone(resultado.getString("phone"));
                cus.setUser_id(resultado.getInt("User_id"));
                lista.add(cus);
            }
            
            //retorna la lista completa
            return lista;
            
         
            
        } catch (SQLException ex) { // si no hay nada se retornará null
           return null;
        }
        
        
        
    }
    
}
