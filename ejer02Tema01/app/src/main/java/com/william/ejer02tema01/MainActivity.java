package com.william.ejer02tema01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.william.ejer02tema01.model.Factorial;

public class

MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button factorialButton = findViewById(R.id.factorial_button);
        EditText factorialInput = findViewById(R.id.factorial_input);
        TextView factorialResult = findViewById(R.id.result_txt);
        factorialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String factorial = String.valueOf(factorialInput.getText());
                Toast.makeText(MainActivity.this, factorial, Toast.LENGTH_LONG).show();
                if (factorial.isEmpty())
                    factorialResult.setText("0");
                else
                    factorialResult.setText(String.valueOf(Factorial.calculate(Integer.parseInt(factorial))));
            }
        });
    }
}