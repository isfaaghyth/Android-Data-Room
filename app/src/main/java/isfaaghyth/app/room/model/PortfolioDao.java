package isfaaghyth.app.room.model;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import io.reactivex.Flowable;

/**
 * Created by isfaaghyth on 1/17/18.
 * github: @isfaaghyth
 */

@Dao
public interface PortfolioDao {
    @Query("SELECT * FROM portfolio")
    Flowable<List<Portfolio>> getAll();

    @Insert
    void insert(Portfolio... portfolio);
}
