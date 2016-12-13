package com.example.user.coffee;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main3Activity extends Activity {
    public static final String EXTRA_DRINKNO="drinkNO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        int drinkNo = (Integer)getIntent().getExtras().get(EXTRA_DRINKNO);
        Drink drink = Drink.drinks[drinkNo];

        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(drink.getImageResourceId());
        photo.setContentDescription(drink.getName());

        TextView name = (TextView)findViewById(R.id.name);
        name.setText(drink.getName());

        TextView description = (TextView)findViewById(R.id.description);
        description.setText(drink.getDescription());
    }
}
