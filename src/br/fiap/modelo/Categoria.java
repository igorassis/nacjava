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
public class Categoria {
    String codigo;
    String categoria;

    public Categoria(String codigo, String categoria) {
        this.codigo = codigo;
        this.categoria = categoria;
    }

    public void Categoria(){};
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
}
