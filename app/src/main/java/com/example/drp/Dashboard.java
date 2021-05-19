package com.example.drp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.animation.ArgbEvaluator;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Dashboard extends AppCompatActivity {
    //recycler view starts
    ViewPager viewPager;
    Adapter adapter;
    List<Model> models;
    Integer[] colors=null;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();
    //recycler view ends

    int oldValue;
    private Button button3;
    Button changelang;
    String selectedLang = "English";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

       //changelanguage starts
        changelang = findViewById(R.id.changelang);
        changelang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showOptionsDialog();
            }
        });



         //recycler view starts
        models= new ArrayList<>();
        models.add(new Model("\nSwipe to understand how to use the App."));
        models.add(new Model("Step 1:\nClick on the upload button to select image from your device gallery."));
        models.add(new Model("Step 2:\nClick on the predict button to get instant analysis."));
        models.add(new Model("Step 3:\nClick on the language button to change the language."));
        models.add(new Model("Step 4:\nClick on the remedies button to know the remedies for the disease."));
        models.add(new Model("Step 5:\nCheck our best practices of gardening by clicking on the new tip button at the botton of the page."));
        models.add(new Model("In winters's chill or summer's heat, a farmer works so that the world can eat.\nWe Thank You!!"));






        adapter = new Adapter(models,this);
        viewPager=findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(130,0,130,0);

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
         //recycler view ends




        //new tip feature begins
        changeTextViewValueRandomlyOnButtonClick();

        //new tip feature ends
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }
    //changeLanguage starts
    private void showOptionsDialog() {
        String[] languages = {"English","हिंदी", "मराठी"};
        AlertDialog.Builder builder = new AlertDialog.Builder(Dashboard.this);
        builder.setTitle("Choose Language....");
        builder.setSingleChoiceItems(languages, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                selectedLang = languages[which];
                Toast.makeText(Dashboard.this, "You Selected " + selectedLang,Toast.LENGTH_SHORT).show();

            }
        });
        builder.setPositiveButton("Proceed", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
            builder.show();
    }
    //changeLanguage ends


    //new tip feaure begins
    private void changeTextViewValueRandomlyOnButtonClick(){
    final String[] manyDifferentStrings = {"Learn about Organic Farming","Research your plant zone","Consult other organic farmers","Don't Overwater", "Inspect for pests", "Use Vermicompost","Use fresh seeds","Remove the weeds"};
    final TextView changingText = (TextView) findViewById(R.id.text_to_change);
    Button changeTextButton = (Button) findViewById(R.id.change_text_button);

    changeTextButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int random = (int) (Math.random() * manyDifferentStrings.length);
            if (random == oldValue) {
                random = (int) (Math.random() * manyDifferentStrings.length);
            }
            changingText.setText(manyDifferentStrings[random]);
            oldValue = random;

        }
    });



    }
  //new tip feature ends







    public void openActivity2(){
        Intent intent = new Intent(this,Activity2.class);
        startActivity(intent);
    }
}