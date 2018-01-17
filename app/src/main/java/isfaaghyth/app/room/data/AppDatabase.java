package isfaaghyth.app.room.data;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import isfaaghyth.app.room.model.Portfolio;
import isfaaghyth.app.room.model.PortfolioDao;

/**
 * Created by isfaaghyth on 1/17/18.
 * github: @isfaaghyth
 */

@Database(entities = {Portfolio.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    private static AppDatabase instance;
    public abstract PortfolioDao portfolioDao();

    public static AppDatabase getAppDatabase(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context, AppDatabase.class, "portfolio")
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }
}
