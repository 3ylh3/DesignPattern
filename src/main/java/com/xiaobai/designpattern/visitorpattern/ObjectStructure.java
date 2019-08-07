package com.xiaobai.designpattern.visitorpattern;

import java.util.Random;

/**
 * 结构对象
 *
 * @author 小白
 * @date 2019/8/6
 */
public class ObjectStructure {
    public static AbstractElement createElement() {
        Random rand = new Random();
        if(rand.nextInt(100) > 50) {
            return new Element1();
        } else {
            return new Element2();
        }
    }
}
