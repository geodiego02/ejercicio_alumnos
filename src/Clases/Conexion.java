/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Diego
 */
public class Conexion {
    private Connection c;
    private Statement st;
    private ResultSet rs;
    
    public Conexion(){
        try{
        String url="jdbc:mysql://localhost/evaluacion5";
        String usuario="root";
        String clave="52047365";
        Class.forName("com.mysql.jdbc.Driver");
        c=DriverManager.getConnection(url,usuario,clave);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error SQL en la conexión: " + e.getMessage(),"Error en la Conexión",0);
            System.exit(0);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error Genérico en la conexión: " + e.getMessage(),"Error en la Conexión",0);
            System.exit(0);
        }
        
    }
    public boolean validarUsuario(String usuario,String clave){
        boolean existe=false;
        try{
        String sql="select * from usuario where nom_usu='"+usuario+"' and cla_usu='"+clave+"';";
        st=c.createStatement();
        rs=st.executeQuery(sql);
        if(rs.next()){
            existe=true;
        }else{
            JOptionPane.showMessageDialog(null, "Usuario inválido, por favor vuelva a intentarlo.", "Usuario inválido", 1);
        }
        st.close();
        rs.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error SQL en la conexión: " + e.getMessage(),"Error en la Conexión",0);
            System.exit(0);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error Genérico en la conexión: " + e.getMessage(),"Error en la Conexión",0);
            System.exit(0);
        }
        
    return existe;
    }
}
