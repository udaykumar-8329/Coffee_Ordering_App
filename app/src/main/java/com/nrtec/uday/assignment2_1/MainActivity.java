package com.nrtec.uday.assignment2_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static  int i=0;
    TextView tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=findViewById(R.id.number);
        tv1.setText("Number of Coffees Ordered:: 0");
        tv2=findViewById(R.id.bill);
        tv2.setText("Total Bill:: Rs.0");

    }

    public void increment(View view) {

        i++;
        tv1.setText("Number of coffees ordered ::"+i);
        tv2.setText("Total:: Rs. "+(i*10));


    }

    public void decrement(View view) {
        if(i<=0) {
            tv1.setText("Order should not be less than 0");
            tv2.setText("Total Bill :: Rs. 0 ");
        }
        else {
            i--;
            tv1.setText("Number of coffees ordered ::" + i + "");
            tv2.setText("Total Bill "+"\n"+":: Rs. " + (i * 10));
        }
    }
}
