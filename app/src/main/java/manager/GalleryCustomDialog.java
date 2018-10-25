package manager;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;

import com.example.kaveri.finalchatapp.R;

public class GalleryCustomDialog extends Dialog{
    private static final String TAG = "GalleryCustomDialog";
    private Context mContext;

    public GalleryCustomDialog(@NonNull Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout_dialog_gallery);
    }
}
