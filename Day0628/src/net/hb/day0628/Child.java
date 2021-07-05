package net.hb.day0628;

public class Child extends Father {
  //Father 부모소속 car()메서드호출
  //Child 자식소속 car()메서드 호출
  Child cd = new Child();


  public static void main(String[] args) {
    Child ck = new Child();
    ck.book();


  }//end
  public void book() {  
    super.car();
    this.car();
  }

  public void car() {
    System.out.println("Child자식클래스 Car 메서드");
  }

}//class END
