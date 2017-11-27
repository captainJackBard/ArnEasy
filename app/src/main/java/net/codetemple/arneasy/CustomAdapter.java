package net.codetemple.arneasy;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.res.StringArrayRes;

public class CustomAdapter extends ArrayAdapter<String> {

    public CustomAdapter(@NonNull Context context, String[] rules) {
        super(context, R.layout.custom_row, rules);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater customInflater = LayoutInflater.from(getContext());
        View customView = customInflater.inflate(R.layout.custom_row, parent, false);

        String singleRule = getItem(position);
        TextView customText = (TextView) customView.findViewById(R.id.customRowText);
        ImageView customImg = (ImageView) customView.findViewById(R.id.customImageView);

        customText.setText(singleRule);
        return customView;
    }
}
