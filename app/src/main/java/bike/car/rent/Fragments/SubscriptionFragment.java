package bike.car.rent.Fragments;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

import bike.car.rent.Activities.Bike;
import bike.car.rent.Activities.SignUp;
import bike.car.rent.Activities.SubscriptionActivity;
import bike.car.rent.R;

public class SubscriptionFragment extends Fragment {

    TextView start_date;
    Spinner start_time;
    EditText duration;
    Button search;
    String date;
    private DatePickerDialog.OnDateSetListener mDateSetListener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_subscription, container, false);

        ((AppCompatActivity) getActivity()).getSupportActionBar().show();

        start_date=root.findViewById(R.id.start_date);
        start_time=root.findViewById(R.id.start_time);
        duration=root.findViewById(R.id.duration);
        search=root.findViewById(R.id.search);

        start_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        getActivity(),
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mDateSetListener,
                        year, month, day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
        mDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month + 1;
                Log.d("TAG", "onDateSet: mm/dd/yyy: " + day + "/" + month + "/" + year);

                date = day + "-" + month + "-" + year;
                start_date.setText(date);

            }
        };

        ArrayAdapter<CharSequence> adapter1=ArrayAdapter.createFromResource(getActivity(), R.array.time, android.R.layout.simple_spinner_dropdown_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        start_time.setAdapter(adapter1);



        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(start_date.getText().toString()) || TextUtils.isEmpty(start_time.getSelectedItem().toString()) || TextUtils.isEmpty(duration.getText().toString())){
                    Toast.makeText(getActivity(),"Please enter all fields!",Toast.LENGTH_SHORT).show();

                }
                else {
                    startActivity(new Intent(getActivity(), SubscriptionActivity.class));
                }
            }
        });

        return root;
    }
}