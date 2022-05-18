// Generated by view binder compiler. Do not edit!
package gonzalez.edith.proyectofinalreel.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import gonzalez.edith.proyectofinalreel.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentCinesBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton btnBuscar;

  @NonNull
  public final ImageButton btnFiltro;

  @NonNull
  public final AppCompatButton btnUbicacion;

  @NonNull
  public final RatingBar calificacion1;

  @NonNull
  public final RatingBar calificacion2;

  @NonNull
  public final Guideline guideline3;

  @NonNull
  public final Guideline guideline5;

  @NonNull
  public final ImageButton ibMenu1;

  @NonNull
  public final ImageButton ibMenu2;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final ImageView ivLogocine1;

  @NonNull
  public final ImageView ivLogocine2;

  @NonNull
  public final ImageView ivMapa1;

  @NonNull
  public final ImageView ivMapa2;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView tvCine1;

  @NonNull
  public final TextView tvCine2;

  @NonNull
  public final TextView tvCines;

  @NonNull
  public final TextView tvDireccion1;

  @NonNull
  public final TextView tvDireccion2;

  @NonNull
  public final TextView tvSalas1;

  @NonNull
  public final TextView tvSalas2;

  private FragmentCinesBinding(@NonNull ConstraintLayout rootView, @NonNull ImageButton btnBuscar,
      @NonNull ImageButton btnFiltro, @NonNull AppCompatButton btnUbicacion,
      @NonNull RatingBar calificacion1, @NonNull RatingBar calificacion2,
      @NonNull Guideline guideline3, @NonNull Guideline guideline5, @NonNull ImageButton ibMenu1,
      @NonNull ImageButton ibMenu2, @NonNull ImageView imageView2, @NonNull ImageView imageView3,
      @NonNull ImageView ivLogocine1, @NonNull ImageView ivLogocine2, @NonNull ImageView ivMapa1,
      @NonNull ImageView ivMapa2, @NonNull TextView textView3, @NonNull TextView tvCine1,
      @NonNull TextView tvCine2, @NonNull TextView tvCines, @NonNull TextView tvDireccion1,
      @NonNull TextView tvDireccion2, @NonNull TextView tvSalas1, @NonNull TextView tvSalas2) {
    this.rootView = rootView;
    this.btnBuscar = btnBuscar;
    this.btnFiltro = btnFiltro;
    this.btnUbicacion = btnUbicacion;
    this.calificacion1 = calificacion1;
    this.calificacion2 = calificacion2;
    this.guideline3 = guideline3;
    this.guideline5 = guideline5;
    this.ibMenu1 = ibMenu1;
    this.ibMenu2 = ibMenu2;
    this.imageView2 = imageView2;
    this.imageView3 = imageView3;
    this.ivLogocine1 = ivLogocine1;
    this.ivLogocine2 = ivLogocine2;
    this.ivMapa1 = ivMapa1;
    this.ivMapa2 = ivMapa2;
    this.textView3 = textView3;
    this.tvCine1 = tvCine1;
    this.tvCine2 = tvCine2;
    this.tvCines = tvCines;
    this.tvDireccion1 = tvDireccion1;
    this.tvDireccion2 = tvDireccion2;
    this.tvSalas1 = tvSalas1;
    this.tvSalas2 = tvSalas2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCinesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCinesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_cines, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCinesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_buscar;
      ImageButton btnBuscar = ViewBindings.findChildViewById(rootView, id);
      if (btnBuscar == null) {
        break missingId;
      }

      id = R.id.btn_filtro;
      ImageButton btnFiltro = ViewBindings.findChildViewById(rootView, id);
      if (btnFiltro == null) {
        break missingId;
      }

      id = R.id.btnUbicacion;
      AppCompatButton btnUbicacion = ViewBindings.findChildViewById(rootView, id);
      if (btnUbicacion == null) {
        break missingId;
      }

      id = R.id.calificacion1;
      RatingBar calificacion1 = ViewBindings.findChildViewById(rootView, id);
      if (calificacion1 == null) {
        break missingId;
      }

      id = R.id.calificacion2;
      RatingBar calificacion2 = ViewBindings.findChildViewById(rootView, id);
      if (calificacion2 == null) {
        break missingId;
      }

      id = R.id.guideline3;
      Guideline guideline3 = ViewBindings.findChildViewById(rootView, id);
      if (guideline3 == null) {
        break missingId;
      }

      id = R.id.guideline5;
      Guideline guideline5 = ViewBindings.findChildViewById(rootView, id);
      if (guideline5 == null) {
        break missingId;
      }

      id = R.id.ib_menu1;
      ImageButton ibMenu1 = ViewBindings.findChildViewById(rootView, id);
      if (ibMenu1 == null) {
        break missingId;
      }

      id = R.id.ib_menu2;
      ImageButton ibMenu2 = ViewBindings.findChildViewById(rootView, id);
      if (ibMenu2 == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.iv_logocine1;
      ImageView ivLogocine1 = ViewBindings.findChildViewById(rootView, id);
      if (ivLogocine1 == null) {
        break missingId;
      }

      id = R.id.iv_logocine2;
      ImageView ivLogocine2 = ViewBindings.findChildViewById(rootView, id);
      if (ivLogocine2 == null) {
        break missingId;
      }

      id = R.id.iv_mapa1;
      ImageView ivMapa1 = ViewBindings.findChildViewById(rootView, id);
      if (ivMapa1 == null) {
        break missingId;
      }

      id = R.id.iv_mapa2;
      ImageView ivMapa2 = ViewBindings.findChildViewById(rootView, id);
      if (ivMapa2 == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.tv_cine1;
      TextView tvCine1 = ViewBindings.findChildViewById(rootView, id);
      if (tvCine1 == null) {
        break missingId;
      }

      id = R.id.tv_cine2;
      TextView tvCine2 = ViewBindings.findChildViewById(rootView, id);
      if (tvCine2 == null) {
        break missingId;
      }

      id = R.id.tvCines;
      TextView tvCines = ViewBindings.findChildViewById(rootView, id);
      if (tvCines == null) {
        break missingId;
      }

      id = R.id.tv_direccion1;
      TextView tvDireccion1 = ViewBindings.findChildViewById(rootView, id);
      if (tvDireccion1 == null) {
        break missingId;
      }

      id = R.id.tv_direccion2;
      TextView tvDireccion2 = ViewBindings.findChildViewById(rootView, id);
      if (tvDireccion2 == null) {
        break missingId;
      }

      id = R.id.tv_salas1;
      TextView tvSalas1 = ViewBindings.findChildViewById(rootView, id);
      if (tvSalas1 == null) {
        break missingId;
      }

      id = R.id.tv_salas2;
      TextView tvSalas2 = ViewBindings.findChildViewById(rootView, id);
      if (tvSalas2 == null) {
        break missingId;
      }

      return new FragmentCinesBinding((ConstraintLayout) rootView, btnBuscar, btnFiltro,
          btnUbicacion, calificacion1, calificacion2, guideline3, guideline5, ibMenu1, ibMenu2,
          imageView2, imageView3, ivLogocine1, ivLogocine2, ivMapa1, ivMapa2, textView3, tvCine1,
          tvCine2, tvCines, tvDireccion1, tvDireccion2, tvSalas1, tvSalas2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
