package com.sugamadhiakri.CoffeeIS;
public class Coffee{
  int modelNumber;
  String appName;
  String category;
  String recommendedBy;
  int discount;
  int price;
  boolean addedSugar;

    public boolean isAddedSugar() {
        return addedSugar;
    }

    public void setAddedSugar(boolean addedSugar) {
        this.addedSugar = addedSugar;
    }
    public boolean getAddedSugar() {
        return this.addedSugar;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getRecommendedBy() {
        return recommendedBy;
    }

    public void setRecommendedBy(String recommendedBy) {
        this.recommendedBy = recommendedBy;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
  public Coffee(int modelNumber, String appName, String category,String recommendedBy, int price, int discount,boolean sugar){
    this.modelNumber = modelNumber;
    this.appName = appName;
    this.category = category;
    this.recommendedBy = recommendedBy;
    this.price = price;
    this.discount = discount;
    this.addedSugar = sugar;
  }
  
}
