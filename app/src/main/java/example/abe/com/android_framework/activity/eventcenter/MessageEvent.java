package example.abe.com.android_framework.activity.eventcenter;

/**
 * Created by Administrator on 2016/8/5.
 */
public class MessageEvent {
    private String mMessage;

    public MessageEvent(String message){
        mMessage = message;
    }

    public String getmMessage() {
        return mMessage;
    }

    public void setmMessage(String mMessage) {
        this.mMessage = mMessage;
    }
}