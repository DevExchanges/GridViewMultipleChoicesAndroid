package info.devexchanges.gridviewmultiplechoices;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;

public class GridItemView extends FrameLayout {

    private TextView textView;

    public GridItemView(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.item_grid, this);
        textView = (TextView) getRootView().findViewById(R.id.text);
    }

    public void display(String text, boolean isSelected) {
        textView.setText(text);
        display(isSelected);
    }

    public void display(boolean isSelected) {
        textView.setBackgroundResource(isSelected ? R.drawable.green_square : R.drawable.gray_square);
    }
}