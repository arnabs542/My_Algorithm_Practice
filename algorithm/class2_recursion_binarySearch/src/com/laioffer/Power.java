package com.laioffer;

/**
 * Created by xiangyuli on 3/13/17.
 */
public class Power {
        public long power(int a, int b) {
            if (b == 0) { return 1;}
            if (a == 0) { return 0;}
            long half = power(a, b / 2);
            if ( b % 2 == 1) {
                return half * half * a;
            } else {
                return half * half;
            }
        }
}
