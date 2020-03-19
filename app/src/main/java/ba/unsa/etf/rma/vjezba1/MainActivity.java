package ba.unsa.etf.rma.vjezba1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText editText;
    private ListView listView;
    private ArrayList entries;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
        listView = findViewById(R.id.listView);

        entries = new ArrayList<String>();

        adapter = new ArrayAdapter<String>(this,R.layout.list_element,
                R.id.itemName,entries);

        listView.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                entries.add(0,editText.getText().toString());
                adapter.notifyDataSetChanged();
                editText.setText("");
            }
        });





    }
}
