package com.负载均衡算法.轮询;

import com.负载均衡算法.ServerIps;

/**
 * @author medal
 * @create 2019-10-12 13:16
 **/
public class RoundRobinV2 {
    private  static Integer num = 0;

    public static String getServer(){
        int totalWeight = 0;
        for(Integer Weight : ServerIps.WEIGHT_MAP.values()){
            totalWeight +=  Weight;
        }

        int requestId = getAndIncreament();
        int offset = requestId % totalWeight;
        for(String ip : ServerIps.WEIGHT_MAP.keySet()){
            Integer weight = ServerIps.WEIGHT_MAP.get(ip);
            if (offset < weight){
                return ip;
            }

            offset = offset - weight;
        }
        return null;
    }

    public static Integer getAndIncreament(){
     //   Integer num = 0;
        return num ++;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 30 ; i++) {
            System.out.println(getServer());
        }
    }
}
