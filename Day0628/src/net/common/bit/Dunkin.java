package net.common.bit;

public class Dunkin {
  protected Dunkin() { }
  protected String coffee(){ 
    return "아이스라떼";
  }//end

  protected void donuts(int cnt){
    System.out.println("도너츠메소드 주문갯수 "+cnt+" 입니다" );
  }//end

}//class END
