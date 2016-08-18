package org.packt.hotel.portal.model.data;

public class Product {

    private int id;
    private String name;
    private String type;
    private String imageUrl;
    private float price;

    public Product(){

    }

    public Product(String name, String type, String imageUrl, float price) {
        super();
        this.name = name;
        this.type = type;
        this.imageUrl = imageUrl;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }




}