/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import JFrames.Produtos;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 *
 * @author jonatas.ferreiraa
 */
public class ProdutosDAO extends GenericDAO<Produtos>{
    public void excluir (int codigo){
        Produtos produto = super.selecionarPorCodigo(codigo);
        super.excluir(produto);
                
    }
    
    
    
 
    
    
}
