/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrixidentity;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class MatrixIdentity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tamano = new Scanner(System.in);

        System.out.println("Programa que identifica si una matriz es identidad");

        System.out.println("Ingrese la fila de la matriz 1");
        int fila = tamano.nextInt();
        System.out.println("Ingrese el tamano de las columnas ");
        int columna = tamano.nextInt();

        /*Func to determine if the matriz is square */
        if (isSquare(fila, columna)) {
            int[][] matrix = matrixCreator(fila, columna);
            showMatrix(matrix, fila, columna);
            if(isIdentity(matrix, matrix.length)){
                System.out.println("La matriz es identidad");
            }else{
            System.out.println("La matriz no es identidad");
            }
        } else {
            System.out.println("Por favor ingrese una nueva matriz");
        }

    }

    /*func to create a matriz n*m*/
    public static int[][] matrixCreator(int fila, int columna) {
        Scanner datosMatrix = new Scanner(System.in);

        int[][] matrixCreator = new int[fila][columna];
        for (int k = 0; k < fila; k++) {
            for (int l = 0; l < columna; l++) {
                System.out.println("Ingrese el dato de la fila " + k + " de la columna " + l);
                int nDato = datosMatrix.nextInt();
                matrixCreator[k][l] = nDato;
            }
        }

        return matrixCreator;
    }

    public static boolean isIdentity(int mat[][], int N) {
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                if (row == col && mat[row][col] != 1) {
                    return false;
                } else if (row != col && mat[row][col] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isSquare(int fila, int columna) {

        if (fila == columna) {
            System.out.println("Se determinara a continuacion si la matriz es una matriz identidad");
        } else {
            System.out.println("No se puede determinar si la matriz no es cuadrada");
            return false;
        }

        return true;
    }
    
    public static void showMatrix(int matrix[][], int fila, int columna) {

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
