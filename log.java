import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class log {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String name = scan.next();
    int num = scan.nextInt();

    System.out.println(name);
    System.out.println(num);
    Logger logger = Logger.getLogger("my logger");
    logger.info("main program started");
    logger.log(Level.WARNING, "DATA file size too big");

    logger.setLevel(Level.FINE);
    ConsoleHandler ch = new ConsoleHandler();
    ch.setLevel(Level.FINE);
    logger.addHandler(ch);
    
    logger.fine("Shutdown main program");


  }
  
}
