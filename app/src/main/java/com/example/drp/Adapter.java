package com.example.drp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager2.widget.ViewPager2;

import java.util.List;

public class Adapter extends PagerAdapter {


    private List<Model> models;

    public Adapter(List<Model> models, Context context) {
        this.models = models;
        this.context = context;
    }

    private LayoutInflater layoutInflater;
    private Context context;


    @Override
    public int getCount() {

        return models.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);

    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = LayoutInflater.from(context);
        View view= layoutInflater.inflate(R.layout.recycler_items,container,false);

        TextView steps;
        steps=view.findViewById(R.id.steps);
        steps.setText(models.get(position).getSteps());

        container.addView(view,0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((View)object);
    }
}
