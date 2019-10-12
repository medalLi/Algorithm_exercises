package com.负载均衡算法.随机;

import com.负载均衡算法.ServerIps;

/**
 * @author medal
 * @create 2019-10-12 11:36
 **/
public class Random {
    public static String getServer(){
        java.util.Random random = new java.util.Random();
        return ServerIps.LIST.get(random.nextInt(ServerIps.LIST.size()));
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++) {
            System.out.println(getServer());
        }
    }
}
