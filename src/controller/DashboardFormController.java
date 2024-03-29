package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardFormController {
    public void SaveCustomerOnAction(ActionEvent actionEvent) throws IOException {
        setUi("SaveCustomerForm");
    }

    public void DeleteCustomerOnAction(ActionEvent actionEvent) throws IOException {
        setUi("DeleteCustomerForm");
    }

    public void UpdateCustomerOnAction(ActionEvent actionEvent) throws IOException {
        setUi("UpdateCustomerForm");
    }

    public void LoardAllCustomerOnAction(ActionEvent actionEvent) throws IOException {
        setUi("LoardAllCustomerForm");
    }

    public void SearchCustomerOnAction(ActionEvent actionEvent) throws IOException {
        setUi("SearchCustomerForm");
    }

    private void setUi(String URI) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../views/" + URI + ".fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(parent));
        stage.setTitle(URI);
        stage.show();
    }
}
