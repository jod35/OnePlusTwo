package application.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void onClickAdd(View view) {

        EditText x = (EditText) findViewById(R.id.editText2);

        EditText y=(EditText) findViewById(R.id.editText5);

        TextView z=(TextView) findViewById(R.id.textView);

        int num1 =Integer.parseInt(x.getText().toString());

        int num2 =Integer.parseInt(y.getText().toString());

        int sum = num1 + num2;

        z.setText(Integer.toString(sum));





    }



}
