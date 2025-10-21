package vn.fpoly.DeMau;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    private List<SinhVien> danhSachSV = new ArrayList<>();

    public boolean themSinhVien(SinhVien sv) {
        if (sv == null) {
            throw new NullPointerException("Không được để trống sinh viên");
        }

        if (sv.getMaSV() == null || sv.getMaSV().trim().isEmpty()) {
            throw new IllegalArgumentException("Mã sinh viên không được để trống");
        }

        if (sv.getTen() == null || sv.getTen().trim().isEmpty()) {
            throw new IllegalArgumentException("Tên sinh viên không được để trống");
        }

        if (sv.getTuoi() <= 0) {
            throw new IllegalArgumentException("Tuổi phải lớn hơn 0");
        }

        if (sv.getDiemTrungBinh() == null || sv.getDiemTrungBinh() < 0 || sv.getDiemTrungBinh() > 10) {
            throw new IllegalArgumentException("Điểm trung bình phải nằm trong khoảng 0 - 10");
        }
        if (sv.getKyHoc() <= 0) {
            throw new IllegalArgumentException("Kỳ học phải lớn hơn 0");
        }
        if (sv.getChuyenNganh() == null || sv.getChuyenNganh().trim().isEmpty()) {
            throw new IllegalArgumentException("Chuyên ngành không được để trống");
        }
        danhSachSV.add(sv);
        return true;
    }

    public boolean suaSinhVien(String maSV, SinhVien sinhVienMoi) {
        SinhVien sinhVien = null;
        for (SinhVien sv : danhSachSV) {
            if (sv.getMaSV().equals(maSV)) {
                sinhVien = sv;
                break;
            }
        }
        if (sinhVien == null) {
            throw new NullPointerException("khong duoc de nulll");
        }
        if (sinhVienMoi.getDiemTrungBinh() < 0 || sinhVienMoi.getDiemTrungBinh() > 10) {
            throw new IllegalArgumentException("khong thuoc phan vung roi");
        }
        sinhVien.setTen(sinhVienMoi.getTen());
        sinhVien.setTuoi(sinhVienMoi.getTuoi());
        sinhVien.setDiemTrungBinh(sinhVienMoi.getDiemTrungBinh());
        sinhVien.setKyHoc(sinhVienMoi.getKyHoc());
        sinhVien.setChuyenNganh(sinhVienMoi.getChuyenNganh());
        return true;
    }

}
