package tm.learner.tictocgame;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private AlertDialog.Builder builder;
    private String startResult = "";
    private Button btnStart,btnn1,btnn2,btnn3,btnn4,
                           btnn5,btnn6,btnn7,btnn8,btnn9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        btnStart = findViewById(R.id.startBtn);

        btnn1 = findViewById(R.id.btn1);
        btnn2 = findViewById(R.id.btn2);
        btnn3 = findViewById(R.id.btn3);
        btnn4 = findViewById(R.id.btn4);
        btnn5 = findViewById(R.id.btn5);
        btnn6 = findViewById(R.id.btn6);
        btnn7 = findViewById(R.id.btn7);
        btnn8 = findViewById(R.id.btn8);
        btnn9 = findViewById(R.id.btn9);

        //---------
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnStart.setText("ReStart");
                alertBuild();
            }
        });
        //---------

        btnn1.setOnClickListener(onClickListener);
        btnn2.setOnClickListener(onClickListener);
        btnn3.setOnClickListener(onClickListener);
        btnn4.setOnClickListener(onClickListener);
        btnn5.setOnClickListener(onClickListener);
        btnn6.setOnClickListener(onClickListener);
        btnn7.setOnClickListener(onClickListener);
        btnn8.setOnClickListener(onClickListener);
        btnn9.setOnClickListener(onClickListener);

    }

    private Button.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn1:
                    if (btnn1.getText().toString().equals("")){
                        btnn1.setText(startResult);
                        checked();
                        if(startResult.equals("X")){
                            startResult = "O";
                            btnn1.setTextColor(Color.GREEN);
                        }
                        else{
                            startResult = "X";
                            btnn1.setTextColor(Color.RED);
                        }

                    }
                    break;
                case R.id.btn2:

                    if (btnn2.getText().toString().equals("")){
                        btnn2.setText(startResult);
                        checked();
                        if(startResult.equals("X")){
                            startResult = "O";
                            btnn2.setTextColor(Color.GREEN);

                        }
                        else{
                            startResult = "X";
                            btnn2.setTextColor(Color.RED);
                        }
                    }
                    break;
                case R.id.btn3:
                    if (btnn3.getText().toString().equals("")){
                        btnn3.setText(startResult);
                        checked();
                        if(startResult.equals("X")){
                            startResult = "O";
                            btnn3.setTextColor(Color.GREEN);

                        }
                        else{
                            startResult = "X";
                            btnn3.setTextColor(Color.RED);

                        }
                    }
                    break;
                case R.id.btn4:
                    if (btnn4.getText().toString().equals("")){
                        btnn4.setText(startResult);
                        checked();
                        if(startResult.equals("X")){
                            startResult = "O";
                            btnn4.setTextColor(Color.GREEN);

                        }
                        else{
                            startResult = "X";
                            btnn4.setTextColor(Color.RED);
                        }
                    }
                    break;
                case R.id.btn5:
                    if (btnn5.getText().toString().equals("")){
                        btnn5.setText(startResult);
                        checked();
                        if(startResult.equals("X")){
                            startResult = "O";
                            btnn5.setTextColor(Color.GREEN);

                        }
                        else{
                            startResult = "X";
                            btnn5.setTextColor(Color.RED);

                        }
                    }
                    break;
                case R.id.btn6:
                    if (btnn6.getText().toString().equals("")){
                        btnn6.setText(startResult);
                        checked();
                        if(startResult.equals("X")){
                            startResult = "O";
                            btnn6.setTextColor(Color.GREEN);

                        }
                        else{
                            startResult = "X";
                            btnn6.setTextColor(Color.RED);

                        }
                    }
                    break;
                case R.id.btn7:
                    if (btnn7.getText().toString().equals("")){
                        btnn7.setText(startResult);
                        checked();
                        if(startResult.equals("X")){
                            startResult = "O";
                            btnn7.setTextColor(Color.GREEN);

                        }
                        else{
                            startResult = "X";
                            btnn7.setTextColor(Color.RED);

                        }
                    }
                    break;
                case R.id.btn8:
                    if (btnn8.getText().toString().equals("")){
                        btnn8.setText(startResult);
                        checked();
                        if(startResult.equals("X")){
                            startResult = "O";
                            btnn8.setTextColor(Color.GREEN);

                        }
                        else{
                            startResult = "X";
                            btnn8.setTextColor(Color.RED);

                        }
                    }
                    break;
                case R.id.btn9:
                    if (btnn9.getText().toString().equals("")){
                        btnn9.setText(startResult);
                        checked();
                        if(startResult.equals("X")){
                            startResult = "O";
                            btnn9.setTextColor(Color.GREEN);

                        }
                        else{
                            startResult = "X";
                            btnn9.setTextColor(Color.RED);
                        }
                    }
                    break;
            }
        }
    } ;


    public void alertWin(){
        builder = new AlertDialog.Builder(this);
        builder.setTitle("Gutlaýarys:  \" " + startResult + " \"")
                .setMessage("Dowam etmek isleýärsiňizmi??!")
                .setPositiveButton("Hawa", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                        clean();
                        Toast.makeText(MainActivity.this, "Hoş geldiňiz!", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("ýok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                        Toast.makeText(getApplicationContext(),"Sagbol!!",Toast.LENGTH_LONG).show();
                    }
                });
        AlertDialog newCreated = builder.create();
        newCreated.show();
    }

    public void alertBuild(){
        builder = new AlertDialog.Builder(this);
        builder.setMessage("Gahrymanlaryňyzy saýlaň!")
                .setPositiveButton("X", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                        startResult = "X";
                        Toast.makeText(getApplicationContext(),"Sen birinji \"X\"",Toast.LENGTH_SHORT).show();
                        clean();
                    }
                })
                .setNegativeButton("O", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                        startResult ="O";
                        Toast.makeText(getApplicationContext(),"Sen birinji \"O\"",Toast.LENGTH_SHORT).show();
                        clean();
                    }
                });
        AlertDialog create = builder.create();
        create.setTitle("Oýun oýnamaga başlalyň!");
        create.show();

    }

    public void clean(){
        btnn1.setText("");
        btnn2.setText("");
        btnn3.setText("");
        btnn4.setText("");
        btnn5.setText("");
        btnn6.setText("");
        btnn7.setText("");
        btnn8.setText("");
        btnn9.setText("");
    }

    public void checked(){
        /// ------ X --- 1 2 3 - 4 5 6 --- 7 8 9
        if(btnn1.getText().toString().equals("X") && btnn2.getText().toString().equals("X") && btnn3.getText().toString().equals("X")){
                    alertWin();
        }
        if(btnn4.getText().toString().equals("X") && btnn5.getText().toString().equals("X") && btnn6.getText().toString().equals("X")){
            alertWin();
        }
        if(btnn7.getText().toString().equals("X") && btnn8.getText().toString().equals("X") && btnn9.getText().toString().equals("X")){
            alertWin();
        }


        /// ------- X ----1 4 7 - 2 5 8 ---- 3 6 9
        if(btnn1.getText().toString().equals("X") && btnn4.getText().toString().equals("X") && btnn7.getText().toString().equals("X")){
            alertWin();
        }
        if(btnn2.getText().toString().equals("X") && btnn5.getText().toString().equals("X") && btnn8.getText().toString().equals("X")){
            alertWin();
        }
       if(btnn3.getText().toString().equals("X") && btnn6.getText().toString().equals("X") && btnn9.getText().toString().equals("X")){
            alertWin();
        }

        /// ------- X ---- 1 5 9 --- 3 5 7

        if(btnn1.getText().toString().equals("X") && btnn5.getText().toString().equals("X") && btnn9.getText().toString().equals("X")){
            alertWin();
        }
        if(btnn3.getText().toString().equals("X") && btnn5.getText().toString().equals("X") && btnn7.getText().toString().equals("X")){
            alertWin();
        }




        /////// ---------------- O ---------------------

        if(btnn1.getText().toString().equals("O") && btnn2.getText().toString().equals("O") && btnn3.getText().toString().equals("O")){
            alertWin();
        }
        if(btnn4.getText().toString().equals("O") && btnn5.getText().toString().equals("O") && btnn6.getText().toString().equals("O")){
            alertWin();
        }
        if(btnn7.getText().toString().equals("O") && btnn8.getText().toString().equals("O") && btnn9.getText().toString().equals("O")){
            alertWin();
        }


        /// ------- O ----1 4 7 - 2 5 8 ---- 3 6 9
        if(btnn1.getText().toString().equals("O") && btnn4.getText().toString().equals("O") && btnn7.getText().toString().equals("O")){
            alertWin();
        }
        if(btnn2.getText().toString().equals("O") && btnn5.getText().toString().equals("O") && btnn8.getText().toString().equals("O")){
            alertWin();
        }
        if(btnn3.getText().toString().equals("O") && btnn6.getText().toString().equals("O") && btnn9.getText().toString().equals("O")){
            alertWin();
        }

        /// ------- O ---- 1 5 9 --- 3 5 7

        if(btnn1.getText().toString().equals("O") && btnn5.getText().toString().equals("O") && btnn9.getText().toString().equals("O")){
            alertWin();
        }
        if(btnn3.getText().toString().equals("O") && btnn5.getText().toString().equals("O") && btnn7.getText().toString().equals("O")){
            alertWin();
        }
    }
}
