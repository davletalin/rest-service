package kz.davletalin.fibo.restservice.model;

import java.math.BigInteger;

public class Fibonacci {
    private BigInteger fibonacciValue;

    public Fibonacci(long fibonacciIndex) {
        this.calculateFibo(fibonacciIndex);
    }

    private final BigInteger calculateFibo(long fibonacciIndex) {
        BigInteger a = BigInteger.valueOf(0L);
        BigInteger b = BigInteger.valueOf(1L);
        if (fibonacciIndex == 0L) {
            return this.fibonacciValue = a;
        } else {
            for (int i = 2; (long) i <= fibonacciIndex; ++i) {
                BigInteger c = a.add(b);
                a = b;
                b = c;
            }

            return this.fibonacciValue = b;
        }
    }


    public BigInteger getFibonacci() {
        return this.fibonacciValue;
    }

    public void setFibonacci(BigInteger fibonacci) {
        this.fibonacciValue = fibonacci;
    }
}

