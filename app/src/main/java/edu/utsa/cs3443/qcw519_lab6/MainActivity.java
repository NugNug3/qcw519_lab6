package edu.utsa.cs3443.qcw519_lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import edu.utsa.cs3443.qcw519_lab6.model.Team;

public class MainActivity extends AppCompatActivity {

    Team team = new Team();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        team.loadAvengers(this);
    }
}