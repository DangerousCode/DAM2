package com.example.alumnot.galeriagestos;

import android.app.Activity;
import android.app.ProgressDialog;
import android.gesture.Gesture;
import android.gesture.GestureOverlayView;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import java.util.ArrayList;
import java.util.logging.Handler;

public class MainActivity extends Activity implements GestureOverlayView.OnGesturePerformedListener {

    //GUI
    private ImageSwitcher switcher;
    private Button btnL;
    private Button btnR;

    //Logica de la aplicacion
    private int contador=-1; //control de imagen actual

    private int totalImagenes=0; //total de imagenes

    private ArrayList<Imagen> listaImagenes=new ArrayList<Imagen>();

    //Enum que guarda las direcciones para ir de una imagen a otra
    enum  enumDirection{DERECHA, IZQUIERDA};
    enumDirection direction=enumDirection.DERECHA;

    //Para la barra de progreso
    private ProgressDialog pDialog;
    public static final int progress_bar_type=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referencias a GUI
        switcher=(ImageSwitcher) findViewById(R.id.imageSwitcher);
        //preparamos el switcher
        switcher.setFactory(new MyImageSwitcherFactory());
        btnL=(Button) findViewById(R.id.btnleft);
        btnR=(Button) findViewById(R.id.btnright);

        //Runnable para la descarga del XML(hilo)
        Runnable hiloXML=new Runnable() {
            //Handler(manejador) para saber cuando acaba la tarea del Runnable
            Handler handler=new Handler();
            @Override

            //Tarea principal del hilo
            public void run(){

            }
        }
    }

    private class MyImageSwitcherFactory implements ViewSwitcher.ViewFactory{

        @Override
        public View makeView() {
            ImageView imageView=(ImageView)
                    LayoutInflater.from(getApplicationContext()).inflate(R.layout.image_item,switcher,false);
            return imageView;
        }
    }

    @Override
    public void onGesturePerformed(GestureOverlayView overlay, Gesture gesture) {

    }
}
