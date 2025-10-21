// File: vn/fpoly/TutorBuoi1/XepLoai.java
package vn.fpoly.TutorBuoi1;

public class XepLoai {
    public String XepLoai(double diemTb){
        if(diemTb < 0 || diemTb > 10){
            throw new IllegalArgumentException("Diem trung binh phai nam trong khoang [0, 10].");
        }
        if(diemTb >= 9){
            return "Xuat xac";
        }else if(diemTb >= 8) {
            return "Gioi";
        }else if(diemTb >= 7){
            return "Kha";
        }else if(diemTb >= 5){
            return "Trung binh";
        }else {
            return "Yeu";
        }
    }
}