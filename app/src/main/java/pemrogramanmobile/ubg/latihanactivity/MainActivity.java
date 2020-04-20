package pemrogramanmobile.ubg.latihanactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etNim, etNama, etAlamat;
    private TextView tvNim, tvNama, tvAlamat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNim = findViewById(R.id.inputNim);
        etNama = findViewById(R.id.inputNama);
        etAlamat = findViewById(R.id.inputAlamat);
        tvNim = findViewById(R.id.hasilNim);
        tvNama = findViewById(R.id.hasilNama);
        tvAlamat = findViewById(R.id.hasilAlamat);
    }

    public void simpanBio(View v){
        tvNim.setText(etNim.getText());
        tvNama.setText(etNama.getText());
        tvAlamat.setText(etAlamat.getText());
    }
}
