/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Icad
 */
public class IntegerList {
    
    int[] list;
    
    public IntegerList(int size){
        
        list = new int[size];
    }
    
    public void randomize(){
        for (int i = 0; i < list.length; i++){
            list[i] = (int)(Math.random() * 100) + 1;
        }
    }
    
    public void print(){
        for (int i = 0; i < list.length; i++){
            System.out.println(i + ":\t" + list[i]);
        }
    }
    
    public int search(int target){
        int location = -1;
        for(int i = 0; i < list.length && location == -1; i++){
            if(list[i]==target){
                location = i;
            }
        }
        return location;
    }
    
    public void selectionSort(){
        int minIndex;
        
        for(int i = 0; i < list.length-1; i++){
            minIndex = i;
            for(int j = i + 1; j < list.length; j++){
                if(list[j] < list[minIndex]){
                    minIndex = j;
                }
            }
            
            int temp = list[i];
            
            list[i] = list[minIndex];
            list[minIndex] = temp;
        }
    }
    
    //1. add method replaceFirst(int oldVal, int newVal)
    public void replaceFirst(int oldVal, int newVal){
 
        int valLoc = search(oldVal);
        
        if (valLoc >= 0)
            list[valLoc] = newVal;
    }
    
    //2. add method replaceAll(int oldVal, int newVal)
    public void replaceAll(int oldVal, int newVal){
        
        for (int i = 0; i < list.length; ++i){
            if(list[i] == oldVal){
                list[i] = newVal;
            }
        }
    }
    
    //3. add method sortDecreasing()
    public void sortDecreasing(){
        int maxIndex;
        
        for(int i = 0; i < list.length-1; i++){
            maxIndex = i;
            for(int j = i + 1; j < list.length; j++){
               
                //compare two numbers
                //descending order
                if(list[j] > list[maxIndex]){
                    maxIndex = j;
                }
            }
            
            int temp = list[i];
            
            //swap two numbers
            list[i] = list[maxIndex];
            list[maxIndex] = temp;
        }
    }
    
    //4. add method int binarySearchD(int target)
    public int binarySearchD(int target){
        
        int end = list.length - 1, start = 0, mid;
        
        while (start <= end){
            
            //set the middle point
            mid = start + (end - 1) /2; 
            
            //check if the target is in mid
            if (list[mid] == target)
                return mid;
            
            //check if the target is least than mid
            if(list[mid] < target)
                //change the end point
                end = mid + 1;
            
            //check if the target is greater than mid
            else
                //change the start point
                start = mid - 1;
        }
    
        return -1;
    }
    
}
