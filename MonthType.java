import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.ComboBox;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;

public class MonthType extends Application {

         public enum MonthAccount {DecemberFebruary, MarchMay, JuneAugust, SeptemberNovember}

	  @Override
	  public void start(Stage primaryStage) { 
	  MonthAccount accounts [] = {MonthAccount.DecemberFebruary, MonthAccount.MarchMay, MonthAccount.JuneAugust, MonthAccount.SeptemberNovember};
	  primaryStage.setTitle("Month TYpe");
	  primaryStage.setWidth(300);
	  ObservableList <MonthAccount> options = FXCollections.observableArrayList(accounts);
	  ComboBox combobox = new ComboBox(options);
	  Label label = new Label ("Greetings!");
	  Button button = new Button ("Exit");
	  VBox pane = new VBox ();
	  System.out.println(combobox.getValue());
	  combobox.setOnAction(e->{
	  				if(combobox.getValue()==MonthAccount.DecemberFebruary) {
						label.setText(" Do you want to build a snow man?");
					}else if(combobox.getValue()==MonthAccount.MarchMay) {
						label.setText(" Happy Spring Days!");
					}else if(combobox.getValue()==MonthAccount.JuneAugust) {
						label.setText(" its summer time.");
					}else if(combobox.getValue()==MonthAccount.SeptemberNovember) {
						label.setText(" welcome to the foliage season");
						}
				});
	button.setOnAction(e->System.exit(0));
	pane.getChildren().add(label);
	pane.getChildren().add(combobox);
	pane.getChildren().add(button);
	Scene scene = new Scene(pane);
	primaryStage.setScene(scene);
	primaryStage.show();
	}
}
