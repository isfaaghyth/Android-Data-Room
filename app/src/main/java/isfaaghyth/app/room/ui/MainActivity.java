package isfaaghyth.app.room.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import isfaaghyth.app.room.R;
import isfaaghyth.app.room.data.AppDatabase;
import isfaaghyth.app.room.model.Portfolio;
import isfaaghyth.app.room.model.PortfolioUtils;

public class MainActivity extends AppCompatActivity {

    private CompositeDisposable disposable = new CompositeDisposable();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final AppDatabase db = AppDatabase.getAppDatabase(getApplicationContext());

        findViewById(R.id.btnTambah).setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Portfolio item = new Portfolio()
                                    .title("Hai!")
                                    .desc("ini deskripsi")
                                    .img("gambar!");
                PortfolioUtils.addPortfolio(db, item);
            }
        });
        findViewById(R.id.btnLihatData).setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                disposable.add(PortfolioUtils.getAll(db)
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribeOn(Schedulers.io())
                        .subscribe(new Consumer<List<Portfolio>>() {
                            @Override public void accept(@NonNull List<Portfolio> portfolios) throws Exception {
                                for (Portfolio portfolio: portfolios) {
                                    Log.d(String.valueOf(portfolio.getId()), portfolio.getTitle());
                                }
                            }
                        }));
            }
        });
    }

    @Override protected void onDestroy() {
        super.onDestroy();
        disposable.clear();
    }
}
