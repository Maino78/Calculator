package com.example.calculator;

import java.io.ObjectStreamException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Calculator {
    
    public static Float Sum (List<Float> numbers)
    {
        float res = 0f;
        for (Float n:numbers)
        {
            res = res + n;
        }
        return res;
    }

    public static Float Sub (List<Float> numbers)
    {
        float res = 0f;
        for (Float n:numbers)
        {
            res = res - n;
        }
        return res;
    }

    public static Float Star (List<Float> numbers)
    {
        float res = 1f;
        for (Float n:numbers)
        {
            res = res * n;
        }
        return res;
    }

    public static Float Div (List<Float> numbers)
    {
        float res = (float) numbers.get(0);

        for (int i=1; i<numbers.size(); i++)
        {
            res = res /  numbers.get(i);
        }

        return res;
    }
}
