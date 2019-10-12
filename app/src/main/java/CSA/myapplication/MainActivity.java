package CSA.myapplication;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.content.Intent;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

/**
 * The MainActivity class is a class which creates the main activity and all of the fragments within
 *
 * @author Jonathan
 * @version 10/11/19
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    /**
     * onCreate - creates button
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);
        final Button settingbutton = (Button) findViewById(R.id.settingbutton);
        settingbutton.setOnClickListener(this);

    }

    @Override
    /**
     * onClick - checks if clicked
     * @param v
     */
    public void onClick(View v) {
        Intent switchscreen = new Intent(MainActivity.this, Settings.class);
        startActivity(switchscreen);
    }
}