package state.toasters.concretestates;

import state.toasters.ToasterState;

public class BreadInsertedState extends ToasterState {

    @Override
    public ToasterState pullLever() {
        return new ToastingState();
    }
}
