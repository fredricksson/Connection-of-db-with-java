/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexaobd.java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author fred
 */
public class ConexaoBDJava {

    /**
     * @param args the command line arguments
     */
   static  Connection conexao;
    public static void main(String[] args) {
        // TODO code application logic here
       
        ArrayList<Estudante> estudantes = new ArrayList<>();

        String sql = "select * from estudantes";
        try {

            PreparedStatement ps = conexao.prepareStatement(sql);

            ResultSet rs;
            rs = ps.executeQuery();

            while (rs.next()) {
                Estudante estudante = new Estudante(rs.getString("nome"), rs.getString("apelido"));
                estudantes.add(estudante);
            }
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
       
   
    
    }
    
}
