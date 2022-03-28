import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class View implements IView, Observer {
    private IModel model;
    private ActionListener controller;

    private JButton moves;
    private JComboBox<String> piece;
    private JButton setPos;
    private JTextField input;
    private JLabel output;
    private JFrame frame;
    private JPanel panel;

    public View(IModel model) {
        this.model = model;
        model.addObserver(this);
        controller = new Controller(this, model);
        buildButtons();
        setButtons();
        buildTextFields();
        buildGUI();


    }

    private void setButtons() {
        moves.setActionCommand("Get Moves");
        setPos.setActionCommand("Set Position");
        piece.setActionCommand("Drop Down");
        piece.addActionListener(controller);
        moves.addActionListener(controller);
        setPos.addActionListener(controller);
    }

    private void buildButtons() {
        moves = new JButton();
        setPos = new JButton();
        String[] choices = { "Knight","Queen"};
        piece = new JComboBox<String>(
            choices
        );
        moves.setText("Get Moves");
        setPos.setText("Set Position");
    }

    /**
     * effects: builds the label and textfield
     */
    private void buildTextFields() {
        input = new JTextField();
        output = new JLabel();
    }

    private void buildGUI() {
        frame = new JFrame();
        panel = new JPanel();
        panel.add(piece);
        panel.add(setPos);
        panel.add(input);
        panel.add(moves);
        panel.add(output);
        panel.setLayout(new GridLayout(5, 1));
        frame.add(panel);
        frame.pack();
        update(null, null);
        frame.setVisible(true);
    }
    @Override
    public String getPiece() {
        System.out.println(piece.getItemAt((piece.getSelectedIndex())));
        return "" + piece.getItemAt((piece.getSelectedIndex()));
    }

    @Override
    public String getInput() {
        return input.getText();
    }

    @Override
    public void update(Observable o, Object arg) {
        output.setText(model.getMoves());
        System.out.println("UPDATE");
    }
    
}
