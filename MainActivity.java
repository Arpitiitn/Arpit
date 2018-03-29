package nareshit.actvtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AutoCompleteTextView actv=findViewById(R.id.actv);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_single_choice,getResources().getStringArray(R.array.countries));
        actv.setAdapter(adapter);
        actv.setThreshold(1);
    }
}
