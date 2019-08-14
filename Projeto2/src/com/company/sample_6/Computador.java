package com.company.sample_6;

public class Computador {
    public String marca;
    public String modelo;
    public String cor;
    public long numeroSerie;
    public double preco;

    public void imprimir(){
        System.out.println("marca = " + marca);
        System.out.println("modelo = " + modelo);
        System.out.println("cor = " + cor);
        System.out.println("numeroSerie = " + numeroSerie);
        System.out.println("preco = " + preco);
    }
    public void calcularValor(){
        if(marca.equalsIgnoreCase("HP")){
            preco = preco * (30/100);
            return;
        }
        if(marca.equalsIgnoreCase("IBM")){
            preco = preco * (50/100);        }
    }
    public int alterarValor(double valor){
        if(valor>0){
            preco = valor;
            return 1;
        }
        return 0;
    }

}
