package vn.fpoly.TutorBuoi1;

public class Calculator {
    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public double divide(int a, int b){
        if(b == 0){
            throw new ArithmeticException("khong the chia cho 0");
        }
        return (double) a / b;
    }


    public boolean isEven(int n){
        return n % 2 == 0;
    }

    // Tính giai thừa
    public long factorial(int n){
        long r = 1;
        for(int i = 2; i <= n; i++) r *= i;
        return r;
    }

}
