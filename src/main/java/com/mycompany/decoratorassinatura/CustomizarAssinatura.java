/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decoratorassinatura;

import java.util.ArrayList;

/**
 *
 * @author igor_
 */
public class CustomizarAssinatura extends ProductDecorator{
    ArrayList<ProductProtocol> produtos = new ArrayList();
    public CustomizarAssinatura(ProductProtocol product) {
        super(product);
    }

    @Override
    String getName() {
        String aux = "";
        for(ProductProtocol produto : produtos){
            System.out.println(produto.getName());
        }
        return aux;
    }

    @Override
    double getPrice() {
        double aux = 0;
        for(ProductProtocol product : produtos){
            System.out.println(product.getPrice());
            aux += product.getPrice();
        }
        return aux;
    }
    
    void addPacote(Pacote pacote){
        produtos.add(pacote);
    }
    
    void removePacote(Pacote pacote){
        produtos.remove(pacote);
    }

}
