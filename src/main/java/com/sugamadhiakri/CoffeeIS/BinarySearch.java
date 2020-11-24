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
  ArrayList<Coffee> items;
  public static void main(String [] args){
    ArrayList<Coffee> items = new ArrayList<>();
    items.add(new Coffee(1,"Tokla","capachino","Some model on tv", 100, 1));
    items.add(new Coffee(2,"nestle","beans","model on tv", 32, 11));
    items.add(new Coffee(3,"coffee","neap","prediepit", 1111, 11));
    MergeSort m = new MergeSort(items);
    m.sortGivenArray();
    items = m.getSortedArray();
    //System.out.println(binarySearch(items,1111));
  }

  
  public int binarySearch(ArrayList<Coffee> items, int search){
    int first = 0;
    int last = items.size() -1 ;
    int mid;
    while(first <= last){
      mid = (first + last) / 2;
      if (search == items.get(mid).price){
        return mid;
      } else if ((items.get(mid).price) - search > 0){
        last = mid - 1;
      } else{
        first = mid + 1;
      }
    }
    return -1;
  }
}
