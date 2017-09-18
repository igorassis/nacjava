/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fiap.modelo;

/**
 *
 * @author logonrm
 */
public class Livro {
    String codigo;
    String titulo;
    String categoria;
    
    public void Livro(){};

    public Livro(String codigo, String titulo, String categoria) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.categoria = categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    
}
