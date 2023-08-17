import java.util.Scanner;

public class JAVA {
  JAVA() {
    System.out.printf("이게 생성자 메서드인가?");
  }
  void login() {
    Scanner scan = new Scanner(System.in);

    System.out.printf("##아이디를 입력하세요");
    String uname = scan.next();

    System.out.printf("#input the password");
    String pwd = scan.next();

    if(uname.equals("hong") && pwd.equals("1234")) {
      System.out.println("check -> login success");
    }
    else {
      System.out.println("id, password fail");
    }
  }

  void check() {
    int cnt = 10;
    String msg = cnt > 0? "새로운 쪽지가 있다" : "새로운 쪽지가 없다";
    System.out.println(msg);
  }

  String signin(String uname) {
    
  }
  public static void main(String[] args) {
    JAVA java = new JAVA();
    while(true) {
      System.out.printf("메뉴를 선택하세요 (1:로그인, 2:쪽지확인, x:종료) ==>");
      Scanner scan = new Scanner(System.in);
      String sel = scan.next();

      switch(sel) {
        case "1": java.login(); break;
        case "2": java.check(); break;
        case "3": System.exit(0);
        default: System.out.println("wrong input");
      }
    }
  } 
}
