package DeMau;

import org.junit.jupiter.api.Test;
import vn.fpoly.DeMau.Bai1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Bai1Test {
    private Bai1 bai1 = new Bai1();

    @Test
    void TC1_KiemTraMangRong_NemLoi() {
        int[] emptyArr = {};
        assertThrows(IllegalArgumentException.class, () -> {
            bai1.TinhTong(emptyArr);
        });
    }

    @Test
    void TC2_PhanVungHopLe_EP() {
        int[] arr = {10, 20, 30};
        assertEquals(60.0, bai1.TinhTong(arr));
    }

}
