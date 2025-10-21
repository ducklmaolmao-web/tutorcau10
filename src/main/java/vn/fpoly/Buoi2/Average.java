package vn.fpoly.Buoi2;

public class Average {
    public double average(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Mảng rỗng");
        }
        long sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }
}
