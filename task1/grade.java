package com.example.samdopenended;

public class grade {
    int m;
    grade(String m)
    {
        try {
            this.m = Integer.valueOf(m);
        }catch (NumberFormatException nfe)
        {
            System.out.println("Could not parse " + nfe);
        }

    }
    public String Calculate()
    {
        if(m>=80)
        {
            return "A";
        }
        else if(m>=60 && m<80)
        {
            return "B";
        }
        else if(m>=40 && m<60)
        {
            return "C";
        }
        else
        {
            return "F";
        }
    }
}
