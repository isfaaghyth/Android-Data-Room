package isfaaghyth.app.room.model;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by isfaaghyth on 1/17/18.
 * github: @isfaaghyth
 */

@Dao
public interface PortfolioDao {
    @Query("SELECT * FROM portfolio")
    List<Portfolio> getAll();

    @Insert
    void insert(Portfolio... portfolio);
}
