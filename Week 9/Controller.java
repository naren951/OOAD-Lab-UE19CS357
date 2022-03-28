import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    private IView view;
    private IModel model;

    public Controller(IView view, IModel model){
        this.view = view;
        this.model = model;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("HERE");
       if(e.getActionCommand().equals("Get Moves")){
           model.moves();
       }else if(e.getActionCommand().equals("Drop Down")){
           model.currPiece(view.getPiece());
       }
       else if(e.getActionCommand().equals("Set Position")){
           model.setPos(view.getInput());
       }else{
           System.out.println("INVAILD ");
       }
    }
}
