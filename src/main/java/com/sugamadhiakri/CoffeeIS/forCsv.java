package com.sugamadhiakri.CoffeeIS;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;

public class forCsv{
  public ArrayList<Coffee> items;
  public forCsv(ArrayList <Coffee> items){
    this.items = items;
  }
  public ArrayList<Coffee> getItems(){
    return this.items;
  }
  public void setItems(ArrayList<Coffee> items) {
    this.items = items;
  }
  public static void main(String[] args){
    ArrayList <Coffee> items = new ArrayList<>();
    forCsv c = new forCsv(items);
    //c.addIntoCsv();
    System.out.println(c.items);
  }
  public int addFromCsv(int maxNum){
    String line;
    try(BufferedReader br = new BufferedReader(new FileReader("items.csv"))){
      while((line = br.readLine()) != null){
        String[] item= line.split(",");    
        if (maxNum < Integer.parseInt(item[0])){
            //System.out.println(maxNum+" "+ Integer.parseInt(item[0]));
              this.items.add(new Coffee(Integer.parseInt(item[0]),item[1],item[2],item[3],Integer.parseInt(item[4]),Integer.parseInt(item[5])));
              maxNum = Integer.parseInt(item[0]);
        }
        else{
            System.out.println("item exists");
        }       
      }
      br.close();
    } catch (Exception e) {
        //System.out.println("errorrrr");
       
    }
    return maxNum;
  }
  public void addIntoCsv(){
      new File("items.csv").delete();
    try(FileWriter csvWriter = new FileWriter("items.csv")){
      for (Coffee c: this.items){
        csvWriter.append(String.join(",",Integer.toString(c.getModelNumber()),c.getAppName(),c.getCategory(),c.getRecommendedBy(),Integer.toString(c.getPrice()),Integer.toString(c.getDiscount())));
        csvWriter.append('\n');
      }
    //csvWriter.flush();
    csvWriter.close();
    }catch (IOException e) {
        System.out.println("errorrrr");
    }
  }
}


