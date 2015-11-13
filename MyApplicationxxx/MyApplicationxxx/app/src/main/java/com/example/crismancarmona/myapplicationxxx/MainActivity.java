package com.example.crismancarmona.myapplicationxxx;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import android.os.AsyncTask;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void consumirServiciorest(View view){
        new CallAPI().execute();
    }

    public void consumirServiciorestTotalVentas(View view){
        new CallAPITotalVentas().execute();
    }

    public void consumirServiciorestMeseros(View view){
        new CallAPIMeseros().execute();
    }

    public void consumirServiciorestClientes(View view){
        new CallAPIClientes().execute();
    }

    public void consumirServiciorestgustomusical(View view){new CallAPIGustoMusical().execute();
    }
    public void consumirServiciorestMejormesero(View view){new CallAPIMejorMesero().execute();
    }
    public void consumirServiciorestIvaRecaudado(View view){new CallAPIIvaRecaudado().execute();
    }
    public void consumirServiciorestProductoMasVendido(View view){new CallAPIProductoMasVendido().execute();
    }
    public void consumirServiciorestNumeroVentas(View view){new CallAPINumeroVentas().execute();
    }
    public void consumirServiciorestConsultardespachador(View view){new CallAPIConsultardespachador().execute();
    }



    private class CallAPI extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... params) {

            String resultToDisplay = "";

            InputStream in = null;

            // HTTP Get
            try {

                URL url = new URL("http://futures.j.facilcloud.com/Meerkat_0.0/resources/consultaproductos/consultarproductos/801");

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
            TextView textoServicio1 = (TextView) findViewById(R.id.textoServicio);
            textoServicio1.setText(result);
        }
    }

    private class CallAPIIvaRecaudado extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... params) {

            String resultToDisplay = "";

            InputStream in = null;

            // HTTP Get
            try {

                URL url = new URL("http://futures.j.facilcloud.com/Meerkat_0.0/resources/consultatotaliva/consultartotaliva/");

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
            TextView textoServicio1 = (TextView) findViewById(R.id.textoServicio);
            textoServicio1.setText(result);
        }
    }

    private class CallAPINumeroVentas extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... params) {

            String resultToDisplay = "";

            InputStream in = null;

            // HTTP Get
            try {

                URL url = new URL("http://futures.j.facilcloud.com/Meerkat_0.0/resources/consultanumeroventas/consultarnumeroventas");

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
            TextView textoServicio1 = (TextView) findViewById(R.id.textoServicio);
            textoServicio1.setText(result);
        }
    }

    private class CallAPIProductoMasVendido extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... params) {

            String resultToDisplay = "";

            InputStream in = null;

            // HTTP Get
            try {

                URL url = new URL("http://futures.j.facilcloud.com/Meerkat_0.0/resources/consultamasvendido/consultarmasvendido/");

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
            TextView textoServicio1 = (TextView) findViewById(R.id.textoServicio);
            textoServicio1.setText(result);
        }
    }


    private class CallAPIMeseros extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... params) {

            String resultToDisplay = "";

            InputStream in = null;

            // HTTP Get
            try {

                URL url = new URL("http://futures.j.facilcloud.com/Meerkat_0.0/resources/consultameseros/consultarmeseros/");

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
            TextView textoServicio1 = (TextView) findViewById(R.id.textoServicio);
            textoServicio1.setText(result);
        }
    }

    private class CallAPITotalVentas extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... params) {

            String resultToDisplay = "";

            InputStream in = null;

            // HTTP Get
            try {

                URL url = new URL("http://futures.j.facilcloud.com/Meerkat_0.0/resources/consultatotalventas/consultartotalventas/");

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
            TextView textoServicio1 = (TextView) findViewById(R.id.textoServicio);
            textoServicio1.setText(result);
        }
    }

    private class CallAPIGustoMusical extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... params) {

            String resultToDisplay = "";

            InputStream in = null;

            // HTTP Get
            try {

                URL url = new URL("http://futures.j.facilcloud.com/Meerkat_0.0/resources/consultagustomusical/consultargustomusical/");

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
            TextView textoServicio1 = (TextView) findViewById(R.id.textoServicio);
            textoServicio1.setText(result);
        }
    }

    private class CallAPIMejorMesero extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... params) {

            String resultToDisplay = "";

            InputStream in = null;

            // HTTP Get
            try {

                URL url = new URL ("http://futures.j.facilcloud.com/Meerkat_0.0/resources/consultamejormesero/consultarmejormesero/");

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
            TextView textoServicio1 = (TextView) findViewById(R.id.textoServicio);
            textoServicio1.setText(result);
        }
    }

    private class CallAPIConsultardespachador extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... params) {

            String resultToDisplay = "";

            InputStream in = null;

            // HTTP Get
            try {

                URL url = new URL("http://futures.j.facilcloud.com/Meerkat_0.0/resources/consultadespachador/consultardespachador/");

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
            TextView textoServicio1 = (TextView) findViewById(R.id.textoServicio);
            textoServicio1.setText(result);
        }
    }


    private class CallAPIClientes extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... params) {

            String resultToDisplay = "";

            InputStream in = null;

            // HTTP Get
            try {

                URL url = new URL("http://futures.j.facilcloud.com/Meerkat_0.0/resources/consultaclientes/consultarclientes/");

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
            TextView textoServicio1 = (TextView) findViewById(R.id.textoServicio);
            textoServicio1.setText(result);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
