package garry.com.interactivestory.model;

/**
 * Created by Garry on 12/5/2015.
 */
public class choice {
    private String mText;
    private int mNextPage;

    public choice(String text,int NextPage){
        mText=text;
        mNextPage=NextPage;
   }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }

    public String getText() {

        return mText;
    }

    public void setText(String text) {
        mText = text;
    }
}
