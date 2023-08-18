public class assaultrifle extends gun {
  public void fire() {
    bulletcount -= 5;
  }
  public assaultrifle(String model) {
  super(model);
  bulletcount = 40; // super(model)에서 bulletcount = 10으로 초기화 되어 있다.
  }
}