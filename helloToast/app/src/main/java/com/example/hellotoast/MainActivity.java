package com.example.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mcount = 0;
    private TextView mShowcount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowcount = (TextView) findViewById(R.id.show_counting);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_massage, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showCount(View view) {
        mcount++;
        if (mShowcount != null){
            mShowcount.setText(Integer.toString(mcount));
        }
    }
}
