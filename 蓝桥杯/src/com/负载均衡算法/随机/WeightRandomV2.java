package com.负载均衡算法.随机;

import com.负载均衡算法.ServerIps;

import java.util.ArrayList;
import java.util.List;

/**
 * @author medal
 * @create 2019-10-12 11:36
 **/
public class WeightRandomV2 {
    public static String getServer(){
        int totalWeiht = 0;
        for(Integer weight : ServerIps.WEIGHT_MAP.values()){
            totalWeiht += weight;
        }

        int offset = new java.util.Random().nextInt(totalWeiht);
        for(String ip : ServerIps.WEIGHT_MAP.keySet()){
            Integer weight = ServerIps.WEIGHT_MAP.get(ip);
            if(offset < weight){
                return ip;
            }

            offset = offset - weight;
        }
//        java.util.Random random = new java.util.Random();
//        return ips.get(random.nextInt(ips.size()));
        return null;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++) {
            System.out.println(getServer());
        }
    }
}
