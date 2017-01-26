package com.primera.android.tresenraya;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class UnJugadorActivity extends ActionBarActivity {

    private ImageButton x1;
    private ImageButton x2;
    private ImageButton x3;
    private ImageButton x4;
    private ImageButton x5;
    private ImageButton x6;
    private ImageButton x7;
    private ImageButton x8;
    private ImageButton x9;
    private String casilla1=new String("-1");
    private String casilla2=new String("-1");
    private String casilla3=new String("-1");
    private String casilla4=new String("-1");
    private String casilla5=new String("-1");
    private String casilla6=new String("-1");
    private String casilla7=new String("-1");
    private String casilla8=new String("-1");
    private String casilla9=new String("-1");
    private int jugador=0;
    private int contador=0;
    private Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_un_jugador);

        this.x1 = (ImageButton) findViewById(R.id.imageButton);
        this.x2 = (ImageButton) findViewById(R.id.imageButton2);
        this.x3 = (ImageButton) findViewById(R.id.imageButton3);
        this.x4 = (ImageButton) findViewById(R.id.imageButton4);
        this.x5 = (ImageButton) findViewById(R.id.imageButton5);
        this.x6 = (ImageButton) findViewById(R.id.imageButton6);
        this.x7 = (ImageButton) findViewById(R.id.imageButton7);
        this.x8 = (ImageButton) findViewById(R.id.imageButton8);
        this.x9 = (ImageButton) findViewById(R.id.imageButton9);

    }
    public void mensaje(String cadena) {
        String x = cadena;
        Toast.makeText(getApplicationContext(),x,Toast.LENGTH_SHORT).show();
    }
    public void pulsax1(View view){
        if(this.jugador==0 && view.isClickable()){
            this.casilla1="X";
            this.x1.setImageResource(R.drawable.equis);
            this.x1.setClickable(false);
            int fin= this.juegoAcabado();
            if(fin!=-1){
                if(fin==0){
                    mensaje("Gana X");
                    return;
                }
                else if(fin==2){
                    mensaje("Perdiste");
                    return;
                }
            }
            this.jugador=1;
            juegaCpu();
        }
        else if (this.jugador==1){
            this.casilla1="0";
            this.x1.setImageResource(R.drawable.circulo);
            this.x1.setClickable(false);
            int fin= this.juegoAcabado();
            if(fin!=-1){
                if(fin==1){
                    mensaje("Gana O");
                }
                else if(fin==2){
                    mensaje("Perdiste");
                }
            }
            this.jugador=0;
        }
    }

    public void pulsax2(View view){
        if(this.jugador==0 && view.isClickable()){
            this.casilla2="X";
            this.x2.setImageResource(R.drawable.equis);
            this.x2.setClickable(false);

            int fin= this.juegoAcabado();
            if(fin!=-1){
                if(fin==0){
                    mensaje("Gana X");
                    return;
                }
                else if(fin==2){
                    mensaje("Perdiste");
                    return;
                }
            }
            this.jugador=1;
            juegaCpu();
        }
        else if(this.jugador==1){
            this.casilla2="0";
            this.x2.setImageResource(R.drawable.circulo);
            this.x2.setClickable(false);
            int fin= this.juegoAcabado();
            if(fin!=-1){
                if(fin==1){
                    mensaje("Gana O");
                }
                else if(fin==2){
                    mensaje("Perdiste");
                }
            }
            this.jugador=0;
        }
    }
    public void pulsax3(View view){
        if(this.jugador==0 && view.isClickable()){
            this.casilla3="X";
            this.x3.setImageResource(R.drawable.equis);
            this.x3.setClickable(false);

            int fin= this.juegoAcabado();
            if(fin!=-1){
                if(fin==0){
                    mensaje("Gana X");
                    return;
                }
                else if(fin==2){
                    mensaje("Perdiste");
                    return;
                }
            }
            this.jugador=1;
            juegaCpu();
        }
        else if (this.jugador==1){
            this.casilla3="0";
            this.x3.setImageResource(R.drawable.circulo);
            this.x3.setClickable(false);
            int fin= this.juegoAcabado();
            if(fin!=-1){
                if(fin==1){
                    mensaje("Gana O");
                }
                else if(fin==2){
                    mensaje("Perdiste");
                }
            }
            this.jugador=0;
        }

    }
    public void pulsax4(View view){
        if(this.jugador==0 && view.isClickable()){
            this.casilla4="X";
            this.x4.setImageResource(R.drawable.equis);
            this.x4.setClickable(false);

            int fin= this.juegoAcabado();
            if(fin!=-1){
                if(fin==0){
                    mensaje("Gana X");
                    return;
                }

                else if(fin==2){
                    mensaje("Perdiste");
                    return;
                }
            }
            this.jugador=1;
            juegaCpu();
        }
        else if (this.jugador==1){
            this.casilla4="0";
            this.x4.setImageResource(R.drawable.circulo);
            this.x4.setClickable(false);
            int fin= this.juegoAcabado();
            if(fin!=-1){
                if(fin==1){
                    mensaje("Gana O");
                }

                else if(fin==2){
                    mensaje("Perdiste");
                }
            }
            this.jugador=0;
        }
    }
    public void pulsax5(View view){
        if(this.jugador==0 && view.isClickable()){
            this.casilla5="X";
            this.x5.setImageResource(R.drawable.equis);
            this.x5.setClickable(false);
            int fin= this.juegoAcabado();
            if(fin!=-1){
                if(fin==0){
                    mensaje("Gana X");
                    return;
                }
                else if(fin==2){
                    mensaje("Perdiste");
                    return;
                }
            }
            this.jugador=1;
            juegaCpu();
        }
        else if (this.jugador==1){
            this.casilla5="0";
            this.x5.setImageResource(R.drawable.circulo);
            this.x5.setClickable(false);
            int fin= this.juegoAcabado();
            if(fin!=-1){
                if(fin==1){
                    mensaje("Ganea O");
                }

                else if(fin==2){
                    mensaje("Perdiste");
                }
            }
            this.jugador=0;
        }
    }
    public void pulsax6(View view){
        if(this.jugador==0 && view.isClickable()){
            this.casilla6="X";
            this.x6.setImageResource(R.drawable.equis);
            this.x6.setClickable(false);
            int fin= this.juegoAcabado();
            if(fin!=-1){
                if(fin==0){
                    mensaje("Gana X");
                    return;
                }
                else if(fin==2){
                    mensaje("Perdiste");
                    return;
                }
            }
            this.jugador=1;
            juegaCpu();
        }
        else if (this.jugador==1){
            this.casilla6="0";
            this.x6.setImageResource(R.drawable.circulo);
            this.x6.setClickable(false);
            int fin= this.juegoAcabado();
            if(fin!=-1){
                if(fin==1){
                    mensaje("Gana O");
                }
                else if(fin==2){
                    mensaje("Perdiste");
                }
            }
            this.jugador=0;
        }
    }
    public void pulsax7(View view){
        if(this.jugador==0 && view.isClickable()){
            this.casilla7="X";
            this.x7.setImageResource(R.drawable.equis);
            this.x7.setClickable(false);

            int fin= this.juegoAcabado();
            if(fin!=-1){
                if(fin==0){
                    mensaje("Gana X");
                    return;
                }

                else if(fin==2){
                    mensaje("Perdiste");
                    return;
                }
            }
            this.jugador=1;
            juegaCpu();
        }
        else if (this.jugador==1){
            this.casilla7="0";
            this.x7.setImageResource(R.drawable.circulo);
            this.x7.setClickable(false);
            int fin= this.juegoAcabado();
            if(fin!=-1){
                if(fin==1){
                    mensaje("Gana O");
                }

                else if(fin==2){
                    mensaje("Perdiste");
                }
            }
            this.jugador=0;
        }
    }
    public void pulsax8(View view){
        if(this.jugador==0 && view.isClickable()){
            this.casilla8="X";
            this.x8.setImageResource(R.drawable.equis);
            this.x8.setClickable(false);
            int fin= this.juegoAcabado();
            if(fin!=-1){
                if(fin==0){
                    mensaje("Gana X");
                    return;
                }
                else if(fin==2){
                    mensaje("Perdiste");
                    return;
                }
            }
            this.jugador=1;
            juegaCpu();
        }
        else if (this.jugador==1){
            this.casilla8="0";
            this.x8.setImageResource(R.drawable.circulo);
            this.x8.setClickable(false);
            int fin= this.juegoAcabado();
            if(fin!=-1){
                if(fin==1){
                    mensaje("Gana O");
                }
                else if(fin==2){
                    mensaje("Perdiste");
                }
            }
            this.jugador=0;
        }
    }
    public void pulsax9(View view){
        if(this.jugador==0 && view.isClickable()){
            this.casilla9="X";
            this.x9.setImageResource(R.drawable.equis);
            this.x9.setClickable(false);

            int fin= this.juegoAcabado();
            if(fin!=-1){
                if(fin==0){
                    mensaje("Gana x");
                    return;
                }
                else if(fin==2){
                    mensaje("Perdiste");
                    return;
                }

            }
            this.jugador=1;
            juegaCpu();

        }
        else if (this.jugador==1){
            this.casilla9="0";
            this.x9.setImageResource(R.drawable.circulo);
            this.x9.setClickable(false);
            int fin= this.juegoAcabado();
            if(fin!=-1){
                if(fin==1){
                    mensaje("Gana O");
                }
                else if(fin==2){
                    mensaje("Perdiste");
                }
            }
            this.jugador=0;
        }
    }
    public void pulsaxborrar(View view){

        this.casilla1="-1";
        this.x1.setImageResource(R.drawable.blanco);
        this.x1.setClickable(true);

        this.casilla2="-1";
        this.x2.setImageResource(R.drawable.blanco);
        this.x2.setClickable(true);

        this.casilla3="-1";
        this.x3.setImageResource(R.drawable.blanco);
        this.x3.setClickable(true);

        this.casilla4="-1";
        this.x4.setImageResource(R.drawable.blanco);
        this.x4.setClickable(true);

        this.casilla5="-1";
        this.x5.setImageResource(R.drawable.blanco);
        this.x5.setClickable(true);

        this.casilla6="-1";
        this.x6.setImageResource(R.drawable.blanco);
        this.x6.setClickable(true);

        this.casilla7="-1";
        this.x7.setImageResource(R.drawable.blanco);
        this.x7.setClickable(true);

        this.casilla8="-1";
        this.x8.setImageResource(R.drawable.blanco);
        this.x8.setClickable(true);

        this.casilla9="-1";
        this.x9.setImageResource(R.drawable.blanco);
        this.x9.setClickable(true);

        if(contador==0){
            this.jugador=1;
            juegaCpu();
            contador=1;
        }
        else if (contador==1){
            this.jugador=0;
            contador=0;
        }


    }

    public void fin(){
        this.x1.setClickable(false);
        this.x2.setClickable(false);
        this.x3.setClickable(false);
        this.x4.setClickable(false);
        this.x5.setClickable(false);
        this.x6.setClickable(false);
        this.x7.setClickable(false);
        this.x8.setClickable(false);
        this.x9.setClickable(false);
    }

    public int juegoAcabado(){

                /* Diagonales */
        if(!this.x1.isClickable() && !this.x5.isClickable()  && !this.x9.isClickable()
                && this.casilla1.equals(this.casilla5) && this.casilla1.equals(this.casilla9)){
            this.fin();
            return jugador;
        }
        if(!this.x3.isClickable() && !this.x5.isClickable()  && !this.x7.isClickable()
                && this.casilla3.equals(this.casilla5)&& this.casilla3.equals(this.casilla7)){

            this.fin();
            return jugador;
        }

                /* Horizontales */
        if(!this.x1.isClickable() && !this.x2.isClickable()  && !this.x3.isClickable()
                && this.casilla1.equals(this.casilla2) && this.casilla1.equals(this.casilla3)){

            this.fin();
            return jugador;
        }

        if(!this.x4.isClickable() && !this.x5.isClickable()  && !this.x6.isClickable()
                && this.casilla4.equals(this.casilla5) && this.casilla4.equals(this.casilla6)){

            this.fin();
            return jugador;
        }

        if(!this.x7.isClickable() && !this.x8.isClickable()  && !this.x9.isClickable()
                && this.casilla7.equals(this.casilla8) && this.casilla7.equals(this.casilla9)){

            this.fin();
            return jugador;
        }

                /* Verticales */

        if(!this.x1.isClickable() && !this.x4.isClickable()  && !this.x7.isClickable()
                && this.casilla1.equals(this.casilla4) && this.casilla1.equals(this.casilla7)){

            this.fin();
            return jugador;
        }

        if(!this.x2.isClickable() && !this.x5.isClickable()  && !this.x8.isClickable()
                && this.casilla2.equals(this.casilla5) && this.casilla2.equals(this.casilla8)){

            this.fin();
            return jugador;
        }

        if(!this.x3.isClickable() && !this.x6.isClickable()  && !this.x9.isClickable()
                && this.casilla3.equals(this.casilla6) && this.casilla3.equals(this.casilla9)){

            this.fin();
            return jugador;
        }

        if(!this.x1.isClickable() && !this.x3.isClickable()  && !this.x3.isClickable()
                && !this.x4.isClickable() && !this.x5.isClickable()  && !this.x6.isClickable()
                && !this.x7.isClickable() && !this.x8.isClickable()  && !this.x9.isClickable() ){

            this.fin();
            return 2;//empate
        }

        return -1;//continua el juego

    }
    /*@Override
    public void onResume() {

        super.onResume();
    }
    @Override
    public void onStop() {

        super.onStop();
    }*/

    public String mejorCasilla(String jugador){

        if(this.x1.isClickable()){
            if ((casilla2.equals(jugador) && casilla3.equals(jugador)) ||
                    (casilla4.equals(jugador) && casilla7.equals(jugador)) ||
                    (casilla5.equals(jugador) && casilla9.equals(jugador))) {
                return "casilla1";
            }
        }

        if(this.x2.isClickable()){
            if ((casilla1.equals(jugador) && casilla3.equals(jugador)) ||
                    (casilla5.equals(jugador) && casilla8.equals(jugador))) {
                return "casilla2";
            }
        }
        if(this.x3.isClickable()){
            if ((casilla1.equals(jugador) && casilla2.equals(jugador)) ||
                    (casilla6.equals(jugador) && casilla9.equals(jugador)) ||
                    (casilla5.equals(jugador) && casilla7.equals(jugador))) {
                return "casilla3";
            }
        }
        if(this.x4.isClickable()){
            if ((casilla1.equals(jugador) && casilla7.equals(jugador)) ||
                    (casilla5.equals(jugador) && casilla6.equals(jugador))) {
                return "casilla4";
            }
        }

        if(this.x5.isClickable()){

            if ((casilla2.equals(jugador) && casilla8.equals(jugador)) ||
                    (casilla3.equals(jugador) && casilla7.equals(jugador)) ||
                    (casilla4.equals(jugador) && casilla6.equals(jugador))||
                    (casilla1.equals(jugador) && casilla9.equals(jugador))) {
                return "casilla5";
            }
        }
        if(this.x6.isClickable()){
            if ((casilla3.equals(jugador) && casilla9.equals(jugador)) ||
                    (casilla4.equals(jugador) && casilla5.equals(jugador))) {
                return "casilla6";
            }
        }
        if(this.x7.isClickable()){
            if ((casilla1.equals(jugador) && casilla4.equals(jugador)) ||
                    (casilla8.equals(jugador) && casilla9.equals(jugador)) ||
                    (casilla5.equals(jugador) && casilla3.equals(jugador))) {
                return "casilla7";
            }
        }
        if(this.x8.isClickable()){
            if ((casilla7.equals(jugador) && casilla9.equals(jugador)) ||
                    (casilla2.equals(jugador) && casilla5.equals(jugador))) {
                return "casilla8";
            }
        }
        if(this.x9.isClickable()){
            if ((casilla3.equals(jugador) && casilla6.equals(jugador)) ||
                    (casilla1.equals(jugador) && casilla5.equals(jugador))||
                    (casilla8.equals(jugador) && casilla7.equals(jugador))) {
                return "casilla9";
            }
        }

        return "-1";
    }

    public String casillaAleatoria(){

        List<Integer> casillasVacias = new ArrayList<Integer>();

        if(this.x1.isClickable()){
            casillasVacias.add(1);
        }


        if(this.x2.isClickable()){
            casillasVacias.add(2);
        }


        if(this.x3.isClickable()){
            casillasVacias.add(3);
        }


        if(this.x4.isClickable()){
            casillasVacias.add(4);
        }


        if(this.x5.isClickable()){
            casillasVacias.add(5);
        }


        if(this.x6.isClickable()){
            casillasVacias.add(6);
        }


        if(this.x7.isClickable()){
            casillasVacias.add(7);
        }


        if(this.x8.isClickable()){
            casillasVacias.add(8);
        }


        if(this.x9.isClickable()){
            casillasVacias.add(9);
        }

        int index = random.nextInt(casillasVacias.size());

        return "casilla"+casillasVacias.get(index);
    }

    public void juegaCpu(){

        String i=mejorCasilla("0");

        if(i.equals("-1")){
            i=mejorCasilla("X");

            if(i.equals("-1")){
                i=casillaAleatoria();

            }
        }

        if(i.equals("casilla1")){
            pulsax1(null);
        }
        else if(i.equals("casilla2")){
            pulsax2(null);
        }
        else if(i.equals("casilla3")){
            pulsax3(null);
        }
        else if(i.equals("casilla4")){
            pulsax4(null);
        }
        else if(i.equals("casilla5")){
            pulsax5(null);
        }
        else if(i.equals("casilla6")){
            pulsax6(null);
        }
        else if(i.equals("casilla7")){
            pulsax7(null);
        }
        else if(i.equals("casilla8")){
            pulsax8(null);
        }
        else if(i.equals("casilla9")){
            pulsax9(null);
        }
    }
}