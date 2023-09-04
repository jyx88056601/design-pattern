import memento.StateManager;
import memento.Subject;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        StateManager stateManager = new StateManager();
        subject.setContent("Our first input");
        subject.setVersion("1.0");
        stateManager.push(subject.createState());
        subject.setContent("our second input");
        subject.setVersion("2.0");
        stateManager.push(subject.createState());
        subject.setContent("our third input");
        subject.setVersion("3.0");
        stateManager.push(subject.createState());
        subject.setContent("our fourth input");
        subject.setVersion("4.0");
        stateManager.push(subject.createState());
        System.out.println(subject.content + " " + subject.version);
        subject.restore(stateManager.undo());
        System.out.println(subject.content + " " + subject.version);
        subject.restore(stateManager.redo());
        System.out.println(subject.content + " " + subject.version);
    }
}