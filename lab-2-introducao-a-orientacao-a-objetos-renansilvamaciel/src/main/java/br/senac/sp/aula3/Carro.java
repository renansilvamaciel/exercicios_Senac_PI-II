/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.aula3;

/**
 *
 * @author fernando.fernandes
 */
public class Carro {
    private String fabricante;
    private String rodas; 
    private String cor;
    private String modelo;
    private int velocidadeAtual;
    
    public Carro(){
        
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getRodas() {
        return rodas;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setRodas(String rodas) {
        this.rodas = rodas;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
    
    public void acelerar (){
        this.velocidadeAtual+=10;
    }
    
    
    public void acelerar(int numVelocidade){
        this.velocidadeAtual+=numVelocidade;
    }
    
    
    
    
    
    
}
