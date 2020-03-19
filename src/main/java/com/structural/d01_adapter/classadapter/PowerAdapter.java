package com.structural.d01_adapter.classadapter;

/**
 * @author xjn
 * @since 2020-03-18
 */
public class PowerAdapter extends AC220 implements DC5 {
    @Override
    public int outputDC5V() {
        int adapterInput = outputAC220V();
        //变压器...
        int adapterOutput = adapterInput/44;
        System.out.println("使用PowerAdapter输入AC:"+adapterInput+"V"+"输出DC:"+adapterOutput+"V");
        return adapterOutput;
    }
}
