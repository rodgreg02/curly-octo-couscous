import java.util.Scanner;
import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Console console = System.console();
        boolean quit = false;
        boolean quit1 = false;
        boolean quit2 = false;
        boolean quit3 = false;
        Oven oven = new Oven();
        Heater heater = new Heater();
        Toaster toaster = new Toaster();
        while (!quit) {
            System.out.println("What appliance do you wanna use?\n1)Oven\n2)Heater\n3)Toaster\n0)Quit");

            Scanner input = new Scanner(System.in);

            switch (input.nextInt()) {
                case 1:
                    while (!quit1) {
                        System.out.println("Oven:");
                        System.out.println("1)Turn on/off\n2)Set temperature\n3)ROAST\n0) Quit");
                        switch (input.nextInt()) {
                            case 1:
                                if (oven.isOn) {
                                    oven.clean();
                                    oven.coolDown();
                                }
                                oven.turnOnOff(oven.isOn);
                                break;
                            case 2:
                                oven.defineTemp(oven.isOn);
                                break;
                            case 3:
                                oven.roast(oven.isOn, oven.setTimer());
                                break;
                            case 0:
                                quit1 = true;
                                break;
                            default:
                                System.out.println("Irmau, então? é de 1-3? não muito complicado né");
                                break;
                        }
                    }
                        break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 0:
                            quit = true;
                            break;
                        default:
                            break;

            }
/*
        System.out.println("\nHeater:");
        heater.turnOnOff(heater.isOn);
        heater.showTemp(heater.defineTemp(heater.isOn));
        heater.coolDown();


        System.out.println("\nToaster:");
        toaster.turnOnOff(toaster.isOn);
        toaster.defineTemp(toaster.isOn);
        toaster.toast(toaster.isOn);
        toaster.coolDown();
*/
        }
    }
}