package com.study.viewbymyself.viewbymyself;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.study.viewbymyself.R;

public class DrawCircleView extends View {

//    Paint paint = new Paint();
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG); //开启抗锯齿

    public DrawCircleView(Context context) {
        super(context);
    }

    public DrawCircleView(Context context,@Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setStyle(Paint.Style.STROKE); //Style 修改为画线模式
        paint.setStrokeWidth(20); //线条的宽度为20像素
        /**
         * cx,cy圆心的坐标
         */
        paint.setColor(Color.BLACK);
        canvas.drawCircle(300,200,160,paint);

        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(700,200,160,paint);

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        canvas.drawCircle(300,600,160,paint);

        paint.setStyle(Paint.Style.FILL);
        paint.setColor(getResources().getColor(R.color.blue));
        canvas.drawCircle(700,600,160,paint);
    }
}
