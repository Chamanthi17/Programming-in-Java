import java.util.Random;
class Square extends Thread {
    int x;
    Square (int n) {
          x = n;
    }
    public void run() {
          int sqrx = x * x;
           System.out.println("Square of " + x + " = " + sqrx);
    }
}
class Cube extends Thread {
    int x;
    Cube (int n) {
           x = n;
    }
    public void run() {
           int cubx = x * x * x;
           System.out.println("Cube of " + x + " = " + cubx);
    }
}
class RandomNumGen extends Thread {
    public void run() {
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                    int randNum = random.nextInt(100);
                    System.out.println("Random number generated: " + randNum);
                    if (randNum % 2 == 0) {
                            System.out.println(randNum + " is even");
                            Square sq = new Square(randNum);
                            sq.run();
                     } else {
                            System.out.println(randNum + " is odd");
                            Cube c = new Cube(randNum);
                            c.run();
                     }
              }
              try {
                     Thread.sleep(1000);
              } catch (InterruptedException e) {
                      System.out.println(e);
              }
     }
}

public class Experiment_14 {
    public static void main(String[] args) {
            RandomNumGen randNumGen = new RandomNumGen();
            randNumGen.start();
    }
}
