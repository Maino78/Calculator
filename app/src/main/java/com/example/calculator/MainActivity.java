package com.example.calculator;

import androidx.annotation.IntegerRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.math.MathUtils;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {

    enum Operator {plus, minus, star, div}
    List<Float> numbers = new ArrayList<Float>();
    Float n1 = null;
    Float n2 = null;
    Integer res = null;
    Operator op = null;
    TextView screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        screen = findViewById(R.id.screenTxt);
    }


    public void numberTap(View view)
    {
        screen.setText(screen.getText().toString() + ((Button)view).getText().toString());
    }

    public void clearTap(View view)
    {
        screen.setText("");
        n1 = null;
        n2 = null;
    }

    public void equalsTap(View view)
    {
        Float result = 0f;
        n2 = Float.parseFloat(screen.getText().toString());

        switch (op)
        {
            case plus:
                result = n1+n2;
                break;
            case minus:
                result = n1-n2;
                break;
            case star:
                result = n1*n2;
                break;
            case div:
                result = n1/n2;
                break;
        }

        screen.setText(result.toString());
    }

    public void operatorTap(View view)
    {
        n1 = Float.parseFloat(screen.getText().toString());

        String opSign = ((Button)view).getText().toString();
        screen.setText(opSign);

        switch (opSign)
        {
            case "+":
                op = Operator.plus;
                break;
            case "-":
                op = Operator.minus;
                break;
            case "*":
                op = Operator.star;
                break;
            case "/":
                op = Operator.div;
                break;
        }
    }
}