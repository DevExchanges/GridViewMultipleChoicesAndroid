package info.devexchanges.gridviewmultiplechoices;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class SelectedItemsActivity extends AppCompatActivity {

    private TextView textView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        textView = new TextView(this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        textView.setLayoutParams(params);
        textView.setPadding(10, 10, 10, 10);
        textView.setTypeface(null, Typeface.BOLD);
        textView.setText("You selected: ");
        setContentView(textView);

        //get data from intent
        getIntentData();
    }

    @SuppressLint("SetTextI18n")
    public void getIntentData() {
        ArrayList<String> stringArrayList = getIntent().getStringArrayListExtra("SELECTED_LETTER");

        assert stringArrayList != null;
        if (stringArrayList.size() > 0) {
            for (int i = 0; i < stringArrayList.size(); i++) {
                if (i < stringArrayList.size() - 1) {
                    textView.setText(textView.getText() + stringArrayList.get(i) + ", ");
                } else {
                    textView.setText(textView.getText() + stringArrayList.get(i) +".");
                }
            }
        }
    }
}
