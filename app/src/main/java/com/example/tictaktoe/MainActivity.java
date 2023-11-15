package com.example.tictaktoe;

import static java.nio.file.Files.find;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,newgame;
    String B1,B2,B3,B4,B5,B6,B7,B8,B9;
    int flag=0;
    int count=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        find();

        newgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resart();

            }
        });


    }


   public void check(View view) {
        Button button = (Button) view;

        if(button.getText().equals("")){
            count++;

        if(flag==0){
            button.setText("X");
            flag=1;
        }
        else{
            button.setText("O");
            flag=0;
        }

        if(count>4){
            B1=b1.getText().toString();
            B2=b2.getText().toString();
            B3=b3.getText().toString();
            B4=b4.getText().toString();
            B5=b5.getText().toString();
            B6=b6.getText().toString();
            B7=b7.getText().toString();
            B8=b8.getText().toString();
            B9=b9.getText().toString();

            if(B1.equals(B2)&&B2.equals(B3)&& !B1.equals("")){
                AlertDialog.Builder builder=new AlertDialog.Builder(this);
                builder.setTitle("Winner is " + B1)
                        .setMessage("Do you want play again?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                resart();

                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();

                            }
                        });
                builder.show();
            }
            else if (B4.equals(B5)&&B5.equals(B6)&& !B4.equals("")) {
                AlertDialog.Builder builder=new AlertDialog.Builder(this);
                builder.setTitle("Winner is " + B4)
                        .setMessage("Do you want play again?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                resart();

                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();

                            }
                        });
                builder.show();
            }
            else if (B7.equals(B8)&&B8.equals(B9)&& !B7.equals("")) {
                AlertDialog.Builder builder=new AlertDialog.Builder(this);
                builder.setTitle("Winner is " + B7)
                        .setMessage("Do you want play again?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                resart();

                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();

                            }
                        });
                builder.show();
            }
            else if (B1.equals(B4)&&B4.equals(B7)&& !B1.equals("")) {
                AlertDialog.Builder builder=new AlertDialog.Builder(this);
                builder.setTitle("Winner is " + B1)
                        .setMessage("Do you want play again?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                resart();

                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();

                            }
                        });
                builder.show();
            }
            else if (B2.equals(B5)&&B5.equals(B8)&& !B2.equals("")) {
                AlertDialog.Builder builder=new AlertDialog.Builder(this);
                builder.setTitle("Winner is " + B2)
                        .setMessage("Do you want play again?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                resart();

                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();

                            }
                        });
                builder.show();
            }
            else if (B3.equals(B6)&&B6.equals(B9)&& !B3.equals("")) {
                AlertDialog.Builder builder=new AlertDialog.Builder(this);
                builder.setTitle("Winner is " + B3)
                        .setMessage("Do you want play again?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                resart();

                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();

                            }
                        });
                builder.show();
            }
            else if (B1.equals(B5)&&B5.equals(B9)&& !B1.equals("")) {
                AlertDialog.Builder builder=new AlertDialog.Builder(this);
                builder.setTitle("Winner is " + B1)
                        .setMessage("Do you want play again?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                resart();

                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();

                            }
                        });
                builder.show();
            }
            else if (B3.equals(B5)&&B5.equals(B7)&& !B3.equals("")) {

                AlertDialog.Builder builder=new AlertDialog.Builder(this);
                builder.setTitle("Winner is " + B3)
                        .setMessage("Do you want play again?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                resart();

                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();

                            }
                        });
                builder.show();
            }
            else if (count==9) {
                AlertDialog.Builder builder=new AlertDialog.Builder(this);
                builder.setTitle("Game is Draw")
                        .setMessage("Do you want play again?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                resart();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                    finish();
                            }
                        });
                builder.show();

            }
        }}
    }



    public void resart() {
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        flag=0;
        count=0;
    }


   public void find() {
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        newgame=findViewById(R.id.newgame);
    }
}