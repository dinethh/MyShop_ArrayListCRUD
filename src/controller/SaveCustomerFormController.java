package controller;

import db.DataSet;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import model.Customer;

public class SaveCustomerFormController {
    public TextField txtId;
    public TextField txtName;
    public TextField txtAddress;
    public TextField txtSalary;

    public void btnSaveOnAction(ActionEvent actionEvent) {
        Customer customer = new Customer(
                txtId.getText(),
                txtName.getText(),
                txtAddress.getText(),
                Double.parseDouble(txtSalary.getText())
        );
        if (DataSet.customerTable.add(customer))
            new Alert(Alert.AlertType.CONFIRMATION,"Saved..!").show();
        else
            new Alert(Alert.AlertType.ERROR,"Something Went Wrong..").show();
    }
}
