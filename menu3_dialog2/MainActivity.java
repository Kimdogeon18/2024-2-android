package com.example.menu3_dialog2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.menu3_dialog_2.R;

public class MainActivity extends AppCompatActivity {
    EditText edtname, edthp;
    Button click, input;
    TextView tvname, tvhp;
    View dialog, toast; //대화 상자뷰
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("대화상자로 사용자정보입력창");
        tvname =findViewById(R.id.tvname);
        tvhp = findViewById(R.id.tvhp);
        input = findViewById(R.id.input);
        /*
        edtname = findViewById(R.id.edtname);
        edthp = findViewById(R.id.edthp);
        click = findViewById((R.id.click);
         */

        input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //대화상자뷰 내 엑티비티로 불러오기
                dialog =View.inflate(MainActivity.this, R.layout.dialog,null);
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("사용자 정보 입력창");
                dlg.setView(dialog);
                dlg.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        edtname = dialog.findViewById(R.id.edtname);
                        edthp = dialog.findViewById(R.id.edthp);
                        tvname.setText(edtname.getText().toString());
                        tvname.setBackgroundColor(Color.LTGRAY);
                        tvhp.setText(edthp.getText().toString());
                        tvhp.setBackgroundColor(Color.CYAN);
                    }
                });

                dlg.setNegativeButton("cancle", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast toast=new Toast(getApplicationContext());
                        Toast.
                                R.layout.toast, null);
                    }
                });
                dlg.show();
            }
        });
    }//onCreate
}//class