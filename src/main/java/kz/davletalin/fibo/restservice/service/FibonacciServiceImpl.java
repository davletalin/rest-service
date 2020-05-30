package kz.davletalin.fibo.restservice.service;

import kz.davletalin.fibo.restservice.model.Fibonacci;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class FibonacciServiceImpl implements FibonacciService {
    @Override
    public Fibonacci get(long fibonacciIndex) {
        BigInteger fibonacciValue = calculateFibo(fibonacciIndex);
        return new Fibonacci(fibonacciValue);
    }

    private final BigInteger calculateFibo(long fibonacciIndex) {
        BigInteger a = BigInteger.valueOf(0L);
        BigInteger b = BigInteger.valueOf(1L);
        if (fibonacciIndex == 0L) {
            return a;
        }
        for (long i = 2; i <= fibonacciIndex; i++) {
            BigInteger c = a.add(b);
            a = b;
            b = c;
        }
        return b;
    }
}

