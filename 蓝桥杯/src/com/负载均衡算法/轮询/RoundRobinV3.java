package com.负载均衡算法.轮询;

import com.负载均衡算法.ServerIps;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author medal
 * @create 2019-10-12 17:19
 **/
public class RoundRobinV3 {
    private static Map<String,Weight> weightMap = new LinkedHashMap<>();

    public static String getServer(){
        if(weightMap.isEmpty()){
            for(String ip : ServerIps.WEIGHT_MAP.keySet()){
                Integer weight = ServerIps.WEIGHT_MAP.get(ip);
                weightMap.put(ip,new Weight(ip,weight,0));
            }
        }

        for(Weight weight : weightMap.values()){
            weight.setCurrentWeight(weight.getCurrentWeight() + weight.getWeight());
        }

        int totalWeight = 0;
        for(Integer Weight : ServerIps.WEIGHT_MAP.values()){
            totalWeight +=  Weight;
        }

        Weight maxCurrentWeight =  null;
        for(Weight weight : weightMap.values()){
            if(maxCurrentWeight == null || weight.getCurrentWeight() > maxCurrentWeight.getCurrentWeight()){
                maxCurrentWeight = weight;
            }
        }

        maxCurrentWeight.setCurrentWeight(maxCurrentWeight.getCurrentWeight()-totalWeight);

        return maxCurrentWeight.getIp();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 30 ; i++) {
            System.out.println(getServer());
        }
    }
}

class Weight{
    private String ip;
    private Integer weight;
    private Integer currentWeight;

    public Weight(String ip, Integer weight, Integer currentWeight) {
        this.ip = ip;
        this.weight = weight;
        this.currentWeight = currentWeight;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(Integer currentWeight) {
        this.currentWeight = currentWeight;
    }
}
