package com.负载均衡算法.随机;

import com.负载均衡算法.ServerIps;

import java.util.ArrayList;
import java.util.List;

/**
 * @author medal
 * @create 2019-10-12 11:36
 **/
public class WeightRandom {
    public static String getServer(){
        List<String> ips = new ArrayList<>();
        for(String ip : ServerIps.WEIGHT_MAP.keySet()){
            Integer weight = ServerIps.WEIGHT_MAP.get(ip);
            for(int i=0;i<weight;i++){
                ips.add(ip);
            }
        }
        java.util.Random random = new java.util.Random();
        return ips.get(random.nextInt(ips.size()));
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++) {
            System.out.println(getServer());
        }
    }
}
