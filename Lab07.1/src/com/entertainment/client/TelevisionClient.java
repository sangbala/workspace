package com.entertainment.client;

import com.entertainment.Television;

public class TelevisionClient {
    public static void main(String[] args) {

        Television tvA=new Television();
        Television tvB=new Television("Sony",500);
        tvA.turnOff();

        tvB.turnOn();
        System.out.println(tvA.getBrand()+tvA.getVolume());
        System.out.println(tvB.getBrand()+tvB.getVolume());
    }
}
