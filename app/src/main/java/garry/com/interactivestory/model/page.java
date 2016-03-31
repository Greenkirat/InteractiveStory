package garry.com.interactivestory.model;

import android.media.Image;

/**
 * Created by Garry on 12/5/2015.
 */
public class page {
    private int mImageId;
    private String mText;
    private choice mchoice1;
    private choice mchoice2;
    private boolean mIsfinal = false;


    public page(int imageId, String text, choice choice1, choice choice2) {

        mImageId = imageId;
        mText = text;
        mchoice1 = choice1;
        mchoice2 = choice2;
    }

    public page(int imageId, String text) {
        mImageId = imageId;
        mText = text;
        mchoice1 = null;
        mchoice2 = null;
        mIsfinal = true;
    }

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public choice getMchoice1() {
        return mchoice1;
    }

    public void setMchoice1(choice mchoice1) {
        this.mchoice1 = mchoice1;
    }

    public choice getMchoice2() {
        return mchoice2;
    }

    public void setMchoice2(choice mchoice2) {
        this.mchoice2 = mchoice2;
    }

    public boolean isIsfinal() {
        return mIsfinal;
    }

    public void setIsfinal(boolean isfinal) {
        mIsfinal = isfinal;
    }

}

