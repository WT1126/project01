/**
 * \* Created with IntelliJ IDEA.
 * \* User: WANGTAO
 * \* Date: 2020/11/28
 * \* Time: 14:29
 * \* To change this template use File
 * \*Settings | File Templates.
 * \* Description:
 **/
package demo;
import java.util.Random;
import java.util.Scanner;
public class CallName {
    public  static void addStudentName(String [] students){
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <students.length ; i++) {
            System.out.println("存储第"+(i+1)+"姓名: ");
            students[i]=sc.next();
        }
    }
    public  static void printStudentName(String [] students){
        for (int i = 0; i <students.length ; i++) {
           String name=students[i];
       System.out.println("第"+(i+1)+"个学生姓名："+name);
        }
    }

    public  static String randomStudentName(String [] students){
    int index=new Random().nextInt(students.length);
    String name=students[index];
    return name;
}
    public static void main(String[] args) {
System.out.println("-------随机点名--------");
        Scanner sc=new Scanner(System.in);
        int sum=sc.nextInt();
String students[]=new  String [sum];
addStudentName(students);
printStudentName(students);
randomStudentName(students);
String randname=randomStudentName(students);
System.out.println("被点到名的同学名是："+randname);

    }
}
