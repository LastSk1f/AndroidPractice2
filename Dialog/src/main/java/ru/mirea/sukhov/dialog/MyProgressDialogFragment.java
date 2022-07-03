package ru.mirea.sukhov.dialog;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;

import androidx.fragment.app.DialogFragment;

public class MyProgressDialogFragment extends DialogFragment{
    ProgressDialog progressDialog;
    public MyProgressDialogFragment(Activity activity) {
        progressDialog = new ProgressDialog(activity);
    }

    public void setProgressDialog() {
        progressDialog.setTitle("Студент");
        progressDialog.setMessage("Загружаю работой");
        progressDialog.setButton(Dialog.BUTTON_POSITIVE, "Молодец",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
        progressDialog.show();
    }
}
