package cn.tedu.demo;

/**
 * @author 路钰明
 * @version 1.0
 * @title: Demo2
 * @projectName Day01
 * @description:基本数据类型
 * @date 2020/7/15   16:38
 */
public class Demo2 {
    public static void main(String[] args) {
        byte b=127;
        System.out.println(b);
        System.out.println(b+1);
        System.out.println("byte的最大值"+Byte.MAX_VALUE);
        System.out.println("byte的最小值"+Byte.MIN_VALUE);
        System.out.println("Short的最大值"+Short.MAX_VALUE);
        System.out.println("Short的最小值"+Short.MIN_VALUE);
        System.out.println("int的最大值"+Integer.MAX_VALUE);
        System.out.println("int的最小值"+Integer.MIN_VALUE);
        System.out.println("long的最大值"+Long.MAX_VALUE);
        System.out.println("long的最小值"+Long.MIN_VALUE);
        System.out.println("float的最大值"+Float.MAX_VALUE);
        System.out.println("float的最小值"+Float.MIN_VALUE);
        System.out.println("double的最大值"+Double.MIN_VALUE);
        System.out.println("double的最小值"+Double.MIN_VALUE);
        System.out.println("char的最大值"+Character.MAX_VALUE);
        System.out.println("char的最小值"+Character.MIN_VALUE);
        int s=2147483647;
        long l=2100000000000000000L;
        long c=2147483648L;
        float f=12.12f;
        float g=12;
        double j=12;
        System.out.println(g);
        System.out.println(f);
        System.out.println(j);
        char c2=97;
        char c3='中';
        char c4='\u0231';
        char c5='\n';  //换行
        char c6='\r';  //回车
        char c7='\t';  //Tab
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        boolean b1=false;
        if(b1=true){
            System.out.println(b);
        }
        boolean cc=false;
        if(cc==true){
            System.out.println(b);
        }

    }
}
