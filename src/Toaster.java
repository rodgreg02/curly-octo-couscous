import java.util.concurrent.TimeUnit;

public class Toaster extends Eletro{
    int capacityToast;
    public void toast(boolean isOn, int timer){
        if(isOn){
            System.out.println("Toasting");
            while (timer  != 0){
                try {
                    TimeUnit.SECONDS.sleep(1);
                    timer--;
                    System.out.println(timer + " Seconds");
                    if (timer==0){
                        System.out.println("Mc NikiNiki > Tira as tuas torradas e siga comer hehehhe! 🍞");
                    }
                } catch (InterruptedException e) {
                 Thread.currentThread().interrupt();
                }
            }
        }
        else{
            System.out.println("MC NIKINIKI > liga isso!.");
        }
    }

    @Override
    public int setTimer() {
        System.out.println("In seconds..");
        int timer = scanner.nextInt();
        return timer;
    }
}