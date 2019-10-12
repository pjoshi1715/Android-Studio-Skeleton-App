package CSA.myapplication.ui.notifications;

import android.os.Bundle;
import android.widget.Switch;
import CSA.myapplication.R;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * The NotificationsViewModel class will create the fragment for the notification class
 *
 * @author Ethan
 * @version 10/11/19
 */
public class NotificationsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public NotificationsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }

}