/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decoratorassinatura;

/**
 *
 * @author igor_
 */
public class AssinaturaBase extends ProductProtocol{
    private final String name = "Assistir vídeos num único dispositivo";
    private final double price = 9.99;

    @Override
    String getName() {
        return this.name;
    }

    @Override
    double getPrice() {
        return this.price;
    }
}