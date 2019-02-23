package ru.itpark.service;

public class CashbackService {
    public int calculate(int cost){
        int limit = 3_000;
        int result = cost * 5 / 100;
        if (result > limit){
            return limit;
        }
        return result;
    }
}
