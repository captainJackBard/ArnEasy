package net.codetemple.arneasy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.res.StringArrayRes;

@EActivity
public class RulesActvity extends AppCompatActivity {

    @ViewById(R.id.rulesListView)
    ListView rulesList;

    @StringArrayRes(R.array.arnis_rules)
    String[] rulesArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);

        ListAdapter rulesAdapter = new CustomAdapter(this, rulesArray);
        rulesList.setAdapter(rulesAdapter);
    }
}
