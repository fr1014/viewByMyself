package com.study.viewbymyself.viewbymyself;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
public class DrawHeartView extends View{

    Paint paint = new Paint();
    Path path = new Path();  //初始化Path
    public DrawHeartView(Context context) {
        super(context);
    }

    public DrawHeartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawHeartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        path.addArc(200,200,400,400,-225,225);
        path.arcTo(400,200,600,400,-180,225,false);
        path.lineTo(400,542);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(path,paint);
    }
}
