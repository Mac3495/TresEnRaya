package com.primera.android.tresenraya;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


public class DosJugadoresActivity extends ActionBarActivity implements View.OnClickListener{

    int sw=0;
    ImageButton a,b,c,d,e,f,g,h,i;
    Button re;
    matris m = new matris();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos_jugadores);

        a = (ImageButton) findViewById(R.id.imageButton);
        b = (ImageButton) findViewById(R.id.imageButton2);
        c = (ImageButton) findViewById(R.id.imageButton3);
        d = (ImageButton) findViewById(R.id.imageButton4);
        e = (ImageButton) findViewById(R.id.imageButton5);
        f = (ImageButton) findViewById(R.id.imageButton6);
        g = (ImageButton) findViewById(R.id.imageButton7);
        h = (ImageButton) findViewById(R.id.imageButton8);
        i = (ImageButton) findViewById(R.id.imageButton9);
        re = (Button) findViewById(R.id.button);

        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        e.setOnClickListener(this);
        f.setOnClickListener(this);
        g.setOnClickListener(this);
        h.setOnClickListener(this);
        i.setOnClickListener(this);
        re.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.imageButton:
                if(sw==0){
                    a.setImageResource(R.drawable.equis);
                    sw=1;
                    m.setElementoX(0,0);
                    a.setEnabled(false);
                    if(m.horizontalX()){
                        sw=2;
                        Toast.makeText(getApplicationContext(), "Ganador 'X'", Toast.LENGTH_SHORT).show();
                    }
                    if(m.verticalX()){
                        sw=2;
                        Toast.makeText(getApplicationContext(),"Ganador 'X'",Toast.LENGTH_SHORT).show();
                    }
                    if(m.diagonalX()){
                        sw=2;
                        Toast.makeText(getApplicationContext(),"Ganador 'X'",Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    if(sw==1) {
                        a.setImageResource(R.drawable.circulo);
                        sw = 0;
                        m.setElementoO(0, 0);
                        a.setEnabled(false);
                        if (m.horizontalO()) {
                            sw=2;
                            Toast.makeText(getApplicationContext(), "Ganador 'O'", Toast.LENGTH_SHORT).show();
                        }
                        if(m.verticalO()){
                            sw=2;
                            Toast.makeText(getApplicationContext(),"Ganador 'O'",Toast.LENGTH_SHORT).show();
                        }
                        if(m.diagonalO()){
                            sw=2;
                            Toast.makeText(getApplicationContext(),"Ganador 'O'",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
                break;
            case R.id.imageButton2:
                if(sw==0){
                    b.setImageResource(R.drawable.equis);
                    sw=1;
                    m.setElementoX(0,1);
                    b.setEnabled(false);
                    if(m.horizontalX()){
                        sw=2;
                        Toast.makeText(getApplicationContext(),"Ganador 'X'",Toast.LENGTH_SHORT).show();
                    }
                    if(m.verticalX()){
                        sw=2;
                        Toast.makeText(getApplicationContext(),"Ganador 'X'",Toast.LENGTH_SHORT).show();
                    }
                    if(m.diagonalX()){
                        sw=2;
                        Toast.makeText(getApplicationContext(),"Ganador 'X'",Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    if(sw==1) {
                        b.setImageResource(R.drawable.circulo);
                        sw = 0;
                        m.setElementoO(0, 1);
                        b.setEnabled(false);
                        if (m.horizontalO()) {
                            sw=2;
                            Toast.makeText(getApplicationContext(), "Ganador 'O'", Toast.LENGTH_SHORT).show();
                        }
                        if(m.verticalO()){
                            sw=2;
                            Toast.makeText(getApplicationContext(),"Ganador 'O'",Toast.LENGTH_SHORT).show();
                        }
                        if(m.diagonalO()){
                            sw=2;
                            Toast.makeText(getApplicationContext(),"Ganador 'O'",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
                break;
            case R.id.imageButton3:
                if(sw==0){
                    c.setImageResource(R.drawable.equis);
                    sw=1;
                    m.setElementoX(0,2);
                    c.setEnabled(false);
                    if(m.horizontalX()){
                        sw=2;
                        Toast.makeText(getApplicationContext(),"Ganador 'X'",Toast.LENGTH_SHORT).show();
                    }
                    if(m.verticalX()){
                        sw=2;
                        Toast.makeText(getApplicationContext(),"Ganador 'X'",Toast.LENGTH_SHORT).show();
                    }
                    if(m.diagonalX()){
                        sw=2;
                        Toast.makeText(getApplicationContext(),"Ganador 'X'",Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    if(sw==1) {
                        c.setImageResource(R.drawable.circulo);
                        sw = 0;
                        m.setElementoO(0, 2);
                        c.setEnabled(false);
                        if (m.horizontalO()) {
                            sw=2;
                            Toast.makeText(getApplicationContext(), "Ganador 'O'", Toast.LENGTH_SHORT).show();
                        }
                        if(m.verticalO()){
                            sw=2;
                            Toast.makeText(getApplicationContext(),"Ganador 'O'",Toast.LENGTH_SHORT).show();
                        }
                        if(m.diagonalO()){
                            sw=2;
                            Toast.makeText(getApplicationContext(),"Ganador 'O'",Toast.LENGTH_SHORT).show();
                        }
                    }

                }
                break;

            case R.id.imageButton4:
                if(sw==0){
                    d.setImageResource(R.drawable.equis);
                    sw=1;
                    m.setElementoX(1,0);
                    d.setEnabled(false);
                    if(m.horizontalX()){
                        sw=2;
                        Toast.makeText(getApplicationContext(),"Ganador 'X'",Toast.LENGTH_SHORT).show();
                    }
                    if(m.verticalX()){
                        sw=2;
                        Toast.makeText(getApplicationContext(),"Ganador 'X'",Toast.LENGTH_SHORT).show();
                    }
                    if(m.diagonalX()){
                        sw=2;
                        Toast.makeText(getApplicationContext(),"Ganador 'X'",Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    if(sw==1) {
                        d.setImageResource(R.drawable.circulo);
                        sw = 0;
                        m.setElementoO(1, 0);
                        d.setEnabled(false);
                        if (m.horizontalO()) {
                            sw=2;
                            Toast.makeText(getApplicationContext(), "Ganador 'O'", Toast.LENGTH_SHORT).show();
                        }
                        if(m.verticalO()){
                            sw=2;
                            Toast.makeText(getApplicationContext(),"Ganador 'O'",Toast.LENGTH_SHORT).show();
                        }
                        if(m.diagonalO()){
                            sw=2;
                            Toast.makeText(getApplicationContext(),"Ganador 'O'",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
                break;

            case R.id.imageButton5:
                if(sw==0){
                    e.setImageResource(R.drawable.equis);
                    sw=1;
                    m.setElementoX(1,1);
                    e.setEnabled(false);
                    if(m.horizontalX()){
                        sw=2;
                        Toast.makeText(getApplicationContext(),"Ganador 'X'",Toast.LENGTH_SHORT).show();
                    }
                    if(m.verticalX()){
                        sw=2;
                        Toast.makeText(getApplicationContext(),"Ganador 'X'",Toast.LENGTH_SHORT).show();
                    }
                    if(m.diagonalX()){
                        sw=2;
                        Toast.makeText(getApplicationContext(),"Ganador 'X'",Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    if(sw==1) {
                        e.setImageResource(R.drawable.circulo);
                        sw = 0;
                        m.setElementoO(1, 1);
                        e.setEnabled(false);
                        if (m.horizontalO()) {
                            sw=2;
                            Toast.makeText(getApplicationContext(), "Ganador 'O'", Toast.LENGTH_SHORT).show();
                        }
                        if(m.verticalO()){
                            sw=2;
                            Toast.makeText(getApplicationContext(),"Ganador 'O'",Toast.LENGTH_SHORT).show();
                        }
                        if(m.diagonalO()){
                            sw=2;
                            Toast.makeText(getApplicationContext(),"Ganador 'O'",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
                break;

            case R.id.imageButton6:
                if(sw==0){
                    f.setImageResource(R.drawable.equis);
                    sw=1;
                    m.setElementoX(1,2);
                    f.setEnabled(false);
                    if(m.horizontalX()){
                        sw=2;
                        Toast.makeText(getApplicationContext(),"Ganador 'X'",Toast.LENGTH_SHORT).show();
                    }
                    if(m.verticalX()){
                        sw=2;
                        Toast.makeText(getApplicationContext(),"Ganador 'X'",Toast.LENGTH_SHORT).show();
                    }
                    if(m.diagonalX()){
                        sw=2;
                        Toast.makeText(getApplicationContext(),"Ganador 'X'",Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    if(sw==1) {
                        f.setImageResource(R.drawable.circulo);
                        sw = 0;
                        m.setElementoO(1, 2);
                        f.setEnabled(false);
                        if (m.horizontalO()) {
                            sw=2;
                            Toast.makeText(getApplicationContext(), "Ganador 'O'", Toast.LENGTH_SHORT).show();
                        }
                        if(m.verticalO()){
                            sw=2;
                            Toast.makeText(getApplicationContext(),"Ganador 'O'",Toast.LENGTH_SHORT).show();
                        }
                        if(m.diagonalO()){
                            sw=2;
                            Toast.makeText(getApplicationContext(),"Ganador 'O'",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
                break;

            case R.id.imageButton7:
                if(sw==0){
                    g.setImageResource(R.drawable.equis);
                    sw=1;
                    m.setElementoX(2,0);
                    g.setEnabled(false);
                    if(m.horizontalX()){
                        sw=2;
                        Toast.makeText(getApplicationContext(),"Ganador 'X'",Toast.LENGTH_SHORT).show();
                    }
                    if(m.verticalX()){
                        sw=2;
                        Toast.makeText(getApplicationContext(),"Ganador 'X'",Toast.LENGTH_SHORT).show();
                    }
                    if(m.diagonalX()){
                        sw=2;
                        Toast.makeText(getApplicationContext(),"Ganador 'X'",Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    if(sw==1) {
                        g.setImageResource(R.drawable.circulo);
                        sw = 0;
                        m.setElementoO(2, 0);
                        g.setEnabled(false);
                        if (m.horizontalO()) {
                            sw=2;
                            Toast.makeText(getApplicationContext(), "Ganador 'O'", Toast.LENGTH_SHORT).show();
                        }
                        if(m.verticalO()){
                            sw=2;
                            Toast.makeText(getApplicationContext(),"Ganador 'O'",Toast.LENGTH_SHORT).show();
                        }
                        if(m.diagonalO()){
                            sw=2;
                            Toast.makeText(getApplicationContext(),"Ganador 'O'",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
                break;

            case R.id.imageButton8:
                if(sw==0){
                    h.setImageResource(R.drawable.equis);
                    sw=1;
                    m.setElementoX(2,1);
                    h.setEnabled(false);
                    if(m.horizontalX()){
                        sw=2;
                        Toast.makeText(getApplicationContext(),"Ganador 'X'",Toast.LENGTH_SHORT).show();
                    }
                    if(m.verticalX()){
                        sw=2;
                        Toast.makeText(getApplicationContext(),"Ganador 'X'",Toast.LENGTH_SHORT).show();
                    }
                    if(m.diagonalX()){
                        sw=2;
                        Toast.makeText(getApplicationContext(),"Ganador 'X'",Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    if(sw==1) {
                        h.setImageResource(R.drawable.circulo);
                        sw = 0;
                        m.setElementoO(2, 1);
                        h.setEnabled(false);
                        if (m.horizontalO()) {
                            sw=2;
                            Toast.makeText(getApplicationContext(), "Ganador 'O'", Toast.LENGTH_SHORT).show();
                        }
                        if(m.verticalO()){
                            sw=2;
                            Toast.makeText(getApplicationContext(),"Ganador 'O'",Toast.LENGTH_SHORT).show();
                        }
                        if(m.diagonalO()){
                            sw=2;
                            Toast.makeText(getApplicationContext(),"Ganador 'O'",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
                break;

            case R.id.imageButton9:
                if(sw==0){
                    i.setImageResource(R.drawable.equis);
                    sw=1;
                    m.setElementoX(2,2);
                    i.setEnabled(false);
                    if(m.horizontalX()){
                        sw=2;
                        Toast.makeText(getApplicationContext(),"Ganador 'X'",Toast.LENGTH_SHORT).show();
                    }
                    if(m.verticalX()){
                        sw=2;
                        Toast.makeText(getApplicationContext(),"Ganador 'X'",Toast.LENGTH_SHORT).show();
                    }
                    if(m.diagonalX()){
                        sw=2;
                        Toast.makeText(getApplicationContext(),"Ganador 'X'",Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    if(sw==1) {
                        i.setImageResource(R.drawable.circulo);
                        sw = 0;
                        m.setElementoO(2, 2);
                        i.setEnabled(false);
                        if (m.horizontalO()) {
                            sw=2;
                            Toast.makeText(getApplicationContext(), "Ganador 'O'", Toast.LENGTH_SHORT).show();
                        }
                        if(m.verticalO()){
                            sw=2;
                            Toast.makeText(getApplicationContext(),"Ganador 'O'",Toast.LENGTH_SHORT).show();
                        }
                        if(m.diagonalO()){
                            sw=2;
                            Toast.makeText(getApplicationContext(),"Ganador 'O'",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
                break;

            case R.id.button:
                Toast.makeText(getApplicationContext(),"Reiniciando",Toast.LENGTH_SHORT).show();
                m.LlenarMatris();
                for(int ii=0;ii<3;ii++){
                    for(int jj=0;jj<3;jj++){
                        if(m.getElemento(ii,jj)== 0){
                            sw=0;
                            a.setImageResource(R.drawable.blanco);
                            b.setImageResource(R.drawable.blanco);
                            c.setImageResource(R.drawable.blanco);
                            d.setImageResource(R.drawable.blanco);
                            e.setImageResource(R.drawable.blanco);
                            f.setImageResource(R.drawable.blanco);
                            g.setImageResource(R.drawable.blanco);
                            h.setImageResource(R.drawable.blanco);
                            i.setImageResource(R.drawable.blanco);
                            a.setEnabled(true);
                            b.setEnabled(true);
                            c.setEnabled(true);
                            d.setEnabled(true);
                            e.setEnabled(true);
                            f.setEnabled(true);
                            g.setEnabled(true);
                            h.setEnabled(true);
                            i.setEnabled(true);

                        }
                    }
                }
                break;

        }

    }
}
