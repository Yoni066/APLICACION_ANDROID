// Generated by view binder compiler. Do not edit!
package com.example.crudadmin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.crudadmin.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityUpdateBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText referencePhone;

  @NonNull
  public final Button updateButton;

  @NonNull
  public final EditText updateLocation;

  @NonNull
  public final EditText updateName;

  @NonNull
  public final EditText updateOperator;

  private ActivityUpdateBinding(@NonNull LinearLayout rootView, @NonNull EditText referencePhone,
      @NonNull Button updateButton, @NonNull EditText updateLocation, @NonNull EditText updateName,
      @NonNull EditText updateOperator) {
    this.rootView = rootView;
    this.referencePhone = referencePhone;
    this.updateButton = updateButton;
    this.updateLocation = updateLocation;
    this.updateName = updateName;
    this.updateOperator = updateOperator;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityUpdateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityUpdateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_update, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityUpdateBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.referencePhone;
      EditText referencePhone = ViewBindings.findChildViewById(rootView, id);
      if (referencePhone == null) {
        break missingId;
      }

      id = R.id.updateButton;
      Button updateButton = ViewBindings.findChildViewById(rootView, id);
      if (updateButton == null) {
        break missingId;
      }

      id = R.id.updateLocation;
      EditText updateLocation = ViewBindings.findChildViewById(rootView, id);
      if (updateLocation == null) {
        break missingId;
      }

      id = R.id.updateName;
      EditText updateName = ViewBindings.findChildViewById(rootView, id);
      if (updateName == null) {
        break missingId;
      }

      id = R.id.updateOperator;
      EditText updateOperator = ViewBindings.findChildViewById(rootView, id);
      if (updateOperator == null) {
        break missingId;
      }

      return new ActivityUpdateBinding((LinearLayout) rootView, referencePhone, updateButton,
          updateLocation, updateName, updateOperator);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
