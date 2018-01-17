package isfaaghyth.app.room.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import isfaaghyth.app.room.R;
import isfaaghyth.app.room.data.AppDatabase;
import isfaaghyth.app.room.model.Portfolio;
import isfaaghyth.app.room.model.PortfolioUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnTambah).setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Portfolio item = new Portfolio.Builder()
                                    .title("Hai!")
                                    .desc("ini deskripsi")
                                    .img("gambar!")
                                    .build();
                PortfolioUtils.addPortfolio(AppDatabase.getAppDatabase(getApplicationContext()), item);
            }
        });
    }
}
