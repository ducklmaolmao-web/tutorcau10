// File: Buoi1/XepLoaiTest.java
package Buoi1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vn.fpoly.TutorBuoi1.XepLoai;

public class XepLoaiTest {
    XepLoai xepLoaiObj = new XepLoai();

    @Test
    public void TestHlPhanVung_95(){
        String exp = "Xuat xac";
        String actual = xepLoaiObj.XepLoai(9.5);
        Assertions.assertEquals(exp, actual);
    }

    @Test
    public void TestHlPhanVung_85(){
        String exp = "Gioi";
        String actual = xepLoaiObj.XepLoai(8.5);
        Assertions.assertEquals(exp, actual);
    }

    @Test
    public void TestHlPhanVung_75(){
        String exp = "Kha";
        String actual = xepLoaiObj.XepLoai(7.5);
        Assertions.assertEquals(exp, actual);
    }

    @Test
    public void TestHlPhanVung_6(){
        String exp = "Trung binh";
        String actual = xepLoaiObj.XepLoai(6);
        Assertions.assertEquals(exp, actual);
    }

    @Test
    public void TestHlPhanVung_3(){
        String exp = "Yeu";
        String actual = xepLoaiObj.XepLoai(3.0);
        Assertions.assertEquals(exp, actual);
    }

    @Test
    public void testHLEx_max(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> xepLoaiObj.XepLoai(15));
    }

    @Test
    public void testHLEx_min(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> xepLoaiObj.XepLoai(-5));
    }
}