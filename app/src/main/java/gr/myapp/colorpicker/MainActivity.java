package gr.myapp.colorpicker;



import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnLongClickListener, View.OnTouchListener {

    TextView sb1,sb2,sb3, textColor;
    RelativeLayout rl;
    Button r1,r2;
    Button g1,g2;
    Button b1,b2;
    int r,g,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sb1 = (TextView) findViewById(R.id.tx1);
        sb2 = (TextView) findViewById(R.id.tx2);
        sb3 = (TextView) findViewById(R.id.tx3);

        textColor = (TextView) findViewById(R.id.txtColor);

        r1 = (Button) findViewById(R.id.bt1);
        r1.setOnLongClickListener(this);
        r1.setOnTouchListener(this);
        r2 = (Button) findViewById(R.id.bt2);
        r2.setOnLongClickListener(this);
        r2.setOnTouchListener(this);

        g1 = (Button) findViewById(R.id.bt3);
        g1.setOnLongClickListener(this);
        g1.setOnTouchListener(this);
        g2 = (Button) findViewById(R.id.bt4);
        g2.setOnLongClickListener(this);
        g2.setOnTouchListener(this);

        b1 = (Button) findViewById(R.id.bt5);
        b1.setOnLongClickListener(this);
        b1.setOnTouchListener(this);
        b2 = (Button) findViewById(R.id.bt6);
        b2.setOnLongClickListener(this);
        b2.setOnTouchListener(this);

        rl = (RelativeLayout) findViewById(R.id.activity_main);
    }


    public void changeBack1Plus(View v){

        r = Integer.valueOf(sb1.getText().toString());
        if(r<255) {

            sb1.setText(String.valueOf(r + 1));
        }
        rl();
    }
    public void changeBack1Min(View v){

        r = Integer.valueOf(sb1.getText().toString());
        if(r>0) {

            sb1.setText(String.valueOf(r - 1));
        }
        rl();
    }

    public void changeBack2Plus(View v){

        g = Integer.valueOf(sb2.getText().toString());
        if(g<255) {

            sb2.setText(String.valueOf(g + 1));
        }
        rl();
    }
    public void changeBack2Min(View v){

        g = Integer.valueOf(sb2.getText().toString());
        if(g>0) {

            sb2.setText(String.valueOf(g - 1));
        }
        rl();
    }

    public void changeBack3Plus(View v){

        b = Integer.valueOf(sb3.getText().toString());
        if(b<255) {

            sb3.setText(String.valueOf(b + 1));
        }
        rl();
    }
    public void changeBack3Min(View v){

        b = Integer.valueOf(sb3.getText().toString());
        if(b>0) {
            sb3.setText(String.valueOf(b - 1));
        }
        rl();
    }

    public void rl(){

        r=Integer.valueOf(sb1.getText().toString());

        g=Integer.valueOf(sb2.getText().toString());
       b=Integer.valueOf(sb3.getText().toString());

       String hex = String.format("#%02x%02x%02x", r,g,b);

        int c = Color.parseColor(hex);
        rl.setBackgroundColor(c);
        textColor.setText(hex);

    }


    @Override
    public boolean onLongClick(View view) {

        switch (view.getId())
        {
            case R.id.bt1:
                int r;
                r = Integer.valueOf(sb1.getText().toString());
                if(r>4) {

                    sb1.setText(String.valueOf(r - 5));
                }
                rl();
                break;

            case R.id.bt2:

                r = Integer.valueOf(sb1.getText().toString());
                if(r<251) {

                    sb1.setText(String.valueOf(r + 5));
                }
                rl();
                break;

            case R.id.bt3:
                int g;
                g = Integer.valueOf(sb2.getText().toString());
                if(g>4) {

                    sb2.setText(String.valueOf(g - 5));
                }
                rl();
                break;

            case R.id.bt4:

                g = Integer.valueOf(sb2.getText().toString());
                if(g<251) {

                    sb2.setText(String.valueOf(g + 5));
                }
                rl();
                break;

            case R.id.bt5:
                int b;
                b = Integer.valueOf(sb3.getText().toString());
                if(b>4) {

                    sb3.setText(String.valueOf(b - 5));
                }
                rl();
                break;

            case R.id.bt6:

                b = Integer.valueOf(sb3.getText().toString());
                if(b<251) {

                    sb3.setText(String.valueOf(b + 5));
                }
                rl();
                break;


        }


        return false;
    }



    @Override
    public boolean onTouch(View view, MotionEvent event) {


        switch (event.getAction()) {

            case MotionEvent.ACTION_MOVE:


                switch (view.getId())
                {
                    case R.id.bt1:
                        int r;
                        r = Integer.valueOf(sb1.getText().toString());
                        if(r>4) {

                            sb1.setText(String.valueOf(r - 5));
                        }
                        rl();
                        break;

                    case R.id.bt2:

                        r = Integer.valueOf(sb1.getText().toString());
                        if(r<251) {

                            sb1.setText(String.valueOf(r + 5));
                        }
                        rl();
                        break;

                    case R.id.bt3:
                        int g;
                        g = Integer.valueOf(sb2.getText().toString());
                        if(g>4) {

                            sb2.setText(String.valueOf(g - 5));
                        }
                        rl();
                        break;

                    case R.id.bt4:

                        g = Integer.valueOf(sb2.getText().toString());
                        if(g<251) {

                            sb2.setText(String.valueOf(g + 5));
                        }
                        rl();
                        break;

                    case R.id.bt5:
                        int b;
                        b = Integer.valueOf(sb3.getText().toString());
                        if(b>4) {

                            sb3.setText(String.valueOf(b - 5));
                        }
                        rl();
                        break;

                    case R.id.bt6:

                        b = Integer.valueOf(sb3.getText().toString());
                        if(b<251) {

                            sb3.setText(String.valueOf(b + 5));
                        }
                        rl();
                        break;


                }



                break;

            case MotionEvent.ACTION_DOWN:

                break;

            case MotionEvent.ACTION_UP:

                ;
                break;
        }




        return false;
    }


}
