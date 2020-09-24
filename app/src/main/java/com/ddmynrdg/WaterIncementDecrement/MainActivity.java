package com.ddmynrdg.WaterIncementDecrement;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    int waterNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WaterListData[] waterListData = new WaterListData[] {
                new WaterListData("Eriklİ", R.mipmap.erikli),
                new WaterListData("Nestle",  R.mipmap.nestle),
/*                new MyListData("Email", android.R.drawable.presence_away),
                new MyListData("Info", android.R.drawable.ic_dialog_info),
                new MyListData("Delete", android.R.drawable.ic_delete),
                new MyListData("Dialer", android.R.drawable.ic_dialog_dialer),
                new MyListData("Alert", android.R.drawable.ic_dialog_alert),
                new MyListData("Map", android.R.drawable.ic_dialog_map),
                new MyListData("Email", android.R.drawable.ic_dialog_email),
                new MyListData("Info", android.R.drawable.ic_dialog_info),
                new MyListData("Delete", android.R.drawable.ic_delete),
                new MyListData("Dialer", android.R.drawable.ic_dialog_dialer),
                new MyListData("Alert", android.R.drawable.ic_dialog_alert),
                new MyListData("Map", android.R.drawable.ic_dialog_map),*/
        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        WaterListAdapter adapter = new WaterListAdapter(waterListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }

    public void Decrement(View view) {
        RelativeLayout parentRow = (RelativeLayout) view.getParent();
        TextView quantityView = (TextView) parentRow.findViewById(R.id.water_number);
        String quantityString = quantityView.getText().toString();
        waterNumber = Integer.parseInt(quantityString);
        waterNumber -= 1;
        quantityView.setText(String.valueOf(waterNumber));
    }
    public void Increment(View view) {
        RelativeLayout parentRow = (RelativeLayout) view.getParent();

        TextView quantityView = (TextView) parentRow.findViewById(R.id.water_number);
        String quantityString = quantityView.getText().toString();
        waterNumber = Integer.parseInt(quantityString);
        waterNumber += 1;
        quantityView.setText(String.valueOf(waterNumber));
    }
}