// Generated by view binder compiler. Do not edit!
package com.aditya.labourdigital.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.aditya.labourdigital.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityUserBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button5;

  @NonNull
  public final Button button6;

  @NonNull
  public final Button button7;

  @NonNull
  public final EditText editTextPhone;

  @NonNull
  public final EditText editTextText;

  @NonNull
  public final EditText editTextText2;

  @NonNull
  public final EditText editTextTextPostalAddress;

  @NonNull
  public final ProgressBar progressBar2;

  @NonNull
  public final Spinner spinner;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView101;

  @NonNull
  public final TextView textView102;

  @NonNull
  public final TextView textView103;

  @NonNull
  public final TextView textView104;

  @NonNull
  public final TextView textView106;

  @NonNull
  public final TextView textView2;

  private ActivityUserBinding(@NonNull ConstraintLayout rootView, @NonNull Button button5,
      @NonNull Button button6, @NonNull Button button7, @NonNull EditText editTextPhone,
      @NonNull EditText editTextText, @NonNull EditText editTextText2,
      @NonNull EditText editTextTextPostalAddress, @NonNull ProgressBar progressBar2,
      @NonNull Spinner spinner, @NonNull TextView textView, @NonNull TextView textView101,
      @NonNull TextView textView102, @NonNull TextView textView103, @NonNull TextView textView104,
      @NonNull TextView textView106, @NonNull TextView textView2) {
    this.rootView = rootView;
    this.button5 = button5;
    this.button6 = button6;
    this.button7 = button7;
    this.editTextPhone = editTextPhone;
    this.editTextText = editTextText;
    this.editTextText2 = editTextText2;
    this.editTextTextPostalAddress = editTextTextPostalAddress;
    this.progressBar2 = progressBar2;
    this.spinner = spinner;
    this.textView = textView;
    this.textView101 = textView101;
    this.textView102 = textView102;
    this.textView103 = textView103;
    this.textView104 = textView104;
    this.textView106 = textView106;
    this.textView2 = textView2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityUserBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_user, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityUserBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button5;
      Button button5 = ViewBindings.findChildViewById(rootView, id);
      if (button5 == null) {
        break missingId;
      }

      id = R.id.button6;
      Button button6 = ViewBindings.findChildViewById(rootView, id);
      if (button6 == null) {
        break missingId;
      }

      id = R.id.button7;
      Button button7 = ViewBindings.findChildViewById(rootView, id);
      if (button7 == null) {
        break missingId;
      }

      id = R.id.editTextPhone;
      EditText editTextPhone = ViewBindings.findChildViewById(rootView, id);
      if (editTextPhone == null) {
        break missingId;
      }

      id = R.id.editTextText;
      EditText editTextText = ViewBindings.findChildViewById(rootView, id);
      if (editTextText == null) {
        break missingId;
      }

      id = R.id.editTextText2;
      EditText editTextText2 = ViewBindings.findChildViewById(rootView, id);
      if (editTextText2 == null) {
        break missingId;
      }

      id = R.id.editTextTextPostalAddress;
      EditText editTextTextPostalAddress = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPostalAddress == null) {
        break missingId;
      }

      id = R.id.progressBar2;
      ProgressBar progressBar2 = ViewBindings.findChildViewById(rootView, id);
      if (progressBar2 == null) {
        break missingId;
      }

      id = R.id.spinner;
      Spinner spinner = ViewBindings.findChildViewById(rootView, id);
      if (spinner == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView101;
      TextView textView101 = ViewBindings.findChildViewById(rootView, id);
      if (textView101 == null) {
        break missingId;
      }

      id = R.id.textView102;
      TextView textView102 = ViewBindings.findChildViewById(rootView, id);
      if (textView102 == null) {
        break missingId;
      }

      id = R.id.textView103;
      TextView textView103 = ViewBindings.findChildViewById(rootView, id);
      if (textView103 == null) {
        break missingId;
      }

      id = R.id.textView104;
      TextView textView104 = ViewBindings.findChildViewById(rootView, id);
      if (textView104 == null) {
        break missingId;
      }

      id = R.id.textView106;
      TextView textView106 = ViewBindings.findChildViewById(rootView, id);
      if (textView106 == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      return new ActivityUserBinding((ConstraintLayout) rootView, button5, button6, button7,
          editTextPhone, editTextText, editTextText2, editTextTextPostalAddress, progressBar2,
          spinner, textView, textView101, textView102, textView103, textView104, textView106,
          textView2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
