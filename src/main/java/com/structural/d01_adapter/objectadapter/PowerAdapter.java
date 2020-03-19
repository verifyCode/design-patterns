package com.structural.d01_adapter.objectadapter;

import com.structural.d01_adapter.classadapter.DC5;

/**
 * @author xjn
 * @since 2020-03-18
 */
public class PowerAdapter implements DC5 {

    //关联关系中的聚合
    private AC220 ac220;

    @Override
    public int outputDC5V() {
        int adapterOutput = 0;
        if (ac220 != null) {
            //变压器...
            adapterOutput = ac220.outputAC220V() / 44;
            System.out.println("使用PowerAdapter输入AC:" + adapterOutput + "V" + "输出DC:" + adapterOutput + "V");
        }
        return adapterOutput;
    }

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }
}
