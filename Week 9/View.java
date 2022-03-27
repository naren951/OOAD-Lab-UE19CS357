import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class View implements IView, Observer {
    //Interfaces for model and controller
    private IModel model;
    private ActionListener controller;
    //GUI Elements
    private JButton moves;
    private JComboBox piece;
    private JButton setPos;
    private JTextField input;
    private JLabel output;
    private JFrame frame;
    private JPanel panel;


    /**
     * Constructore for view
     * requires: model != null
     * effects builds view
     */
    public View(IModel model) {
        this.model = model;
        model.addObserver(this);
        controller = new Controller(this, model);
        buildButtons();
        setButtons();
        buildTextFields();
        buildGUI();


    }

    /**
     * effects: Adds listeners to buttons and set there command string
     */
    private void setButtons() {
        moves.setActionCommand("Get Moves");
        setPos.setActionCommand("Set Position");
        moves.addActionListener(controller);
        setPos.addActionListener(controller);
    }

    /**
     * effects: creates button objects and sets their text
     */
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

    /**
     * effects: builds the gui
     */
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
        update(null, null);//kind of cheating but good way to initialise gui
        frame.setVisible(true);

    }


    /**
     * requires: input.getText() != null
     * effects: returns a string of the input
     */
    @Override
    public String getInput() {
        return input.getText();
    }

    /**
     * METHOD for updating VARIABLES
     *
     *
     */
    @Override
    public void update(Observable o, Object arg) {
        output.setText(model.getMoves());
        // output.setText(String.valueOf(model.moves()));
        System.out.println("UPDATE");
    }
}
