package com.example.narasim.jm_solution_admin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Feedback extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
    }

    public void viewProduct(View view) {
        Intent i = new Intent(Feedback.this, FeedbackProduct.class);
        startActivity(i);
    }

    public void viewService(View view) {
        Intent i = new Intent(Feedback.this, FeedbackService.class);
        startActivity(i);
    }
}
