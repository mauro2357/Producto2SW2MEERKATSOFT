package com.example.mauriciogiraldo.restintegration;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    public void consumirServiciorest(View view){
        new CallAPI().execute();

    }

    private class CallAPI extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... params) {

            String resultToDisplay = "";

            InputStream in = null;

            // HTTP Get
            try {

                URL url = new URL("http://httpbin.org/get");

                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

                in = new BufferedInputStream(urlConnection.getInputStream());

                byte[] contents = new byte[1024];

                int bytesRead=0;
                String strFileContents=null;
                while( (bytesRead = in.read(contents)) != -1){
                    strFileContents = new String(contents, 0, bytesRead);
                }

                return strFileContents;

            } catch (Exception e ) {
                e.printStackTrace();

                return null;
            }

        }

        protected void onPostExecute(String result) {
            TextView textoServicio = (TextView) findViewById(R.id.textoServicio);
            textoServicio.setText(result);
        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
