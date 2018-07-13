package com.example.narasim.jm_solution_admin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ReportService extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_service);
//        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void viewProgress(View view) {
        Intent i = new Intent(ReportService.this, ReportServiceProgress.class);
        startActivity(i);
    }

    public void viewCompleted(View view) {
        Intent i = new Intent(ReportService.this, ReportServiceCompleted.class);
        startActivity(i);
    }

    public void viewCancelled(View view) {
        Intent i = new Intent(ReportService.this, ReportServiceCancelled.class);
        startActivity(i);
    }
}
