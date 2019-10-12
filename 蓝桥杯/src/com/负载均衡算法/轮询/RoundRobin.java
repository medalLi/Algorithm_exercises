package com.负载均衡算法.轮询;

import com.负载均衡算法.ServerIps;

/**
 * @author medal
 * @create 2019-10-12 13:16
 **/
public class RoundRobin {
    private static Integer pos = 0;
    public static String getServer(){
        if(pos >= ServerIps.LIST.size()){
            pos = 0;
        }

        String ip = ServerIps.LIST.get(pos);
        return ip;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++) {
            System.out.println(getServer());
        }
    }
}
