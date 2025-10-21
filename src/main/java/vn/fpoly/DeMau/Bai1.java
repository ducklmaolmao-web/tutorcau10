package vn.fpoly.DeMau;

public class Bai1 {
    public double TinhTong(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Mảng rỗng");
        }
        int sum = 0;
        for (int num : arr) {
            if (num < 1 || num >1000) {
                throw new IllegalArgumentException("so qua lon");
            }
            if (num >= 1 && num <= 1000) {
                sum += num;
            }
        }
        return sum;
    }
}
