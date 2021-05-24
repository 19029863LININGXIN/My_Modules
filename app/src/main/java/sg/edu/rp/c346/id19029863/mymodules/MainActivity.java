package sg.edu.rp.c346.id19029863.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView C322;
    TextView C382;
    TextView C346;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        C322 = findViewById(R.id.C322);
        C346 = findViewById(R.id.C346);
        C382 = findViewById(R.id.C382);

        C346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module Code", "C346");
                intent.putExtra("Module Name", "Mobile App Development");
                intent.putExtra("Academic Year", 2021);
                intent.putExtra("Semester", 1);
                intent.putExtra("Module Credit", 4);
                intent.putExtra("Venue", "E62E");
                startActivity(intent);
            }
        });


        C382.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module Code", "C382");
                intent.putExtra("Module Name", "IT Service Delivery");
                intent.putExtra("Academic Year", 2021);
                intent.putExtra("Semester", 1);
                intent.putExtra("Module Credit", 4);
                intent.putExtra("Venue", "E62G");
                startActivity(intent);
            }
        });

        C322.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module Code", "C322");
                intent.putExtra("Module Name", "Data Centre and Cloud Management");
                intent.putExtra("Academic Year", 2021);
                intent.putExtra("Semester", 1);
                intent.putExtra("Module Credit", 4);
                intent.putExtra("Venue", "E61G");
                startActivity(intent);
            }
        });

    }
}