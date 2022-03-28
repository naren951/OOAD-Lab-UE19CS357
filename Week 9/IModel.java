
import java.util.Observer;

public interface IModel {
    void moves();
    void setPos(String curr);
    void currPiece(String curr);
    void addObserver(Observer o);
    String getMoves();

}
