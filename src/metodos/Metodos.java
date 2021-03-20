package metodos;

import javax.swing.*;
import java.util.ArrayList;

public class Metodos {

    public static void mostrarPorConsola(String mensaxe) {
        System.out.println(mensaxe);
    }

    public static String pedirString(String mensaxe) {
        return JOptionPane.showInputDialog(mensaxe);
    }
    public static int pedirInt(String mensaxe) {
        return Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
    }

    public static String lerString(String mensaxe) {
        return JOptionPane.showInputDialog(mensaxe);
    }

    public static int lerEnteiro(String mensaxe) {

        return Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
    }
    public static int validacionInt(String menxase) {
        int dato;
        do {
            dato = Integer.parseInt(JOptionPane.showInputDialog(menxase));
        } while (dato <= 0);
        return dato;
    }


    public static void visualizar(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            //Para visualizar unha matriz de números en non unha fila de números
            System.out.println(" \n ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%3d ", matriz[i][j]); //%imprime una variable, utiliza al menos 3 espacios para mostrar rellenando segun sea necesrio ,d la variable será entera

            }
        }
    }

    public static ArrayList<Integer> arrayListInteger(int[]array){

        ArrayList<Integer>lista=new ArrayList<>();
        for (int i =0;i<array.length;i++){
            lista.add(array[i]);
        }
        return lista;
    }
    public static boolean comprobarMatriz0(int[][] matriz) {
        boolean vacia = false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0) {
                    vacia = true;
                }
            }
        }
        return vacia;
    }

}
