package com.example.wh.toucheventdispatchdemo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

/**
 * Created by wh on 18-10-19.
 */

@SuppressLint("AppCompatCustomView")
public class BaseTextView extends TextView {
    private static final String TAG = "testdemo--BaseTextView";
    public BaseTextView(Context context) {
        super(context);
    }

    public BaseTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BaseTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        if (ev.getAction() == MotionEvent.ACTION_DOWN) {
            Log.i(TAG, "dispatchTouchEvent: DOWN");
        } else if (ev.getAction() == MotionEvent.ACTION_UP) {
            Log.i(TAG, "dispatchTouchEvent: UP");
        } else if (ev.getAction() == MotionEvent.ACTION_MOVE) {
            Log.i(TAG, "onTouchEvent: MOVE");
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        if (ev.getAction() == MotionEvent.ACTION_DOWN) {
            Log.i(TAG, "onTouchEvent: DOWN");
        } else if (ev.getAction() == MotionEvent.ACTION_UP) {
            Log.i(TAG, "onTouchEvent: UP");
        } else if (ev.getAction() == MotionEvent.ACTION_MOVE) {
            Log.i(TAG, "onTouchEvent: MOVE");
        }
        return super.onTouchEvent(ev);
    }
}
