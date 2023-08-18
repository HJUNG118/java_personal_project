public class robotdog extends robot implements pet {
  public void bark(){
    System.out.println("Woof Woof~~");
  }
  void charging() {
    System.out.println(getname() + "go to charging station");
  }
  public static void main(String[] args){
    robotdog rd = new robotdog();
    rd.setname("robo dog");
    rd.bark();
    rd.move();
    rd.charging();
  }
}