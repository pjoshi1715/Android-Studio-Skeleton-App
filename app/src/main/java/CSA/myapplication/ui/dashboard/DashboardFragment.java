package CSA.myapplication.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;


import CSA.myapplication.R;
/**
 * The DashboardFragment class will create the fragment for the dashboard class
 *
 * @author Parth
 * @version 10/11/19
 */
public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        final TextView textView = root.findViewById(R.id.text_dashboard);
        dashboardViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        //button press causes the image to be unhidden
        final Button compliment = root.findViewById(R.id.compliment);
        final TextView compliment_text = root.findViewById(R.id.compliment_text);
        compliment.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                compliment_text.setVisibility(View.VISIBLE);
            }
        });
        return root;
    }
}