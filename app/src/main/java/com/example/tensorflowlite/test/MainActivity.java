package com.example.tensorflowlite.test;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tensorflowlite.test.functions.TensorflowTraining;

import java.io.IOException;


public class MainActivity extends AppCompatActivity {
    public String TAG = "Tensorflow";

    public Button loadDatasetButton;
    public Button trainButton;
    TensorflowTraining tensorflowTraining;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        tensorflowTraining = new TensorflowTraining();
        loadDatasetButton = (Button) findViewById(R.id.button1);
        trainButton = findViewById(R.id.button2);
//        Interpreter interpreter;


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loadDataset(View view) {
        try {
            TensorflowTraining.loadModel();
            Log.e(TAG,"model loaded");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void train(View view) {


    }

}
