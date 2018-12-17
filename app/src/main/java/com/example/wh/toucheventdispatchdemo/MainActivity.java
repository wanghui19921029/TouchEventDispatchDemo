package com.example.wh.toucheventdispatchdemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnClickListener {
    private static final String TAG = "testdemo--MainActivity";
    private BaseFrameLayout mFrameLayout;
    private BaseRelativeLayout mRelativeLayout;
    private BaseLinearLayout mLinearLayout;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFrameLayout = (BaseFrameLayout) findViewById(R.id.fl);
        mRelativeLayout = (BaseRelativeLayout) findViewById(R.id.rl);
        mLinearLayout = (BaseLinearLayout) findViewById(R.id.ll);

        mTextView = (TextView) findViewById(R.id.textview);
        mTextView.setOnClickListener(this);

        // 注释掉和放开,结果是不一样的,可以看log加深理解
        // mFrameLayout.setOnClickListener(this);
        // mRelativeLayout.setOnClickListener(this);
        // mLinearLayout.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fl:
                Log.i(TAG, "onClick: fl");
                break;
            case R.id.rl:
                Log.i(TAG, "onClick: rl");
                break;
            case R.id.ll:
                Log.i(TAG, "onClick: ll");
                break;
            case R.id.textview:
                Log.i(TAG, "onClick: textview");
                break;
            default:
                break;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        if (ev.getAction() == MotionEvent.ACTION_DOWN) {
            Log.i(TAG, "dispatchTouchEvent: DOWN");
        } else if (ev.getAction() == MotionEvent.ACTION_UP) {
            Log.i(TAG, "dispatchTouchEvent: UP");
        } else if (ev.getAction() == MotionEvent.ACTION_MOVE) {
            Log.i(TAG, "dispatchTouchEvent: MOVE");
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
