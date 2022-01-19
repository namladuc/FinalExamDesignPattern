package state.toasters.concretestates;

import state.toasters.ToasterState;

public class BreadEjectedState extends ToasterState {

    @Override
    public ToasterState removeBread() {
        return new IdleState();
    }
}
