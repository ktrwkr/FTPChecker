package com.ktrjack.FTPChecker;
/*import android.app.Activity;
import android.os.Bundle
import android.widget.EditText;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.View;
import android.View.ViewGroup;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.app.AlertDialog;
*/

/* FTP calculation class*/
class CalcFTP {
   // do ftp calculation
   private int ftp;
   // FTPを設定
   public CalcFTP( final int ftp ){
        this.ftp = ftp;
    }
    //各閾値を返す
    public int getL1_high(){
        return this.ftp * 0.55;
    }
    public int getL2_low(){
        return this.ftp * 0.56;
    }
    public int getL2_high(){
        return this.ftp * 0.75;
    }
    public int getL3_low(){
        return this.ftp * 0.76;
    }
    public int getL3_high(){
        return this.ftp * 0.90;
    }
    public int getL4_low(){
        return this.ftp * 0.91;
    }
    public int getL4_high(){
        return this.ftp * 1.05;
    }
    public int getL5_low(){
        return this.ftp * 1.06;
    }
    public int getL5_high(){
        return this.ftp * 1.20;
    }
    public int getL6_low(){
        return this.ftp * 1.21;
    }
    public int getL6_high(){
        return this.ftp * 1.50;
    }
    public int getL7_low(){
        return this.ftp * 1.51;
    }
}
