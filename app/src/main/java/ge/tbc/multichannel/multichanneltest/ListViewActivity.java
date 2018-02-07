package ge.tbc.multichannel.multichanneltest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ArrayList<String> data = getData();

        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i));
        }


        ListView listView = findViewById(R.id.listView);
        MyAdapter adapter = new MyAdapter(data, this);

        System.out.println();

        System.out.println("OE OE");

        listView.setAdapter(adapter);

    }

    private ArrayList<String> getData(){
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < 20; i++){
            list.add("List Item " + i);
        }

        return list;
    }
}
