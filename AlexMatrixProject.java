package alexmatrixproject;

import static alexmatrixproject.AlexClasses.add;
import static alexmatrixproject.AlexClasses.makeMatrix;
import static alexmatrixproject.AlexClasses.printMatrix;
import static alexmatrixproject.AlexClasses.subtract;
import static alexmatrixproject.AlexClasses.hammard;
import static alexmatrixproject.AlexClasses.multiplication;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;



public class AlexMatrixProject {
    
    public static void main(String[] args) {
    
       Scanner ui = new Scanner(System.in);
       System.out.print("Enter number of rows of matrix 1: ");
       int rows1 = ui.nextInt();
       
       System.out.print("Enter number of columns of matrix 1: ");
       int columns1 = ui.nextInt();
       
       System.out.print("Enter number of rows of matrix 2: ");
       int rows2 = ui.nextInt();
       
       System.out.print("Enter number of columns of matrix 2: ");
       int columns2 = ui.nextInt();
       
       
       
       
       System.out.println("Add = 1, substract = 2, multiply = 3");
       System.out.println("Hammard product = 4");

       int choose = ui.nextInt();
        
       int[][] matrix1 = makeMatrix(rows1, columns1); 
       /* int[][] matrix 1 means that we are creating a random matrix
       makeMatrix is a method that makes a matrix with [-100<#<100]*/
       
       System.out.println();
       
      int[][] matrix2 = makeMatrix(rows2, columns2);
      /*making a second matrix...*/
     
         
      int[][] sum = add(matrix1, matrix2);
      /*
      "int[][] sum" means that we are creating a sum variavle of type int[][].
      The method "add", has 2 parameters of type int[][].
      This method adds 2 matricies(2Darrays) and returns another matrix(2Darray).
      */
      
      int[][] sub = subtract(matrix1, matrix2);
      
      int[][] hammardProduct = hammard(matrix1, matrix2);
      
      int[][] multipli = multiplication(matrix1, matrix2);
      
      
      
      
      
      
      
      
switch(choose){
    
    case 1:
    {
       
       printMatrix(matrix1); 
       System.out.println();
       System.out.println("+");
       System.out.println();
       printMatrix(matrix2);
       System.out.println();
       System.out.println("=");
        System.out.println();        
       printMatrix(sum);
       System.out.println();    
       
       
       
    
    }    
        break;

    case 2:{
        printMatrix(matrix1); 
       System.out.println();
       System.out.println("-");
       System.out.println();
       printMatrix(matrix2);
       System.out.println();
       System.out.println("=");
        System.out.println();        
        printMatrix(sub);
       System.out.println();
       
        }
    break;   
    
    case 3:{
        
        
        printMatrix(matrix1); 
       System.out.println();
        System.out.println(" * ");
       System.out.println();
       printMatrix(matrix2);
       System.out.println(); 
       System.out.println("=");
        System.out.println();        
       printMatrix(multipli);
        
        
    }
    break;
    
    case 4:{
       
        printMatrix(matrix1); 
       System.out.println();
           System.out.println("'hammard product'");
       System.out.println();
       printMatrix(matrix2);
       System.out.println();
        System.out.println("=");
        System.out.println();        
       printMatrix(hammardProduct);
       
    }
    break;    

        }
      
    
     }}
    