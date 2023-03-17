package bike.car.rent.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import bike.car.rent.R;

public class ElectricCycle extends AppCompatActivity {

    Button city_basic,pro_city,fit_classic,fit_pro,commute_plus,commute_pro,cruise_plus,cruise_pro,wild_goose,light_cycle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electric_cycle);
        getSupportActionBar().hide();

        city_basic=findViewById(R.id.city_basic);
        pro_city=findViewById(R.id.pro_city);
        fit_classic=findViewById(R.id.fit_classic);
        fit_pro=findViewById(R.id.fit_pro);
        commute_plus=findViewById(R.id.commute_plus);
        commute_pro=findViewById(R.id.commute_pro);
        cruise_plus=findViewById(R.id.cruise_plus);
        cruise_pro=findViewById(R.id.cruise_pro);
        wild_goose=findViewById(R.id.wild_goose);
        light_cycle=findViewById(R.id.light_cycle);


        city_basic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),BookRent.class);
                intent.putExtra("Charges","199");
                intent.putExtra("Bike Name","City Basic");
                intent.putExtra("Bike Image", R.drawable.citycycle);
                startActivity(intent);
            }
        });
        pro_city.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),BookRent.class);
                intent.putExtra("Charges","299");
                intent.putExtra("Bike Name","Pro City");
                intent.putExtra("Bike Image", R.drawable.citycycle);
                startActivity(intent);
            }
        });


        fit_classic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),BookRent.class);
                intent.putExtra("Charges","999");
                intent.putExtra("Bike Name","Fit Classic");
                intent.putExtra("Bike Image", R.drawable.gymboi);
                startActivity(intent);
            }
        });
        fit_pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),BookRent.class);
                intent.putExtra("Charges","1299");
                intent.putExtra("Bike Name","Fit Pro");
                intent.putExtra("Bike Image", R.drawable.gymboi);
                startActivity(intent);
            }
        });


        commute_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),BookRent.class);
                intent.putExtra("Charges","3499");
                intent.putExtra("Bike Name","Commute Plus");
                intent.putExtra("Bike Image", R.drawable.commuter);
                startActivity(intent);
            }
        });
        commute_pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),BookRent.class);
                intent.putExtra("Charges","3999");
                intent.putExtra("Bike Name","Commute Pro");
                intent.putExtra("Bike Image", R.drawable.commuter);
                startActivity(intent);
            }
        });


        cruise_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),BookRent.class);
                intent.putExtra("Charges","599");
                intent.putExtra("Bike Name","Cruise Plus");
                intent.putExtra("Bike Image", R.drawable.cruise3);
                startActivity(intent);
            }
        });
        cruise_pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),BookRent.class);
                intent.putExtra("Charges","799");
                intent.putExtra("Bike Name","Cruise Pro");
                intent.putExtra("Bike Image", R.drawable.cruise3);
                startActivity(intent);
            }
        });


        wild_goose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),BookRent.class);
                intent.putExtra("Charges","399");
                intent.putExtra("Bike Name","Wild Goose");
                intent.putExtra("Bike Image", R.drawable.wildgoose);
                startActivity(intent);
            }
        });
        light_cycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),BookRent.class);
                intent.putExtra("Charges","99");
                intent.putExtra("Bike Name","Lightcycle");
                intent.putExtra("Bike Image", R.drawable.lightcycle);
                startActivity(intent);
            }
        });

    }
}