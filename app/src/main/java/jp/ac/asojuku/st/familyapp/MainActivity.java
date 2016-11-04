package jp.ac.asojuku.st.familyapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.cardList);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager llManager = new LinearLayoutManager(this);

        llManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llManager);

        ArrayList<MyData> uranai = new ArrayList<MyData>();
        for (int i = 0; i < Data.uranaiArray.length; i++) {
            uranai.add(new MyData(
                    Data.uranaiArray[i],
                    Data.comentArray[i]
            ));
        }

        RecyclerView.Adapter adapter = new UranaiAdapter(uranai, this);
        recyclerView.setAdapter(adapter);
        recyclerView.smoothScrollToPosition(uranai.size() - 1);


    }

}

