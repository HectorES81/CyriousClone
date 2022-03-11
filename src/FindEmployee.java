import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.sql.*;



public class FindEmployee extends Application{

	//statement for executing queries 
	private Statement stmt;
	private TextField tfId = new TextField();
	private TextField tfName = new TextField();
	private Label lblAge = new Label(); 
	
	@Override
	public void start(Stage primaryStage) {
		
			//initialize DB and create connection object
			initializeDB();
			
			Button btShowLastName = new Button("Show Age");
			HBox hBox = new HBox(5);
			hBox.getChildren().addAll(new Label("ID"), tfId, new Label("Name"), tfName, (btShowLastName));
			
			VBox vBox = new VBox(10);
			vBox.getChildren().addAll(hBox, lblAge);
			
			tfId.setPrefColumnCount(2);
			tfName.setPrefColumnCount(10);
			btShowLastName.setOnAction(e -> showLastName());
			
			Scene scene = new Scene(vBox, 420, 80);

			primaryStage.setTitle("Find employee's Age");
			primaryStage.setScene(scene);
			primaryStage.show();

	}
	
	private void initializeDB() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
	
			System.out.println("Driver loaded");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cyrious?characterEncoding=latin1", "root","waiter2kx");
			
			System.out.println("Database connected");
			
			stmt = con.createStatement();			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void showLastName() {
		String id = tfId.getText();
		String name = tfName.getText();
		
		try {
			String queryString = "select id, name, age from emp where id='" + id + "' and "
					+ "name='" + name + "'";
			
			ResultSet rset = stmt.executeQuery(queryString);
			
			if(rset.next()) {
				int rsid = rset.getInt(1);
				String rsname = rset.getString(2);
				int age = rset.getInt(3);
				
				lblAge.setText("Employee ID:" + rsid + ", Name: "+ rsname + ", Age: " + age);
			} else {
				lblAge.setText("Not found");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
