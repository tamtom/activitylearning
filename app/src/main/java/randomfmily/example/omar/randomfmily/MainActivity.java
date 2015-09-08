package randomfmily.example.omar.randomfmily;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends Activity {
 private Button add ;
    private EditText num1 ;
    private EditText num2 ;


 @Override
    public void onCreate(Bundle SavedInstanceState){
    super.onCreate(SavedInstanceState);
    setContentView(R.layout.activity_main);
     add = (Button) findViewById(R.id.button);
     num1 = (EditText)findViewById(R.id.editText);
     num2 = (EditText)findViewById(R.id.editText2);
     add.setOnClickListener(new View.OnClickListener(){

         @Override
         public void onClick(View v) {
             int one = Integer.parseInt(num1.getText().toString());
             int two = Integer.parseInt(num2.getText().toString());
             int res = one + two;
             Intent inte = new Intent(MainActivity.this,Seconed.class);
             inte.putExtra("resutl",res);
             startActivity(inte);

         }
     });
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
}
