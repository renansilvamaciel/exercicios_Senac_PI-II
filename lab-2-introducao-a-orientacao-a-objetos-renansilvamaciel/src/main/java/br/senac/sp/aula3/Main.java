/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.aula3;

import javax.swing.JOptionPane;

/**
 *
 * @author fernando.fernandes
 */
public class Main {

    
    public static void main(String[] args) {
       //instacio o objeto 
        Carro myCar = new Carro();
        myCar.setModelo("Volkswagen Voyage");
       
        
        //instancio outro objeto
        Carro carroRodizio = new Carro();
        carroRodizio.setModelo("Volkswagen Gol");
        carroRodizio.setCor("Cinza");
        carroRodizio.acelerar();
        
        
        // exibindo a mensagem com as informacoes do segundo carro
       JOptionPane.showMessageDialog(null, "Modelo: "+carroRodizio.getModelo()+", Cor: "+carroRodizio.getCor()+", velocidade: "+carroRodizio.getVelocidadeAtual());
    }
    
    
    
}
