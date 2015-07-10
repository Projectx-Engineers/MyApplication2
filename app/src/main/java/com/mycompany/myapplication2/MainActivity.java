package com.mycompany.myapplication2;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText t = (EditText) findViewById(R.id.editText);
        Button b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new OnSubmitListener(t,(TextView)findViewById(R.id.textView2), new RestCaller() ));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
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


    public class RestCaller extends AsyncTask<Void, Void, JsonBean> {

        @Override
        protected JsonBean doInBackground(Void... params) {
            /*final String url = "https://api.parse.com/1/apps";
            RestTemplate restTemplate = new RestTemplate();
            restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
            HttpHeaders headers = new HttpHeaders();
            headers.add("X-Parse-Email","y.h.n.satish@gmail.com");
            headers.add("X-Parse-Password","Welcome1");
            headers.add("Content-Type", "application/json");
            ResponseEntity<JsonResults> greeting = restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<byte[]>(headers), JsonResults.class);
            System.out.println(greeting.toString());
            return greeting.getBody().getResults().get(0);*/
            return null;
        }

        @Override
        protected void onPostExecute(JsonBean o) {
            ((TextView)findViewById(R.id.textView2)).setText(o.getAppName() + "--" + o.getMasterKey());
        }
    }

}
