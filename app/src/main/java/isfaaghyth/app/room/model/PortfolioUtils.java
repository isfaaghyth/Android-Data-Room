package isfaaghyth.app.room.model;

import java.util.List;

import io.reactivex.Flowable;
import isfaaghyth.app.room.data.AppDatabase;

/**
 * Created by isfaaghyth on 1/17/18.
 * github: @isfaaghyth
 */

public class PortfolioUtils {

    public static Portfolio addPortfolio(AppDatabase db, Portfolio portfolio) {
        db.portfolioDao().insert(portfolio);
        return portfolio;
    }

    public static Flowable<List<Portfolio>> getAll(AppDatabase db) {
        return db.portfolioDao().getAll();
    }

}
