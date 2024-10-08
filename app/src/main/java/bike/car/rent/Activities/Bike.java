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

public class Bike extends AppCompatActivity implements BikeAdapter.ItemClickListener{

    RecyclerView recyclerView;
    List<BikeBook> bikeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bike);
        getSupportActionBar().hide();

        recyclerView =findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));


        //initializing the productlist
        bikeList = new ArrayList<>();

        bikeList.add(new BikeBook(1, "Shine","₹ 700.00/day",R.drawable.shine));
        bikeList.add(new BikeBook(2, "FZ16","₹ 800.00/day",R.drawable.fz16));
        bikeList.add(new BikeBook(3, "R15 V3","₹ 1190.00/day",R.drawable.r15_v3));
        bikeList.add(new BikeBook(4, "Duke 250","₹ 1190.00/day",R.drawable.duke250));
        bikeList.add(new BikeBook(5, "Avenger Cruise 220","₹ 1200.00/day",R.drawable.avenger_220));
        bikeList.add(new BikeBook(6, "Classic 350 EFI Gunmetal Grey","₹ 1289.00/day",R.drawable.classic_350));
        bikeList.add(new BikeBook(7, "Electra 350 CC","₹ 1299.00/day",R.drawable.electra350));
        bikeList.add(new BikeBook(8, "Dominar 400 New","₹ 1499.00/day",R.drawable.dominar400));
        bikeList.add(new BikeBook(9, "Pulsar NS 125","₹ 749.00/day",R.drawable.pulsar_ns));
        bikeList.add(new BikeBook(10, "Jawa 42","₹ 1099.00/day",R.drawable.jawa_42));
        bikeList.add(new BikeBook(11, "Bajaj Pulsar 150","₹ 549.00/day",R.drawable.bajaj_pulsar150));
        bikeList.add(new BikeBook(12, "Yamaha FZ","₹ 599.00/day",R.drawable.yamaha_fz));
        bikeList.add(new BikeBook(13, "Honda Hornet","₹ 659.00/day",R.drawable.honda_hornet));
        bikeList.add(new BikeBook(14, "Bajaj Avenger 220 Street","₹ 719.00/day",R.drawable.bajaj_avenger_street));
        bikeList.add(new BikeBook(15, "Royal Enfield Meteor Stellar 350","₹ 1872.00/day",R.drawable.royal_enfield_meteor_stellar_350));
        bikeList.add(new BikeBook(16, "Royal Enfield Himalayan BS6","₹ 1920.00/day",R.drawable.royal_enfield_himalayan_bs6));
        bikeList.add(new BikeBook(17, "Yamaha MT15 V2 (BS6)","₹ 1944.00/day",R.drawable.yamaha_mt15_v2));
        bikeList.add(new BikeBook(18, "KTM 250 Adventure","₹ 1944.00/day",R.drawable.ktm_250_adventure));
        bikeList.add(new BikeBook(19, "Yezdi Roadster","₹ 1968.00/day",R.drawable.yezdi_roadster));
        bikeList.add(new BikeBook(20, "Royal Enfield Himalayan Gravel Grey","₹ 1992.00/day",R.drawable.royal_enfield_himalayan_gravel_grey));
        bikeList.add(new BikeBook(21, "Yezdi Adventure","₹ 1992.00/day",R.drawable.yezdi_adventure));
        bikeList.add(new BikeBook(22, "Royal Enfield Scram 411","₹ 2016.00/day",R.drawable.royal_enfield_scram_411));
        bikeList.add(new BikeBook(23, "KTM Duke 390(BS6)","₹ 2106.00/day",R.drawable.ktm_duke_390));
        bikeList.add(new BikeBook(24, "Royal Enfield Interceptor 650","₹ 2712.00/day",R.drawable.royal_enfield_interceptor_650));
        bikeList.add(new BikeBook(25, "Royal Enfield Continental GT 650 ","₹ 2760.00/day",R.drawable.royal_enfield_continental_gt_650));
        bikeList.add(new BikeBook(26, "TVS Apache RTR 180 (BS6)","₹ 1020.00/day",R.drawable.tvs_apache_rtr_180_bs6));
        bikeList.add(new BikeBook(27, "KTM Duke 250 (BS6)","₹ 1776.00/day",R.drawable.ktm_duke_250));
        bikeList.add(new BikeBook(28, "Royal Enfield Classic 350 Reborn","₹ 1632.00/day",R.drawable.royal_enfield_classic_350_reborn_black));
        bikeList.add(new BikeBook(29, "Yamaha R15 (BS6)","₹ 1539.00/day",R.drawable.yamaha_r15));
        bikeList.add(new BikeBook(30, "Royal Enfield Interceptor 650 (BS6)","₹ 2712.00/day",R.drawable.royal_enfield_interceptor_650_blue));

        bikeList.add(new BikeBook(31, "Honda CB Hornet 160","₹ 768.00/day",R.drawable.honda_cb_hornet_160));
        bikeList.add(new BikeBook(32, "Bajaj Pulsar 150 Neon","₹ 720.00/day",R.drawable.bajaj_pulsar_150_neon));
        bikeList.add(new BikeBook(33, "Royal Enfield Hunter 350","₹ 1440.00/day",R.drawable.royal_enfield_hunter_350));
        bikeList.add(new BikeBook(34, "TVS Apache RTR 200 (BS6)","₹ 1560.00/day",R.drawable.tvs_apache_rtr_200));
        bikeList.add(new BikeBook(35, "Royal Enfield Continental GT 650","₹ 2304.00/day",R.drawable.royal_enfield_continental_gt_650_white));
        bikeList.add(new BikeBook(36, "Royal Enfield Himalayan (BS6)","₹ 1848.00/day",R.drawable.royal_enfield_himalayan));
        bikeList.add(new BikeBook(37, "Royal Enfield Meteor Supernova 350","₹ 1920.00/day",R.drawable.royal_enfield_meteor_supernova_350));
        bikeList.add(new BikeBook(38, "BMW G310 GS (BS6)","₹ 2738.00/day",R.drawable.bmw_g310_gs));
        bikeList.add(new BikeBook(39, "Royal Enfield Meteor Fireball 350","₹ 1752.00/day",R.drawable.royal_enfield_meteor_fireball_350));
        bikeList.add(new BikeBook(40, "Royal Enfield Himalayan Pine Green","₹ 1992.00/day",R.drawable.royal_enfield_himalayan_pine_green));
        bikeList.add(new BikeBook(41, "Honda CB 350 RS","₹ 1824.00/day",R.drawable.honda_cb_350_rs));
        bikeList.add(new BikeBook(42, "Honda H’ness CB 350","₹ 1783.00/day",R.drawable.honda_hness_cb_350));
        bikeList.add(new BikeBook(43, "Yezdi Scrambler","₹ 1776.00/day",R.drawable.yezdi_scrambler));
        bikeList.add(new BikeBook(44, "Bajaj Dominar 400 BS6","₹ 1752.00/day",R.drawable.bajaj_dominar_400_bs6));
        bikeList.add(new BikeBook(45, "Suzuki V-Strom 250","₹ 1620.00/day",R.drawable.suzuki_v_strom_250));
        bikeList.add(new BikeBook(46, "Royal Enfield Classic 350 Reborn","₹ 1602.00/day",R.drawable.royal_enfield_classic_350_reborn));
        bikeList.add(new BikeBook(47, "Jawa Perak(Single seater)","₹ 1536.00/day",R.drawable.jawa_perak));
        bikeList.add(new BikeBook(48, "Hero X-pulse Rally Edition","₹ 1470.00/day",R.drawable.hero_x_pulse_rally_edition));
        bikeList.add(new BikeBook(49, "Honda CB 200X","₹ 1416.00/day",R.drawable.honda_cb_200x));
        bikeList.add(new BikeBook(50, "KTM Duke 200 (BS6)","₹ 1392.00/day",R.drawable.ktm_duke_200));
        bikeList.add(new BikeBook(51, "Suzuki Gixxer SF 250","₹ 1344.00/day",R.drawable.suzuki_gixxer_sf_250));
        bikeList.add(new BikeBook(52, "Royal Enfield Classic 350 (BS6)","₹ 1320.00/day",R.drawable.royal_enfield_classic_350));
        bikeList.add(new BikeBook(53, "Suzuki Gixxer 250","₹ 1248.00/day",R.drawable.suzuki_gixxer_250));
        bikeList.add(new BikeBook(54, "Hero XPulse (BS6)","₹ 1224.00/day",R.drawable.hero_xpulse));
        bikeList.add(new BikeBook(55, "Bajaj Pulsar 250F (BS6)","₹ 1104.00/day",R.drawable.bajaj_pulsar_250f));
        bikeList.add(new BikeBook(56, "Bajaj Pulsar 250N (BS6)","₹ 1020.00/day",R.drawable.bajaj_pulsar_250n));
        bikeList.add(new BikeBook(57, "Suzuki Gixxer 150","₹ 984.00/day",R.drawable.suzuki_gixxer_150));
        bikeList.add(new BikeBook(58, "TVS Apache RTR 180","₹ 936.00/day",R.drawable.tvs_apache_rtr_180));
        bikeList.add(new BikeBook(59, "Yamaha FZ V3 (BS6)","₹ 936.00/day",R.drawable.yamaha_fz_v3_bs6));
        bikeList.add(new BikeBook(60, "Honda Hornet 2.0","₹ 919.00/day",R.drawable.honda_hornet_2));
        bikeList.add(new BikeBook(61, "Honda X Blade (BS6)","₹ 888.00/day",R.drawable.honda_x_blade));
        bikeList.add(new BikeBook(62, "Yamaha FZ V3","₹ 864.00/day",R.drawable.yamaha_fz_v3));
        bikeList.add(new BikeBook(63, "Honda X Blade","₹ 864.00/day",R.drawable.honda_x_blade_bs6));


        //creating recyclerview adapter
        BikeAdapter adapter = new BikeAdapter(this, bikeList);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }


    @Override
    public void onItemClick(View view, int position) {

        Intent intent=new Intent(getApplicationContext(),BookRent.class);

        switch (position) {
            case 0:intent.putExtra("Charges","700");
                intent.putExtra("Bike Name","Shine");
                intent.putExtra("Bike Image", R.drawable.shine);
                break;
            case 1: intent.putExtra("Charges","800");
                intent.putExtra("Bike Name","FZ16");
                intent.putExtra("Bike Image", R.drawable.fz16);
                break;
            case 2: intent.putExtra("Charges","1190");
                intent.putExtra("Bike Name","R15 V3");
                intent.putExtra("Bike Image", R.drawable.r15_v3);
                break;
            case 3:intent.putExtra("Charges","1190");
                intent.putExtra("Bike Name","Duke 250");
                intent.putExtra("Bike Image", R.drawable.duke250);
                break;
            case 4:intent.putExtra("Charges","1200");
                intent.putExtra("Bike Name","Avenger Cruise 220");
                intent.putExtra("Bike Image", R.drawable.avenger_220);
                break;
            case 5:intent.putExtra("Charges","1289");
                intent.putExtra("Bike Name","Classic 350 EFI Gunmetal Grey");
                intent.putExtra("Bike Image", R.drawable.classic_350);
                break;
            case 6:intent.putExtra("Charges","1299");
                intent.putExtra("Bike Name","Electra 350 CC");
                intent.putExtra("Bike Image", R.drawable.electra350);
                break;
            case 7:intent.putExtra("Charges","1499");
                intent.putExtra("Bike Name","Dominar 400 New");
                intent.putExtra("Bike Image", R.drawable.dominar400);
                break;
            case 8:intent.putExtra("Charges","749");
                intent.putExtra("Bike Name","Pulsar NS 125");
                intent.putExtra("Bike Image", R.drawable.pulsar_ns);
                break;
            case 9:intent.putExtra("Charges","1099");
                intent.putExtra("Bike Name","Jawa 42");
                intent.putExtra("Bike Image", R.drawable.jawa_42);
                break;
            case 10:intent.putExtra("Charges","549");
                intent.putExtra("Bike Name","Bajaj Pulsar 150");
                intent.putExtra("Bike Image", R.drawable.bajaj_pulsar150);
                break;
            case 11:intent.putExtra("Charges","599");
                intent.putExtra("Bike Name","Yamaha FZ");
                intent.putExtra("Bike Image", R.drawable.yamaha_fz);
                break;
            case 12:intent.putExtra("Charges","659");
                intent.putExtra("Bike Name","Honda Hornet");
                intent.putExtra("Bike Image", R.drawable.honda_hornet);
                break;
            case 13:intent.putExtra("Charges","719");
                intent.putExtra("Bike Name","Bajaj Avenger 220 Street");
                intent.putExtra("Bike Image", R.drawable.bajaj_avenger_street);
                break;
            case 14:intent.putExtra("Charges","1872");
                intent.putExtra("Bike Name","Royal Enfield Meteor Stellar 350");
                intent.putExtra("Bike Image", R.drawable.royal_enfield_meteor_stellar_350);
                break;
            case 15:intent.putExtra("Charges","1920");
                intent.putExtra("Bike Name","Royal Enfield Himalayan BS6");
                intent.putExtra("Bike Image", R.drawable.royal_enfield_himalayan_bs6);
                break;
            case 16:intent.putExtra("Charges","1944");
                intent.putExtra("Bike Name","Yamaha MT15 V2 (BS6)");
                intent.putExtra("Bike Image", R.drawable.yamaha_mt15_v2);
                break;
            case 17:intent.putExtra("Charges","1944");
                intent.putExtra("Bike Name","KTM 250 Adventure");
                intent.putExtra("Bike Image", R.drawable.ktm_250_adventure);
                break;
            case 18:intent.putExtra("Charges","1968");
                intent.putExtra("Bike Name","Yezdi Roadster");
                intent.putExtra("Bike Image", R.drawable.yezdi_roadster);
                break;
            case 19:intent.putExtra("Charges","1992");
                intent.putExtra("Bike Name","Royal Enfield Himalayan Gravel Grey");
                intent.putExtra("Bike Image", R.drawable.royal_enfield_himalayan_gravel_grey);
                break;
            case 20: intent.putExtra("Bike Name", "Yezdi Adventure");
                intent.putExtra("Charges","1992");
                intent.putExtra("Bike Image", R.drawable.yezdi_adventure);
                break;
            case 21:  intent.putExtra("Bike Name", "Royal Enfield Scram 411");
                intent.putExtra("Charges","2016");
                intent.putExtra("Bike Image", R.drawable.royal_enfield_scram_411);
                break;
            case 22:  intent.putExtra("Bike Name", "KTM Duke 390(BS6)");
                intent.putExtra("Charges","2106");
                intent.putExtra("Bike Image", R.drawable.ktm_duke_390);
                break;
            case 23:  intent.putExtra("Bike Name", "Royal Enfield Interceptor 650");
                intent.putExtra("Charges","2712");
                intent.putExtra("Bike Image", R.drawable.royal_enfield_interceptor_650);
                break;
            case 24: intent.putExtra("Bike Name", "Royal Enfield Continental GT 650 ");
                intent.putExtra("Charges","2760");
                intent.putExtra("Bike Image", R.drawable.royal_enfield_continental_gt_650);
                break;
            case 25: intent.putExtra("Bike Name", "TVS Apache RTR 180 (BS6)");
                intent.putExtra("Charges","1020");
                intent.putExtra("Bike Image", R.drawable.tvs_apache_rtr_180_bs6);
                break;
            case 26:   intent.putExtra("Bike Name", "KTM Duke 250 (BS6)");
                intent.putExtra("Charges","1776");
                intent.putExtra("Bike Image", R.drawable.ktm_duke_250);
                break;
            case 27:  intent.putExtra("Bike Name", "Royal Enfield Classic 350 Reborn");
                intent.putExtra("Charges","1632");
                intent.putExtra("Bike Image", R.drawable.royal_enfield_classic_350_reborn_black);
                break;
            case 28: intent.putExtra("Bike Name", "Yamaha R15 (BS6)");
                intent.putExtra("Charges","1539");
                intent.putExtra("Bike Image", R.drawable.yamaha_r15);
                break;
            case 29:  intent.putExtra("Bike Name", "Royal Enfield Interceptor 650 (BS6)");
                intent.putExtra("Charges","2712");
                intent.putExtra("Bike Image", R.drawable.royal_enfield_interceptor_650_blue);
                break;
            case 30:intent.putExtra("Bike Name", "Honda CB Hornet 160");
                intent.putExtra("Charges","768");
                intent.putExtra("Bike Image", R.drawable.honda_cb_hornet_160);
                break;
            case 31:intent.putExtra("Bike Name", "Bajaj Pulsar 150 Neon");
                intent.putExtra("Charges","720");
                intent.putExtra("Bike Image", R.drawable.bajaj_pulsar_150_neon);
                break;
            case 32:intent.putExtra("Bike Name","Royal Enfield Hunter 350");
                intent.putExtra("Charges","1440");
                intent.putExtra("Bike Image", R.drawable.royal_enfield_hunter_350);
                break;
            case 33:intent.putExtra("Bike Name","TVS Apache RTR 200 (BS6)");
                intent.putExtra("Charges","1560");
                intent.putExtra("Bike Image", R.drawable.tvs_apache_rtr_200);
                break;
            case 34:intent.putExtra("Bike Name","Royal Enfield Continental GT 650");
                intent.putExtra("Charges","2304");
                intent.putExtra("Bike Image", R.drawable.royal_enfield_continental_gt_650_white);
                break;
            case 35:intent.putExtra("Bike Name","Royal Enfield Himalayan (BS6)");
                intent.putExtra("Charges","1848");
                intent.putExtra("Bike Image", R.drawable.royal_enfield_himalayan_bs6);
                break;
            case 36:intent.putExtra("Bike Name", "Royal Enfield Meteor Supernova 350");
                intent.putExtra("Charges","1920");
                intent.putExtra("Bike Image", R.drawable.royal_enfield_meteor_supernova_350);
                break;
            case 37:intent.putExtra("Bike Name","BMW G310 GS (BS6)");
                intent.putExtra("Charges","2738");
                intent.putExtra("Bike Image", R.drawable.bmw_g310_gs);
                break;
            case 38:intent.putExtra("Bike Name", "Royal Enfield Meteor Fireball 350");
                intent.putExtra("Charges","1752");
                intent.putExtra("Bike Image", R.drawable.royal_enfield_meteor_fireball_350);
                break;
            case 39:intent.putExtra("Bike Name", "Royal Enfield Himalayan Pine Green");
                intent.putExtra("Charges","1992");
                intent.putExtra("Bike Image", R.drawable.royal_enfield_himalayan_pine_green);
                break;
            case 40:intent.putExtra("Bike Name","Honda CB 350 RS");
                intent.putExtra("Charges","1824");
                intent.putExtra("Bike Image", R.drawable.honda_cb_350_rs);
                break;
            case 41:intent.putExtra("Bike Name", "Honda H’ness CB 350");
                intent.putExtra("Charges","1783");
                intent.putExtra("Bike Image", R.drawable.honda_hness_cb_350);
                break;
            case 42:intent.putExtra("Bike Name", "Yezdi Scrambler");
                intent.putExtra("Charges","1776");
                intent.putExtra("Bike Image", R.drawable.yezdi_scrambler);
                break;
            case 43:intent.putExtra("Bike Name", "Bajaj Dominar 400 BS6");
                intent.putExtra("Charges","1752");
                intent.putExtra("Bike Image", R.drawable.bajaj_dominar_400_bs6);
                break;
            case 44: intent.putExtra("Bike Name", "Suzuki V-Strom 250");
                intent.putExtra("Charges","1620");
                intent.putExtra("Bike Image", R.drawable.suzuki_v_strom_250);
                break;
            case 45:intent.putExtra("Bike Name","Royal Enfield Classic 350 Reborn");
                intent.putExtra("Charges","1602");
                intent.putExtra("Bike Image", R.drawable.royal_enfield_classic_350_reborn);
                break;
            case 46: intent.putExtra("Bike Name", "Jawa Perak(Single seater)");
                intent.putExtra("Charges","1536");
                intent.putExtra("Bike Image", R.drawable.jawa_perak);
                break;
            case 47:intent.putExtra("Bike Name","Hero X-pulse Rally Edition");
                intent.putExtra("Charges","1470");
                intent.putExtra("Bike Image", R.drawable.hero_x_pulse_rally_edition);
                break;
            case 48:intent.putExtra("Bike Name", "Honda CB 200X");
                intent.putExtra("Charges","1416");
                intent.putExtra("Bike Image", R.drawable.honda_cb_200x);
                break;
            case 49: intent.putExtra("Bike Name","KTM Duke 200 (BS6)");
                intent.putExtra("Charges","1392");
                intent.putExtra("Bike Image", R.drawable.ktm_duke_200);
                break;
            case 50:intent.putExtra("Bike Name", "Suzuki Gixxer SF 250");
                intent.putExtra("Charges","1344");
                intent.putExtra("Bike Image", R.drawable.suzuki_gixxer_sf_250);
                break;
            case 51:intent.putExtra("Bike Name", "Royal Enfield Classic 350 (BS6)");
                intent.putExtra("Charges","1320");
                intent.putExtra("Bike Image", R.drawable.royal_enfield_classic_350);
                break;
            case 52:intent.putExtra("Bike Name", "Suzuki Gixxer 250");
                intent.putExtra("Charges","1248");
                intent.putExtra("Bike Image", R.drawable.suzuki_gixxer_250);
                break;
            case 53:intent.putExtra("Bike Name", "Hero XPulse (BS6)");
                intent.putExtra("Charges","1224");
                intent.putExtra("Bike Image", R.drawable.hero_xpulse);
                break;
            case 54:intent.putExtra("Bike Name", "Bajaj Pulsar 250F (BS6)");
                intent.putExtra("Charges","1104");
                intent.putExtra("Bike Image", R.drawable.bajaj_pulsar_250f);
                break;
            case 55:intent.putExtra("Bike Name", "Bajaj Pulsar 250N (BS6)");
                intent.putExtra("Charges","1020");
                intent.putExtra("Bike Image", R.drawable.bajaj_pulsar_250n);
                break;
            case 56:intent.putExtra("Bike Name", "Suzuki Gixxer 150");
                intent.putExtra("Charges","984");
                intent.putExtra("Bike Image", R.drawable.suzuki_gixxer_150);
                break;
            case 57:intent.putExtra("Bike Name", "TVS Apache RTR 180");
                intent.putExtra("Charges","936");
                intent.putExtra("Bike Image", R.drawable.tvs_apache_rtr_180);
                break;
            case 58:intent.putExtra("Bike Name", "Yamaha FZ V3 (BS6)");
                intent.putExtra("Charges","936");
                intent.putExtra("Bike Image", R.drawable.yamaha_fz_v3_bs6);
                break;
            case 59:intent.putExtra("Bike Name", "Honda Hornet 2.0");
                intent.putExtra("Charges","919");
                intent.putExtra("Bike Image", R.drawable.honda_hornet_2);
                break;
            case 60:intent.putExtra("Bike Name", "Honda X Blade (BS6)");
                intent.putExtra("Charges","888");
                intent.putExtra("Bike Image", R.drawable.honda_x_blade_bs6);
                break;
            case 61:intent.putExtra("Bike Name", "Yamaha FZ V3");
                intent.putExtra("Charges","864");
                intent.putExtra("Bike Image", R.drawable.yamaha_fz_v3);
                break;
            case 62:intent.putExtra("Bike Name", "Honda X Blade");
                intent.putExtra("Charges","864");
                intent.putExtra("Bike Image", R.drawable.honda_x_blade);
                break;
        }
        startActivity(intent);
    }
}


