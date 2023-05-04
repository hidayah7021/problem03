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
        svsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // get amount, multiply with gst or svs, divide among pax
                boolean isChecked = svsButton.isChecked();
                if (isChecked) {
                    ;
                }else{
                    ;
                }
            }
        });


    }
}