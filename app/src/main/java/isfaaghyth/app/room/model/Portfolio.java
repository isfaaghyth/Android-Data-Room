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

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    private Portfolio(Builder builder) {
        id = builder.id;
        title = builder.title;
        desc = builder.desc;
        img = builder.img;
    }

    public static final class Builder {
        private int id;
        private String title;
        private String desc;
        private String img;

        public Builder() {
        }

        public Builder id(int val) {
            id = val;
            return this;
        }

        public Builder title(String val) {
            title = val;
            return this;
        }

        public Builder desc(String val) {
            desc = val;
            return this;
        }

        public Builder img(String val) {
            img = val;
            return this;
        }

        public Portfolio build() {
            return new Portfolio(this);
        }
    }
}
