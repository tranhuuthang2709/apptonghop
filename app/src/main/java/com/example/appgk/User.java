package com.example.appgk;

public class User {
    private String ten;
    private int img;
    private String diachi;
    private String sdt;
    private String email;

    public User(String ten, int img, String diachi, String sdt, String email) {
        this.ten = ten;
        this.img = img;
        this.diachi = diachi;
        this.sdt = sdt;
        this.email = email;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nhac{" +
                "ten='" + ten + '\'' +
                ", img=" + img +
                ", diachi='" + diachi + '\'' +
                ", sdt='" + sdt + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
