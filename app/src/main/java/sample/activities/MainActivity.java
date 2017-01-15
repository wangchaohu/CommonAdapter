package sample.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.wch.commonadapter.R;

import sample.commonadapter.CommonAdapter;
import sample.commonadapter.ViewHolder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

//        ((RecyclerView)findViewById(R.id.recycleview)).setAdapter(new CommonAdapter(this, 6, R.layout.item_layout){
//            @Override
//            public void convert(ViewHolder helper, int position) {
//                helper.setText(R.id.textview, "通用adapter");
//                helper.setImg(R.id.imageview, R.mipmap.ic_launcher);
//            }
//        });

        ((ListView) findViewById(R.id.listview)).setAdapter(new CommonAdapter(this, 6, R.layout.item_layout) {
            @Override
            public void convert(ViewHolder helper, int position) {
                helper.setText(R.id.textview, "通用adapter");
                helper.setImg(R.id.imageview, R.mipmap.ic_launcher);
            }
        });
    }
}
