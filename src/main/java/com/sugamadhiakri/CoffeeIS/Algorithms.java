//use these in the main frame classes 
package com.sugamadhiakri.CoffeeIS;
import java.util.ArrayList;
class Algorithms{
  public ArrayList<Coffee> items;
  public Algorithms(ArrayList<Coffee> items){
    this.items = items ;
  }
  public static void main(String [] args){
    ArrayList <Coffee> items = new ArrayList<>();
    Algorithms a = new Algorithms(items);
    a.adder(1, "himalayan coffee", "coffee beans", "matt D'Avella",5000,10);
    a.adder(2, "ilam coffee", "coffee beans", "kp oli",1000,20);
    a.adder(3, "african coffee", "grinded coffee ", "barak obama",10000,00);
    a.mergeSort();
    a.printer();
  }
  public void mergeSort(){
    MergeSort ms = new MergeSort(this.items); 
    ms.sortGivenArray();
    this.items = ms.getSortedArray();
  }
  
  public void importCsv(){
    forCsv c = new forCsv(this.items);
    c.addFromCsv();
    this.items = s.getItems();
  }

  public void exportCsv(){
    forCsv c = new forCsv(this.items);
    c.addFromCsv();
  }

  public void adder(int modelNumber, String appName, String category,String recommendedBy, int price, int discount){
    this.items.add(new Coffee(modelNumber, appName, category, recommendedBy, price,discount));
  }
  public void printer(){ //print the pricess
    for(Coffee i:this.items){
      System.out.print(i.price+" ");
    }
  }
}
