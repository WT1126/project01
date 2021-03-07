/**
 * \* Created with IntelliJ IDEA.
 * \* User: WANGTAO
 * \* Date: 2020/11/28
 * \* Time: 15:18
 * \* To change this template use File
 * \*Settings | File Templates.
 * \* Description:
 **/
package demo;

public class Example23 {
    public static int add(int x,int y){
        return  x+y;
    }
    public static int  add(int x,int y,int z){
        return x+y+z;
    }
    public static double add(double x, double y){
        return x+y;
    }
    public static void main(String[] args) {
int sum1=add(1,3);
int sum2=add(3,4,5);
double sum3=add(1.2,3.4);
System.out.println("sum1="+sum1);
        System.out.println("sum2="+sum2);
        System.out.println("sum3="+sum3);
    }
}
