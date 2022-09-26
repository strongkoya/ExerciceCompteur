package com.mkt.exercicecompteur;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int compteur = 0;
    private TextView comptageTxtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        comptageTxtView = (TextView) findViewById(R.id.comptageTxtView);
    }

    public void afficherToast(View view) {
        Toast toast = Toast.makeText(this, R.string.txtToast,
                Toast.LENGTH_SHORT);
        toast.show();
    }


    public void compter(View view) {
        compteur++;
        if (comptageTxtView != null)
            comptageTxtView.setText(Integer.toString(compteur));
    }
}