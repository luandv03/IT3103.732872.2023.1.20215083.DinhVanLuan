// Author: Dinh Van Luan
// MSSV: 20215083
package lab_1.excerises.bai_6_3;

import java.util.Scanner;

public class TriangleStar {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
            System.out.println("Enter height of triangle:");
            int nHeight = in.nextInt();
            int nStarMax = 2*nHeight - 1;
            int nStar;
            for (int i = 0; i < nHeight; i++) {
                nStar = 2*i + 1;
                for (int j = 0; j < nStarMax; j++) {
                    System.out.print(" ");// print space charecter' '.
                    // start position to print '*'.
                    if (j == (nStarMax - nStar)/2) {
                        for (int k = 0; k < nStar; k++) {
                            System.out.print("*");
                        }
                        break; // after print number of stars every time then break;
                    }
                }
                System.out.print("\n");
            }
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
