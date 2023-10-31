import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Eletro {
    int tempMax = 300;
    String size;
    String color;
    String material;
    String brand;
    boolean isOn;
int currentTemp = 0;

Scanner scanner = new Scanner(System.in);
    public void turnOnOff(boolean isOn){
        if(isOn){
            System.out.println("Boop beep turning off");
            this.isOn = false;
        }
        else{
            System.out.println("Beep boop turning on");
            this.isOn = true;
        }
    }

    public int defineTemp(boolean isOn){
        int definedTemp;
        if(isOn){
            System.out.println("Max temperature tolerated:"+ this.tempMax + "\nInsert temp to heat up to:");
            definedTemp = scanner.nextInt();
            if(definedTemp <= this.tempMax){
                System.out.println("Heating up to " + definedTemp);
                heatUp(definedTemp);
                System.out.println("Heated up to " + definedTemp);
                return definedTemp;
            }
            else{
                System.out.println("Too hot, set to " + this.tempMax);
                heatUp(this.tempMax);
            }
        }
        else{
            System.out.println("É ligar o aparelho primero, Irmau");
        }
        return 0;
    }

    public void heatUp(int definedTemp){
        while(currentTemp != definedTemp) {
            currentTemp++;
            if(currentTemp % 5 == 0 || currentTemp == definedTemp) {
                System.out.println(currentTemp + "ºC");
            }
        }
    }


    public void coolDown(){
        this.currentTemp = 0;
        System.out.println("Cooled down, usable again. beep boop.");
    }

    public int setTimer(){
        System.out.println("In minutes:");
        int timer = scanner.nextInt();
        return timer;
        }
    }


