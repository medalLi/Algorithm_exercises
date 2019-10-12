package com.负载均衡算法;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author medal
 * @create 2019-10-12 11:33
 **/
public class ServerIps {
    public static final List<String> LIST = Arrays.asList(
            "192.168.0.1",
            "192.168.0.2",
            "192.168.0.3",
            "192.168.0.4",
            "192.168.0.5",
            "192.168.0.6",
            "192.168.0.7",
            "192.168.0.8",
            "192.168.0.9",
            "192.168.0.10"
    );

    public static final Map<String,Integer> WEIGHT_MAP = new HashMap<>();

    static {
        WEIGHT_MAP.put("a",5);
        WEIGHT_MAP.put("b",1);
        WEIGHT_MAP.put("c",1);
//        WEIGHT_MAP.put("192.168.0.4",9);
//        WEIGHT_MAP.put("192.168.0.5",4);
//        WEIGHT_MAP.put("192.168.0.6",6);

    }
}
