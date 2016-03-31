package garry.com.interactivestory.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import garry.com.interactivestory.R;


public class MainActivity extends Activity {

    private EditText nEditField;
    private Button nStartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nEditField =(EditText)findViewById(R.id.name);
        nStartButton =(Button)findViewById(R.id.Startbutton);
        nStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nName = nEditField.getText().toString();
                 startStory(nName);

            }
        });
    }

        private void startStory(String name){
            Intent intent = new Intent(this, StoryActivity.class);
            intent.putExtra(getString(R.string.key_name),name);
            startActivity(intent);
        }


    @Override
    protected void onResume() {

        super.onResume();

        nEditField.setText("");
    }
}
