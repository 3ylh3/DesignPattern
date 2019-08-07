package com.xiaobai.designpattern.flyweightpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * 享原工厂
 *
 * @author 小白
 * @date 2019/8/6
 */
public class FlyweightFactory {
    private static Map<String,AbstractFlyweight> pool = new HashMap<>();

    public AbstractFlyweight getFlyweight(String extrinsic) {
        AbstractFlyweight flyweight = null;
        if(pool.containsKey(extrinsic)) {
            flyweight = pool.get(extrinsic);
        } else {
            flyweight = new ConcreteFlyweight(extrinsic);
            pool.put(extrinsic,flyweight);
        }
        return flyweight;
    }
}
