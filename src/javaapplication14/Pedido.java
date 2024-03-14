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
public class Pedido {
        private ArrayList<ItemPedido> itens;

    public Pedido() {
        this.itens = new ArrayList<>();
        
    }
    
    public void addItem(ItemPedido item){
        this.itens.add(item);
        
        
    }
    
    public Double valorTotal(){
        Double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.getProduto().getValor() *
                    item.getQuantidade();
            
        }
        return total;
    }
    
    
}
