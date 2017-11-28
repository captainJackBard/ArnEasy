package net.codetemple.arneasy;

import android.app.Application;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ItemClick;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    int[] images = {
            R.drawable.amonestation,
            R.drawable.karate,
            R.drawable.information,
            R.drawable.strikes,
            R.drawable.tips,
            R.drawable.door
    };

    String[] values = {
            "RULES",
            "EQUIPMENTS",
            "ABOUT ARNIS",
            "STRIKES",
            "TIPS & TRICKS",
            "EXIT"
    };

    @ViewById(R.id.grid)
    GridView grid;

    @AfterViews
    void initialize() {
        MenuGridAdapter adapter = new MenuGridAdapter(this, values, images);
        grid.setAdapter(adapter);
    }

    @ItemClick
    public void grid(String clickedItem) {
        if (clickedItem.equals("RULES"))
            RulesActvity_.intent(this).start();
        if (clickedItem.equals("EQUIPMENTS"))
            EquipmentMenuActivitiy_.intent(this).start();
        if (clickedItem.equals("ABOUT ARNIS"))
            AboutActivity_.intent(this).start();
        if (clickedItem.equals("STRIKES"))
            Strikes_.intent(this).start();
        if (clickedItem.equals("TIPS & TRICKS"))
            TipsAndTricksActivity_.intent(this).start();
        if (clickedItem.equals("EXIT")) {
            System.exit(0);
        }
    }

}
