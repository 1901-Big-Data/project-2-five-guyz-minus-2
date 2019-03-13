// ORM class for table 'tmdb_movies'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Mar 12 07:22:14 PDT 2019
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class tmdb_movies extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("budget", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        budget = (Long)value;
      }
    });
    setters.put("genre", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        genre = (String)value;
      }
    });
    setters.put("homepage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        homepage = (String)value;
      }
    });
    setters.put("movie_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        movie_id = (Integer)value;
      }
    });
    setters.put("keyword", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        keyword = (String)value;
      }
    });
    setters.put("original_language", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        original_language = (String)value;
      }
    });
    setters.put("original_title", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        original_title = (String)value;
      }
    });
    setters.put("overview", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        overview = (String)value;
      }
    });
    setters.put("popularity", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        popularity = (Float)value;
      }
    });
    setters.put("productioncompany", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        productioncompany = (String)value;
      }
    });
    setters.put("productioncountry", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        productioncountry = (String)value;
      }
    });
    setters.put("release_date", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        release_date = (String)value;
      }
    });
    setters.put("revenue", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        revenue = (Long)value;
      }
    });
    setters.put("runtime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        runtime = (Float)value;
      }
    });
    setters.put("spokenlanguages", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        spokenlanguages = (String)value;
      }
    });
    setters.put("status", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        status = (String)value;
      }
    });
    setters.put("tagline", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tagline = (String)value;
      }
    });
    setters.put("title", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        title = (String)value;
      }
    });
    setters.put("vote_average", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        vote_average = (Float)value;
      }
    });
    setters.put("vote_count", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        vote_count = (Integer)value;
      }
    });
  }
  public tmdb_movies() {
    init0();
  }
  private Long budget;
  public Long get_budget() {
    return budget;
  }
  public void set_budget(Long budget) {
    this.budget = budget;
  }
  public tmdb_movies with_budget(Long budget) {
    this.budget = budget;
    return this;
  }
  private String genre;
  public String get_genre() {
    return genre;
  }
  public void set_genre(String genre) {
    this.genre = genre;
  }
  public tmdb_movies with_genre(String genre) {
    this.genre = genre;
    return this;
  }
  private String homepage;
  public String get_homepage() {
    return homepage;
  }
  public void set_homepage(String homepage) {
    this.homepage = homepage;
  }
  public tmdb_movies with_homepage(String homepage) {
    this.homepage = homepage;
    return this;
  }
  private Integer movie_id;
  public Integer get_movie_id() {
    return movie_id;
  }
  public void set_movie_id(Integer movie_id) {
    this.movie_id = movie_id;
  }
  public tmdb_movies with_movie_id(Integer movie_id) {
    this.movie_id = movie_id;
    return this;
  }
  private String keyword;
  public String get_keyword() {
    return keyword;
  }
  public void set_keyword(String keyword) {
    this.keyword = keyword;
  }
  public tmdb_movies with_keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }
  private String original_language;
  public String get_original_language() {
    return original_language;
  }
  public void set_original_language(String original_language) {
    this.original_language = original_language;
  }
  public tmdb_movies with_original_language(String original_language) {
    this.original_language = original_language;
    return this;
  }
  private String original_title;
  public String get_original_title() {
    return original_title;
  }
  public void set_original_title(String original_title) {
    this.original_title = original_title;
  }
  public tmdb_movies with_original_title(String original_title) {
    this.original_title = original_title;
    return this;
  }
  private String overview;
  public String get_overview() {
    return overview;
  }
  public void set_overview(String overview) {
    this.overview = overview;
  }
  public tmdb_movies with_overview(String overview) {
    this.overview = overview;
    return this;
  }
  private Float popularity;
  public Float get_popularity() {
    return popularity;
  }
  public void set_popularity(Float popularity) {
    this.popularity = popularity;
  }
  public tmdb_movies with_popularity(Float popularity) {
    this.popularity = popularity;
    return this;
  }
  private String productioncompany;
  public String get_productioncompany() {
    return productioncompany;
  }
  public void set_productioncompany(String productioncompany) {
    this.productioncompany = productioncompany;
  }
  public tmdb_movies with_productioncompany(String productioncompany) {
    this.productioncompany = productioncompany;
    return this;
  }
  private String productioncountry;
  public String get_productioncountry() {
    return productioncountry;
  }
  public void set_productioncountry(String productioncountry) {
    this.productioncountry = productioncountry;
  }
  public tmdb_movies with_productioncountry(String productioncountry) {
    this.productioncountry = productioncountry;
    return this;
  }
  private String release_date;
  public String get_release_date() {
    return release_date;
  }
  public void set_release_date(String release_date) {
    this.release_date = release_date;
  }
  public tmdb_movies with_release_date(String release_date) {
    this.release_date = release_date;
    return this;
  }
  private Long revenue;
  public Long get_revenue() {
    return revenue;
  }
  public void set_revenue(Long revenue) {
    this.revenue = revenue;
  }
  public tmdb_movies with_revenue(Long revenue) {
    this.revenue = revenue;
    return this;
  }
  private Float runtime;
  public Float get_runtime() {
    return runtime;
  }
  public void set_runtime(Float runtime) {
    this.runtime = runtime;
  }
  public tmdb_movies with_runtime(Float runtime) {
    this.runtime = runtime;
    return this;
  }
  private String spokenlanguages;
  public String get_spokenlanguages() {
    return spokenlanguages;
  }
  public void set_spokenlanguages(String spokenlanguages) {
    this.spokenlanguages = spokenlanguages;
  }
  public tmdb_movies with_spokenlanguages(String spokenlanguages) {
    this.spokenlanguages = spokenlanguages;
    return this;
  }
  private String status;
  public String get_status() {
    return status;
  }
  public void set_status(String status) {
    this.status = status;
  }
  public tmdb_movies with_status(String status) {
    this.status = status;
    return this;
  }
  private String tagline;
  public String get_tagline() {
    return tagline;
  }
  public void set_tagline(String tagline) {
    this.tagline = tagline;
  }
  public tmdb_movies with_tagline(String tagline) {
    this.tagline = tagline;
    return this;
  }
  private String title;
  public String get_title() {
    return title;
  }
  public void set_title(String title) {
    this.title = title;
  }
  public tmdb_movies with_title(String title) {
    this.title = title;
    return this;
  }
  private Float vote_average;
  public Float get_vote_average() {
    return vote_average;
  }
  public void set_vote_average(Float vote_average) {
    this.vote_average = vote_average;
  }
  public tmdb_movies with_vote_average(Float vote_average) {
    this.vote_average = vote_average;
    return this;
  }
  private Integer vote_count;
  public Integer get_vote_count() {
    return vote_count;
  }
  public void set_vote_count(Integer vote_count) {
    this.vote_count = vote_count;
  }
  public tmdb_movies with_vote_count(Integer vote_count) {
    this.vote_count = vote_count;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tmdb_movies)) {
      return false;
    }
    tmdb_movies that = (tmdb_movies) o;
    boolean equal = true;
    equal = equal && (this.budget == null ? that.budget == null : this.budget.equals(that.budget));
    equal = equal && (this.genre == null ? that.genre == null : this.genre.equals(that.genre));
    equal = equal && (this.homepage == null ? that.homepage == null : this.homepage.equals(that.homepage));
    equal = equal && (this.movie_id == null ? that.movie_id == null : this.movie_id.equals(that.movie_id));
    equal = equal && (this.keyword == null ? that.keyword == null : this.keyword.equals(that.keyword));
    equal = equal && (this.original_language == null ? that.original_language == null : this.original_language.equals(that.original_language));
    equal = equal && (this.original_title == null ? that.original_title == null : this.original_title.equals(that.original_title));
    equal = equal && (this.overview == null ? that.overview == null : this.overview.equals(that.overview));
    equal = equal && (this.popularity == null ? that.popularity == null : this.popularity.equals(that.popularity));
    equal = equal && (this.productioncompany == null ? that.productioncompany == null : this.productioncompany.equals(that.productioncompany));
    equal = equal && (this.productioncountry == null ? that.productioncountry == null : this.productioncountry.equals(that.productioncountry));
    equal = equal && (this.release_date == null ? that.release_date == null : this.release_date.equals(that.release_date));
    equal = equal && (this.revenue == null ? that.revenue == null : this.revenue.equals(that.revenue));
    equal = equal && (this.runtime == null ? that.runtime == null : this.runtime.equals(that.runtime));
    equal = equal && (this.spokenlanguages == null ? that.spokenlanguages == null : this.spokenlanguages.equals(that.spokenlanguages));
    equal = equal && (this.status == null ? that.status == null : this.status.equals(that.status));
    equal = equal && (this.tagline == null ? that.tagline == null : this.tagline.equals(that.tagline));
    equal = equal && (this.title == null ? that.title == null : this.title.equals(that.title));
    equal = equal && (this.vote_average == null ? that.vote_average == null : this.vote_average.equals(that.vote_average));
    equal = equal && (this.vote_count == null ? that.vote_count == null : this.vote_count.equals(that.vote_count));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tmdb_movies)) {
      return false;
    }
    tmdb_movies that = (tmdb_movies) o;
    boolean equal = true;
    equal = equal && (this.budget == null ? that.budget == null : this.budget.equals(that.budget));
    equal = equal && (this.genre == null ? that.genre == null : this.genre.equals(that.genre));
    equal = equal && (this.homepage == null ? that.homepage == null : this.homepage.equals(that.homepage));
    equal = equal && (this.movie_id == null ? that.movie_id == null : this.movie_id.equals(that.movie_id));
    equal = equal && (this.keyword == null ? that.keyword == null : this.keyword.equals(that.keyword));
    equal = equal && (this.original_language == null ? that.original_language == null : this.original_language.equals(that.original_language));
    equal = equal && (this.original_title == null ? that.original_title == null : this.original_title.equals(that.original_title));
    equal = equal && (this.overview == null ? that.overview == null : this.overview.equals(that.overview));
    equal = equal && (this.popularity == null ? that.popularity == null : this.popularity.equals(that.popularity));
    equal = equal && (this.productioncompany == null ? that.productioncompany == null : this.productioncompany.equals(that.productioncompany));
    equal = equal && (this.productioncountry == null ? that.productioncountry == null : this.productioncountry.equals(that.productioncountry));
    equal = equal && (this.release_date == null ? that.release_date == null : this.release_date.equals(that.release_date));
    equal = equal && (this.revenue == null ? that.revenue == null : this.revenue.equals(that.revenue));
    equal = equal && (this.runtime == null ? that.runtime == null : this.runtime.equals(that.runtime));
    equal = equal && (this.spokenlanguages == null ? that.spokenlanguages == null : this.spokenlanguages.equals(that.spokenlanguages));
    equal = equal && (this.status == null ? that.status == null : this.status.equals(that.status));
    equal = equal && (this.tagline == null ? that.tagline == null : this.tagline.equals(that.tagline));
    equal = equal && (this.title == null ? that.title == null : this.title.equals(that.title));
    equal = equal && (this.vote_average == null ? that.vote_average == null : this.vote_average.equals(that.vote_average));
    equal = equal && (this.vote_count == null ? that.vote_count == null : this.vote_count.equals(that.vote_count));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.budget = JdbcWritableBridge.readLong(1, __dbResults);
    this.genre = JdbcWritableBridge.readString(2, __dbResults);
    this.homepage = JdbcWritableBridge.readString(3, __dbResults);
    this.movie_id = JdbcWritableBridge.readInteger(4, __dbResults);
    this.keyword = JdbcWritableBridge.readString(5, __dbResults);
    this.original_language = JdbcWritableBridge.readString(6, __dbResults);
    this.original_title = JdbcWritableBridge.readString(7, __dbResults);
    this.overview = JdbcWritableBridge.readString(8, __dbResults);
    this.popularity = JdbcWritableBridge.readFloat(9, __dbResults);
    this.productioncompany = JdbcWritableBridge.readString(10, __dbResults);
    this.productioncountry = JdbcWritableBridge.readString(11, __dbResults);
    this.release_date = JdbcWritableBridge.readString(12, __dbResults);
    this.revenue = JdbcWritableBridge.readLong(13, __dbResults);
    this.runtime = JdbcWritableBridge.readFloat(14, __dbResults);
    this.spokenlanguages = JdbcWritableBridge.readString(15, __dbResults);
    this.status = JdbcWritableBridge.readString(16, __dbResults);
    this.tagline = JdbcWritableBridge.readString(17, __dbResults);
    this.title = JdbcWritableBridge.readString(18, __dbResults);
    this.vote_average = JdbcWritableBridge.readFloat(19, __dbResults);
    this.vote_count = JdbcWritableBridge.readInteger(20, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.budget = JdbcWritableBridge.readLong(1, __dbResults);
    this.genre = JdbcWritableBridge.readString(2, __dbResults);
    this.homepage = JdbcWritableBridge.readString(3, __dbResults);
    this.movie_id = JdbcWritableBridge.readInteger(4, __dbResults);
    this.keyword = JdbcWritableBridge.readString(5, __dbResults);
    this.original_language = JdbcWritableBridge.readString(6, __dbResults);
    this.original_title = JdbcWritableBridge.readString(7, __dbResults);
    this.overview = JdbcWritableBridge.readString(8, __dbResults);
    this.popularity = JdbcWritableBridge.readFloat(9, __dbResults);
    this.productioncompany = JdbcWritableBridge.readString(10, __dbResults);
    this.productioncountry = JdbcWritableBridge.readString(11, __dbResults);
    this.release_date = JdbcWritableBridge.readString(12, __dbResults);
    this.revenue = JdbcWritableBridge.readLong(13, __dbResults);
    this.runtime = JdbcWritableBridge.readFloat(14, __dbResults);
    this.spokenlanguages = JdbcWritableBridge.readString(15, __dbResults);
    this.status = JdbcWritableBridge.readString(16, __dbResults);
    this.tagline = JdbcWritableBridge.readString(17, __dbResults);
    this.title = JdbcWritableBridge.readString(18, __dbResults);
    this.vote_average = JdbcWritableBridge.readFloat(19, __dbResults);
    this.vote_count = JdbcWritableBridge.readInteger(20, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(budget, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(genre, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(homepage, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(movie_id, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(keyword, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(original_language, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(original_title, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(overview, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeFloat(popularity, 9 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeString(productioncompany, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(productioncountry, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(release_date, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(revenue, 13 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeFloat(runtime, 14 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeString(spokenlanguages, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(status, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tagline, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(title, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeFloat(vote_average, 19 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeInteger(vote_count, 20 + __off, 4, __dbStmt);
    return 20;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(budget, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(genre, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(homepage, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(movie_id, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(keyword, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(original_language, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(original_title, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(overview, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeFloat(popularity, 9 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeString(productioncompany, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(productioncountry, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(release_date, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(revenue, 13 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeFloat(runtime, 14 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeString(spokenlanguages, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(status, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tagline, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(title, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeFloat(vote_average, 19 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeInteger(vote_count, 20 + __off, 4, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.budget = null;
    } else {
    this.budget = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.genre = null;
    } else {
    this.genre = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.homepage = null;
    } else {
    this.homepage = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.movie_id = null;
    } else {
    this.movie_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.keyword = null;
    } else {
    this.keyword = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.original_language = null;
    } else {
    this.original_language = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.original_title = null;
    } else {
    this.original_title = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.overview = null;
    } else {
    this.overview = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.popularity = null;
    } else {
    this.popularity = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.productioncompany = null;
    } else {
    this.productioncompany = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.productioncountry = null;
    } else {
    this.productioncountry = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.release_date = null;
    } else {
    this.release_date = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.revenue = null;
    } else {
    this.revenue = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.runtime = null;
    } else {
    this.runtime = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.spokenlanguages = null;
    } else {
    this.spokenlanguages = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.status = null;
    } else {
    this.status = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.tagline = null;
    } else {
    this.tagline = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.title = null;
    } else {
    this.title = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.vote_average = null;
    } else {
    this.vote_average = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.vote_count = null;
    } else {
    this.vote_count = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.budget) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.budget);
    }
    if (null == this.genre) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, genre);
    }
    if (null == this.homepage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, homepage);
    }
    if (null == this.movie_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.movie_id);
    }
    if (null == this.keyword) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, keyword);
    }
    if (null == this.original_language) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, original_language);
    }
    if (null == this.original_title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, original_title);
    }
    if (null == this.overview) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, overview);
    }
    if (null == this.popularity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.popularity);
    }
    if (null == this.productioncompany) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, productioncompany);
    }
    if (null == this.productioncountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, productioncountry);
    }
    if (null == this.release_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, release_date);
    }
    if (null == this.revenue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.revenue);
    }
    if (null == this.runtime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.runtime);
    }
    if (null == this.spokenlanguages) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, spokenlanguages);
    }
    if (null == this.status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, status);
    }
    if (null == this.tagline) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tagline);
    }
    if (null == this.title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, title);
    }
    if (null == this.vote_average) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.vote_average);
    }
    if (null == this.vote_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.vote_count);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.budget) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.budget);
    }
    if (null == this.genre) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, genre);
    }
    if (null == this.homepage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, homepage);
    }
    if (null == this.movie_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.movie_id);
    }
    if (null == this.keyword) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, keyword);
    }
    if (null == this.original_language) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, original_language);
    }
    if (null == this.original_title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, original_title);
    }
    if (null == this.overview) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, overview);
    }
    if (null == this.popularity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.popularity);
    }
    if (null == this.productioncompany) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, productioncompany);
    }
    if (null == this.productioncountry) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, productioncountry);
    }
    if (null == this.release_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, release_date);
    }
    if (null == this.revenue) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.revenue);
    }
    if (null == this.runtime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.runtime);
    }
    if (null == this.spokenlanguages) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, spokenlanguages);
    }
    if (null == this.status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, status);
    }
    if (null == this.tagline) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tagline);
    }
    if (null == this.title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, title);
    }
    if (null == this.vote_average) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.vote_average);
    }
    if (null == this.vote_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.vote_count);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(budget==null?"null":"" + budget, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(genre==null?"null":genre, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(homepage==null?"null":homepage, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(movie_id==null?"null":"" + movie_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(keyword==null?"null":keyword, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(original_language==null?"null":original_language, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(original_title==null?"null":original_title, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(overview==null?"null":overview, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(popularity==null?"null":"" + popularity, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(productioncompany==null?"null":productioncompany, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(productioncountry==null?"null":productioncountry, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(release_date==null?"null":release_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(revenue==null?"null":"" + revenue, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(runtime==null?"null":"" + runtime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(spokenlanguages==null?"null":spokenlanguages, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(status==null?"null":status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tagline==null?"null":tagline, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(title==null?"null":title, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(vote_average==null?"null":"" + vote_average, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(vote_count==null?"null":"" + vote_count, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(budget==null?"null":"" + budget, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(genre==null?"null":genre, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(homepage==null?"null":homepage, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(movie_id==null?"null":"" + movie_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(keyword==null?"null":keyword, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(original_language==null?"null":original_language, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(original_title==null?"null":original_title, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(overview==null?"null":overview, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(popularity==null?"null":"" + popularity, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(productioncompany==null?"null":productioncompany, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(productioncountry==null?"null":productioncountry, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(release_date==null?"null":release_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(revenue==null?"null":"" + revenue, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(runtime==null?"null":"" + runtime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(spokenlanguages==null?"null":spokenlanguages, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(status==null?"null":status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tagline==null?"null":tagline, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(title==null?"null":title, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(vote_average==null?"null":"" + vote_average, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(vote_count==null?"null":"" + vote_count, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.budget = null; } else {
      this.budget = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.genre = null; } else {
      this.genre = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.homepage = null; } else {
      this.homepage = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.movie_id = null; } else {
      this.movie_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.keyword = null; } else {
      this.keyword = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.original_language = null; } else {
      this.original_language = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.original_title = null; } else {
      this.original_title = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.overview = null; } else {
      this.overview = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.popularity = null; } else {
      this.popularity = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.productioncompany = null; } else {
      this.productioncompany = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.productioncountry = null; } else {
      this.productioncountry = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.release_date = null; } else {
      this.release_date = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.revenue = null; } else {
      this.revenue = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.runtime = null; } else {
      this.runtime = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.spokenlanguages = null; } else {
      this.spokenlanguages = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.status = null; } else {
      this.status = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tagline = null; } else {
      this.tagline = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.title = null; } else {
      this.title = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.vote_average = null; } else {
      this.vote_average = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.vote_count = null; } else {
      this.vote_count = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.budget = null; } else {
      this.budget = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.genre = null; } else {
      this.genre = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.homepage = null; } else {
      this.homepage = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.movie_id = null; } else {
      this.movie_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.keyword = null; } else {
      this.keyword = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.original_language = null; } else {
      this.original_language = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.original_title = null; } else {
      this.original_title = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.overview = null; } else {
      this.overview = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.popularity = null; } else {
      this.popularity = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.productioncompany = null; } else {
      this.productioncompany = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.productioncountry = null; } else {
      this.productioncountry = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.release_date = null; } else {
      this.release_date = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.revenue = null; } else {
      this.revenue = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.runtime = null; } else {
      this.runtime = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.spokenlanguages = null; } else {
      this.spokenlanguages = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.status = null; } else {
      this.status = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tagline = null; } else {
      this.tagline = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.title = null; } else {
      this.title = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.vote_average = null; } else {
      this.vote_average = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.vote_count = null; } else {
      this.vote_count = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    tmdb_movies o = (tmdb_movies) super.clone();
    return o;
  }

  public void clone0(tmdb_movies o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("budget", this.budget);
    __sqoop$field_map.put("genre", this.genre);
    __sqoop$field_map.put("homepage", this.homepage);
    __sqoop$field_map.put("movie_id", this.movie_id);
    __sqoop$field_map.put("keyword", this.keyword);
    __sqoop$field_map.put("original_language", this.original_language);
    __sqoop$field_map.put("original_title", this.original_title);
    __sqoop$field_map.put("overview", this.overview);
    __sqoop$field_map.put("popularity", this.popularity);
    __sqoop$field_map.put("productioncompany", this.productioncompany);
    __sqoop$field_map.put("productioncountry", this.productioncountry);
    __sqoop$field_map.put("release_date", this.release_date);
    __sqoop$field_map.put("revenue", this.revenue);
    __sqoop$field_map.put("runtime", this.runtime);
    __sqoop$field_map.put("spokenlanguages", this.spokenlanguages);
    __sqoop$field_map.put("status", this.status);
    __sqoop$field_map.put("tagline", this.tagline);
    __sqoop$field_map.put("title", this.title);
    __sqoop$field_map.put("vote_average", this.vote_average);
    __sqoop$field_map.put("vote_count", this.vote_count);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("budget", this.budget);
    __sqoop$field_map.put("genre", this.genre);
    __sqoop$field_map.put("homepage", this.homepage);
    __sqoop$field_map.put("movie_id", this.movie_id);
    __sqoop$field_map.put("keyword", this.keyword);
    __sqoop$field_map.put("original_language", this.original_language);
    __sqoop$field_map.put("original_title", this.original_title);
    __sqoop$field_map.put("overview", this.overview);
    __sqoop$field_map.put("popularity", this.popularity);
    __sqoop$field_map.put("productioncompany", this.productioncompany);
    __sqoop$field_map.put("productioncountry", this.productioncountry);
    __sqoop$field_map.put("release_date", this.release_date);
    __sqoop$field_map.put("revenue", this.revenue);
    __sqoop$field_map.put("runtime", this.runtime);
    __sqoop$field_map.put("spokenlanguages", this.spokenlanguages);
    __sqoop$field_map.put("status", this.status);
    __sqoop$field_map.put("tagline", this.tagline);
    __sqoop$field_map.put("title", this.title);
    __sqoop$field_map.put("vote_average", this.vote_average);
    __sqoop$field_map.put("vote_count", this.vote_count);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
