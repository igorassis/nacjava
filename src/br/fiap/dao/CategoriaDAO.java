/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fiap.dao;

import br.fiap.conexao.Conexao;
import br.fiap.modelo.Categoria;
import br.fiap.modelo.Livro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author logonrm
 */
public class CategoriaDAO {
    private Connection connection;
    private PreparedStatement p;
    private ResultSet rs;
    private String sql;
    
    public boolean salvar(Categoria categoria){
        boolean status = false;
            sql = "insert into java_categoria values(?, ?)";
            try{
                connection = Conexao.getConnection();
                p = connection.prepareStatement(sql);
                p.setString(1, categoria.getCodigo());
                p.setString(2, categoria.getCategoria());
                p.execute();
                status = true;
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Não foi possivel salvar!"+e);
            }
        return status;
    }
    
}
