package bike.car.rent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import bike.car.rent.Activities.Bike;
import bike.car.rent.Activities.Car;
import bike.car.rent.Activities.ElectricCycle;
import bike.car.rent.Activities.LoginActivity;
import bike.car.rent.Activities.Scooter;
import bike.car.rent.Fragments.HomeFragment;
import bike.car.rent.Fragments.ProfileFragment;
import bike.car.rent.Fragments.SubscriptionFragment;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        getSupportActionBar().hide();

        sp = getSharedPreferences("login",MODE_PRIVATE);
        String MobileNumber=sp.getString("Mobile",null);


//        String MobileNumber=getIntent().getStringExtra("Mobile Number");

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();

    }


    private final BottomNavigationView.OnNavigationItemSelectedListener navListener = item -> {

        Fragment selectedFragment = null;
        int itemId = item.getItemId();
        if (itemId == R.id.home) {
            selectedFragment = new HomeFragment();
        } else if (itemId == R.id.subscription) {
            selectedFragment = new SubscriptionFragment();
        } else if (itemId == R.id.profile) {
            selectedFragment = new ProfileFragment();
        }

        if (selectedFragment != null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
        }
        return true;
    };
}