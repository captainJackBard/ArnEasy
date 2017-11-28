package net.codetemple.arneasy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.res.StringArrayRes;

@EActivity(R.layout.activity_rules)
public class RulesActvity extends AppCompatActivity {

    @ViewById(R.id.rulesListView)
    ListView rulesList;

    @StringArrayRes(R.array.arnis_rules)
    String[] rulesArray;

    @AfterViews
    void initialize() {
        ListAdapter rulesAdapter = new CustomAdapter(this, rulesArray);
        rulesList.setAdapter(rulesAdapter);
    }
}
