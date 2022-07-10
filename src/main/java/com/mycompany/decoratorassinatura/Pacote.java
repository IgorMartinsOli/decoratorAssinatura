/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decoratorassinatura;

/**
 *
 * @author igor_
 */
public class Pacote extends ProductProtocol{
    protected String name;
    protected double price;
    
    Pacote(String name, double price){
        this.name = name;
        this.price = price;
    }
    @Override
    String getName() {
        return this.name;
    }

    @Override
    double getPrice() {
        return this.price;
    }
}
