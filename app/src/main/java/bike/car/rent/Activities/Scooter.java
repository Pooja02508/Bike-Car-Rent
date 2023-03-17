package bike.car.rent.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import bike.car.rent.Adapters.BikeAdapter;
import bike.car.rent.Models.BikeBook;
import bike.car.rent.R;

public class Scooter extends AppCompatActivity implements BikeAdapter.ItemClickListener{

    RecyclerView recyclerView;
    List<BikeBook> bikeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scooter);
        getSupportActionBar().hide();

        recyclerView = (RecyclerView) findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));


        //initializing the productlist
        bikeList = new ArrayList<>();


        bikeList.add(new BikeBook(1, "Activa","₹ 395.00/day",R.drawable.activa));
        bikeList.add(new BikeBook(2, "Activa 5G Deluxe","₹ 449.00/day",R.drawable.activa5g_delux));
        bikeList.add(new BikeBook(3, "Jupiter","₹ 499.00/day",R.drawable.jupiter));
        bikeList.add(new BikeBook(4, "Activa 6G","₹ 590.00/day",R.drawable.activa6g));
        bikeList.add(new BikeBook(5, "Activa 3G","₹ 599.00/day",R.drawable.activa3g));
        bikeList.add(new BikeBook(6, "Activa 4G","₹ 599.00/day",R.drawable.activa4g));
        bikeList.add(new BikeBook(7, "Activa 5G","₹ 600.00/day",R.drawable.activa5g));
        bikeList.add(new BikeBook(8, "Dio","₹ 599.00/day",R.drawable.dio));
        bikeList.add(new BikeBook(9, "Wego","₹ 599.00/day",R.drawable.wego));
        bikeList.add(new BikeBook(10, "Duet","₹ 599.00/day",R.drawable.duet));
        bikeList.add(new BikeBook(11, "Hero Pleasure Plus","₹ 336.00/day",R.drawable.hero_pleasure_plus));
        bikeList.add(new BikeBook(12, "Yamaha Fascino","₹ 456.00/day",R.drawable.yamaha_fascino));
        bikeList.add(new BikeBook(13, "Honda Dio (BS6)","₹ 480.00/day",R.drawable.honda_dio));
        bikeList.add(new BikeBook(14, "Hero Maestro","₹ 504.00/day",R.drawable.hero_maestro));
        bikeList.add(new BikeBook(15, "TVS Jupiter 125(BS6)","₹ 528.00/day",R.drawable.tvs_jupiter_125));
        bikeList.add(new BikeBook(16, "Honda Grazia 125","₹ 576.00/day",R.drawable.honda_grazia_125));
        bikeList.add(new BikeBook(17, "Suzuki Access 125 (BS6)","₹ 576.00/day",R.drawable.suzuki_access_125));
        bikeList.add(new BikeBook(18, "Suzuki Avenis 125","₹ 576.00/day",R.drawable.suzuki_avenis_125));
        bikeList.add(new BikeBook(19, "Aprilia SR 160 ABS (BS6)","₹ 600.00/day",R.drawable.aprilia_sr_160));
        bikeList.add(new BikeBook(20, "TVS Ntorq 125 (BS6)","₹ 612.00/day",R.drawable.tvs_ntorq_125_bs6));
        bikeList.add(new BikeBook(21, "Yamaha Aerox","₹ 624.00/day",R.drawable.yamaha_aerox));
        bikeList.add(new BikeBook(22, "Yamaha Ray ZR","₹ 631.00/day",R.drawable.yamaha_ray_zr));
        bikeList.add(new BikeBook(23, "TVS Ntorq 125","₹ 552.00/day",R.drawable.tvs_ntorq_125));
        bikeList.add(new BikeBook(24, "Ather 450","₹ 504.00/day",R.drawable.ather_450));
        bikeList.add(new BikeBook(25, "Honda Aviator","₹ 504.00/day",R.drawable.honda_aviator));
        bikeList.add(new BikeBook(26, "Aprilia SR 150 (ABS)","₹ 552.00/day",R.drawable.aprilia_sr_150));
        bikeList.add(new BikeBook(27, "Aprilia SR 125","₹ 504.00/day",R.drawable.aprilia_sr_125));
        bikeList.add(new BikeBook(28, "TVS XL Heavy Duty","₹ 264.00/day",R.drawable.tvs_xl_heavy_duty));

        //creating recyclerview adapter
        BikeAdapter adapter = new BikeAdapter(this, bikeList);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {

        Intent intent=new Intent(getApplicationContext(),BookRent.class);

        switch (position) {
            case 0:intent.putExtra("Charges","395");
                intent.putExtra("Bike Name","Activa");
                intent.putExtra("Bike Image", R.drawable.activa);
                break;
            case 1:intent.putExtra("Charges","449");
                intent.putExtra("Bike Name","Activa 5G Deluxe");
                intent.putExtra("Bike Image", R.drawable.activa5g_delux);
                break;
            case 2:intent.putExtra("Charges","499");
                intent.putExtra("Bike Name","Jupiter");
                intent.putExtra("Bike Image", R.drawable.jupiter);
                break;
            case 3:intent.putExtra("Charges","590");
                intent.putExtra("Bike Name","Activa 6G");
                intent.putExtra("Bike Image", R.drawable.activa6g);
                break;
            case 4:intent.putExtra("Charges","599");
                intent.putExtra("Bike Name","Activa 3G");
                intent.putExtra("Bike Image", R.drawable.activa3g);
                break;
            case 5:intent.putExtra("Charges","599");
                intent.putExtra("Bike Name","Activa 4G");
                intent.putExtra("Bike Image", R.drawable.activa4g);
                break;
            case 6:intent.putExtra("Charges","600");
                intent.putExtra("Bike Name","Activa 5G");
                intent.putExtra("Bike Image", R.drawable.activa5g);
                break;
            case 7:intent.putExtra("Charges","599");
                intent.putExtra("Bike Name","Dio");
                intent.putExtra("Bike Image", R.drawable.dio);
                break;
            case 8:intent.putExtra("Charges","599");
                intent.putExtra("Bike Name","Wego");
                intent.putExtra("Bike Image", R.drawable.wego);
                break;
            case 9:intent.putExtra("Charges","599");
                intent.putExtra("Bike Name","Duet");
                intent.putExtra("Bike Image", R.drawable.duet);
                break;
            case 10:intent.putExtra("Charges","336");
                intent.putExtra("Bike Name","Hero Pleasure Plus");
                intent.putExtra("Bike Image", R.drawable.hero_pleasure_plus);
                break;
            case 11:intent.putExtra("Charges","456");
                intent.putExtra("Bike Name","Yamaha Fascino");
                intent.putExtra("Bike Image", R.drawable.yamaha_fascino);
                break;
            case 12:intent.putExtra("Charges","480");
                intent.putExtra("Bike Name","Honda Dio (BS6)");
                intent.putExtra("Bike Image", R.drawable.honda_dio);
                break;
            case 13:intent.putExtra("Charges","504");
                intent.putExtra("Bike Name","Hero Maestro");
                intent.putExtra("Bike Image", R.drawable.hero_maestro);
                break;
            case 14:intent.putExtra("Charges","528");
                intent.putExtra("Bike Name","TVS Jupiter 125(BS6)");
                intent.putExtra("Bike Image", R.drawable.tvs_jupiter_125);
                break;
            case 15:intent.putExtra("Charges","576");
                intent.putExtra("Bike Name","Honda Grazia 125");
                intent.putExtra("Bike Image", R.drawable.honda_grazia_125);
                break;
            case 16:intent.putExtra("Charges","576");
                intent.putExtra("Bike Name","Suzuki Access 125 (BS6)");
                intent.putExtra("Bike Image", R.drawable.suzuki_access_125);
                break;
            case 17:intent.putExtra("Charges","576");
                intent.putExtra("Bike Name","Suzuki Avenis 125");
                intent.putExtra("Bike Image", R.drawable.suzuki_avenis_125);
                break;
            case 18:intent.putExtra("Charges","600");
                intent.putExtra("Bike Name","Aprilia SR 160 ABS (BS6)");
                intent.putExtra("Bike Image", R.drawable.aprilia_sr_160);
                break;
            case 19:intent.putExtra("Charges","612");
                intent.putExtra("Bike Name","TVS Ntorq 125 (BS6)");
                intent.putExtra("Bike Image", R.drawable.tvs_ntorq_125_bs6);
                break;
            case 20:intent.putExtra("Charges","624");
                intent.putExtra("Bike Name","Yamaha Aerox");
                intent.putExtra("Bike Image", R.drawable.yamaha_aerox);
                break;
            case 21:intent.putExtra("Charges","631");
                intent.putExtra("Bike Name","Yamaha Ray ZR");
                intent.putExtra("Bike Image", R.drawable.yamaha_ray_zr);
                break;
            case 22:intent.putExtra("Charges","552");
                intent.putExtra("Bike Name","TVS Ntorq 125");
                intent.putExtra("Bike Image", R.drawable.tvs_ntorq_125);
                break;

            case 23:intent.putExtra("Charges","504");
                intent.putExtra("Bike Name","Ather 450");
                intent.putExtra("Bike Image", R.drawable.ather_450);
                break;
            case 24:intent.putExtra("Charges","504");
                intent.putExtra("Bike Name","Honda Aviator");
                intent.putExtra("Bike Image", R.drawable.honda_aviator);
                break;
            case 25:intent.putExtra("Charges","552");
                intent.putExtra("Bike Name","Aprilia SR 150 (ABS)");
                intent.putExtra("Bike Image", R.drawable.aprilia_sr_150);
                break;
            case 26:intent.putExtra("Charges","504");
                intent.putExtra("Bike Name","Aprilia SR 125");
                intent.putExtra("Bike Image", R.drawable.aprilia_sr_125);
                break;
            case 27:intent.putExtra("Charges","264");
                intent.putExtra("Bike Name","TVS XL Heavy Duty");
                intent.putExtra("Bike Image", R.drawable.tvs_xl_heavy_duty);
                break;
        }
        startActivity(intent);
    }
}