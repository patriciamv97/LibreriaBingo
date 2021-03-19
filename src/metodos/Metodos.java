package metodos;

import javax.swing.*;

public class Metodos {

    public static void visualizar(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            //Para visualizar unha matriz de números en non unha fila de números
            System.out.println(" \n ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%3d ", matriz[i][j]); //%imprime una variable, utiliza al menos 3 espacios para mostrar rellenando segun sea necesrio ,d la variable será entera

            }
        }
    }

}
