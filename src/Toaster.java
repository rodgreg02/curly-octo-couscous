public class Toaster extends Eletro{
    int capacityToast;
    public void toast(boolean isOn){
        if(isOn){
            System.out.println("Toasting");
        }
        else{
            System.out.println("Oh irmaun, liga isto.");
        }
    }
}