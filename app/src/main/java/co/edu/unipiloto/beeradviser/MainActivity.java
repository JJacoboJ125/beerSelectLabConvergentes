package co.edu.unipiloto.beeradviser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickFindProd(View view){
        TextView list = (TextView) findViewById(R.id.brands);
        Spinner color = (Spinner) findViewById(R.id.Color);
        String prodType = String.valueOf(color.getSelectedItemId());

        if(prodType.equals("0")){
            String temp = "1. madera" +
                    "\n2. hierro";

            list.setText(temp);
        }
        if(prodType.equals("1")){
            String temp = "1. semillas" +
                    "\n2. arroz" +
                    "\n3. naranjas";
            list.setText(temp);
        }
        if(prodType.equals("2")){
            String temp = "1. Agua" +
                    "\n2. Gasolina" +
                    "\n3. Petroleo";
            list.setText(temp);
        }

    }
}