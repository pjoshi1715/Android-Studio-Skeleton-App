package CSA.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.preference.PreferenceFragmentCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;

/**
 * Settings class is a class for the settings activity which sets the color, name, and email of the users preferance
 *
 * @author Jonathan
 * @version 10/11/19
 */
public class Settings extends AppCompatActivity {
    /**
     * onCreate - sets up Switch
     * @param savedInstanceState - is the parameter for th state of the switch which causes darkmode to work
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.settings_activity);
            final ConstraintLayout container = (ConstraintLayout) findViewById(R.id.container);
            final Switch myswitch = (Switch) findViewById(R.id.myswitch);
            BottomNavigationView navView = findViewById(R.id.nav_view);
            myswitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                /**
                 * onCheckChanged - checks a change of state in button
                 * @param buttonView
                 * @param isChecked
                 */
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(isChecked) {
                        //set color to black
                        container.setBackgroundColor(Color.parseColor("#303030"));

                    }
                    else {
                        //set color to white
                        container.setBackgroundColor(Color.parseColor("#ffffff"));

                    }
                }
            });
    }

    /*public static class SettingsFragment extends PreferenceFragmentCompat {
        @Override
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.settings, new SettingsFragment())
                .commit();
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
            setPreferencesFromResource(R.xml.root_preferences, rootKey);
        }
    }*/
}