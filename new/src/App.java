public class App {
    int num1;
    static int num2;
    public void printname(String name) {
        String prtmsg = name + "hello";
        System.out.println(prtmsg);
    }
    public static void main(String[] args) {
        App mc = new App();
        mc.num1 = 100;
        App.num2 = 50;
        mc.printname("홍길동");
        System.out.println("%d, %d", mc.num1, Variables.num2);
    }
}
