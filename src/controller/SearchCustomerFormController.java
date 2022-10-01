package controller;

import db.DataSet;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import model.Customer;

public class SearchCustomerFormController {
    public TextField txtId;
    public TextField txtName;
    public TextField txtAddress;
    public TextField txtSalary;

    public void txtSearchOnAction(ActionEvent actionEvent) {
        search();
    }

    public void btnSearchOnAction(ActionEvent actionEvent) {
        search();

    }
    private  void search(){
        for (Customer temp: DataSet.customerTable
             ) {
             if (temp.getId().equals(txtId.getText())) {
                 txtName.setText(temp.getName());
                 txtAddress.setText(temp.getAddress());
                 txtSalary.setText(String.valueOf(temp.getSalary()));
                 return;
             }
        }
        new Alert(Alert.AlertType.WARNING,"Empty Result..!").show();
    }

}
