package CSA.myapplication.ui.notifications;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import java.util.concurrent.TimeUnit;

import CSA.myapplication.R;

/**
 * The NotificationsFragment class will create the fragment for the notification class
 *
 * @author Ethan
 * @version 10/11/19
 */
public class NotificationsFragment extends Fragment {

    private NotificationsViewModel notificationsViewModel;

    /**
     * onCreateView - sets up environment
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                ViewModelProviders.of(this).get(NotificationsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_notifications, container, false);
        final TextView textView = root.findViewById(R.id.text_notifications);
        notificationsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        final EditText text_compliment = root.findViewById(R.id.text_compliment);
        final TextView textView2 = root.findViewById(R.id.textView2);
        text_compliment.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
                textView2.setVisibility(View.VISIBLE);
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            public void onTextChanged(CharSequence s, int start, int before, int count) {}
        });
        return root;
    }
}