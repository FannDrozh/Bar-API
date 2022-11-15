package com.example.country_mobilky;

import android.os.Parcel;
import android.os.Parcelable;

public class mask implements Parcelable {

    private int ID_Drink;
    private String Name;
    private int Price;
    private String Image;

    protected mask(Parcel in){
        ID_Drink = in.readInt();
        Name = in.readString();
        Price = in.readInt();
        Image = in.readString();
    }

    public mask(int ID, String Name, int Price,String Image ) {
        this.ID_Drink = ID;
        this.Name = Name;
        this.Price = Price;
        this.Image = Image;
    }

    public static final Creator<mask> CREATOR = new Creator<mask>() {
        @Override
        public mask createFromParcel(Parcel in) {
            return new mask(in);
        }

        @Override
        public mask[] newArray(int size) {
            return new mask[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(ID_Drink);
        dest.writeString(Name);
        dest.writeInt(Price);
        dest.writeString(Image);
    }


    public int getID() { return ID_Drink; }

    public void setID(int ID) { this.ID_Drink = ID; }

    public String getName() { return Name; }

    public void setName(String name) { Name = name;}

    public int getPrice() { return Price; }

    public void setPrice(int price) { Price = price; }

    public String getImage() { return Image; }

    public void setImage(String image) { Image = image; }
}