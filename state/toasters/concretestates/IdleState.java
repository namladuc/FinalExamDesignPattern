package state.toasters.concretestates;

import state.toasters.ToasterState;

public class IdleState extends ToasterState {

    @Override
    public ToasterState insertBread() {
        return new BreadInsertedState();
    }
}
