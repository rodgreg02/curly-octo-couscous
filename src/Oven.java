import java.util.concurrent.TimeUnit;

public class Oven extends Eletro {
    int capacity;

    boolean imbutido;

    public void roast(boolean isOn, int timer) {
        if (isOn) {
            System.out.println("Mc Juão > 'Yo momma so dumb, she thought HTML was a programming language'");
            while (timer != 0) {
                try {
                    TimeUnit.MINUTES.sleep(1);
                    timer--;
                    System.out.println(timer + " Minutes");
                    if (timer == 0) {
                        System.out.println("Mc Juão > 'Irmau, comida pronta, chama a chavala!'");
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        } else {
            System.out.println("Mc Juão > 'Oh irmaun, liga isto.'");
        }
    }


    public void clean() {
        System.out.println("Mc Juão > 'A limpar este estierco'");
    }

    public void showTemp(int currentTemp) {
        System.out.println(currentTemp);
    }
}
