package com.example.drp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    CardView card1,card2,card3,card4,card5,card6,card7,card8;
    //today
    Dialog dialog;
    //today

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        card1=findViewById(R.id.card1);
        card2=findViewById(R.id.card2);
        card3=findViewById(R.id.card3);
        card4=findViewById(R.id.card4);
        card5=findViewById(R.id.card5);
        card6=findViewById(R.id.card6);
        card7=findViewById(R.id.card7);
        card8=findViewById(R.id.card8);
        //today
        dialog = new Dialog(this);
        //today

        //for card1
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCard1Dialog();
            }
        });
        //card1 ends
        //for card2
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCard2Dialog();
            }
        });
        //card 2 ends
        //for card3
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCard3Dialog();
            }
        });
        //card 3 ends
        //card4 starts
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCard4Dialog();
            }
        });
        //card4 ends
        //card5 starts
        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCard5Dialog();
            }
        });
        //card5 ends
        //card6 starts
        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCard6Dialog();
            }
        });
        //card6 ends
        //card7 starts
        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCard7Dialog();
            }
        });
        //card7 ends
        //card8 starts
        card8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCard8Dialog();
            }
        });
        //card8 ends
    }
    //1starts
    //today
    private void openCard1Dialog(){
        dialog.setContentView(R.layout.card1_layout_dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        ImageView imageViewClose=dialog.findViewById(R.id.imageViewclose);
        Button btnOK=dialog.findViewById(R.id.btnOK);

        imageViewClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Toast.makeText(Activity2.this, "Dialog Close", Toast.LENGTH_SHORT).show();
            }
        });

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Toast.makeText(Activity2.this, "OK", Toast.LENGTH_SHORT).show();
            }
        });



        dialog.show();

    }
    //today
    //1ends
    //2starts
    private void openCard2Dialog(){
        dialog.setContentView(R.layout.card2_layout_dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        ImageView imageViewClose=dialog.findViewById(R.id.imageViewclose);
        Button btnOK=dialog.findViewById(R.id.btnOK);

        imageViewClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Toast.makeText(Activity2.this, "Dialog Close", Toast.LENGTH_SHORT).show();
            }
        });

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Toast.makeText(Activity2.this, "OK", Toast.LENGTH_SHORT).show();
            }
        });



        dialog.show();


    }
    //2ends
    //3starts
    private void openCard3Dialog(){
        dialog.setContentView(R.layout.card3_layout_dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        ImageView imageViewClose=dialog.findViewById(R.id.imageViewclose);
        Button btnOK=dialog.findViewById(R.id.btnOK);

        imageViewClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Toast.makeText(Activity2.this, "Dialog Close", Toast.LENGTH_SHORT).show();
            }
        });

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Toast.makeText(Activity2.this, "OK", Toast.LENGTH_SHORT).show();
            }
        });



        dialog.show();


    }
    //3ends
    //4starts
    private void openCard4Dialog(){
        dialog.setContentView(R.layout.card4_layout_dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        ImageView imageViewClose=dialog.findViewById(R.id.imageViewclose);
        Button btnOK=dialog.findViewById(R.id.btnOK);

        imageViewClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Toast.makeText(Activity2.this, "Dialog Close", Toast.LENGTH_SHORT).show();
            }
        });

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Toast.makeText(Activity2.this, "OK", Toast.LENGTH_SHORT).show();
            }
        });



        dialog.show();


    }
    //4ends
    //5strats
    private void openCard5Dialog(){
        dialog.setContentView(R.layout.card5_layout_dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        ImageView imageViewClose=dialog.findViewById(R.id.imageViewclose);
        Button btnOK=dialog.findViewById(R.id.btnOK);

        imageViewClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Toast.makeText(Activity2.this, "Dialog Close", Toast.LENGTH_SHORT).show();
            }
        });

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Toast.makeText(Activity2.this, "OK", Toast.LENGTH_SHORT).show();
            }
        });



        dialog.show();


    }
    //5ends
    //6starts
    private void openCard6Dialog(){
        dialog.setContentView(R.layout.card6_layout_dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        ImageView imageViewClose=dialog.findViewById(R.id.imageViewclose);
        Button btnOK=dialog.findViewById(R.id.btnOK);

        imageViewClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Toast.makeText(Activity2.this, "Dialog Close", Toast.LENGTH_SHORT).show();
            }
        });

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Toast.makeText(Activity2.this, "OK", Toast.LENGTH_SHORT).show();
            }
        });



        dialog.show();


    }
    //6ends
    //7starts
    private void openCard7Dialog(){
        dialog.setContentView(R.layout.card7_layout_dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        ImageView imageViewClose=dialog.findViewById(R.id.imageViewclose);
        Button btnOK=dialog.findViewById(R.id.btnOK);

        imageViewClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Toast.makeText(Activity2.this, "Dialog Close", Toast.LENGTH_SHORT).show();
            }
        });

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Toast.makeText(Activity2.this, "OK", Toast.LENGTH_SHORT).show();
            }
        });



        dialog.show();


    }
    //7ends
    //8starts
    private void openCard8Dialog(){
        dialog.setContentView(R.layout.card8_layout_dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        ImageView imageViewClose=dialog.findViewById(R.id.imageViewclose);
        Button btnOK=dialog.findViewById(R.id.btnOK);

        imageViewClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Toast.makeText(Activity2.this, "Dialog Close", Toast.LENGTH_SHORT).show();
            }
        });

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Toast.makeText(Activity2.this, "OK", Toast.LENGTH_SHORT).show();
            }
        });



        dialog.show();


    }
    //8ends

}