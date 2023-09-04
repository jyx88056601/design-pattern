package memento;

import java.util.ArrayList;
import java.util.List;

public class StateManager {
    List<State> states;
    int current;

    public StateManager(){
        current = -1;
        states = new ArrayList<>();
    }

    public void push(State state) {
        states.add(state);
        current++;
    }
 
    public State redo() {
        if(current < states.size() - 1) {
            current+=1;
        }
        return states.get(current);
    }

    public State undo() {
        if(current > 0) {
            current -= 1;
        }
        return states.get(current);
    }
}
