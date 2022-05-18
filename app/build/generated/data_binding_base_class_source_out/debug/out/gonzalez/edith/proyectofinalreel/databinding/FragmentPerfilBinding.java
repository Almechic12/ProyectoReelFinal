// Generated by view binder compiler. Do not edit!
package gonzalez.edith.proyectofinalreel.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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

public final class FragmentPerfilBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton btnAmigos;

  @NonNull
  public final AppCompatButton btnCalificaciones;

  @NonNull
  public final AppCompatButton btnCanjearMonedas;

  @NonNull
  public final AppCompatButton btnConfiguracion;

  @NonNull
  public final AppCompatButton btnConseguirMonedas;

  @NonNull
  public final AppCompatButton btnInsignias;

  @NonNull
  public final AppCompatButton btnListas;

  @NonNull
  public final AppCompatButton btnRecordatorio;

  @NonNull
  public final Guideline guideline2;

  @NonNull
  public final ImageView icReel;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ImageView ivLogoPerfil;

  @NonNull
  public final ImageView ivLogoReel;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView tvNombreUsuario;

  private FragmentPerfilBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatButton btnAmigos, @NonNull AppCompatButton btnCalificaciones,
      @NonNull AppCompatButton btnCanjearMonedas, @NonNull AppCompatButton btnConfiguracion,
      @NonNull AppCompatButton btnConseguirMonedas, @NonNull AppCompatButton btnInsignias,
      @NonNull AppCompatButton btnListas, @NonNull AppCompatButton btnRecordatorio,
      @NonNull Guideline guideline2, @NonNull ImageView icReel, @NonNull ImageView imageView,
      @NonNull ImageView ivLogoPerfil, @NonNull ImageView ivLogoReel, @NonNull TextView textView,
      @NonNull TextView tvNombreUsuario) {
    this.rootView = rootView;
    this.btnAmigos = btnAmigos;
    this.btnCalificaciones = btnCalificaciones;
    this.btnCanjearMonedas = btnCanjearMonedas;
    this.btnConfiguracion = btnConfiguracion;
    this.btnConseguirMonedas = btnConseguirMonedas;
    this.btnInsignias = btnInsignias;
    this.btnListas = btnListas;
    this.btnRecordatorio = btnRecordatorio;
    this.guideline2 = guideline2;
    this.icReel = icReel;
    this.imageView = imageView;
    this.ivLogoPerfil = ivLogoPerfil;
    this.ivLogoReel = ivLogoReel;
    this.textView = textView;
    this.tvNombreUsuario = tvNombreUsuario;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentPerfilBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentPerfilBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_perfil, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentPerfilBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnAmigos;
      AppCompatButton btnAmigos = ViewBindings.findChildViewById(rootView, id);
      if (btnAmigos == null) {
        break missingId;
      }

      id = R.id.btnCalificaciones;
      AppCompatButton btnCalificaciones = ViewBindings.findChildViewById(rootView, id);
      if (btnCalificaciones == null) {
        break missingId;
      }

      id = R.id.btn_canjearMonedas;
      AppCompatButton btnCanjearMonedas = ViewBindings.findChildViewById(rootView, id);
      if (btnCanjearMonedas == null) {
        break missingId;
      }

      id = R.id.btnConfiguracion;
      AppCompatButton btnConfiguracion = ViewBindings.findChildViewById(rootView, id);
      if (btnConfiguracion == null) {
        break missingId;
      }

      id = R.id.btn_conseguirMonedas;
      AppCompatButton btnConseguirMonedas = ViewBindings.findChildViewById(rootView, id);
      if (btnConseguirMonedas == null) {
        break missingId;
      }

      id = R.id.btnInsignias;
      AppCompatButton btnInsignias = ViewBindings.findChildViewById(rootView, id);
      if (btnInsignias == null) {
        break missingId;
      }

      id = R.id.btnListas;
      AppCompatButton btnListas = ViewBindings.findChildViewById(rootView, id);
      if (btnListas == null) {
        break missingId;
      }

      id = R.id.btnRecordatorio;
      AppCompatButton btnRecordatorio = ViewBindings.findChildViewById(rootView, id);
      if (btnRecordatorio == null) {
        break missingId;
      }

      id = R.id.guideline2;
      Guideline guideline2 = ViewBindings.findChildViewById(rootView, id);
      if (guideline2 == null) {
        break missingId;
      }

      id = R.id.ic_reel;
      ImageView icReel = ViewBindings.findChildViewById(rootView, id);
      if (icReel == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.iv_logoPerfil;
      ImageView ivLogoPerfil = ViewBindings.findChildViewById(rootView, id);
      if (ivLogoPerfil == null) {
        break missingId;
      }

      id = R.id.iv_logoReel;
      ImageView ivLogoReel = ViewBindings.findChildViewById(rootView, id);
      if (ivLogoReel == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.tv_nombreUsuario;
      TextView tvNombreUsuario = ViewBindings.findChildViewById(rootView, id);
      if (tvNombreUsuario == null) {
        break missingId;
      }

      return new FragmentPerfilBinding((ConstraintLayout) rootView, btnAmigos, btnCalificaciones,
          btnCanjearMonedas, btnConfiguracion, btnConseguirMonedas, btnInsignias, btnListas,
          btnRecordatorio, guideline2, icReel, imageView, ivLogoPerfil, ivLogoReel, textView,
          tvNombreUsuario);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
