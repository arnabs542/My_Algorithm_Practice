package com.laioffer;

public class Fibo {
    public long fibonacci (int k) {
        if (k <=0) {return 0;}
        if (k == 1) {return 1;}
        return fibonacci(k-1) + fibonacci(k-2);
    }
}
