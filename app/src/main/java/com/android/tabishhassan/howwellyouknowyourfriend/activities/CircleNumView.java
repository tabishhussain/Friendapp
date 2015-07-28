package com.android.tabishhassan.howwellyouknowyourfriend.activities;

import android.app.usage.UsageEvents;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.EventLog;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import com.android.tabishhassan.howwellyouknowyourfriend.R;
/**
 * Created by tabishhassan on 7/14/15.
 */
public class CircleNumView extends View {

    public Boolean Is_Added;
    private Paint circlePaint;

    public CircleNumView(Context context, AttributeSet attr) {
        super(context, attr);
        circlePaint = new Paint();
        TypedArray a = context.getTheme().obtainStyledAttributes(attr,
                R.styleable.CircleNumView, 0, 0);
        try {
            Is_Added = a.getBoolean(R.styleable.CircleNumView_IsAdded, false);
        }
        finally {
            a.recycle();
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int viewWidthHalf = this.getMeasuredWidth() / 2;
        int viewHeightHalf = this.getMeasuredHeight() / 2;
        int radius = 0,radius_2 = 0;
        if (viewWidthHalf > viewHeightHalf) {
            radius = viewHeightHalf;
        } else{
            radius = viewWidthHalf;
        }
        radius_2 = 5*radius/20;
        if(!Is_Added) {
            circlePaint.setStyle(Paint.Style.STROKE);
            circlePaint.setAntiAlias(true);
            circlePaint.setStrokeWidth(5);
            circlePaint.setColor(Color.BLACK);
            canvas.drawCircle(viewWidthHalf, viewHeightHalf, radius/2, circlePaint);
        }
        else
        {
            circlePaint.setStyle(Paint.Style.STROKE);
            circlePaint.setAntiAlias(true);
            circlePaint.setStrokeWidth(5);
            circlePaint.setColor(Color.BLACK);
            canvas.drawCircle(viewWidthHalf, viewHeightHalf, radius/2, circlePaint);
            circlePaint.setStyle(Paint.Style.FILL_AND_STROKE);
            circlePaint.setAntiAlias(true);
            circlePaint.setStrokeWidth(5);
            circlePaint.setColor(Color.parseColor("#ffff5458"));
            canvas.drawCircle(viewWidthHalf, viewHeightHalf, radius_2, circlePaint);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        super.onTouchEvent(event);
        if(event.getAction() == MotionEvent.ACTION_DOWN)
        {
            if(Is_Added)
            {
                setIs_Added(false);
            }
            else
            {
                setIs_Added(true);
            }
            return true;
        }
        return false;
    }

    public void setIs_Added(Boolean is_Added) {
        Is_Added = is_Added;
        invalidate();
    }


}
