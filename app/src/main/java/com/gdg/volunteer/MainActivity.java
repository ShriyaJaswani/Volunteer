package com.gdg.volunteer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button submitBtn;
    EditText nameEdt,numberEdt;
    EditText emailEdt,collegeEdt;
    RadioButton radio1,radio2,radio3;
    Spinner yostudySpn;
    CheckBox reachingout,designing,marketing,writing,programming,management;
    CheckBox ch1,ch2,ch3,ch4,ch5,ch6,ch7,ch8,ch9,ch10,ch11;
    CheckBox WD,AD,SD,data,Block,CC,Devops,QC,comp,product,cyber;
    SeekBar ageSB;
    int age = 0;
    TextView agedis;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitBtn =  (Button)findViewById(R.id.submitbtn);
        nameEdt = (EditText)findViewById(R.id.nameET);
        emailEdt= (EditText)findViewById(R.id.emailET);
        collegeEdt= (EditText)findViewById(R.id.collegeET);
        numberEdt=(EditText)findViewById(R.id.numberET);
        radio1=(RadioButton)findViewById(R.id.radio1);
        radio2=(RadioButton)findViewById(R.id.radio2);
        radio3=(RadioButton)findViewById(R.id.radio3);
        yostudySpn=(Spinner)findViewById(R.id.yostudyspn);
        reachingout= (CheckBox)findViewById(R.id.reachingout);
        designing= (CheckBox)findViewById(R.id.designing);
        marketing= (CheckBox)findViewById(R.id.marketing);
        writing= (CheckBox)findViewById(R.id.writing);
        programming= (CheckBox)findViewById(R.id.programming);
        management= (CheckBox)findViewById(R.id.management);
        ch1= (CheckBox)findViewById(R.id.ch1);
        ch2= (CheckBox)findViewById(R.id.ch2);
        ch3= (CheckBox)findViewById(R.id.ch3);
        ch4= (CheckBox)findViewById(R.id.ch4);
        ch5= (CheckBox)findViewById(R.id.ch5);
        ch6= (CheckBox)findViewById(R.id.ch6);
        ch7= (CheckBox)findViewById(R.id.ch7);
        ch8=(CheckBox)findViewById(R.id.ch8);
        ch9=(CheckBox)findViewById(R.id.ch9);
        ch10=(CheckBox)findViewById(R.id.ch10);
        ch11=(CheckBox)findViewById(R.id.ch11);
        WD=(CheckBox)findViewById(R.id.WD);
        AD=(CheckBox)findViewById(R.id.AD);
        SD=(CheckBox)findViewById(R.id.SD);
        data=(CheckBox)findViewById(R.id.data);
        Block=(CheckBox)findViewById(R.id.Block);
        CC= (CheckBox)findViewById(R.id.CC);
        Devops=(CheckBox)findViewById(R.id.devops);
        QC=(CheckBox)findViewById(R.id.qc);
        comp=(CheckBox)findViewById(R.id.comp);
        product=(CheckBox)findViewById(R.id.product);
        cyber=(CheckBox)findViewById(R.id.cyber);
        ageSB=(SeekBar)findViewById(R.id.ageSB);
        agedis=(TextView)findViewById(R.id.agedis);


        ageSB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int min =15;
                if(progress<min){
                    age=min;
                }else{

                    age = progress;
                }agedis.setText(Integer.toString(age));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        submitBtn.setOnClickListener(new View.OnClickListener(){
                                         @Override
                                         public void onClick(View view){

                                             String name = nameEdt.getText().toString();
                                             String email = emailEdt.getText().toString();
                                             String college = collegeEdt.getText().toString();
                                             String yostudy = yostudySpn.getSelectedItem().toString();
                                             String number = numberEdt.getText().toString();
                                             String gender=null;
                                             if(radio1.isChecked()){
                                                 gender = "Female";
                                             }
                                             if(radio2.isChecked()){
                                                 gender= "Male";
                                             }
                                             if(radio3.isChecked()){
                                                 gender= "Other";
                                             }
                                             String expertise=null;
                                             if(reachingout.isChecked())
                                                 expertise=expertise + " Reachingout ";
                                             if (designing.isChecked())
                                                 expertise=expertise+" Designing ";
                                             if (marketing.isChecked())
                                                 expertise=expertise+" Marketing ";
                                             if (writing.isChecked())
                                                 expertise=expertise+" Writing ";
                                             if (programming.isChecked())
                                                 expertise=expertise+" Programming ";
                                             if (management.isChecked())
                                                 expertise=expertise+" Management ";


                                             String technologies=null;
                                             if (ch1.isChecked())
                                                 technologies=technologies+" Python ";
                                             if (ch2.isChecked())
                                                 technologies=technologies+" JavaScript ";
                                             if (ch3.isChecked())
                                                 technologies=technologies+" React ";
                                             if (ch4.isChecked())
                                                 technologies=technologies+" Angular ";
                                             if (ch5.isChecked())
                                                 technologies=technologies+" HTML+CSS ";
                                             if (ch6.isChecked())
                                                 technologies=technologies+" PHP ";
                                             if (ch7.isChecked())
                                                 technologies=technologies+" Node.js ";
                                             if (ch8.isChecked())
                                                 technologies=technologies+" SQL/NoSQL ";
                                             if (ch9.isChecked())
                                                 technologies=technologies+" C# ";
                                             if (ch10.isChecked())
                                                 technologies=technologies+" Go ";
                                             if (ch11.isChecked())
                                                 technologies=technologies+" Other ";

                                             String specialisations=null;
                                             if (WD.isChecked())
                                                 specialisations=specialisations+" Web Development ";
                                             if (AD.isChecked())
                                                 specialisations=specialisations+" App Development ";
                                             if (SD.isChecked())
                                                 specialisations=specialisations+" Software Development ";
                                             if (data.isChecked())
                                                 specialisations=specialisations+" Data Science ";
                                             if (Block.isChecked())
                                                 specialisations=specialisations+" Block Chain ";
                                             if (CC.isChecked())
                                                 specialisations=specialisations+" Cloud Computing ";
                                             if (Devops.isChecked())
                                                 specialisations=specialisations+" DevOps ";
                                             if (QC.isChecked())
                                                 specialisations=specialisations+" Quantum Computing ";
                                             if (comp.isChecked())
                                                 specialisations=specialisations+" Competitive Programming ";
                                             if (product.isChecked())
                                                 specialisations=specialisations+" Product Development ";
                                             if (cyber.isChecked())
                                                 specialisations=specialisations+" Cyber Security ";








                                             VolunteerList gf = new VolunteerList( email, name,age, college, yostudy, number, gender, expertise, technologies,specialisations) ;


                                             Intent i = new Intent(MainActivity.this, Main2Activity.class);
                                             i.putExtra("feedback",gf);

                                             startActivity(i);

                                         }

                                     }
        );



    }

}
