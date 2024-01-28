package com.example.gender;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import com.example.gender.R;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout layout;
    private CheckBox genderCheckbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.parentLayout); // Corrected reference
        genderCheckbox = findViewById(R.id.genderCheckbox);
    }

    public void onGenderCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        if (checked) {
            layout.setBackgroundColor(getResources().getColor(R.color.male_background));
        } else {
            layout.setBackgroundColor(getResources().getColor(R.color.female_background));
        }
    }
}
