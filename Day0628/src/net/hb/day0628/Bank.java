package net.hb.day0628;

public class Bank {


  //자바언어는 객체지향언어=OOP=Object Oriented Programming
  //챕터6-5 생성자 = constructor = constr
  //기본생성자만 기술 => 기본생성자 생략가능
  //우리은행거래
  //비번으로 입금,송금,계좌이체,인출,잔액
  private int pwd = 1234; //private키워드는 현재클래스에서 사용가능


  Bank() { }

  //챕터6-4 오버로딩 메서드중복, 생성자 중복가능
  protected void cal() { }

  public void cal(int m) { System.out.println(pwd);}

  public void cal(String name, int m) { } //어느은행, 입금

}


