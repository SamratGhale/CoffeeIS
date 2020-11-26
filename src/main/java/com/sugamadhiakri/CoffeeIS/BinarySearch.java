package com.sugamadhiakri.CoffeeIS;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samrat
 */
public class BinarySearch{
    
  public static int binarySearch(ArrayList<Coffee> items, int search){
    int first = 0;
    int last = items.size() -1 ;
    int mid;
    while(first <= last){
      mid = (first + last) / 2;
      if (search == items.get(mid).getPrice()){
        return mid;
      } else if ((items.get(mid).getPrice()) - search > 0){
        last = mid - 1;
      } else{
        first = mid + 1;
      }
    }
    return -1;
  }
}
