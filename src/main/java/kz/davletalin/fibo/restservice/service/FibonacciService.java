package kz.davletalin.fibo.restservice.service;

import kz.davletalin.fibo.restservice.model.Fibonacci;

public interface FibonacciService {
    /**
     * Returns Fibonacci by sequence number
     * @param fibonacciIndex
     * @return Fibonacci object by sequence number
     */
    Fibonacci get(long fibonacciIndex);
}
