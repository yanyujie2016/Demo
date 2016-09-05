package zhuoxin.com.myapp_833;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick_Button(View view) {

        View v=findViewById(R.id.viewstub);
        if(v!=null){
            v.setVisibility(View.VISIBLE);
        }else {
            setTitle("以替换");
        }
    }
}
