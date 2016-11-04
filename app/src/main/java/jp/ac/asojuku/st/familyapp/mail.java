package jp.ac.asojuku.st.familyapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by fukudomeryuga on 2016/11/02.
 */
public class mail extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
              //setContentView(R.layout.activity_pick_up);
            Button btnSend = (Button) this.findViewById(R.id.button);

            btnSend.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    //RadioGroup rgPlace = (RadioGroup) findViewById(R.id.rg_place);
                    //int checkedId = rgPlace.getCheckedRadioButtonId();
                    //String strPlace = ((RadioButton) findViewById(checkedId)).getText().toString();


                }

            });


        }
}
