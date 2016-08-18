package example.abe.com.android_framework.activity.drawing.whiteboard.tool.step;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by abe on 16/8/18.
 */
public class TextStep implements IStep{
    private float posX, posY;
    private String mText;
    private Paint mPaint;

    public TextStep(String text, float x, float y, Paint paint){
        mText = text;
        posX = x;
        posY = y;
        mPaint = new Paint(paint);
    }

    @Override
    public void draw(Canvas canvas){
        canvas.drawText(mText, posX, posY, mPaint);
    }

    public void setPoint(float x, float y){
        posX = x;
        posY = y;
    }
}