import java.util.UUID;

/**
 * Created by phorust on 4/1/18.
 */

public class Crime {
    private UUID mID;
    private String mTitle;

    public Crime(){
        //Generate unique identifier
        mID = UUID.randomUUID();
    }

    public UUID getID() {
        return mID;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
