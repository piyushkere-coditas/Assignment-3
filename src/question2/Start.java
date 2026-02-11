package question2;

public class Start {
    public static void main(String[] args) throws InterruptedException {
        Job j1 = new Job();
        Job j2 = new Job();
        Job j3 = new Job();

        j1.start();
        j2.start();
        j3.start();
        j2.read();
    }
}
