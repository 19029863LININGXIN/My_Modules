package sg.edu.rp.c346.id19029863.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
    TextView moduleCode;
    TextView moduleName;
    TextView academicYear;
    TextView semester;
    TextView moduleCredit;
    TextView Venue;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);
        moduleCode = findViewById(R.id.ModuleCode);
        moduleName = findViewById(R.id.ModuleName);
        academicYear = findViewById(R.id.AcademicYear);
        semester = findViewById(R.id.Semester);
        moduleCredit = findViewById(R.id.ModuleCredit);
        Venue = findViewById(R.id.Venue);
        back = findViewById(R.id.Back);

        Intent intentReceived = getIntent();
        String questionsSelected1 = intentReceived.getStringExtra("Module Code");
        String questionsSelected2 = intentReceived.getStringExtra("Module Name");
        int questionsSelected3 = intentReceived.getIntExtra("Academic Year", 2021);
        int questionsSelected4 = intentReceived.getIntExtra("Semester", 1);
        int questionsSelected5 = intentReceived.getIntExtra("Module Credit", 4);
        String questionsSelected6 = intentReceived.getStringExtra("Venue");

        if (questionsSelected1.equalsIgnoreCase("C346") ) {
            moduleCode.setText("Module Code : " + questionsSelected1 );
            moduleName.setText("Module Name : " + questionsSelected2);
            academicYear.setText("Academic Year : " + questionsSelected3);
            semester.setText("Semester : " + questionsSelected4);
            moduleCredit.setText("Module Credit : " + questionsSelected5);
            Venue.setText("Venue  : " + questionsSelected6);
        } else if (questionsSelected1.equalsIgnoreCase("C322")) {
            moduleCode.setText("Module Code : " + questionsSelected1 );
            moduleName.setText("Module Name : " + questionsSelected2);
            academicYear.setText("Academic Year : " + questionsSelected3);
            semester.setText("Semester : " + questionsSelected4);
            moduleCredit.setText("Module Credit : " + questionsSelected5);
            Venue.setText("Venue  : " + questionsSelected6);
        } else if (questionsSelected1.equalsIgnoreCase("C382")){
            moduleCode.setText("Module Code : " + questionsSelected1 );
            moduleName.setText("Module Name : " + questionsSelected2);
            academicYear.setText("Academic Year : " + questionsSelected3);
            semester.setText("Semester : " + questionsSelected4);
            moduleCredit.setText("Module Credit : " + questionsSelected5);
            Venue.setText("Venue  : " + questionsSelected6);
        }

        back.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

    }
}