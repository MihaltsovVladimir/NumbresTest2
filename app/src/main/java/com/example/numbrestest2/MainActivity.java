package com.example.numbrestest2;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;
import java.net.URL;
import static utils.NetWorkUtils.generateURL;

public class MainActivity extends AppCompatActivity {

        private EditText searchField;                           //поле ввода текста
        private TextView result;                                //результат
        private Button searchButton;                            //поле кнопка



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchField=findViewById(R.id.et_search_field);
        result=findViewById(R.id.tv_result);
        searchButton=findViewById(R.id.bottom);

        View.OnClickListener onClickListener = new View.OnClickListener() {  //срабатывает при нажатии кнопки
            @Override
            public void onClick(View v) {
                URL generateURL=generateURL(searchField.getText().toString());

                result.setText(generateURL.toString());
            }
        };
        searchButton.setOnClickListener(onClickListener);  //связываем кнопку с листером


       }




}
