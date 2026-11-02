package com.tamarack;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;

public class CodeEditorView extends View {
    public CodeEditorView(Context context) {
        super(context);
        init();
    }

    public CodeEditorView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CodeEditorView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private Paint mPaint;

    private void init() {
        mPaint = new Paint();
        mPaint.setTypeface(Typeface.MONOSPACE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float x = 0;
        float y = -mPaint.ascent(); // shouldve been 0 but drawing the text start from baseline
        canvas.drawText("hello world:D", x, y, mPaint);
    }
}