package com.midterm.finalproject;

public class ShopDomain {
    private String name;
    private String pic;
    private String address;
    private String score;
    private String ratings;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getRatings() {
        return ratings;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }

    public ShopDomain(String name, String pic, String address, String score, String ratings) {
        this.name = name;
        this.pic = pic;
        this.address = address;
        this.score = score;
        this.ratings = ratings;
    }
}
