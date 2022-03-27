
import java.util.Observer;

public interface IModel {
    /**
     * Interface for model
     */
    void moves();
    void setPos(String curr);
    void addObserver(Observer o);
    String getMoves();

}
