import java.util.Scanner;


public class Eletro {
    int tempMax = 300;
    String size;
    String color;
    String material;
    String brand;
    boolean isOn;
    int currentTemp = 0;

    Scanner scanner = new Scanner(System.in);

    public void turnOnOff(boolean isOn) {
        if (isOn) {
            System.out.println("Boop beep turning off");
            this.isOn = false;
        } else {
            System.out.println("Beep boop turning on");
            this.isOn = true;
        }
    }

    public int defineTemp(boolean isOn) {
        int definedTemp;
        if (isOn) {
            System.out.println("Max temperature tolerated:" + this.tempMax + "\nInsert temp to heat up to:");
            definedTemp = scanner.nextInt();
            if (definedTemp <= this.tempMax) {
                System.out.println("Heating up to " + definedTemp);
                heatUp(definedTemp);
                System.out.println("Heated up to " + definedTemp);
                return definedTemp;
            } else {
                System.out.println("Too hot, set to " + this.tempMax);
                heatUp(this.tempMax);
            }
        } else {
            System.out.println("Mc Juão > É ligar o aparelho primero, Irmau");
        }
        return 0;
    }

    public void heatUp(int definedTemp) {
        while (currentTemp != definedTemp) {
            currentTemp++;
            if (currentTemp % 5 == 0 || currentTemp == definedTemp) {
                System.out.println(currentTemp + "ºC");
            }
        }
    }


    public void coolDown() {
        while(this.currentTemp != 0) {
            this.currentTemp -= 5;
            System.out.println(this.currentTemp);
        }
            System.out.println("Cooled down, usable again. beep boop.");
            return;

    }

    public int setTimer() {
        System.out.println("In minutes:");
        int timer = scanner.nextInt();
        return timer;
    }
}


