package Buoi2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import vn.fpoly.Buoi2.Average;

public class AverageTest {

    private Average average = new Average();

    @Test
    void TC1_KiemTraMangRong_NemLoi() {
        int[] emptyArr = {};
        assertThrows(IllegalArgumentException.class, () -> {
            average.average(emptyArr);
        });
    }

    @Test
    void TC2_PhanVungHopLe_EP() {
        int[] arr = {10, 20, 30};
        assertEquals(20.0, average.average(arr));
    }

    @Test
    void TC3_PhanVungTuongDuong_EP() {
        int[] arr = {-10, 0, 10};
        assertEquals(0.0, average.average(arr));
    }

    @Test
    void TC4_KichThuocToiThieu_BVA() {
        int[] arr = {99};
        assertEquals(99.0, average.average(arr));
    }

    @Test
    void TC5_GiaTriBien0_BVA() {
        int[] arr = {0, 0, 0, 0};
        assertEquals(0.0, average.average(arr));
    }
}