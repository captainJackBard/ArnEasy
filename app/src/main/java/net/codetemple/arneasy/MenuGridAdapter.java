package net.codetemple.arneasy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by zuriela on 27/11/2017.
 */

public class MenuGridAdapter extends BaseAdapter {
    Context context;

    private final String [] values;
    private final int [] images;

    View view;
    LayoutInflater layoutInflater;

    public MenuGridAdapter(Context context, String[] values, int[] images) {
        this.context = context;
        this.values = values;
        this.images = images;
    }

    @Override
    public int getCount() {
        return values.length;
    }

    @Override
    public String getItem(int position) {
        return values[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {
            view = new View(context);
            view = layoutInflater.inflate(R.layout.menu_item, null);
            ImageView imageView = (ImageView) view.findViewById(R.id.menuimageview);
            TextView textView = (TextView) view.findViewById(R.id.menutextview);
            imageView.setImageResource(images[position]);
            textView.setText(values[position]);
        }

        return view;
    }
}
