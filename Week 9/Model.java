import java.util.Observable;
import java.util.Observer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.*;


public class Model extends Observable implements IModel {
    
    private String getmoves = "";
    private String curr;
    private String currPiece;

    private final String url = "jdbc:postgresql://localhost:5432/company";
private final String user = "postgres";
private final String password = "<add your password>";
    public void model(){

    }
    
    @Override
    public void moves() {

        if (currPiece.equals("Queen")){
            this.getmoves = " c1, c2, c3, c4, c6, c7, c8";
        }
        else{
        this.getmoves = " e4, e6, e8, f4 , f8, f6";
    }
    try {
        FileWriter myWriter = new FileWriter("Database.txt",true);
        myWriter.append("Possible Moves: "+this.getmoves+"\n");
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
    // connect();
        System.out.println("Curr "+curr);
        setChanged();
        notifyObservers();
    }
    @Override
    public String getMoves(){
          return getmoves;
    }
    @Override
    public void currPiece(String curr){
        System.out.println("Curr Piece is "+ curr);
        try {
            FileWriter myWriter = new FileWriter("Database.txt",true);
            myWriter.append("Current Piece is: "+curr+"\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        this.currPiece = curr;
        setChanged();
        notifyObservers();
    }
    @Override
    public void setPos(String curr) {
        System.out.println("pos is " + curr);
        try {
            FileWriter myWriter = new FileWriter("Database.txt",true);
            myWriter.append("Current Position is: "+curr+"\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        this.curr = curr;
        setChanged();
        notifyObservers();
    }
    @Override
        public void addObserver(Observer o) {
            super.addObserver(o);
        }
        public Connection connect() {
            Connection conn = null;
            try {
                conn = DriverManager.getConnection(url, user, password);
                System.out.println("Connected to the PostgreSQL server successfully.");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
    
            return conn;
        }

    }
