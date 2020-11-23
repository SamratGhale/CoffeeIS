import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class forCsv{
  public ArrayList<Coffee> items;
  public forCsv(ArrayList <Coffee> items){
    this.items = items;
  }
  public static void main(String[] args){
    ArrayList <Coffee> items = new ArrayList<Coffee>();
    forCsv c = new forCsv(items);
    c.addFromCsv();
    c.addIntoCsv();
    System.out.println(c.items);
  }
  public void addFromCsv(){
    String line;
    try(BufferedReader br = new BufferedReader(new FileReader("items.csv"))){
      while((line = br.readLine()) != null){
        String[] item= line.split(",");
        this.items.add(new Coffee( Integer.parseInt(item[0]),item[1],item[2],item[3],Integer.parseInt(item[4]),Integer.parseInt(item[5])));
      }
      br.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  public void addIntoCsv(){
    try(FileWriter csvWriter = new FileWriter("items2.csv")){
      for (Coffee c: this.items){
        csvWriter.append(String.join(",",Integer.toString(c.getModelNumber()),c.getAppName(),c.getCategory(),c.getRecommendedBy(),Integer.toString(c.getPrice()),Integer.toString(c.getDiscount())));
        csvWriter.append('\n');
      }
    //csvWriter.flush();
    csvWriter.close();
    }catch (IOException e) {
      e.printStackTrace();
    }
  }
}


