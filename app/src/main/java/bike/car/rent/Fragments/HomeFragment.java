package bike.car.rent.Fragments;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
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
import bike.car.rent.Activities.BookNowActivity;
import bike.car.rent.Activities.Car;
import bike.car.rent.Activities.ElectricCycle;
import bike.car.rent.Activities.Scooter;
import bike.car.rent.R;

public class HomeFragment extends Fragment {


    TextView pickup_date,drop_date;
    Spinner pickup_time,drop_time;
    Button search;
    String date,date2;
    private DatePickerDialog.OnDateSetListener mDateSetListener1,mDateSetListener2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_home, container, false);
        ((AppCompatActivity) getActivity()).getSupportActionBar().show();

        pickup_date=root.findViewById(R.id.pickup_date);
        pickup_time=root.findViewById(R.id.pickup_time);
        drop_date=root.findViewById(R.id.drop_date);
        drop_time=root.findViewById(R.id.drop_time);
        search=root.findViewById(R.id.search);




        pickup_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        getActivity(),
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mDateSetListener1,
                        year, month, day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
        mDateSetListener1 = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month + 1;
                Log.d("TAG", "onDateSet: mm/dd/yyy: " + day + "/" + month + "/" + year);

                date = day + "-" + month + "-" + year;
                pickup_date.setText(date);

            }
        };



        drop_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        getActivity(),
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mDateSetListener2,
                        year, month, day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
        mDateSetListener2 = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month + 1;
                Log.d("TAG", "onDateSet: mm/dd/yyy: " + day + "/" + month + "/" + year);

                date2 = day + "-" + month + "-" + year;
                drop_date.setText(date2);

            }
        };


        ArrayAdapter<CharSequence> adapter1=ArrayAdapter.createFromResource(getActivity(), R.array.time, android.R.layout.simple_spinner_dropdown_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        pickup_time.setAdapter(adapter1);
        ArrayAdapter<CharSequence> adapter2=ArrayAdapter.createFromResource(getActivity(), R.array.time, android.R.layout.simple_spinner_dropdown_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        drop_time.setAdapter(adapter2);



        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(pickup_date.getText().toString()) || TextUtils.isEmpty(pickup_time.getSelectedItem().toString()) ||
                        TextUtils.isEmpty(drop_date.getText().toString()) ||TextUtils.isEmpty(drop_time.getSelectedItem().toString())){
                    Toast.makeText(getActivity(),"Please enter all fields!",Toast.LENGTH_SHORT).show();

                }
                else {
                    startActivity(new Intent(getActivity(), BookNowActivity.class));
                }
            }
        });


        return root;




    }
}