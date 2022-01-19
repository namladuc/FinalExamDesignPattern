package state.toasters;

import state.toasters.concretestates.*;

public class Toaster implements ToasterOperations {
    private ToasterState state = new IdleState();

    public Toaster() {
        this.logCurrentState();
    }

    @Override
    public void insertBread() {
        state = state.insertBread();
        this.logCurrentState();
    }

    @Override
    public void pullLever() {
        state = state.pullLever();
        this.logCurrentState();
    }

    @Override
    public void ejectBread() {
        state = state.ejectBread();
        this.logCurrentState();
    }

    @Override
    public void removeBread() {
        state = state.removeBread();
        this.logCurrentState();
    }

    private void logCurrentState() {
        String[] strArr = (state+"").split("\\.");
        System.out.println(strArr[strArr.length - 1].split("@")[0]);
    }
    
}
