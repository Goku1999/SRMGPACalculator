package com.example.srmgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> myAdapter=new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.grades));
        s1=(Spinner)findViewById(R.id.spinner1);
        s2=(Spinner)findViewById(R.id.spinner2);
        s3=(Spinner)findViewById(R.id.spinner3);
        s4=(Spinner)findViewById(R.id.spinner4);
        s5=(Spinner)findViewById(R.id.spinner5);
        s6=(Spinner)findViewById(R.id.spinner6);
        s7=(Spinner)findViewById(R.id.spinner7);
        s8=(Spinner)findViewById(R.id.spinner8);
        s9=(Spinner)findViewById(R.id.spinner9);
        s10=(Spinner)findViewById(R.id.spinner10);
        s11=(Spinner)findViewById(R.id.spinner11);
        s1.setAdapter(myAdapter);
        s2.setAdapter(myAdapter);
        s3.setAdapter(myAdapter);
        s4.setAdapter(myAdapter);
        s5.setAdapter(myAdapter);
        s6.setAdapter(myAdapter);
        s7.setAdapter(myAdapter);
        s8.setAdapter(myAdapter);
        s9.setAdapter(myAdapter);
        s10.setAdapter(myAdapter);
        s11.setAdapter(myAdapter);
    }
    public void calculate(View view)
    {
        String s[]=new String[11];
        s[0]=s1.getSelectedItem().toString();
        s[1]=s2.getSelectedItem().toString();
        s[2]=s3.getSelectedItem().toString();
        s[3]=s4.getSelectedItem().toString();
        s[4]=s5.getSelectedItem().toString();
        s[5]=s6.getSelectedItem().toString();
        s[6]=s7.getSelectedItem().toString();
        s[7]=s8.getSelectedItem().toString();
        s[8]=s9.getSelectedItem().toString();
        s[9]=s10.getSelectedItem().toString();
        s[10]=s11.getSelectedItem().toString();
        int credit[]=new int[11];
        EditText e1=(EditText)findViewById(R.id.editText1);
        EditText e2=(EditText)findViewById(R.id.editText2);
        EditText e3=(EditText)findViewById(R.id.editText3);
        EditText e4=(EditText)findViewById(R.id.editText4);
        EditText e5=(EditText)findViewById(R.id.editText5);
        EditText e6=(EditText)findViewById(R.id.editText6);
        EditText e7=(EditText)findViewById(R.id.editText7);
        EditText e8=(EditText)findViewById(R.id.editText8);
        EditText e9=(EditText)findViewById(R.id.editText9);
        EditText e10=(EditText)findViewById(R.id.editText10);
        EditText e11=(EditText)findViewById(R.id.editText11);
        int i=0;
        try
        {
            credit[i] = Integer.parseInt(e1.getText().toString());
            i++;
            credit[i] = Integer.parseInt(e2.getText().toString());
            i++;
            credit[i] = Integer.parseInt(e3.getText().toString());
            i++;
            credit[i] = Integer.parseInt(e4.getText().toString());
            i++;
            credit[i] = Integer.parseInt(e5.getText().toString());
            i++;
            credit[i] = Integer.parseInt(e6.getText().toString());
            i++;
            credit[i] = Integer.parseInt(e7.getText().toString());
            i++;
            credit[i] = Integer.parseInt(e8.getText().toString());
            i++;
            credit[i] = Integer.parseInt(e9.getText().toString());
            i++;
            credit[i] = Integer.parseInt(e10.getText().toString());
            i++;
            credit[i] = Integer.parseInt(e11.getText().toString());
            i++;
        }
        catch(NumberFormatException e)
        {
        }
        int total=0;
        int ct=0;
        for(int x=0;x<i;x++)
        {
            int m=0;
            if(s[x].equals("--Select--"))
            {
                Toast.makeText(MainActivity.this,"Grade not selected", Toast.LENGTH_SHORT).show();
                break;
            }
            else if(s[x].equals("O"))
            {
                m=10;
            }
            else if(s[x].equals("A+"))
            {
                m=9;
            }
            else if(s[x].equals("A"))
            {
                m=8;
            }
            else if(s[x].equals("B+"))
            {
                m=7;
            }
            else if(s[x].equals("B"))
            {
                m=6;
            }
            else if(s[x].equals("C"))
            {
                m=5;
            }
            else if(s[x].equals("P"))
            {
                m=4;
            }
            else
            {
                m=0;
            }
            ct+=credit[x];
            total+=credit[x]*m;
        }
        double gpa=(double)total/ct;
        EditText editText=(EditText)findViewById(R.id.editText);
        editText.setText(gpa+"");
    }
}
