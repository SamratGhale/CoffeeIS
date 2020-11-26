package com.sugamadhiakri.CoffeeIS;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class forCsv {
    public static void addFromCsv() {
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader("items.csv"))) {
            while ((line = br.readLine()) != null) {
                String[] item = line.split(",");
                int Cn =Integer.parseInt(item[0]);
                try{
                    for (Coffee c:CoffeeInventorySystem.items){
                    if (Cn==c.getModelNumber()){
                        Cn =Cn+1;
                    }
                }
                }
                catch(Exception e){
                    
                }
                
                CoffeeInventorySystem.items.add(new Coffee(Cn, item[1],item[2],item[3], Integer.parseInt(item[4]), Integer.parseInt(item[5]), Boolean.parseBoolean(item[6])));  
            }
            br.close();
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void addIntoCsv() {
        new File("items.csv").delete();
        try (FileWriter csvWriter = new FileWriter("items.csv")) {
            for (Coffee c : CoffeeInventorySystem.items) {
                csvWriter.append(String.join(",", Integer.toString(c.getModelNumber()), c.getAppName(), c.getCategory(), c.getRecommendedBy(), Integer.toString(c.getPrice()), Integer.toString(c.getDiscount()),Boolean.toString(c.getAddedSugar())));
                csvWriter.append('\n');
            }
            csvWriter.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
