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
public abstract class ProductDecorator extends ProductProtocol{
    ProductProtocol produtoDecorador;
    
    public ProductDecorator(ProductProtocol product){
        this.produtoDecorador = product;
    }
}
