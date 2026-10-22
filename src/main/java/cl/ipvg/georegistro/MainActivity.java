package cl.ipvg.georegistro;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_main);

        FirebaseAuth.getInstance().signInAnonymously()
                .addOnFailureListener(e ->
                        Toast.makeText(this,
                                "No se pudo iniciar la conexión con Firebase.",
                                Toast.LENGTH_LONG).show());

        go(R.id.btnRegistrar, RegistroActivity.class);
        go(R.id.btnHistorial, HistorialActivity.class);
        go(R.id.btnMapa, MapaActivity.class);
        go(R.id.btnSensor, SensorActivity.class);
    }

    void go(int id, Class<?> c) {
        ((Button) findViewById(id))
                .setOnClickListener(v -> startActivity(new Intent(this, c)));
    }
}
