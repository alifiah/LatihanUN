package id.sch.smktelkom_mlg.project.xiirpl303132333.latihanun;
import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Database extends SQLiteOpenHelper {
    final static String DB_NAME = "db_kuis";

    public Database(Context context) {
        super(context, DB_NAME, null, 1);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE IF NOT EXISTS tbl_soal(id INTEGER PRIMARY KEY AUTOINCREMENT,  img BLOB)";
        db.execSQL(sql);

        ContentValues values = new ContentValues();
        values.put("img", R.drawable.bi_sd_2013_1);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_2);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_3);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_4);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_5);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_6);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_7);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_8);
        db.insert("tbl_soal", "soal", values);

	values.put("img", R.drawable.bi_sd_2013_9);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_10);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_11);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_12);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_13);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_14);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_15);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_16);
        db.insert("tbl_soal", "soal", values);

	values.put("img", R.drawable.bi_sd_2013_17);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_18);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_19);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_20);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_21);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_22);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_23);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_24);
        db.insert("tbl_soal", "soal", values);

	values.put("img", R.drawable.bi_sd_2013_25);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_26);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_27);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_28);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_29);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_30);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_31);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_32);
        db.insert("tbl_soal", "soal", values);

	values.put("img", R.drawable.bi_sd_2013_33);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_34);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_35);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_36);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_37);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_38);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_39);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_40);
        db.insert("tbl_soal", "soal", values);

	values.put("img", R.drawable.bi_sd_2013_41);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_42);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_43);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_44);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_45);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_46);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_47);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_48);
        db.insert("tbl_soal", "soal", values);

	values.put("img", R.drawable.bi_sd_2013_49);
        db.insert("tbl_soal", "soal", values);

        values.put("img", R.drawable.bi_sd_2013_50);
        db.insert("tbl_soal", "soal", values);

    }

    public List<Soal> getSoal(){
        List<Soal> listSoal = new ArrayList<Soal>();
        String query = "select * from tbl_soal";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);

        if(cursor.moveToFirst()){
            do{
                Soal s = new Soal();
                s.setGambar(cursor.getInt(1));
                listSoal.add(s);
            }while(cursor.moveToNext());
        }

        return listSoal;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS tbl_soal");
        onCreate(db);

    }

}