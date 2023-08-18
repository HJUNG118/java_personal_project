public class shotgun extends gun {
  public void fire(){
    bulletcount -= 1;
    System.out.printf("%s =}}}, %d\n", model, bulletcount);
  }
  public shotgun(String model) {
    super(model);
  }
}
