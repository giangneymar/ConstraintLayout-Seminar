package com.example.constraintlayoutseminar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;

public class BoundsImageView extends AppCompatImageView {


    private Paint paint = new Paint();

    public BoundsImageView(@NonNull Context context) {
        super(context);
    }

    public BoundsImageView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public BoundsImageView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        paint.setARGB(255,200,0,0);
        paint.setStrokeWidth(4f);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawLine(0f,0f,getWidth(),getHeight(),paint);
        canvas.drawLine(0f,getHeight(),getWidth(),0f,paint);
    }
}
