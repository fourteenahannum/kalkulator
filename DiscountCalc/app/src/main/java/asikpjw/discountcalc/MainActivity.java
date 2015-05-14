package asikpjw.discountcalc;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnClickListener {



    //TextView input1, input2, result, notif;
    Button btHitung;
    EditText input1;
    EditText input2;
    TextView result;

//    private double HasilAkhir = 0;
    //private String Cek1 = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

        input1      = (EditText) findViewById(R.id.inputharga);
        input2      = (EditText) findViewById(R.id.inputdiskon);
        result      = (TextView) findViewById(R.id.hasil);

        btHitung    = (Button)  findViewById(R.id.hitung);

        btHitung.setOnClickListener(this);

    }

    //public void onClick(View view){
        //String num1 = input1.getText().toString();
        //Float a = input2 <= 0.75;
        //String num2 = input2.getText().toString();
        //String hasilnya = result.getText().toString();

//        int num1 = Integer.parseInt(input1.getText().toString());
//        int num2 = Integer.parseInt(input2.getText().toString());
//        int hasil = Integer.parseInt(result.getText().toString());


//        switch (view.getId()){
//            case R.id.hitung:
//                try {
                    //int a = input2 / 100;


    public void onClick(View view) {
    String inputHarga = input1.getText().toString();
    String inputDiskon = input2.getText().toString();
        double persenDiskon = Double.parseDouble(inputDiskon)*0.01;
        double besarDiskon = Double.parseDouble(inputHarga)*persenDiskon;
        double output = Double.parseDouble(inputHarga)-besarDiskon;

        result.setText(String.valueOf(output));

        }



//    public void klikEmpatlima (View V){
//        operation = 1;
//        operator.setText("45%");
//    }
//
//    public void klikLimapuluh (View V){
//        operation = 2;
//        operator.setText("50%");
//    }
//
//    public void klikHitung (View V){
//        Cek1 = input1.getText().toString();
//
//        if((Cek1.equalsIgnoreCase(""))){
//            notif.setText("Kolom tidak boleh kosong");
//        }
//        else{
//            int inputA = Integer.parseInt((input1.getText().toString()));
//
//            switch (operation){
//                case 1 :
//                    HasilAkhir = inputA * (45/100);
//                    break;
//                case 2 :
//                    HasilAkhir = inputA * (50/100);
//                    break;
//
//                case 0 :
//                    notif.setText("Harap pilih diskon terlebih dahulu");
//                    break;
//
//                default:
//                    notif.setText("Error");
//            }
//        }
//    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
