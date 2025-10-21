package vn.fpoly.Buoi3;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    private List<SinhVien> dsSinhVien = new ArrayList<>();

    public boolean themSinhVien(SinhVien sv) {

        if (sv.getTuoi() < 18 || sv.getTuoi() > 30) {
            throw new IllegalArgumentException("Tuoi phai trong khoang tu 18 den 30");
        }

        if (sv.getDiem() < 0 || sv.getDiem() > 10) {
            throw new IllegalArgumentException("Diem phai trong khoang tu 0 den 10");
        }

        if (sv.getTen() == null || sv.getTen().trim().isEmpty()) {
            throw new IllegalArgumentException("ten khong duoc de trong");
        }
        for (SinhVien existing : dsSinhVien) {
            if (existing.getId().equals(sv.getId())) {
                throw new IllegalArgumentException("ID da ton tai: " + sv.getId());
            }
        }

        dsSinhVien.add(sv);
        return true;
    }

    public boolean suaSinhVien(String id, String tenMoi, double diemMoi) {
        for (SinhVien sv : dsSinhVien) {
            if (sv.getId().equals(id)) {
                if (diemMoi < 0 || diemMoi > 10) {
                    throw new IllegalArgumentException("Diem trong khoang tu 0 den 10");
                }
                if (tenMoi == null || tenMoi.trim().isEmpty()) {
                    throw new IllegalArgumentException("Ten khong duoc de trong");
                }
                if (!tenMoi.matches("^[a-zA-Z\\s]+$")) {
                    throw new IllegalArgumentException("Ten khong hop le chi duoc chua chu cai va khoang trang");
                }

                sv.setTen(tenMoi);
                sv.setDiem(diemMoi);
                return true;
            }
        }
        throw new IllegalArgumentException("Khong tim thay sinh vien voi id: " + id);
    }
}