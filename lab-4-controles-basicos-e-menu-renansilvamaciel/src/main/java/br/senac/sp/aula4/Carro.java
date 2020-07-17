/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.aula4;

/**
 *
 * @author fernando.fernandes
 */
public class Carro {
    
    private String[] rodas;
    private String cor;
    private String modelo;
    private int velocidadeAtual;
    public static String fabricante = "SeuNomeSobreNome";

    public Carro() {
    }

    public String[] getRodas() {
        return rodas;
    }

    public void setRodas(String[] rodas) {
        this.rodas = rodas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return this.modelo.toUpperCase();
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
    
     public void acelelar(){
        this.velocidadeAtual+=10;
        if(this.velocidadeAtual >200){
           this.velocidadeAtual=200;
        }
    }
    
    public void acelelar(int numVelocidade){
        this.velocidadeAtual+=numVelocidade;
        
        if(this.velocidadeAtual >200){
           this.velocidadeAtual=200;
        }
    }
    
    public void frear(){
        this.velocidadeAtual-=10;
        if(this.velocidadeAtual <0){
           this.velocidadeAtual=0;
        }
    }
    
    public void frear(int numVelocidade){
        this.velocidadeAtual-=numVelocidade;
        
        if(this.velocidadeAtual <0){
           this.velocidadeAtual=0;
        }
        
    }
    
}
