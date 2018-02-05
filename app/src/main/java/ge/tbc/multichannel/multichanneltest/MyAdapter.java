package ge.tbc.multichannel.multichanneltest;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jay on 05.02.18.
 */

public class MyAdapter extends BaseAdapter {
    private ArrayList<String> myData;
    private Context context;


    public MyAdapter(ArrayList<String> myData, Context context) {
        this.myData = myData;
        this.context = context;
    }

    @Override
    public int getCount() {
        return myData.size();
    }

    @Override
    public Object getItem(int position) {
        return myData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        View root;
        if (convertView != null) {
            root = convertView;
        } else {
            root = View.inflate(context, R.layout.list_item_layout, null);
        }

        TextView labelView = root.findViewById(R.id.labelName);

        String itemName = myData.get(position);

        labelView.setText(itemName);


        return root;
    }
}
