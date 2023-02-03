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
        for (State state1 : states) {
            if (!state1.equals(state)) {
                states.add(state);
            }
        }
    }

    @Override
    public boolean remove(State state) {
        for (State state1 : states) {
            if (state1.equals(state)) {
                states.remove(state);
                return true;
            }
        }
        return false;
    }

    @Override
    public State byName(String name) {
        for (State state : states) {
         if (state.getName().equals(name)) {
             return state;
         }
        }
        return null;
    }
}
