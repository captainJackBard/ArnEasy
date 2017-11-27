package net.codetemple.arneasy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;


@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @Click(R.id.btnExit)
    void exitApp() {
        System.exit(0);
    }

    @Click(R.id.btnRules)
    void viewRules() {
        RulesActvity_.intent(this).start();
    }

    @Click(R.id.btnAbout)
    void viewAbout() {
        AboutActivity_.intent(this).start();
    }

    @Click(R.id.btnEquipments)
    void viewEquipments() {
        EquipmentMenuActivitiy_.intent(this).start();
    }
}
