public class car {
  private String color;
  private String model;
  private int power;
  private int carSpeed;

  public car() {
    carSpeed = 0;
  }
  public car(String color, String model, int power){
    this.color = color;
    this.model = model;
    this.power = power;
  }
  public void go() {
    if(power < 200) {
      carSpeed += 10;
    }
    else {
      carSpeed += 20;
    }
    System.out.printf("accelerate %s, current speed %d", model, carSpeed);

  }
  public void stop() {
    carSpeed = 0;
  }
  public void setColor(String color) {
    this.color = color;
  }
}

