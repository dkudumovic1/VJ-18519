package ba.unsa.etf.rma.vj_18519;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button button = (Button)findViewById(R.id.button);
    private TextView editText = findViewById(R.id.editText);
    private ListView listView = findViewById(R.id.listView);
    private ArrayList entries;
    private ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        entries = new ArrayList<String>();
        button = (Button)findViewById(R.id.button);
        editText = findViewById(R.id.editText);
        listView = findViewById(R.id.listView);
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, entries);

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
