package memento;

public class Subject {
    public String content;
    public String version;

    public void setContent(String content) {
        this.content = content;
    }

    public void setVersion(String version) {
        this.version = version;
    }


    public State createState() {
      return new State(content,version);
    }

    public void restore(State state) {
        this.content = state.content;
        this.version = state.version;
    }


}
