package kz.davletalin.fibo.restservice.model;

import java.math.BigInteger;

public class Fibonacci {
    private BigInteger fibonacciValue;

    public Fibonacci(BigInteger fibonacciValue) {
        this.fibonacciValue = fibonacciValue;
    }

    public BigInteger getFibonacciValue() {
        return fibonacciValue;
    }

    public void setFibonacciValue(BigInteger fibonacciValue) {
        this.fibonacciValue = fibonacciValue;
    }
}

