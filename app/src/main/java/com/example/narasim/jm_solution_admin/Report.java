package com.example.narasim.jm_solution_admin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Report extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
    }

    public void viewProduct(View view) {
        Intent i = new Intent(Report.this, ReportProduct.class);
        startActivity(i);
    }

    public void viewService(View view) {
        Intent i = new Intent(Report.this, ReportService.class);
        startActivity(i);
    }
}
