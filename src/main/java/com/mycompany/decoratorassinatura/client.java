/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.decoratorassinatura;

/**
 *
 * @author igor_
 */
public class client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AssinaturaBase assinatura = new AssinaturaBase();
        AssinaturaBase assinatura2 = new AssinaturaBase();
        Pacote pacote1 = new Pacote("Assistir vídeos em vários dispositivos", 19.99);
        Pacote pacote2 = new Pacote("Frete Grátis em produtos", 9.99);
        Pacote pacote3 = new Pacote("Caixa surpresa com produtos relacionados a filmes e séries", 29.99);
        Pacote pacote4 = new Pacote("Cartão de crédito Platinum", 49.99);
        Pacote pacote5 = new Pacote("Compra com Cash Back", 19.99);
        
        CustomizarAssinatura customizar = new CustomizarAssinatura(assinatura);
        customizar.addPacote(pacote1);
        customizar.addPacote(pacote2);
        customizar.getName();
        
        CustomizarAssinatura customizar2 = new CustomizarAssinatura(assinatura2);
        customizar2.addPacote(pacote3);
        customizar2.addPacote(pacote4);
        customizar2.addPacote(pacote1);
        customizar2.getName();
        customizar2.getPrice();
        System.out.println(customizar2.getPrice());
    }
    
}
