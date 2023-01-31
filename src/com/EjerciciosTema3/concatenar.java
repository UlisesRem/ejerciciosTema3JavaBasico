package com.EjerciciosTema3;

public class concatenar {
    public static void main(String[] args) {
        conca();
    }

    static void conca(){

        String[] gatos = new String[]{"Coco", "Hayley", "Calixto"};

        for(int i = 0; i < gatos.length; i++){
            System.out.print(gatos[i]+ " ");
        }
    }
    }