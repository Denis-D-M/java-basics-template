package com.epam.izh.rd.online.service;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SimpleMathService implements MathService {

    @Override
    public int compare(int value1, int value2) {
        return Integer.compare(value1, value2);
    }

    @Override
    public int maxFrom(int value1, int value2) {
        return Math.max(value1, value2);
    }

    @Override
    public int maxFrom(int[] values) {
        Arrays.sort(values);
        return values[values.length - 1];
    }

    @Override
    public int sum(int[] values) {
        return Arrays.stream(values).sum();
    }

    @Override
    public int[] getEvenDigits(int[] values) {
        return Arrays.stream(values).filter(value -> value % 2 == 0).toArray();
    }

    @Override
    public long calcFactorial(int initialVal) {
        return (initialVal == 0) ? 1 : IntStream.rangeClosed(1, initialVal).reduce((left, right) -> left * right).getAsInt();
    }
    // не вижу смысла в long здесь
    @Override
    public long calcFibonacci(int number) {
        return (long) Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .skip(number)
                .map(n -> n[0])
                .limit(1)
                .collect(Collectors.toList())
                .get(0);
    }

    @Override
    public int[] sort(int[] values) {
        Arrays.sort(values);
        return values;
    }

    @Override
    public boolean isPrimary(int number) {
        return BigInteger.valueOf(number).isProbablePrime(1);
    }

    @Override
    public int[] reverseArray(int[] values) {
        int[] newArray = new int[values.length];
        for (int i = values.length - 1, j = 0; i >= 0 ; i--, j++) {
            newArray[j] = values[i];
        }
        return newArray;
    }
}
