package com.ktrjack.ftpchecker;

import android.app.Activity;
import android.os.Bundle
import android.widget.EditText;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.View;
import android.View.ViewGroup;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.app.AlertDialog;
import com.ktrjack.ftpchecker.CalcFTP;

public class FTPChecker extends Activity
{
    //variables
    private int L2_low;
    private int L3_low;
    private int sst_low;
    private int L4_low;
    private int L5_low;
    private int L6_low;
    private int L7_low;

    private int L1_high;
    private int L2_high;
    private int L3_high;
    private int sst_high;
    private int L4_high;
    private int L5_high;
    private int L6_high;


    /** Called when 
      the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        
        // create linear layout
        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        setContentView(ll);
        
        
        //setContentView(R.layout.main);
        // input FTP 
        EditText inftp = new EditText(this);
        
        //To input numbers
        inftp.setContentType ( InputType.TYPE_CLASS_NUMBER );
        // add to view
        //setContentView(inftp, new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
        ll.addView(edit, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));

        // get inputed ftp with button action.
        Button btnCalc = new ButtoftPn(this);
        
        btnCalc.setText("Extimate FTP");
        btnCalc.setOnClickListener(new OnClickListener(){
                public void onClick(View v){
                    int ftp = inftp.getText();
                    AlertDialog.show(FTPChecker.this, "Input FTP", ftp, "ok", false);
                    CalcFTP calc = new CalcFTP(ftp);

                    //get each threthold
                    L1_high = calc.getL1_high();
                    L2_low  = calc.getL2_low();
                    L2_high = calc.getL2_high();
                    L3_low  = calc.getL3_low();
                    L3_high = calc.getL3_high();
                    L4_low  = calc.getL4_low();
                    L4_high = calc.getL4_high();
                    L5_low  = calc.getL5_low();
                    L5_high = calc.getL5_high();
                    L6_low  = calc.getL6_low();
                    L6_high = calc.getL6_high();
                    L7_low  = calc.getL7_low();

                }
        });

        // add to view
        ll.addView(btnCalc, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));
        

    }
}
