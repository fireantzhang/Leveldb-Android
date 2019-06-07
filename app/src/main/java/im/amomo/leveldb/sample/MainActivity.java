package im.amomo.leveldb.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import im.amomo.leveldb.DBFactory;
import im.amomo.leveldb.LevelDB;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    private LevelDB db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.tv_text);

        db = DBFactory.open(this, "leveldb");

        db.put("name", "fireant");
        String name = db.getString("name");

        textView.setText(String.format("从 LevelDd 中读取到的名字：%s", name));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (db != null) {
            db.close();
            db.destroy();
        }
    }

}
