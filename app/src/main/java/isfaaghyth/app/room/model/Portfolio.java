package isfaaghyth.app.room.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by isfaaghyth on 1/17/18.
 * github: @isfaaghyth
 */

@Entity(tableName = "portfolio")
public class Portfolio {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "title")
    private String title;

    @ColumnInfo(name = "desc")
    private String desc;

    @ColumnInfo(name = "img")
    private String img;

    public Portfolio() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public Portfolio setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public Portfolio setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getImg() {
        return img;
    }

    public Portfolio setImg(String img) {
        this.img = img;
        return this;
    }
}
