package com.sugamadhiakri.CoffeeIS;
import java.util.ArrayList;
 
public class MergeSort {
    public static void sortMyArray(){       
        divide(0, CoffeeInventorySystem.items.size()-1);
    }
    public static void divide(int startIndex,int endIndex){
        if(startIndex<endIndex && (endIndex-startIndex)>=1){
            int mid = (endIndex + startIndex)/2;
            divide(startIndex, mid);
            divide(mid+1, endIndex);        
            merger(startIndex,mid,endIndex);            
        }       
    }   
    public static void  merger(int startIndex,int midIndex,int endIndex){
        ArrayList<Coffee> mergedSortedArray = new ArrayList<>();
        int leftIndex = startIndex;
        int rightIndex = midIndex+1;
        
        while(leftIndex<=midIndex && rightIndex<=endIndex){
            if(CoffeeInventorySystem.items.get(leftIndex).getPrice()<=CoffeeInventorySystem.items.get(rightIndex).getPrice()){
                mergedSortedArray.add(CoffeeInventorySystem.items.get(leftIndex));
                leftIndex++;
            }else{
                mergedSortedArray.add(CoffeeInventorySystem.items.get(rightIndex));
                rightIndex++;
            }
        }       
        while(leftIndex<=midIndex){
            mergedSortedArray.add(CoffeeInventorySystem.items.get(leftIndex));
            leftIndex++;
        }    
        while(rightIndex<=endIndex){
            mergedSortedArray.add(CoffeeInventorySystem.items.get(rightIndex));
            rightIndex++;
        }  
        int i = 0;
        int j = startIndex;
        while(i<mergedSortedArray.size()){
            CoffeeInventorySystem.items.set(j, mergedSortedArray.get(i++));
            j++;
        }
    }
}
