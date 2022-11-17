package com.fyh.chapter10.final_;

public class FinalDetail01 {
    public static void main(String[] args) {
        CC cc = new CC();
        new EE().cal();
    }
}

class AA {
    /*
    1.定义时
    2.在构造器中
    3.在代码块中
     */
    public final double TAX_RATE = 0.08;
    public final double TAX_RATE2;
    public final double TAX_RATE3;

    public AA() {
        TAX_RATE2 = 1.1;
    }

    {
        TAX_RATE3 = 2.2;
    }
}

//final类不能继承，但可以实例化对象
final class CC {
}

//如果类不是final类，但是含有finaL方法，则该方法虽然不能重写，但是可以被继承
//即，仍然遵守继承的机制。
class DD {
    public final void cal() {
        System.out.println("cal()方法");
    }
}

class EE extends DD {
}