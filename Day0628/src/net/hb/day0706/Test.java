package net.hb.day0706;

import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    
    String msg = "" ;

    System.out.print("사번입력>>>");
    int a = Integer.parseInt(sc.nextLine());

    System.out.print("이름입력>>>");
    String b = sc.nextLine();

    System.out.print("부서입력>>>");
    String c = sc.nextLine();

    //SQL쿼리문장 문자, 문자열 'kim' '전산'
    //msg= "insert into winter(sabun,name,buse ) values (" + a +","+ b + "," + c + ") ";
    msg= "insert into winter(sabun,name,buse ) values (" + a + ",'"+ b + "','" + c + "') ";
    System.out.println(msg);
    //insert into karina(sabun,name,buse) values(3345, 'kim','전산');
  }
}