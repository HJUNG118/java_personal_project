public abstract class robot {
  private String name;
  void move() {
    System.out.println("robot moved");
  }
  abstract void charging();
  public String getname(){
    return name;
  }
  public void setname(String name){
    this.name = name;
  }
}