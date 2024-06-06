/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.fesa.tablepick.dao;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author DAVI
 * @param <E>
 */
public interface GenericoDAO<E> extends Serializable{
    
    public List<E> listar();
    
    public void inserir(E e);

    public void alterar(E e);

    public void remover(E e);

    public E listarPorID(E e);
}
