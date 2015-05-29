/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2objetos;

import java.sql.*;


/**
 *
 * @author kevin
 */
public class Enlacedb {
    public Connection conect;
    Statement stSentencia;
    ResultSet rsDatos;
    public PreparedStatement psPreapararSentencias;
    
    public Connection Conexion() throws ClassNotFoundException, SQLException{
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            conect = DriverManager.getConnection("jdbc:mysql://localhost/dbprogra2objetos","root","");
            stSentencia = conect.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        }catch(ClassCastException | SQLException ex){
            throw ex;
            
        }
        return conect;
    }
    
    public ResultSet Consulta(String sql) throws SQLException{
        try{
            rsDatos = stSentencia.executeQuery(sql);
        }catch(SQLException e){
            throw e;
        }
        return rsDatos;
    }
    
    public void ejecutar(String sql)throws SQLException{
        try {
             
            stSentencia.execute(sql);
        } catch (SQLException e) {
            throw e;
        }
    }
}
