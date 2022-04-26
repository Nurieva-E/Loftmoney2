package ru.nurieva.loftmoney2;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, AddItemActivity.class );
        startActivity(intent);


        // TODO: - Here we will work with recyclerview

    }
}


