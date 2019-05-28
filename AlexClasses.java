package alexmatrixproject;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class AlexClasses {


   public static int[][] makeMatrix(int rows, int columns) {
       int[][] result = new int[rows][columns];
     
     Random dice = new Random();  // num is is any int between -100 to 100. 
         int num;
      
         num = dice.nextInt(200) - 100; // num is from 0 - 200, but if we do -100, it will go from -100 - 100 
     
     for (int i = 0; i < rows; i++) {
           for (int j = 0; j < columns; j++) {
               result[i][j] = dice.nextInt(200) - 100;
           }
       }
       return result;
   }

   public static int[][] add(int[][] matrix1, int[][] matrix2) {
       
       //if(matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length) 
       
       int rows = matrix1.length;
       int columns = matrix1[0].length;
       
       int[][] result = new int[rows][columns];
       
       for (int i = 0; i < rows; i++) {
           for (int j = 0; j < columns; j++) {
               result[i][j] = matrix1[i][j] + matrix2[i][j];
           }
       }
       
       return result;
       
   }

   public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
       int rows = matrix1.length;
       int columns = matrix1[0].length;
       int[][] result = new int[rows][columns];
       for (int i = 0; i < rows; i++) {
           for (int j = 0; j < columns; j++) {
               result[i][j] = matrix1[i][j] - matrix2[i][j];
           }
       }
       return result;
   }

   public static void printMatrix(int[][] matrix) {
       int rows = matrix.length;
       int columns = matrix[0].length;
       for (int i = 0; i < rows; i++) {
           for (int j = 0; j < columns; j++) {
               System.out.print(matrix[i][j] + "\t");
                                             }
           System.out.println();
                                      }
                                                  }
 
   public static int[][] hammard(int[][] matrix1, int[][] matrix2) {
       int rows = matrix1.length;
       int columns = matrix1[0].length;
       
       int[][] result = new int[rows][columns];
       for (int i = 0; i < rows; i++) {
           for (int j = 0; j < columns; j++) {
               result[i][j] = matrix1[i][j] * matrix2[i][j];
           }
       }
       return result;
   }
   
   
   public static int[][] multiplication(int[][] matrix1, int[][] matrix2) {
 
            int r1 = matrix1.length;
            int c1 = matrix1[0].length;
            int r2 = matrix2.length;
            int c2 = matrix2[0].length;
         
          int[][] result = new int[c1][r2];
       
          for ( int c = 0 ; c < r1 ; c++ ) 
         {
            for ( int d = 0 ; d < c2 ; d++ ) 
            {   
               for (int k = 0 ; k < c1 ; k++ )
               {
                  result[c][d] += matrix1[c][k] * matrix2[k][d];
               }
            }
         }
       
       return result;
   }
   
}
