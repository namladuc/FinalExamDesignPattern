package state.toasters.concretestates;

import state.toasters.ToasterState;

public class ToastingState extends ToasterState {

    @Override
    public ToasterState ejectBread() {
        return new BreadEjectedState();
    }
}
