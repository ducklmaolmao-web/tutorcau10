package Buoi3;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vn.fpoly.Buoi3.SinhVien;
import vn.fpoly.Buoi3.SinhVienService;

import static org.junit.jupiter.api.Assertions.*;

public class SinhVienServiceTest {
    private SinhVienService service;
    @BeforeEach
    public void setUP(){
        service = new SinhVienService();
    }
    //unit test chức năng thêm
    @Test
    public void themsinhvienhople(){
        SinhVien sv = new SinhVien("SV01","Nguyen Van Minh",8.0,"SD21201",20);
        assertTrue(service.themSinhVien(sv));
    }
    @Test
    public void themsinhviendiemam_khonghople() {
        SinhVien sv = new SinhVien("SV02", "Nguyen Van Minh", -1, "SD21201", 20);
        assertThrows(IllegalArgumentException.class, () -> service.themSinhVien(sv));

    }
    @Test
    public void themSinhVien_tuoiam_khonghopLe() {
        SinhVien sv = new SinhVien("SV03", "Tran Hoang Anh", 7.0, "SD21202", -5);
        assertThrows(IllegalArgumentException.class, () -> service.themSinhVien(sv));
    }

    @Test
    public void themsinhvien_trungID_khonghopLe() {
        SinhVien sv1 = new SinhVien("SV04", "Nguyen Ngoc Hung", 6.5, "SD21203", 22);
        SinhVien sv2 = new SinhVien("SV04", "Nguyen Van Tuan", 7.5, "SD21203", 23);
        service.themSinhVien(sv1);
        assertThrows(IllegalArgumentException.class, () -> service.themSinhVien(sv2));
    }

    @Test
    public void themSinhVien_tentrong_khonghople() {
        SinhVien sv = new SinhVien("SV05", "", 7.0, "SD21204", 19);
        assertThrows(IllegalArgumentException.class, () -> service.themSinhVien(sv));
    }
    // Unit test chức năng sửa
    @Test
    public void suaSinhVien_HopLe() {
        SinhVien sv = new SinhVien("SV06", "Nguyen Ngoc Trang", 8.0, "SD21205", 20);
        service.themSinhVien(sv);
        assertTrue(service.suaSinhVien("SV06", "Nguyen Ngoc Trang", 9.0));
    }

    @Test
    public void suatensinhvienkhonghople() {
        SinhVien sv = new SinhVien("SV05", "Nguyen Bao", 7.0, "SD21203", 25);
        service.themSinhVien(sv);
        assertThrows(IllegalArgumentException.class, () -> service.suaSinhVien("SV06", "123", 8));
    }
    @Test
    public void suaSinhVien_IDKhongTonTai_KhongHopLe() {
        assertThrows(IllegalArgumentException.class, () -> service.suaSinhVien("SV99", "Pham Binh", 8.0));
    }
    @Test
    public void suaSinhVien_DiemAm_KhongHopLe() {
        SinhVien sv = new SinhVien("SV08", "le Van Hoan", 6.0, "SD21207", 22);
        service.themSinhVien(sv);
        assertThrows(IllegalArgumentException.class, () -> service.suaSinhVien("SV08", "Nguyen Manh Linh ", -2.0));
    }


}