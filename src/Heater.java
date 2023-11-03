import java.util.concurrent.TimeUnit;

public class Heater extends Eletro{
    public void showTemp(int currentTemp){
        System.out.println(currentTemp);
    }

    public void heat(boolean isOn, int timer) {
        if (isOn) {
            System.out.println("Mc Juão > 'Irmoun, está a aquecer, aguardas se queres!'");
            while (timer != 0) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                    timer--;
                    System.out.println(timer + " Minutes");
                    if (timer == 0) {
                        System.out.println("Mc Juão > 'Irmau, o quarto está quentinho, chama a chavala!'");
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        } else {
            System.out.println("Mc Juão > 'Oh irmaun, liga isto.'");
        }
    }

    public void coolDown(boolean isOn, int actualTemp) {
        if (isOn) {
            System.out.print("Define the temperature: ");
            currentTemp = scanner.nextInt();
            if (actualTemp > currentTemp) {
                System.out.println("Mc Juão > 'Irmoun, está a arrefecer, aguardas se queres!");
                while (actualTemp != currentTemp) {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                        actualTemp-=5;
                        System.out.println(actualTemp + "ºC");
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.println("Mc  Juão > 'Irmau, está um frio que até queima!'");
            } else {
                System.out.println("Mc Juão > 'Oh irmaun, queres arrefecer com um valor mais maior ao atual? ó bórro!'");
            }
        } else {
            System.out.println("Mc Juão > 'Oh irmaun, liga isto.'");
        }
    }
}