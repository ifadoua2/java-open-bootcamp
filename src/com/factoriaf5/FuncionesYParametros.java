package com.factoriaf5;

public class FuncionesYParametros {
    public static void main(String[]args) {

        // holaMundo();
        // holaMundo();

       //holaMundo(name:"Alan");
        //holaMundo(name"Roberto");

        String hola = devolverHola();
        System.out.println(hola);


    }
public static void holaMundo(){
    System.out.println("Hola mundo");
    System.out.println("Hola mundo");

    }

    private static void holaMundo(String nam){
        System.out.println("Hola "+ nam);
    }
    private static String devolverhola(){
        return"Hola";
    }
    private static int sum(int num1,int num2){

    }
}