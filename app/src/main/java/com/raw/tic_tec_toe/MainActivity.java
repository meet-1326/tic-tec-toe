package com.raw.tic_tec_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int op = 0;
    int r11= 0, r12= 0, r13= 0, r21= 0, r22= 0, r23= 0, r31= 0, r32= 0,r33= 0;

    Button reset;
    TextView t11, t12, t13, t21, t22, t23, t31, t32, t33,first;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reset = findViewById(R.id.reset);

        t11 = findViewById(R.id.t11);
        t12 = findViewById(R.id.t12);
        t13 = findViewById(R.id.t13);

        t21 = findViewById(R.id.t21);
        t22 = findViewById(R.id.t22);
        t23 = findViewById(R.id.t23);

        t31 = findViewById(R.id.t31);
        t32 = findViewById(R.id.t32);
        t33 = findViewById(R.id.t33);

        first = findViewById(R.id.first);

            if (op == 0) {
                first.setText("First : O");
            }else{
                first.setText("First : X");
            }

        t11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r11 == 0) {
                    if (op == 0) {
                        t11.setText("O");
                        op = 1;
                    } else {
                        t11.setText("X");
                        op = 0;
                    }
                    r11++;
                    pro();
                } else {
                    Toast.makeText(MainActivity.this, "Already Use", Toast.LENGTH_SHORT).show();
                }
            }
        });
        t12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r12 == 0) {
                    if (op == 0) {
                        t12.setText("O");
                        op = 1;
                    } else {
                        t12.setText("X");
                        op = 0;
                    }
                    r12++;
                    pro();
                } else {
                    Toast.makeText(MainActivity.this, "Already Use", Toast.LENGTH_SHORT).show();
                }
            }
        });
        t13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r13 == 0) {
                    if (op == 0) {
                        t13.setText("O");
                        op = 1;
                    } else {
                        t13.setText("X");
                        op = 0;
                    }
                    r13++;
                    pro();
                } else {
                    Toast.makeText(MainActivity.this, "Already Use", Toast.LENGTH_SHORT).show();
                }
            }
        });

        t21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r21 == 0) {
                    if (op == 0) {
                        t21.setText("O");
                        op = 1;
                    } else {
                        t21.setText("X");
                        op = 0;
                    }
                    r21++;
                    pro();
                } else {
                    Toast.makeText(MainActivity.this, "Already Use", Toast.LENGTH_SHORT).show();
                }
            }
        });
        t22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r22 == 0) {
                    if (op == 0) {
                        t22.setText("O");
                        op = 1;
                    } else {
                        t22.setText("X");
                        op = 0;
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Already Use", Toast.LENGTH_SHORT).show();
                }
                r22++;
                pro();
            }
        });
        t23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r23 == 0) {
                    if (op == 0) {
                        t23.setText("O");
                        op = 1;
                    } else {
                        t23.setText("X");
                        op = 0;
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Already Use", Toast.LENGTH_SHORT).show();
                }
                r23++;
                pro();
            }
        });

        t31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r31 == 0) {
                    if (op == 0) {
                        t31.setText("O");
                        op = 1;
                    } else {
                        t31.setText("X");
                        op = 0;
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Already Use", Toast.LENGTH_SHORT).show();
                }
                r31++;
                pro();
            }
        });
        t32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r32 == 0) {
                    if (op == 0) {
                        t32.setText("O");
                        op = 1;
                    } else {
                        t32.setText("X");
                        op = 0;
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Already Use", Toast.LENGTH_SHORT).show();
                }
                r32++;
                pro();
            }
        });
        t33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r33 == 0) {
                    if (op == 0) {
                        t33.setText("O");
                        op = 1;
                    } else {
                        t33.setText("X");
                        op = 0;
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Already Use", Toast.LENGTH_SHORT).show();
                }
                r33++;
                pro();
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t11.setText("");
                t12.setText("");
                t13.setText("");

                t21.setText("");
                t22.setText("");
                t23.setText("");

                t31.setText("");
                t32.setText("");
                t33.setText("");

                if (op == 0) {
                    first.setText("First : O");
                }else{
                    first.setText("First : X");
                }
            }
        });
    }
    //pro
    void pro() {

        if(t11.getText().toString() == "O" && t12.getText().toString() == "O" && t13.getText().toString() == "O") {
            Toast.makeText(this, "Win", Toast.LENGTH_SHORT).show();
        }else if(t11.getText().toString() == "O" && t21.getText().toString() == "O" && t31.getText().toString() == "O"){
            Toast.makeText(this, "Win", Toast.LENGTH_SHORT).show();
        }else if(t11.getText().toString() == "O" && t22.getText().toString() == "O" && t33.getText().toString() == "O"){
            Toast.makeText(this, "Win", Toast.LENGTH_SHORT).show();
        }else if(t13.getText().toString() == "O" && t23.getText().toString() == "O" && t33.getText().toString() == "O") {
            Toast.makeText(this, "Win", Toast.LENGTH_SHORT).show();
        }else if(t13.getText().toString() == "O" && t22.getText().toString() == "O" && t31.getText().toString() == "O"){
            Toast.makeText(this, "Win", Toast.LENGTH_SHORT).show();
        }else if(t31.getText().toString() == "O" && t32.getText().toString() == "O" && t33.getText().toString() == "O"){
            Toast.makeText(this, "Win", Toast.LENGTH_SHORT).show();
        }else if(t12.getText().toString() == "O" && t22.getText().toString() == "O" && t32.getText().toString() == "O"){
            Toast.makeText(this, "Win", Toast.LENGTH_SHORT).show();
        }else if(t21.getText().toString() == "O" && t22.getText().toString() == "O" && t23.getText().toString() == "O"){
            Toast.makeText(this, "Win", Toast.LENGTH_SHORT).show();
        } else if(t11.getText().toString() == "X" && t12.getText().toString() == "X" && t13.getText().toString() == "X") {
            Toast.makeText(this, "Win", Toast.LENGTH_SHORT).show();
        }else if(t11.getText().toString() == "X" && t21.getText().toString() == "X" && t31.getText().toString() == "X"){
            Toast.makeText(this, "Win", Toast.LENGTH_SHORT).show();
        }else if(t11.getText().toString() == "X" && t22.getText().toString() == "X" && t33.getText().toString() == "X"){
            Toast.makeText(this, "Win", Toast.LENGTH_SHORT).show();
        }else if(t13.getText().toString() == "X" && t23.getText().toString() == "X" && t33.getText().toString() == "X") {
            Toast.makeText(this, "Win", Toast.LENGTH_SHORT).show();
        }else if(t13.getText().toString() == "X" && t22.getText().toString() == "X" && t31.getText().toString() == "X"){
            Toast.makeText(this, "Win", Toast.LENGTH_SHORT).show();
        }else if(t31.getText().toString() == "X" && t32.getText().toString() == "X" && t33.getText().toString() == "X"){
            Toast.makeText(this, "Win", Toast.LENGTH_SHORT).show();
        }else if(t12.getText().toString() == "X" && t22.getText().toString() == "X" && t32.getText().toString() == "X"){
            Toast.makeText(this, "Win", Toast.LENGTH_SHORT).show();
        }else if(t21.getText().toString() == "X" && t22.getText().toString() == "X" && t23.getText().toString() == "X"){
            Toast.makeText(this, "Win", Toast.LENGTH_SHORT).show();
        }else{
            if(t11.getText().toString().trim().length() != 0 && t12.getText().toString().trim().length() != 0 && t13.getText().toString().trim().length() != 0 && t21.getText().toString().trim().length() != 0 && t22.getText().toString().trim().length() != 0 && t23.getText().toString().trim().length() != 0 && t31.getText().toString().trim().length() != 0 && t32.getText().toString().trim().length() != 0 && t33.getText().toString().trim().length() != 0){
                Toast.makeText(this, "Try Again", Toast.LENGTH_SHORT).show();
            }
        }
    }
}