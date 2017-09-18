/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fiap.dao;

import br.fiap.conexao.Conexao;
import br.fiap.modelo.Categoria;
import br.fiap.modelo.Livro;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author logonrm
 */
public class LivroDAO {
    private Connection connection;
    private PreparedStatement p;
    private ResultSet rs;
    private String sql;
    
    public boolean salvar(Livro livro){
        boolean status = false;
            sql = "insert into java_livro values(?, ?, ?)";
            try{
                connection = Conexao.getConnection();
                p = connection.prepareStatement(sql);
                p.setString(1, livro.getCodigo());
                p.setString(2, livro.getTitulo());
                p.setString(3, livro.getCategoria());
                p.execute();
                status = true;
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Não foi possivel salvar!"+e);
            }
        return status;
    }
    
    public Livro pesquisar(String codigo){
        Livro aux = null;
        sql="select * from java_livro where codigo = ?";
        try{
            connection = Conexao.getConnection();
            p = connection.prepareStatement(sql);
            p.setString(1, codigo);
            rs = p.executeQuery();
            if(rs.next()){
                String Titulo = rs.getString("titulo");
                String categoria = rs.getString("categoria");
                aux = new Livro(codigo, Titulo, categoria);
            }
        }catch(SQLException ex){
            
        }
        return aux;
    }
    
    public ArrayList<String> pesquisarCat(){
        ArrayList<String> cate = new ArrayList<String>();
        sql="select * from java_categoria";
        try{
            connection = Conexao.getConnection();
            p = connection.prepareStatement(sql);
            rs = p.executeQuery();
             while (rs.next()) {
                String categoria = rs.getString("categoria");
                cate.add(categoria);
             }
        }catch(SQLException ex){
            
        }
        return cate;
    }
    
}
