package com.example.narasim.jm_solution_admin;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

public class ReportProductDetail extends AppCompatActivity implements View.OnClickListener {

    private EditText editTextId;
    private EditText editTextName, editTextHint, editTextReply;
    private EditText editTextProduct, editTextTokenname, editTextFeed;
    private EditText editTextToken, editTextMobile, editTextModel, editTextQuantity, editTextDeldate, editTextConname, editTextStatus;

    private Button buttonUpdate;
    private Button buttonDelete;
    Spinner spinnerFeed, spinnerStatus;

    private String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_product_detail);

//        getActionBar().setDisplayHomeAsUpEnabled(true);
        Intent intent = getIntent();

        id = intent.getStringExtra(Config.EMP_ID);

        editTextId = (EditText) findViewById(R.id.editTextId);
        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextProduct = (EditText) findViewById(R.id.editTextProduct);
        editTextToken = (EditText) findViewById(R.id.editTextToken);
        editTextMobile = (EditText) findViewById(R.id.editTextMobile);
        editTextModel = (EditText) findViewById(R.id.editTextModel);
        editTextQuantity = (EditText) findViewById(R.id.editTextQuantity);
        editTextDeldate = (EditText) findViewById(R.id.editTextDeldate);
        editTextConname = (EditText) findViewById(R.id.editTextConname);
        editTextStatus = (EditText) findViewById(R.id.editTextStatus);
        editTextTokenname = (EditText) findViewById(R.id.editTextTokenname);
        editTextFeed = (EditText) findViewById(R.id.editTextFeed);
        spinnerStatus = (Spinner)findViewById(R.id.spinnerStatus);
        editTextHint = (EditText) findViewById(R.id.editTextHint);
        editTextReply = (EditText) findViewById(R.id.editTextReply);



        buttonUpdate = (Button) findViewById(R.id.buttonUpdate);
        buttonDelete = (Button) findViewById(R.id.buttonDelete);


        buttonUpdate.setOnClickListener(this);
        buttonDelete.setOnClickListener(this);

        editTextId.setText(id);

        getEmployee();
    }

    private void getEmployee(){
        class GetEmployee extends AsyncTask<Void,Void,String> {
            ProgressDialog loading;
            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(ReportProductDetail.this,"Fetching...","Wait...",false,false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                showEmployee(s);
            }

            @Override
            protected String doInBackground(Void... params) {
                RequestHandler rh = new RequestHandler();
                String s = rh.sendGetRequestParam(Config.URL_GET_PRODUCT,id);
                return s;
            }
        }
        GetEmployee ge = new GetEmployee();
        ge.execute();
    }

    private void showEmployee(String json){
        try {
            JSONObject jsonObject = new JSONObject(json);
            JSONArray result = jsonObject.getJSONArray(Config.TAG_JSON_ARRAY);
            JSONObject c = result.getJSONObject(0);
            String name = c.getString(Config.TAG_NAME);
            String product = c.getString(Config.TAG_PRODUCT);
            String token = c.getString(Config.TAG_TOKENNAME) + c.getString(Config.TAG_TOKEN);
            String mobile = c.getString(Config.TAG_MOBILE);
            String model = c.getString(Config.TAG_MODEL);
            String quantity = c.getString(Config.TAG_QUANTITY);
            String deldate = c.getString(Config.TAG_DEL_DATE);
            String conname = c.getString(Config.TAG_CON_NAME);
            String status = c.getString(Config.TAG_STATUS);
            String tokenname = c.getString(Config.TAG_TOKENNAME);
            String feed = c.getString(Config.TAG_FEED);
            String hint = c.getString(Config.TAG_HINT);

            editTextName.setText(name);
            editTextProduct.setText(product);
            editTextToken.setText(token);
            editTextMobile.setText(mobile);
            editTextModel.setText(model);
            editTextQuantity.setText(quantity);
            editTextDeldate.setText(deldate);
            editTextConname.setText(conname);
            editTextStatus.setText(status);
            editTextTokenname.setText(tokenname);
            editTextFeed.setText(feed);
            editTextHint.setText(hint);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }


    private void updateEmployee(){
//        final String name = editTextName.getText().toString().trim();
//        final String product = editTextProduct.getText().toString().trim();
//        final String token = editTextToken.getText().toString().trim();
//        final String mobile = editTextMobile.getText().toString().trim();
//        final String feed = editTextFeed.getText().toString().trim();
        final String status = spinnerStatus.getSelectedItem().toString().trim();
//        final String hint = editTextHint.getText().toString().trim();
//        final String reply = editTextReply.getText().toString().trim();

        class UpdateEmployee extends AsyncTask<Void,Void,String> {
            ProgressDialog loading;
            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(ReportProductDetail.this,"Updating...","Wait...",false,false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(ReportProductDetail.this,s, Toast.LENGTH_LONG).show();
            }

            @Override
            protected String doInBackground(Void... params) {
                HashMap<String,String> hashMap = new HashMap<>();
                hashMap.put(Config.KEY_EMP_ID,id);
//                hashMap.put(Config.KEY_EMP_NAME,name);
//                hashMap.put(Config.KEY_EMP_DESG,product);
//                hashMap.put(Config.KEY_EMP_SAL,token);
//                hashMap.put(Config.KEY_EMP_MOB,mobile);
                hashMap.put(Config.KEY_EMP_STATUS,status);
//                hashMap.put(Config.KEY_EMP_FEED,feed);
//                hashMap.put(Config.KEY_EMP_REPLY,reply);

                RequestHandler rh = new RequestHandler();

                String s = rh.sendPostRequest(Config.URL_UPDATE_PRODUCT_STATUS,hashMap);

                return s;
            }
        }

        UpdateEmployee ue = new UpdateEmployee();
        ue.execute();
    }

    private void deleteEmployee(){
        class DeleteEmployee extends AsyncTask<Void,Void,String> {
            ProgressDialog loading;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(ReportProductDetail.this, "Updating...", "Wait...", false, false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(ReportProductDetail.this, s, Toast.LENGTH_LONG).show();
            }

            @Override
            protected String doInBackground(Void... params) {
                RequestHandler rh = new RequestHandler();
                String s = rh.sendGetRequestParam(Config.URL_DELETE_EMP, id);
                return s;
            }
        }

        DeleteEmployee de = new DeleteEmployee();
        de.execute();
    }

    private void confirmDeleteEmployee(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Are you sure you want to delete this employee?");

        alertDialogBuilder.setPositiveButton("Yes",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        deleteEmployee();
                        startActivity(new Intent(ReportProductDetail.this,ReportProduct.class));
                    }
                });

        alertDialogBuilder.setNegativeButton("No",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                    }
                });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    @Override
    public void onClick(View v) {
        if(v == buttonUpdate){
            updateEmployee();
        }

        if(v == buttonDelete){
            confirmDeleteEmployee();
        }

    }


}
