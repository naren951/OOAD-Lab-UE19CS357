import java.io.ObjectStreamException;
import java.util.Observable;
import java.util.Observer;

public class Model extends Observable implements IModel {
    private String getmoves = "";
    private String curr;
    /**
     * Requires: start != null
     * modifies: this
     * effects: sets the initial value of count
     *
     */
    public void model(){

    }
    @Override
    public void moves() {
        System.out.println("Curr"+curr);
        this.getmoves = "test String";
        setChanged();//set the observaable object ie the model to changed
        notifyObservers();//notify all the observers
    }

    /**
     *
     * effects: returns the current count
     */
    public String getMoves(){
        return getmoves;
    }
    /**
     * requires: count != null
     * Modifies: this
     * effects: sets the current count to count and notifys the observers that its changed
     */
    @Override
    public void setPos(String curr) {
        System.out.println("pos is" + curr);
        this.curr = curr;
        setChanged();
        notifyObservers();
    }

    /**
     * requires: o != NULL
     * Modifies: this
     * effects: adds an Observer for the model
     *
     */
    @Override
        public void addObserver(Observer o) {
            super.addObserver(o);
        }
}
