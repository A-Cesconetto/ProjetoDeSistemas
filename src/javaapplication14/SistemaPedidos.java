/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class SistemaPedidos {
    public static void main(String[] args){
        Pedido pedido = new Pedido ();
        Produto prod = new Produto(1, "martelo", 25.0);
        ItemPedido item = new ItemPedido(prod, 2);
        pedido.addItem(item);
        
        prod = new Produto(2, "alicate", 45.0);
        item = new ItemPedido(prod, 3);
        pedido.addItem(item);
        
        System.out.println("Total "   +     pedido.valorTotal());
        
    }

   
    
    

    
    
}
