/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Icad
 */
public class Sorting {
    
    public static void selectionSort(Comparable[] list){
        int min;
        Comparable temp;
        
        for (int index = 0; index < list.length-1;  index++){
            
            min = index;
            
            for (int scan = index + 1; scan < list.length; scan++){
                
                if (list[scan].compareTo(list[min]) < 0)
                    min = scan;
                
                temp = list[min];
                list[min] = list[index];
                list[index] = temp;
            }
        }
    }
    
    public static void insertionSort(Comparable[] list){
        
        for (int index = 1; index < list.length; index++){
        Comparable key = list[index];
        int position = index;
        
        while (position > 0 && key.compareTo(list[position-1]) > 0){ 
        //log : changed from ascending into descending "<0 to >0"
            list[position] = list[position-1];
            position--;
        }
        
        list[position] = key;
        }
    }
}
