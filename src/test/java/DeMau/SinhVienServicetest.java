package DeMau;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vn.fpoly.DeMau.SinhVien;
import vn.fpoly.DeMau.SinhVienService;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SinhVienServicetest {
    private SinhVienService sinhVienService;

    @BeforeEach
    public void setUp() {
        sinhVienService = new SinhVienService();
    }

    @Test
    public void testSuaHopLe() {
        SinhVien sinhVien = new SinhVien("MS1", "Bùi Đức", 20, 8.0f, 5, "CNTT");
        sinhVienService.themSinhVien(sinhVien);

        SinhVien sinhVienMoi = new SinhVien("MS1", "Bùi Đức", 21, 9.0f, 6, "An toàn thông tin");
        assertTrue(sinhVienService.suaSinhVien("MS1", sinhVienMoi));
    }

    @Test
    public void testSuaNull() {
        SinhVien sinhVien = new SinhVien("MS2", "Bùi Đức", 20, 8.0f, 5, "CNTT");
        sinhVienService.themSinhVien(sinhVien);

        SinhVien sinhVienMoi = new SinhVien("MS2", "Bùi Đức", 21, 9.0f, 6, "An toàn thông tin");
        assertThrows(NullPointerException.class, () -> sinhVienService.suaSinhVien(null, sinhVienMoi));
    }

    @Test
    public void testSuaPVKoHopLe() {
        SinhVien sinhVien = new SinhVien("MS3", "Bùi Đức", 20, 8.0f, 5, "CNTT");
        sinhVienService.themSinhVien(sinhVien);

        SinhVien sinhVienMoi = new SinhVien("MS3", "Bùi Đức", 21, 88.0f, 6, "CNTT");
        assertThrows(IllegalArgumentException.class, () -> sinhVienService.suaSinhVien("MS3", sinhVienMoi));
    }

    @Test
    public void testSuaPVHopLe() {
        SinhVien sinhVien = new SinhVien("MS4", "Bùi Đức ngu", 20, 8.0f, 5, "CNTT");
        sinhVienService.themSinhVien(sinhVien);

        SinhVien sinhVienMoi = new SinhVien("MS4", "Bùi Đức ngu", 21, 4.0f, 6, "An toàn thông tin");
        assertTrue(sinhVienService.suaSinhVien("MS4", sinhVienMoi));
    }
}
