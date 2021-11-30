package com.midterm.finalproject;

public class RecentDomain {
    private String title;
    private String pic;
    private String address;

    public RecentDomain(String title, String pic, String address) {
        this.title = title;
        this.pic = pic;
        this.address = address;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
}
