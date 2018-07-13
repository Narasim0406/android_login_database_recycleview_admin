package com.example.narasim.jm_solution_admin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ReportProduct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_product);
//        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void viewProgress(View view) {
        Intent i = new Intent(ReportProduct.this, ReportProductProgress.class);
        startActivity(i);
    }

    public void viewCompleted(View view) {
        Intent i = new Intent(ReportProduct.this, ReportProductCompleted.class);
        startActivity(i);
    }

    public void viewCancelled(View view) {
        Intent i = new Intent(ReportProduct.this, ReportProductCancelled.class);
        startActivity(i);
    }
}
