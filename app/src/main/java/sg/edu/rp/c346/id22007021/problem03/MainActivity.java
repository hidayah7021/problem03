package sg.edu.rp.c346.id22007021.problem03;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {
    //Delaring and naming variables
    ToggleButton svsButton;
    ToggleButton gstButton;
    RadioGroup rgPayment;
    Button splitButton;
    Button resetButton;
    TextView txDisplay;
    TextView numberPax;
    TextView editPax;
    TextView editAmount;
    TextView editDiscount;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //linking java to xml
        svsButton = findViewById(R.id.svsButton);
        gstButton = findViewById(R.id.gstButton);
        splitButton = findViewById(R.id.splitButton);
        resetButton = findViewById(R.id.resetButton);
        rgPayment = findViewById(R.id.radioGroupPay);
        txDisplay = findViewById(R.id.textDisplay);
        numberPax = findViewById(R.id.numberPax);
        editPax = findViewById(R.id.editPax);
        editAmount = findViewById(R.id.editAmount);
        editDiscount = findViewById(R.id.editDiscount);

        splitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // code requirements;
                // get state of toggle button
                // enabling and disabling etInput
                boolean isChecked = splitButton.isPressed();
                if (isChecked) {
                    svsButton.isChecked();
                    // svs
                    double svsPrice = 110.0;
                    int price1 = Integer.parseInt(editAmount.getText().toString());
                    double result = ((double) svsPrice/price1+price1);
                    String disc = editDiscount.getText().toString();
                    String dis = Integer.valueOf(String);
                    int discount = Integer.parseInt(editAmount.getText().toString());
                    double result2 = ((double) result-discount);
                }else{
                    // gst
                    gstButton.isChecked();
                    double gstPrice = 108.0;
                    int price2 = Integer.parseInt(editAmount.getText().toString());
                    double result = ((double) gstPrice/price2+price2);
                    String disc = editDiscount.getText().toString();
                    String dis = Integer.valueOf(String);
                    int discount = Integer.parseInt(editAmount.getText().toString());
                    double result2 = ((double) result-discount);

                    String stringResponse = .getText().toString();
                    int checkedRadioId = rgPayment.getCheckedRadioButtonId();
                    if(checkedRadioId == R.id.radioCash){
                        // if male; he says ...
                        stringResponse = "Total Bill: " + result2;
                    }else{
                        // she says ...
                        stringResponse = "Total Bill: " + stringResponse;
                    }
                    txDisplay.setText(stringResponse);
                }
            }
        });

    }
}