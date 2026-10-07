package org.example;

class HebraLetra extends Thread {
    private char caracter;
    private int repeticiones;

    public HebraLetra(char caracter, int repeticiones) {
        this.caracter = caracter;
        this.repeticiones = repeticiones;
    }
    @Override
    public void run() {
        // for para que se repita tanto como repeticiones haya
        for (int i = 0; i < repeticiones; i++) {
            System.out.print(caracter);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // cojo los caracteres y las veces que quiero que se repitan
        HebraLetra h1 = new HebraLetra('A', 50);
        HebraLetra h2 = new HebraLetra('B', 50);
        HebraLetra h3 = new HebraLetra('C', 50);

        h1.start();
        h2.start();
        h3.start();
    }
}