package com.example.country_mobilky;

public class DataModal {
    private String Image;
    private String Name;
    private int Price;
    public DataModal(String Image, String Name, int Price){

        this.Image=Image;
        this.Name=Name;
        this.Price=Price;
    }
    public void setImage(String Image)
    {
        this.Image=Image;
    }
    public void setName(String Name ){this.Name=Name;}
    public void setPrice (int Price)
    {
        this.Price=Price;
    }
    public String getImage()
    {
        return Image;
    }
    public String getName()
    {
        return Name;
    }
    public int getPrice()
    {
        return Price;
    }
}
