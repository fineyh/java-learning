package com.fyh.chapter07;

public class VarParameter01 {
    public static void main(String[] args) {
        VarMethod method = new VarMethod();
        System.out.println(method.sum(1, 2, 3, 4));
        System.out.println(method.sum(10, 12, 13));

    }

}

class VarMethod {
//	public int sum(int n1,int n2) {
//		return n1 + n2;
//	}

    public int sum(int... nums) {
//		System.out.println("接收的参数个数=" + nums.length);
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res += nums[i];
        }
        return res;
    }
}

//方法名称相同，功能相同，参数个数不同-》使用可变参数优化
