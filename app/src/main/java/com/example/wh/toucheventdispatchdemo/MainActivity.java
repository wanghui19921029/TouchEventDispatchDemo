package com.example.wh.toucheventdispatchdemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnClickListener {
    private static final String TAG = "testdemo--MainActivity";
    private BaseFrameLayout mFrameLayout;
    private BaseRelativeLayout mRelativeLayout;
    private BaseLinearLayout mLinearLayout;
    private TextView mTextView;
    private ImageView mImageView;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFrameLayout = findViewById(R.id.framelayout);
        mRelativeLayout = findViewById(R.id.relativelayout);
        mLinearLayout = findViewById(R.id.linearlayout);
        mTextView = findViewById(R.id.textview);
        mImageView = findViewById(R.id.imageview);
        mButton = findViewById(R.id.button);

        //注释掉和放开,结果是不一样的,可以看log加深理解
        //mFrameLayout.setOnClickListener(this);
        //mRelativeLayout.setOnClickListener(this);
//        mLinearLayout.setOnClickListener(this);
        //mTextView.setOnClickListener(this);
        //mImageView.setOnClickListener(this);
        //mButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.framelayout:
                Log.i(TAG, "onClick: framelayout");
                break;
            case R.id.relativelayout:
                Log.i(TAG, "onClick: relativelayout");
                break;
            case R.id.linearlayout:
                Log.i(TAG, "onClick: linearlayout");
                break;
            case R.id.textview:
                Log.i(TAG, "onClick: textview");
                break;
            case R.id.imageview:
                Log.i(TAG, "onClick: imageview");
                break;
            case R.id.button:
                Log.i(TAG, "onClick: button");
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
