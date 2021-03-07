/**
 * \* Created with IntelliJ IDEA.
 * \* User: WANGTAO
 * \* Date: 2020/10/28
 * \* Time: 10:12
 * \* To change this template use File
 * \*Settings | File Templates.
 * \* Description:
 **/
package demo;

import java.util.Scanner;

public class two {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String s=sc.nextLine();

int a=0,b=0,c=0,k=0;
            for (int i = 0; i <s.length() ; i++) {
                if((s.charAt(i)<=90&s.charAt(i)>=65)|(s.charAt(i)<=122&s.charAt(i)>=97)|(s.charAt(i)<=57&s.charAt(i)>=48)|s.charAt(i)==32){
                if(s.charAt(i)<=90&s.charAt(i)>=65){
                    a++;
                }
                if(s.charAt(i)<=122&s.charAt(i)>=97){
                    a++;
                }
                if(s.charAt(i)<=57&s.charAt(i)>=48){
                    b++;
                }
                if(s.charAt(i)==32){
                    c++;
                }
                }else{

                        k++;

                }


}
            System.out.println("字母个数"+a+"\n"+"数字个数"+b+"\n"+"空格个数"+c+"\n"+"其他字符个数"+k);
}


           }



