/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
 
package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;
import com.entertainment.Tuner;

class TelevisionClient {
  
    public static void main(String[] args) {
        Television tv = new Television("Samsung", 65, DisplayType.LED,new Tuner("C1BS"));

        System.out.println(tv);
        
        // TODO: change the channel
        tv.changeChannel("JOHN");


        System.out.println(tv);
    }
}