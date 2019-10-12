package com.负载均衡算法.哈希;

import com.负载均衡算法.ServerIps;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author medal
 * @create 2019-10-12 17:49
 **/
public class ConsistentHash {
    private static TreeMap<Integer,String> virtualNodes = new TreeMap<>();
    private static final int VIRTUAL_NODES = 160;

    static {
        for(String ip : ServerIps.LIST){
            for(int i = 0;i < VIRTUAL_NODES;i ++){
                int hash = getHash(ip +1);
            }
        }
    }

    private  static String getServer(String client){
        int hash = getHash(client);
        SortedMap<Integer,String> subMap = virtualNodes.tailMap(hash);
        Integer firstKey = null;
        if(subMap == null){
            firstKey = virtualNodes.firstKey();
        }else {
            firstKey = subMap.firstKey();
        }
        return virtualNodes.get(firstKey);
    }

    private static int getHash(String str){
        final int p = 16777619;
        int hash = (int)2166136261L;
        for(int i = 0;i < str.length();i ++)
            hash = (hash ^ str.charAt(i)*p);
        hash += hash << 13;
        hash ^= hash >> 7;
        hash += hash << 3;
        hash ^= hash >> 17;
        hash += hash << 5;

        if(hash < 0){
            hash = Math.abs(hash);
        }
        return hash;

       // return  0;
    }
}
