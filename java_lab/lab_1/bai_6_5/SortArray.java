// Author: Dinh Van Luan
// MSSV: 20215083
package lab_1.excerises.bai_6_5;

import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Hi, Dinh Van Luan - 20215083 \nEnter size of array: ");
            int sizeArr = in.nextInt();

            int[] arr = new int[sizeArr];

            for (int i = 0; i < sizeArr; i++) {
                arr[i] = in.nextInt();
            }

            // sort array;
            // selection sort;
            for (int i = 0; i < sizeArr; i++) { 
               for (int j = i; j < sizeArr; j++) {
                    if (arr[i] > arr[j]) {
                        int tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                    }
               }
            } 

            // calculate sum;
            int sum = 0;
            for (int i = 0; i < sizeArr; i++) {
                sum += arr[i];
            }

            double averageSum = (double) sum / sizeArr;

            System.out.println( 
                "Sorted array: "); 
            for (int i = 0; i < sizeArr; i++) { 
                // prints the elements of an array 
                System.out.print(arr[i] + " "); 
            } 
            System.out.print("\n");
            System.out.println("Sum of array: " + sum);
            System.out.println("Average sum of array: " + averageSum);

            in.close(); 
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
