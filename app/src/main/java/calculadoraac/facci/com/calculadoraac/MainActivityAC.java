package calculadoraac.facci.com.calculadoraac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivityAC extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener{


    Double nu1,nu2,resultado;
    String operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_ac);
    }

    public void acerca(View v){
        Intent pas = new Intent(this, AcercaActivtyAC.class);
        startActivity(pas);
    }

    public void borra(View v){
        nu1=0.0;
        nu2=0.0;
        EditText tv = (EditText) findViewById(R.id.idresulta) ;
        tv.setText("");
    }

    public void igual(View miView)
    {
        EditText tv = (EditText) findViewById(R.id.idresulta) ;
        nu2 = Double.parseDouble(tv.getText().toString());

        if(operador.equals("+"))
        {
            resultado= nu1+nu2;
        }
        else if(operador.equals("-"))
        {
            resultado= nu1-nu2;
        }
        else if(operador.equals("*"))
        {
            resultado= nu1*nu2;
        }
        else if(operador.equals("/"))
        {
            resultado= nu1/nu2;
        }
        tv.setText(resultado.toString());
    }

    public void mas(View miView)
    {
        operador="+";
        onClickOperacionCapturaNumero1(miView);
    }
    public void menos(View miView)
    {
        operador="-";
        onClickOperacionCapturaNumero1(miView);
    }
    public void multiplicar(View miView)
    {
        operador="*";
        onClickOperacionCapturaNumero1(miView);
    }
    /*public void onClickDivision(View miView)
    {
        operador="/";
        onClickOperacionCapturaNumero1(miView);
    }*/

    public void onClickOperacionCapturaNumero1(View miView)
    {
        EditText tv = (EditText) findViewById(R.id.idresulta) ;
        nu1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");
    }

    public void uno(View miView)
    {
        EditText tv = (EditText) findViewById(R.id.idresulta) ;
        tv.setText(tv.getText() + "1");
    }
    public void dos(View miView)
    {
        EditText tv = (EditText) findViewById(R.id.idresulta) ;
        tv.setText(tv.getText() + "2");
    }
    public void tres(View miView)
    {
        EditText tv = (EditText) findViewById(R.id.idresulta) ;
        tv.setText(tv.getText() + "3");
    }
    public void cuatro(View miView)
    {
        EditText tv = (EditText) findViewById(R.id.idresulta) ;
        tv.setText(tv.getText() + "4");
    }
    public void cinco(View miView)
    {
        EditText tv = (EditText) findViewById(R.id.idresulta) ;
        tv.setText(tv.getText() + "5");
    }
    public void seis(View miView)
    {
        EditText tv = (EditText) findViewById(R.id.idresulta) ;
        tv.setText(tv.getText() + "6");
    }
    public void siete(View miView)
    {
        EditText tv = (EditText) findViewById(R.id.idresulta) ;
        tv.setText(tv.getText() + "7");
    }
    public void ocho(View miView)
    {
        EditText tv = (EditText) findViewById(R.id.idresulta) ;
        tv.setText(tv.getText() + "8");
    }
    public void nueve(View miView)
    {
        EditText tv = (EditText) findViewById(R.id.idresulta) ;
        tv.setText(tv.getText() + "9");
    }
    public void cero(View miView)
    {
        EditText tv = (EditText) findViewById(R.id.idresulta) ;
        tv.setText(tv.getText() + "0");
    }

    @Override
    public void onClick(View v) {

        EditText pantalla = (EditText)findViewById(R.id.idresulta);
        int press = v.getId();
        String al = pantalla.getText().toString();

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }

}
