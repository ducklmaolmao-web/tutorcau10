package Buoi2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vn.fpoly.Buoi2.Divide;

import static org.junit.jupiter.api.Assertions.*;

public class DivideTest {
    private Divide div;

    @BeforeEach
    public void SetUp() {
        div = new Divide();
    }

    @Test
    public void Phanvungtuongduong_chiagiatrihoplela50() {
        int result = div.Divide( 50,  50);
        int expected = 1;
        assertEquals(result, expected);
    }

    @Test
    public void kythuatbien_chiagiatrihoplela0() {
        int result = div.Divide( 0,  1);
        int expected = 0;
        assertEquals(result, expected);
    }

    @Test
    public void kythuatbien_chiagiatrihoplela1() {
        int result = div.Divide( 1,  1);
        int expected = 1;
        assertEquals(result, expected);
    }

    @Test
    public void kythuatbien_chiagiatrihoplela99() {
        int result = div.Divide( 99,  99);
        int expected = 1;
        assertEquals(result, expected);
    }
    @Test
    public void kythuatbien_chiagiatrihoplela100() {
        int result = div.Divide( 100,  20);
        int expected = 5;
        assertEquals(result, expected);
    }

    @Test
    public void KiemTraChiaCho0(){
        Assertions.assertThrows(
                ArithmeticException.class,()->div.Divide(10,0)
        );
    }

    @Test
    public void KiemTraGiaTriKhongHopLe(){
        Assertions.assertThrows(
                IllegalArgumentException.class,()->div.Divide(100000,10)
        );
    }
}