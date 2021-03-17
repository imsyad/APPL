
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
public class Strings {

    public static void main(String[] args) {
        
        String[] strList; //log : Change the data type from int (primitive) to Integer
        int size;
        
        Scanner scan = new Scanner(System.in);
    
        System.out.println("\nHow many String do you want to sort? ");
        size = scan.nextInt();
        strList = new String[size]; //log : Change the data type from int (primitive) to Integer
        
        System.out.println("\nEnter the word(s)...");
        for(int i = 0; i < size; i++){
            strList[i] = scan.next();
        }
        Sorting.insertionSort(strList); //log : changed from selectionSort() into insertionSort()
        
        System.out.println("\nYour numbers in sorted order...");
        for (int i = 0; i < size; i++){
            System.out.print(strList[i] + " ");
        }
        System.out.println();
    }
    
}
