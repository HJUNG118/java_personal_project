public class App {
    int num1;
    static int num2;
    App() {
        String name = "홍길동";
        System.out.println(name);
    }
    public void printname(String name) { // public형태의 메소드는 다른 클래스에서도 접근이 가능하다.
        String prtmsg = name + "hello";
        System.out.println(prtmsg);
    }
    public void printname(String name1, String name2) {
        String prtmsg = name1 + name2;
        System.out.println(prtmsg);
    }
    void printnames(String... name) {
        for(String s : name) {
            System.out.println("이름 출력");
            System.out.printf("%s", s);
        }
    }
    public static void main(String[] args) {
        App mc = new App();
        mc.num1 = 100;
        App.num2 = 50;
        mc.printname("홍길동");
        mc.printname("a","b");
        System.out.printf("%d, %d", mc.num1, App.num2);
    }
}
