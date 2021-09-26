package rob.myappcompany.wearlistview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import rob.myappcompany.wearlistview.databinding.ActivityMainBinding;

public class MainActivity extends Activity {


    private ActivityMainBinding binding;

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        listView = findViewById(R.id.listView);
        String[] friends = {"Joe", "Ralph", "Sara", "Jane","Joe", "Ralph", "Sara", "Jane","Joe", "Ralph", "Sara", "Jane"};

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, friends);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, friends[position], Toast.LENGTH_SHORT).show();
            }
        });

    }
}