import java.io.SerializablePermission;
import java.util.Scanner;
import java.io.Console;

public class Main {
    public static void main(String[] args) {
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
                    while (!quit2) {
                        System.out.println("Heater:");
                        System.out.println("1)Turn on/off\n2)Set temperature\n3)Heat\n4)CoolDown\n0) Quit");
                        switch (input.nextInt()) {
                            case 1:
                                if (heater.isOn) {
                                    heater.coolDown();
                                }
                                heater.turnOnOff(heater.isOn);
                                break;
                            case 2:
                                heater.defineTemp(heater.isOn);
                                break;
                            case 3:
                                heater.heat(heater.isOn, heater.setTimer());
                                break;
                            case 4:
                                heater.coolDown(heater.isOn, heater.currentTemp);
                                break;
                            case 0:
                                quit2 = true;
                                break;
                            default:
                                System.out.println("Irmau, então? é de 1-3? não muito complicado né");
                                break;
                        }
                    }
                    break;
                case 3:
                            while (!quit2){
                                System.out.println("Toaster:");
                                System.out.println("1)Turn on/off\n2)Set temperature\n3)Toast\n0) Quit");
                                int choose = input.nextInt();
                                switch (choose) {
                                    case 1:
                                        if (toaster.isOn) {
                                            toaster.coolDown();
                                        }
                                        toaster.turnOnOff(toaster.isOn);
                                        break;
                                    case 2:
                                        toaster.defineTemp(toaster.isOn);
                                        break;
                                    case 3:
                                        toaster.toast(toaster.isOn, toaster.setTimer());
                                        break;
                                    case 0:
                                        quit2 = true;
                                        break;
                                    default:
                                        System.out.println("Irmau, então? é de 1-3? não muito complicado né");
                                        break;
                                }

                            }
                            break;
                        case 0:
                            quit = true;
                            break;
                        default:
                            break;
                        
            }
        }