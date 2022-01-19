package state.toasters;

public class Client {
    public static void main(String[] args) {
        Toaster toaster = new Toaster();
        // logs: IdleState 

        toaster.insertBread();
        // logs: BreadInsertedState 

        toaster.pullLever();
        // logs: ToastingState 

        toaster.ejectBread();
        // logs: BreadEjectedState 

        toaster.removeBread();
        // logs: IdleState 
    }
}
