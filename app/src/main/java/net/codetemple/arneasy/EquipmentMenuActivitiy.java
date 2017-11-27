package net.codetemple.arneasy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

@EActivity
public class EquipmentMenuActivitiy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipment_menu);
    }

    @Click(R.id.btnBodyProtector)
    void viewBodyProtector() {
        BodyProtectorActivity_.intent(this).start();
    }

    @Click(R.id.btnStick)
    void viewWoodenSticks() {
        WoodenStickActivity_.intent(this).start();
    }

    @Click(R.id.btnHeadProtector)
    void viewHeadProtector() {
        HeadProtectorActivity_.intent(this).start();
    }

    @Click(R.id.btnForearm)
    void viewForearm() {
        ForearmActivity_.intent(this).start();
    }
}
