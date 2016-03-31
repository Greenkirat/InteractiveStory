package garry.com.interactivestory.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import garry.com.interactivestory.R;
import garry.com.interactivestory.model.page;
import garry.com.interactivestory.model.story;

public class StoryActivity extends Activity {


    public static final String TAG = StoryActivity.class.getSimpleName();

    private story mStory =new story();
    private ImageView mImageView;
    private TextView mTextView;
    private Button mchoice1;
    private Button mchoice2;
    private String mName;
    private page mCurrentpage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Intent intent = getIntent();
       String mName= intent.getStringExtra(getString(R.string.key_name));
        if(mName==null){
            mName="friend";
        }
        Log.d(TAG, mName);

        mImageView=(ImageView)findViewById(R.id.StroryImageView);
        mTextView=(TextView)findViewById(R.id.storyTextView);
        mchoice1=(Button)findViewById(R.id.choiceButton1);
        mchoice2=(Button)findViewById(R.id.choiceButton2);
        load_page(0);

    }
    private void load_page(int Choice){

         mCurrentpage=mStory.getpage( Choice);
        Drawable drawable = getResources().getDrawable(mCurrentpage.getImageId());
        mImageView.setImageDrawable(drawable);

        String pageText=mCurrentpage.getText();
        pageText=String.format(pageText,mName);
        mTextView.setText(pageText);

        if(mCurrentpage.isIsfinal()){

            mchoice1.setVisibility(View.INVISIBLE);
            mchoice2.setText("PLAY AGAIN");
            mchoice2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }
        else{

        mchoice1.setText(mCurrentpage.getMchoice1().getText());
        mchoice2.setText(mCurrentpage.getMchoice2().getText());




            mchoice1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int nextpage = mCurrentpage.getMchoice1().getNextPage();
                    load_page(nextpage);

                }
            });

            mchoice2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int nextpage = mCurrentpage.getMchoice2().getNextPage();
                    load_page(nextpage);

                }
            });


        }

        }

    }




