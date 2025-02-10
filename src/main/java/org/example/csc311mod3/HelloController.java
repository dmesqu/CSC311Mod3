package org.example.csc311mod3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Button btnCalc;

    @FXML
    private TextField tfAnnual;

    @FXML
    private TextField tfYears;

    @FXML
    private TextField tfAmount;

    @FXML
    private TextField tfMonthly;

    @FXML
    private TextField tfTotal;

    @FXML
    protected void calc() {
        double loanAmount = Double.parseDouble(tfAmount.getText());
        double intrestRate = Double.parseDouble(tfAnnual.getText());
        double years = Double.parseDouble(tfYears.getText());

        double monthlyRate = intrestRate / 100 / 12;
        double numOfPayments = years * 12;

        double monthlyPayment = (loanAmount * monthlyRate) / (1 - Math.pow(1 + monthlyRate,-numOfPayments));
        double totalPayment = monthlyPayment * numOfPayments;

        tfMonthly.setText(monthlyPayment +"");
        tfTotal.setText(totalPayment +"");
    }
}