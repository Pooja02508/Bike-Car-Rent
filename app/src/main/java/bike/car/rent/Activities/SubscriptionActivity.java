package bike.car.rent.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import bike.car.rent.Adapters.BikeAdapter;
import bike.car.rent.Adapters.CarAdapter;
import bike.car.rent.Adapters.SubscriptionAdapter;
import bike.car.rent.Models.Booking;
import bike.car.rent.Models.CarBook;
import bike.car.rent.R;

public class SubscriptionActivity extends AppCompatActivity implements BikeAdapter.ItemClickListener{

    RecyclerView recyclerView;
    List<Booking> bikeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscription);
        getSupportActionBar().hide();

        recyclerView = (RecyclerView) findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        //initializing the productlist
        bikeList = new ArrayList<>();

        bikeList.add(new Booking(1, "Honda Activa 5G", "₹ 3312/month",R.drawable.s1));
        bikeList.add(new Booking(2, "Honda Dio (BS6)", "₹ 4400/month",R.drawable.s2));
        bikeList.add(new Booking(3, "Honda CB Hornet 160", "₹ 4637/month",R.drawable.s3));
        bikeList.add(new Booking(4, "Honda Activa 6G", "₹ 6600/month",R.drawable.s4));
        bikeList.add(new Booking(5, "Honda Activa 4G", "₹ 3165/month",R.drawable.s5));
        bikeList.add(new Booking(6, "Honda Aviator", "₹ 3312/month",R.drawable.s6));
        bikeList.add(new Booking(7, "Honda Dio", "₹ 3312/month",R.drawable.s7));
        bikeList.add(new Booking(8, "Hero Pleasure Plus", "₹ 3499/month",R.drawable.s8));
        bikeList.add(new Booking(9, "Bajaj Pulsar 150 Neon", "₹ 4467/month",R.drawable.s9));
        bikeList.add(new Booking(10, "Honda X Blade", "₹ 4637/month",R.drawable.s10));
        bikeList.add(new Booking(11, "TVS Ntorq 125", "₹ 4717/month",R.drawable.s11));
        bikeList.add(new Booking(12, "Aprilia SR 150 (ABS)", "₹ 5195/month",R.drawable.s12));
        bikeList.add(new Booking(13, "Ather 450X", "₹ 7088/month",R.drawable.s13));
        bikeList.add(new Booking(14, "TVS XL Heavy Duty", "₹ 2583/month",R.drawable.s14));
        bikeList.add(new Booking(15, "Yamaha Fascino", "₹ 3312/month",R.drawable.s15));
        bikeList.add(new Booking(16, "Aprilia SR 125", "₹ 4080/month",R.drawable.s16));
        bikeList.add(new Booking(17, "Honda Grazia 125", "₹ 4225/month",R.drawable.s17));
        bikeList.add(new Booking(18, "Ather 450", "₹ 6528/month",R.drawable.s18));
        bikeList.add(new Booking(19, "Yamaha FZ V3", "₹ 6528/month",R.drawable.s19));
        bikeList.add(new Booking(20, "Bajaj Avenger Cruise 220 (BS6)", "₹ 6528/month",R.drawable.s20));
        bikeList.add(new Booking(21, "Yamaha FZ V3 (BS6)", "₹ 6528/month",R.drawable.s21));


        SubscriptionAdapter adapter = new SubscriptionAdapter(this, bikeList);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }
    @Override
    public void onItemClick(View view, int position) {

        Intent intent=new Intent(getApplicationContext(),BookRent.class);

        switch (position) {
            case 0:intent.putExtra("Charges","3312");
                intent.putExtra("Bike Name","Honda Activa 5G");
                intent.putExtra("Bike Image", R.drawable.s1);
                break;
            case 1:intent.putExtra("Charges","4400");
                intent.putExtra("Bike Name","Honda Dio (BS6)");
                intent.putExtra("Bike Image", R.drawable.s2);
                break;
            case 2:intent.putExtra("Charges","4637");
                intent.putExtra("Bike Name","Honda CB Hornet 160");
                intent.putExtra("Bike Image", R.drawable.s3);
                break;
            case 3:intent.putExtra("Charges","6600");
                intent.putExtra("Bike Name","Honda Activa 6G");
                intent.putExtra("Bike Image", R.drawable.s4);
                break;
            case 4:intent.putExtra("Charges","3165");
                intent.putExtra("Bike Name","Honda Activa 4G");
                intent.putExtra("Bike Image", R.drawable.s5);
                break;
            case 5:intent.putExtra("Charges","3312");
                intent.putExtra("Bike Name","Honda Aviator");
                intent.putExtra("Bike Image", R.drawable.s6);
                break;
            case 6:intent.putExtra("Charges","3312");
                intent.putExtra("Bike Name","Honda Dio");
                intent.putExtra("Bike Image", R.drawable.s7);
                break;
            case 7:intent.putExtra("Charges","3499");
                intent.putExtra("Bike Name","Hero Pleasure Plus");
                intent.putExtra("Bike Image", R.drawable.s8);
                break;
            case 8:intent.putExtra("Charges","4467");
                intent.putExtra("Bike Name","Bajaj Pulsar 150 Neon");
                intent.putExtra("Bike Image", R.drawable.s9);
                break;
            case 9:intent.putExtra("Charges","4637");
                intent.putExtra("Bike Name","Honda X Blade");
                intent.putExtra("Bike Image", R.drawable.s10);
                break;
            case 10:intent.putExtra("Charges","4717");
                intent.putExtra("Bike Name","TVS Ntorq 125");
                intent.putExtra("Bike Image", R.drawable.s11);
                break;
            case 11:intent.putExtra("Charges","5195");
                intent.putExtra("Bike Name","Aprilia SR 150 (ABS)");
                intent.putExtra("Bike Image", R.drawable.s12);
                break;
            case 12:intent.putExtra("Charges","7088");
                intent.putExtra("Bike Name","Ather 450X");
                intent.putExtra("Bike Image", R.drawable.s13);
                break;
            case 13:intent.putExtra("Charges","2583");
                intent.putExtra("Bike Name","TVS XL Heavy Duty");
                intent.putExtra("Bike Image", R.drawable.s14);
                break;
            case 14:intent.putExtra("Charges","3312");
                intent.putExtra("Bike Name","Yamaha Fascino");
                intent.putExtra("Bike Image", R.drawable.s15);
                break;
            case 15:intent.putExtra("Charges","4080");
                intent.putExtra("Bike Name","Aprilia SR 125");
                intent.putExtra("Bike Image", R.drawable.s16);
                break;
            case 16:intent.putExtra("Charges","4225");
                intent.putExtra("Bike Name","Honda Grazia 125");
                intent.putExtra("Bike Image", R.drawable.s17);
                break;
            case 17:intent.putExtra("Charges","6528");
                intent.putExtra("Bike Name","Ather 6528");
                intent.putExtra("Bike Image", R.drawable.s18);
                break;
            case 18:intent.putExtra("Charges","6528");
                intent.putExtra("Bike Name","Yamaha FZ V3");
                intent.putExtra("Bike Image", R.drawable.s19);
                break;
            case 19:intent.putExtra("Charges","6528");
                intent.putExtra("Bike Name","Bajaj Avenger Cruise 220 (BS6)");
                intent.putExtra("Bike Image", R.drawable.s20);
                break;
            case 20:intent.putExtra("Charges","6528");
                intent.putExtra("Bike Name","Yamaha FZ V3 (BS6)");
                intent.putExtra("Bike Image", R.drawable.s21);
                break;




        }
        startActivity(intent);
    }
}