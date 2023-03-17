package bike.car.rent.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import bike.car.rent.Adapters.BikeAdapter;
import bike.car.rent.Adapters.CarAdapter;
import bike.car.rent.Models.CarBook;
import bike.car.rent.R;

public class Car extends AppCompatActivity implements BikeAdapter.ItemClickListener{

   RecyclerView recyclerView;
    List<CarBook> carList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);
        getSupportActionBar().hide();

        recyclerView = (RecyclerView) findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        //initializing the productlist
        carList = new ArrayList<>();


        carList.add(new CarBook(1, "Maruti Brezza AT", "Automatic","Disel","5 Seats",
                        "₹ 2880","₹ 3408","₹ 4080","Extra km charge @ ₹ 13/km",R.drawable.maruti_brezza_at));

        carList.add(new CarBook(2, "Maruti Swift", "Manual","Disel","5 Seats",
                        "₹ 2232","₹ 2640","₹ 3168","Extra km charge @ ₹ 9/km",R.drawable.maruti_swift));

        carList.add(new CarBook(3, "Hyundai Santro MT", "Manual","Petrol","5 Seats",
                        "₹ 1752","₹ 2064","₹ 2472","Extra km charge @ ₹ 8/km",R.drawable.hyundai_santro));

        carList.add(new CarBook(4, "Hyundai Elite i20", "Manual","Disel","5 Seats",
                        "₹ 2208","₹ 2616","₹ 3144","Extra km charge @ ₹ 11/km",R.drawable.hyndai_elite_i20));

        carList.add(new CarBook(5, "Maruti Swift Dzire", "Manual","Disel","5 Seats",
                        "₹ 2424","₹ 2856","₹ 3432","Extra km charge @ ₹ 11/km",R.drawable.maruti_swift_dezire));

        carList.add(new CarBook(6, "Mahindra XUV", "Manual","Disel","7 Seats",
                        "₹ 4128","₹ 4872","₹ 5856","Extra km charge @ ₹ 14/km",R.drawable.mahindra_xuv));

        carList.add(new CarBook(7, "Hyundai Santro AT", "Automatic","Petrol","5 Seats",
                        "₹ 2088","₹ 2472","₹ 2976","Extra km charge @ ₹ 8/km",R.drawable.hyundai_santro_at));

        carList.add(new CarBook(8, "Maruti Ertiga", "Manual","Disel","7 Seats",
                        "₹ 3048","₹ 3600","₹ 4320","Extra km charge @ ₹ 14/km",R.drawable.maruti_ertiga));

        carList.add(new CarBook(9, "Toyota Innova Crysta", "Manual","Disel","7 Seats",
                        "₹ 4152","₹ 4896","₹ 5880","Extra km charge @ ₹ 15/km",R.drawable.toyota_innova));

        carList.add(new CarBook(10, "Maruti Swift AT", "Automatic","Petrol","5 Seats",
                        "₹ 2088","₹ 2472","₹ 2976","Extra km charge @ ₹ 9/km",R.drawable.maruti_swift_at));

        carList.add(new CarBook(11, "Hyundai Creta", "Manual","Disel","5 Seats",
                        "₹ 3480","₹ 4104","₹ 4920","Extra km charge @ ₹ 14/km",R.drawable.hyundai_creta));

        carList.add(new CarBook(12, "Maruti Alto K10", "Manual","Petrol","5 Seats",
                        "₹ 1968","₹ 2328","₹ 2784","Extra km charge @ ₹ 7/km",R.drawable.maruti_alto));

        carList.add(new CarBook(13, "Maruti Ciaz AT", "Automatic","Petrol","5 Seats",
                        "₹ 2640","₹ 3120","₹ 3744","Extra km charge @ ₹ 12/km",R.drawable.honda_city_at));

        carList.add(new CarBook(14, "Maruti Ciaz", "Manual","Disel","5 Seats",
                        "₹ 2568","₹ 3024","₹ 3624","Extra km charge @ ₹ 12/km",R.drawable.maruti_ciaz));

        carList.add(new CarBook(15, "Hyundai Creta AT", "Automatic","Disel","5 Seats",
                        "₹ 2232","₹ 2640","₹ 3168","Extra km charge @ ₹ 14/km",R.drawable.hyundai_creta_at));

        carList.add(new CarBook(16, "Hyundai Venue AT", "Automatic","Petrol","5 Seats",
                        "₹ 2640","₹ 3120","₹ 3744","Extra km charge @ ₹ 13/km",R.drawable.hyundai_venue_at));

        carList.add(new CarBook(17, "Maruti Brezza", "Manual","Disel","5 Seats",
                        "₹ 2352","₹ 2784","₹ 3336","Extra km charge @ ₹ 13/km",R.drawable.maruti_brezza));

        carList.add(new CarBook(18, "Mahindra XUV300", "Manual","Disel","5 Seats",
                        "₹ 2496","₹ 2952","₹ 3552","Extra km charge @ ₹ 13/km",R.drawable.mahindra_xuv300));

        carList.add(new CarBook(19, "Hyundai Verna AT", "Automatic","Petrol","5 Seats",
                        "₹ 2856","₹ 3360","₹ 4032","Extra km charge @ ₹ 12/km",R.drawable.hyundai_verna));

        carList.add(new CarBook(20, "Mahindra Scorpio", "Manual","Disel","7 Seats",
                        "₹ 3048","₹ 3600","₹ 4320","Extra km charge @ ₹ 14/km",R.drawable.mahindra_scorpio));

        carList.add(new CarBook(21, "Hyundai Elite i20 AT", "Automatic","Petrol","5 Seats",
                        "₹ 2496","₹ 2952","₹ 3552","Extra km charge @ ₹ 11/km",R.drawable.hyundai_elite_i20_at));

        carList.add(new CarBook(22, "Honda City", "Manual","Disel","5 Seats",
                        "₹ 2208","₹ 2616","₹ 3144","Extra km charge @ ₹ 12/km",R.drawable.honda_city));

        carList.add(new CarBook(23, "Maruti Baleno", "Manual","Disel","5 Seats",
                        "₹ 2568","₹ 3024","₹ 3624","Extra km charge @ ₹ 11/km",R.drawable.maruti_baleno));

        carList.add(new CarBook(24, "Maruti Baleno AT", "Automatic","Petrol","5 Seats",
                        "₹ 2736","₹ 2340","₹ 3888","Extra km charge @ ₹ 11/km",R.drawable.maruti_baleno_at));

        carList.add(new CarBook(25, "Hyundai Grand i10", "Manual","Disel","5 Seats",
                        "₹ 2088","₹ 2472","₹ 2976","Extra km charge @ ₹ 9/km",R.drawable.hyundai_grand_i10));

        carList.add(new CarBook(26, "Mahindra XUV300 (P)", "Manual","Petrol","5 Seats",
                        "₹ 1968","₹ 2328","₹ 2784","Extra km charge @ ₹ 13/km",R.drawable.mahindra_xuv300));

        carList.add(new CarBook(27, "Honda Amaze (P)", "Manual","Petrol","5 Seats",
                        "₹ 1800","₹ 2136","₹ 2568","Extra km charge @ ₹ 11/km",R.drawable.honda_amaze));

        carList.add(new CarBook(28, "Honda City AT", "Automatic","Petrol","5 Seats",
                        "₹ 2640","₹ 3120","₹ 3744","Extra km charge @ ₹ 12/km",R.drawable.honda_city_at));



        CarAdapter adapter = new CarAdapter(this, carList);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }
    @Override
    public void onItemClick(View view, int position) {

        Intent intent=new Intent(getApplicationContext(),BookRent.class);

        switch (position) {
            case 0:intent.putExtra("Charges","2880");
                intent.putExtra("Bike Name","Maruti Brezza AT");
                intent.putExtra("Bike Image", R.drawable.maruti_brezza_at);
                break;
            case 1:intent.putExtra("Charges","2232");
                intent.putExtra("Bike Name","Maruti Swift");
                intent.putExtra("Bike Image", R.drawable.maruti_swift);
                break;
            case 2:intent.putExtra("Charges","1752");
                intent.putExtra("Bike Name","Hyundai Santro MT");
                intent.putExtra("Bike Image", R.drawable.hyundai_santro);
                break;
            case 3:intent.putExtra("Charges","2208");
                intent.putExtra("Bike Name","Hyundai Elite i20");
                intent.putExtra("Bike Image", R.drawable.hyndai_elite_i20);
                break;
            case 4:intent.putExtra("Charges","2424");
                intent.putExtra("Bike Name","Maruti Swift Dzire");
                intent.putExtra("Bike Image", R.drawable.maruti_swift_dezire);
                break;
            case 5:intent.putExtra("Charges","4128");
                intent.putExtra("Bike Name","Mahindra XUV");
                intent.putExtra("Bike Image", R.drawable.mahindra_xuv);
                break;
            case 6:intent.putExtra("Charges","2088");
                intent.putExtra("Bike Name","Hyundai Santro AT");
                intent.putExtra("Bike Image", R.drawable.hyundai_santro_at);
                break;
            case 7:intent.putExtra("Charges","3048");
                intent.putExtra("Bike Name","Maruti Ertiga");
                intent.putExtra("Bike Image", R.drawable.maruti_ertiga);
                break;
            case 8:intent.putExtra("Charges","4152");
                intent.putExtra("Bike Name","Toyota Innova Crysta");
                intent.putExtra("Bike Image", R.drawable.toyota_innova);
                break;
            case 9:intent.putExtra("Charges","2088");
                intent.putExtra("Bike Name","Maruti Swift AT");
                intent.putExtra("Bike Image", R.drawable.maruti_swift_at);
                break;
            case 10:intent.putExtra("Charges","3480");
                intent.putExtra("Bike Name","Hyundai Creta");
                intent.putExtra("Bike Image", R.drawable.hyundai_creta);
                break;
            case 11:intent.putExtra("Charges","1968");
                intent.putExtra("Bike Name","Maruti Alto K10");
                intent.putExtra("Bike Image", R.drawable.maruti_alto);
                break;
            case 12:intent.putExtra("Charges","2640");
                intent.putExtra("Bike Name","Maruti Ciaz AT");
                intent.putExtra("Bike Image", R.drawable.maruti_ciaz_at);
                break;
            case 13:intent.putExtra("Charges","2568");
                intent.putExtra("Bike Name","Maruti Ciaz");
                intent.putExtra("Bike Image", R.drawable.maruti_ciaz);
                break;
            case 14:intent.putExtra("Charges","2232");
                intent.putExtra("Bike Name","Hyundai Creta AT");
                intent.putExtra("Bike Image", R.drawable.hyundai_creta_at);
                break;
            case 15:intent.putExtra("Charges","2640");
                intent.putExtra("Bike Name","Hyundai Venue AT");
                intent.putExtra("Bike Image", R.drawable.hyundai_venue_at);
                break;
            case 16:intent.putExtra("Charges","2352");
                intent.putExtra("Bike Name","Maruti Brezza");
                intent.putExtra("Bike Image", R.drawable.maruti_brezza);
                break;
            case 17:intent.putExtra("Charges","2496");
                intent.putExtra("Bike Name","Mahindra XUV300");
                intent.putExtra("Bike Image", R.drawable.mahindra_xuv300);
                break;
            case 18:intent.putExtra("Charges","2856");
                intent.putExtra("Bike Name","Hyundai Verna AT");
                intent.putExtra("Bike Image", R.drawable.hyundai_verna);
                break;
            case 19:intent.putExtra("Charges","3048");
                intent.putExtra("Bike Name","Mahindra Scorpio");
                intent.putExtra("Bike Image", R.drawable.mahindra_scorpio);
                break;
            case 20:intent.putExtra("Charges","2496");
                intent.putExtra("Bike Name","Hyundai Elite i20 AT");
                intent.putExtra("Bike Image", R.drawable.hyundai_elite_i20_at);
                break;
            case 21:intent.putExtra("Charges","2208");
                intent.putExtra("Bike Name","Honda City");
                intent.putExtra("Bike Image", R.drawable.honda_city);
                break;
            case 22:intent.putExtra("Charges","2568");
                intent.putExtra("Bike Name","Maruti Baleno");
                intent.putExtra("Bike Image", R.drawable.maruti_baleno);
                break;
            case 23:intent.putExtra("Charges","2736");
                intent.putExtra("Bike Name","Maruti Baleno AT");
                intent.putExtra("Bike Image", R.drawable.maruti_baleno_at);
                break;
            case 24:intent.putExtra("Charges","2088");
                intent.putExtra("Bike Name","Hyundai Grand i10");
                intent.putExtra("Bike Image", R.drawable.hyundai_grand_i10);
                break;
            case 25:intent.putExtra("Charges","1968");
                intent.putExtra("Bike Name","Mahindra XUV300 (P)");
                intent.putExtra("Bike Image", R.drawable.mahindra_xuv300);
                break;
            case 26:intent.putExtra("Charges","1800");
                intent.putExtra("Bike Name","Honda Amaze (P)");
                intent.putExtra("Bike Image", R.drawable.honda_amaze);
                break;
            case 27:intent.putExtra("Charges","2640");
                intent.putExtra("Bike Name","Honda City AT");
                intent.putExtra("Bike Image", R.drawable.honda_city_at);
                break;

        }
        startActivity(intent);
    }
}