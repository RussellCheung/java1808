package com.qianfeng;

public class Maleader {

    private GreenTeaWater water;

    public GreenTeaWater getWater() {
        return water;
    }

    //XML的SpringIoC的配置一定要有set方法
    public void setWater(GreenTeaWater water) {
        this.water = water;
    }
}
