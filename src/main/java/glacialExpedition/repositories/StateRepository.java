package glacialExpedition.repositories;

import glacialExpedition.models.states.State;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StateRepository implements Repository<State>{

    private Collection<State> states;


    public StateRepository() {
        this.states = new ArrayList<State>();
    }

    @Override
    public Collection<State> getCollection() {
        return Collections.unmodifiableCollection(states);
    }

    @Override
    public void add(State state) {

    }

    @Override
    public boolean remove(State state) {
        return false;
    }

    @Override
    public State byName(String name) {
        return null;
    }
}
