package bike.car.rent.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import bike.car.rent.R;

public class BookNowActivity extends AppCompatActivity {

    CardView cycle,scooter,bike,car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_now);
        getSupportActionBar().hide();

        cycle=findViewById(R.id.cycle);
        scooter=findViewById(R.id.scooter);
        bike=findViewById(R.id.bike);
        car=findViewById(R.id.car);


        cycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ElectricCycle.class));
            }
        });
        scooter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Scooter.class));
            }
        });
        bike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Bike.class));
            }
        });
        car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Car.class));
            }
        });
    }
}