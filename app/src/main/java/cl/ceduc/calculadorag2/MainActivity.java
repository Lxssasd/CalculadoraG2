package cl.ceduc.calculadorag2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_0 = (Button) this.findViewById(R.id.button_0);
        Button btn_1 = (Button) this.findViewById(R.id.button_1);
        Button btn_2 = (Button) this.findViewById(R.id.button_2);
        Button btn_3 = (Button) this.findViewById(R.id.button_3);
        Button btn_4 = (Button) this.findViewById(R.id.button_4);
        Button btn_5 = (Button) this.findViewById(R.id.button_5);
        Button btn_6 = (Button) this.findViewById(R.id.button_6);
        Button btn_7 = (Button) this.findViewById(R.id.button_7);
        Button btn_8 = (Button) this.findViewById(R.id.button_8);
        Button btn_9 = (Button) this.findViewById(R.id.button_9);

        Button btn_plus = (Button) this.findViewById(R.id.button_plus);
        Button btn_minun = (Button) this.findViewById(R.id.button_minun);
        Button btn_multiply = (Button) this.findViewById(R.id.button_multiply);
        Button btn_divide = (Button) this.findViewById(R.id.button_divide);
        Button btn_point = (Button) this.findViewById(R.id.button_point);
        Button btn_clean = (Button) this.findViewById(R.id.button_clean);
        Button btn_back = (Button) this.findViewById(R.id.button_backespace);
        Button btn_equals = (Button) this.findViewById(R.id.button_equals);

        TextView txt_data = (TextView) this.findViewById(R.id.TextView_Data);

        btn_0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) { setDigito("0");
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) { setDigito("1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) { setDigito("2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) { setDigito("3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) { setDigito("4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) { setDigito("5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) { setDigito("6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) { setDigito("7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) { setDigito("8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) { setDigito("9");
            }
        });
        btn_clean.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {txt_data.setText("0"s);}{

            }
        });
    }
    void setDigito(String digito){
        TextView txt_data = (TextView) this.findViewById(R.id.TextView_Data);
        String actual = txt_data.getText().toString();
        float actual0 = Float.parseFloat(txt_data.getText().toString());
        int Numeros = txt_data.length();
        if (actual0 == 0){
            String nuevo = digito;
            txt_data.setText(nuevo);
        }
        else if (Numeros == 7){
            String nuevo= actual;
        }
        else{
            String nuevo = actual + digito;
            txt_data.setText(nuevo);
        }

    }
}
