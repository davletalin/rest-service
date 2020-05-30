package kz.davletalin.fibo.restservice.controller;

import kz.davletalin.fibo.restservice.model.Fibonacci;
import kz.davletalin.fibo.restservice.service.FibonacciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FibonacciController {
    private final FibonacciService fibonacciService;

    @Autowired
    public FibonacciController(FibonacciService fibonacciService) {
        this.fibonacciService = fibonacciService;
    }

    @GetMapping(value = "number/{index}")
    public ResponseEntity<Fibonacci> get(@PathVariable(name = "index") long index){
        final Fibonacci fibonacci = fibonacciService.get(index);
        return fibonacci!=null
                ? new ResponseEntity<>(fibonacci, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
