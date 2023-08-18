public class gun {
    protected String model;
    protected int bulletcount;

    public void fire(){
        System.out.println(model + "=>");
        bulletcount -= 1;
    }
    public gun(String model) {
        bulletcount = 10;
        this.model = model;
    }
}