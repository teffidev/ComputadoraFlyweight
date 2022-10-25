package main;

import main.flyweight.ComputadoraFlyweight;
import main.model.Computadora;

public class Main {
    public static void main(String[] args) {

        ComputadoraFlyweight flyweight = new ComputadoraFlyweight();

        Computadora mac1 = flyweight.obtenerOCrearComputadora(16, 500);

        Computadora windows1 = flyweight.obtenerOCrearComputadora(2, 256);
        //Aquí estamos usando un espacio de memoria innecesario...
        Computadora mac2 = flyweight.obtenerOCrearComputadora(16, 500);

        System.out.println(mac1.toString());
        System.out.println(mac2.toString());
        System.out.println(windows1.toString());

    }

}

