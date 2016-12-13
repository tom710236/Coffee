package com.example.user.coffee;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main2Activity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listDrinks = getListView();
        ArrayAdapter<Drink> listAdapter = new ArrayAdapter<Drink>(
                this,
                android.R.layout.simple_list_item_1,
                Drink.drinks);
        listDrinks.setAdapter(listAdapter);
    }
    public void onListItemClick(ListView listView,
                                View v,
                                int positon,
                                long id){
        Intent intent = new Intent(Main2Activity.this,Main3Activity.class);
        intent.putExtra(Main3Activity.EXTRA_DRINKNO, (int) id);
        startActivity(intent);
    }

}
