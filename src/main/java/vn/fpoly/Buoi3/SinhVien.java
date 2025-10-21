package vn.fpoly.Buoi3;

public class SinhVien {
    private String id;
    private String ten;
    private double diem;
    private String lop;
    private int tuoi;

    public SinhVien(String id, String ten, double diem, String lop, int tuoi) {
        this.id = id;
        this.ten = ten;
        this.diem = diem;
        this.lop = lop;
        this.tuoi = tuoi;
    }

    public String getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public double getDiem() {
        return diem;
    }

    public String getLop() {
        return lop;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
}
