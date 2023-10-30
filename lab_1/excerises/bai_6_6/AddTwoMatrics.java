// Author: Dinh Van Luan
// MSSV: 20215083
package lab_1.excerises.bai_6_6;

import java.util.Scanner;

public class AddTwoMatrics {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) { 
            System.out.println("Hi, Dinh Van Luan - 20215083 \nPlease enter the parameters of the matrix");
            System.out.print("Enter number of row: ");
            int nRow = in.nextInt();
            System.out.print("Enter number of column: ");
            int nColumn = in.nextInt();

            // enter element of matrix one
            int matrixOne[][] = new int[nRow][nColumn];
            System.out.println("Enter element of matrix one: ");
            for (int i = 0; i < nRow; i++) {
                for (int j = 0; j < nColumn; j++) {
                    matrixOne[i][j] = in.nextInt();
                }
            }

            // enter element of matrix two
            int matrixTwo[][] = new int[nRow][nColumn];
            System.out.println("Enter element of matrix two: ");
            for (int i = 0; i < nRow; i++) {
                for (int j = 0; j < nColumn; j++) {
                    matrixTwo[i][j] = in.nextInt();
                }
            }

            // add two matrix
            int matrixAdd[][] = new int[nRow][nColumn];
              for (int i = 0; i < nRow; i++) {
                for (int j = 0; j < nColumn; j++) {
                    matrixAdd[i][j] = matrixOne[i][j] + matrixTwo[i][j];
                }
            }

            //display add two matrics on console;
            System.out.println("Add Matrix: ");
            for (int i = 0; i < nRow; i++) {
                for (int j = 0; j < nColumn; j++) {
                    System.out.print(matrixAdd[i][j] + " ");
                }
                System.out.print("\n");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
    }
}
