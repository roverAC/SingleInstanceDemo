package test.zhuangbi.com.customviewdemo1;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * 项目名称:zhuangbi
 * 创建人:hpf
 * 创建时间:2017/7/13 17:52
 */

public class CustomView extends View{

    private String mTextTitle;
    private int mTextSize;

    public CustomView(Context context) {
        this(context,null);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray array = context.getTheme().obtainStyledAttributes(attrs, null, defStyleAttr, 0);
        int indexCount = array.getIndexCount();

        for(int i = 0;i < indexCount;i++) {
            switch (array.getIndex(indexCount)) {
                case R.styleable.Android_Text_textTitle:
                    mTextTitle = array.getString(R.styleable.Android_Text_textTitle);
                    break;
                case R.styleable.Android_Text_textSize:
                    mTextSize = array.getInt(R.styleable.Android_Text_textSize,10);
                    break;
                default:break;
            }
        }

        array.recycle();
        Log.e("====TextView===","title：==="+mTextTitle+"   size:==="+mTextSize);

    }
}
