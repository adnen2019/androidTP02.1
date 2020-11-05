package com.example.tp021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tp021.R;

public class MainActivity extends AppCompatActivity {
    private Button button ;
    TextView textView ;
    public static final   String N="name";
    int number ;
    private static final String TAG=MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById((R.id.button));
        reponse() ;
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                hello();
            }
        });
        button=(Button)findViewById((R.id.button2));
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                count();
            }
        });
    }



    public void hello(){
                Intent intent =new Intent(this, MainActivity2.class);
       String num =textView.getText().toString();
        intent.putExtra(N,num);
        startActivity(intent);
    }


    public void count(){
         textView =findViewById(R.id.textView);
        number =Integer.parseInt(textView.getText().toString()) +1 ;
        textView.setText(Integer.toString(number));
    }

    public void reponse(){
        Log.d(TAG,"Question 1") ;
        Log.d(TAG,"La deuxième activité est ajoutée en tant que " +
                "classe Java, le fichier de présentation (layout) XML est créé et le fichier" +
                " AndroidManifest.xml est modifié pour déclarer une deuxième activité.") ;

        Log.d(TAG,"Question 2") ;
        Log.d(TAG,"Le bouton Up (Haut) de la barre d'applications n'apparaît" +
                " plus dans la deuxième activité pour renvoyer " +
                "l'utilisateur à l'activité parent.") ;

        Log.d(TAG,"Question 3") ;
        Log.d(TAG,"new Intent(Context context, Class<?> class)") ;

        Log.d(TAG,"Question 4") ;
        Log.d(TAG,"Comme extra d'intention (Intent)") ;

        Log.d(TAG,"Question 5") ;
        Log.d(TAG,"Tout ce qui précède") ;

    }
}
