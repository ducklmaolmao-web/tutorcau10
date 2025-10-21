package vn.fpoly.Buoi2;

public class Divide {
    public int Divide(int a, int b) {
        if (a < 0 || a > 100 || b < 0 || b > 100)
            throw new IllegalArgumentException("gia tri phai nam trong khoang tu 0 den 100");
        if (b == 0)
            throw new ArithmeticException("Khong the chia cho 0");
        return a / b;
    }
}
