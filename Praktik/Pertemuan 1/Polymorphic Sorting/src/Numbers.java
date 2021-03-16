
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Icad
 */
public class Numbers {

    public static void main(String[] args) {
        
        Integer[] intList; //log : Change the data type from int (primitive) to Integer
        int size;
        
        Scanner scan = new Scanner(System.in);
    
        System.out.println("\nHow many integers do you want to sort? ");
        size = scan.nextInt();
        intList = new Integer[size]; //log : Change the data type from int (primitive) to Integer
        
        System.out.println("\nEnter the numbers...");
        for(int i = 0; i < size; i++){
            intList[i] = scan.nextInt();
        }
        Sorting.selectionSort(intList);
        
        System.out.println("\nYour numbers in sorted order...");
        for (int i = 0; i < size; i++){
            System.out.print(intList[i] + " ");
        }
        System.out.println();
    }
    
}
