package fm.qingting.qtradio.view.personalcenter.clock;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import fm.qingting.framework.utils.BitmapResourceCache;
import fm.qingting.framework.view.QtListItemView;
import fm.qingting.framework.view.ViewLayout;
import fm.qingting.qtradio.manager.SkinManager;

public class AlarmDayRingtoneView extends QtListItemView
{
  private final ViewLayout arrowLayout = this.standardLayout.createChildLT(36, 36, 650, 0, ViewLayout.SCALE_FLAG_SLTCW);
  private String channelName = "";
  private int dayList = 0;
  private final DrawFilter filter = SkinManager.getInstance().getDrawFilter();
  private Rect infoBound = new Rect();
  private boolean isRepeat = true;
  private final ViewLayout itemLayout = this.standardLayout.createChildLT(720, 112, 0, 0, ViewLayout.SCALE_FLAG_SLTCW);
  private final ViewLayout lineLayout = this.standardLayout.createChildLT(720, 1, 0, 0, ViewLayout.SCALE_FLAG_SLTCW);
  private Rect mArrowRect = new Rect();
  private final Paint mBgPaint = new Paint();
  private boolean mInTouchMode = false;
  private float mLastMotionY = 0.0F;
  private final Paint mPaint = new Paint();
  private int mSelectIndex = -1;
  private String ringtoneName = "直接播放电台";
  private final ViewLayout standardLayout = ViewLayout.createViewLayoutWithBoundsLT(720, 336, 720, 336, 0, 0, ViewLayout.FILL);
  private final ViewLayout textLayout = this.standardLayout.createChildLT(720, 45, 30, 0, ViewLayout.SCALE_FLAG_SLTCW);

  public AlarmDayRingtoneView(Context paramContext)
  {
    super(paramContext);
    this.mBgPaint.setColor(SkinManager.getItemHighlightMaskColor());
    setItemSelectedEnable();
  }

  private void drawArrow(Canvas paramCanvas, int paramInt, boolean paramBoolean)
  {
    this.mArrowRect.offset(0, paramInt);
    paramCanvas.drawBitmap(BitmapResourceCache.getInstance().getResourceCache(getResources(), this, 2130837694), null, this.mArrowRect, this.mPaint);
    this.mArrowRect.offset(0, -paramInt);
  }

  private void drawBg(Canvas paramCanvas)
  {
    if ((this.mSelectIndex < 0) || (!isItemPressed()))
      return;
    int i = this.itemLayout.height * this.mSelectIndex;
    paramCanvas.drawRect(0.0F, i, this.standardLayout.width, i + this.itemLayout.height, this.mBgPaint);
  }

  private void drawChannel(Canvas paramCanvas)
  {
    int i = 1;
    TextPaint localTextPaint = SkinManager.getInstance().getNormalTextPaint();
    localTextPaint.getTextBounds("播放电台:", 0, "播放电台:".length(), this.infoBound);
    paramCanvas.drawText("播放电台:", this.textLayout.leftMargin, (3 * this.itemLayout.height - this.infoBound.bottom - this.infoBound.top) / 2.0F, localTextPaint);
    String str = TextUtils.ellipsize(this.channelName, localTextPaint, this.arrowLayout.leftMargin - this.textLayout.leftMargin - this.infoBound.width(), TextUtils.TruncateAt.END).toString();
    localTextPaint.getTextBounds(str, 0, str.length(), this.infoBound);
    paramCanvas.drawText(str, this.arrowLayout.leftMargin - this.infoBound.width() - this.arrowLayout.width, (3 * this.itemLayout.height - this.infoBound.bottom - this.infoBound.top) / 2.0F, localTextPaint);
    int k = this.itemLayout.height;
    if ((isItemPressed()) && (this.mSelectIndex == i));
    while (true)
    {
      drawArrow(paramCanvas, k, i);
      return;
      int j = 0;
    }
  }

  private void drawDay(Canvas paramCanvas)
  {
    int i = 2 * this.itemLayout.height;
    if ((isItemPressed()) && (this.mSelectIndex == 2));
    for (boolean bool = true; ; bool = false)
    {
      drawArrow(paramCanvas, i, bool);
      TextPaint localTextPaint = SkinManager.getInstance().getNormalTextPaint();
      localTextPaint.getTextBounds("重复:", 0, "重复:".length(), this.infoBound);
      paramCanvas.drawText("重复:", this.textLayout.leftMargin, (5 * this.itemLayout.height - this.infoBound.bottom - this.infoBound.top) / 2.0F, localTextPaint);
      String str = getDay(this.dayList);
      if (!this.isRepeat)
        str = "只响一次";
      localTextPaint.getTextBounds(str, 0, str.length(), this.infoBound);
      paramCanvas.drawText(str, this.arrowLayout.leftMargin - this.arrowLayout.width - this.infoBound.width(), (5 * this.itemLayout.height - this.infoBound.bottom - this.infoBound.top) / 2.0F, localTextPaint);
      return;
    }
  }

  private void drawLine(Canvas paramCanvas)
  {
    SkinManager.getInstance().drawHorizontalLine(paramCanvas, 0, this.itemLayout.width, this.itemLayout.height - this.lineLayout.height, this.lineLayout.height);
    SkinManager.getInstance().drawHorizontalLine(paramCanvas, 0, this.itemLayout.width, 2 * this.itemLayout.height - this.lineLayout.height, this.lineLayout.height);
    SkinManager.getInstance().drawHorizontalLine(paramCanvas, 0, this.itemLayout.width, 3 * this.itemLayout.height - this.lineLayout.height, this.lineLayout.height);
  }

  private void drawRingtone(Canvas paramCanvas)
  {
    String str;
    if ((this.ringtoneName == null) || (this.ringtoneName.equalsIgnoreCase("")))
    {
      str = "直接播放电台";
      TextPaint localTextPaint = SkinManager.getInstance().getNormalTextPaint();
      localTextPaint.getTextBounds("闹铃声:", 0, "闹铃声:".length(), this.infoBound);
      paramCanvas.drawText("闹铃声:", this.textLayout.leftMargin, (this.itemLayout.height - this.infoBound.bottom - this.infoBound.top) / 2.0F, localTextPaint);
      localTextPaint.getTextBounds(str, 0, str.length(), this.infoBound);
      paramCanvas.drawText(str, this.arrowLayout.leftMargin - this.infoBound.width() - this.arrowLayout.width, (this.itemLayout.height - this.infoBound.bottom - this.infoBound.top) / 2.0F, localTextPaint);
      if ((!isItemPressed()) || (this.mSelectIndex != 0))
        break label190;
    }
    label190: for (boolean bool = true; ; bool = false)
    {
      drawArrow(paramCanvas, 0, bool);
      return;
      str = this.ringtoneName;
      break;
    }
  }

  private String getDay(int paramInt)
  {
    int i = 1;
    Object localObject;
    if (paramInt == 0)
    {
      localObject = "" + "工作日";
      return localObject;
    }
    String str1 = "" + "周";
    if ((paramInt & 0x4) > 0)
      str1 = str1 + "一 ";
    for (int j = i; ; j = 0)
    {
      if ((paramInt & 0x8) > 0)
      {
        str1 = str1 + "二 ";
        j++;
        i++;
      }
      if ((paramInt & 0x10) > 0)
      {
        str1 = str1 + "三 ";
        j++;
        i++;
      }
      if ((paramInt & 0x20) > 0)
      {
        str1 = str1 + "四 ";
        j++;
        i++;
      }
      if ((paramInt & 0x40) > 0)
      {
        str1 = str1 + "五 ";
        j++;
        i++;
      }
      if ((paramInt & 0x80) > 0)
      {
        str1 = str1 + "六 ";
        i++;
        j = 0;
      }
      int k;
      if ((paramInt & 0x2) > 0)
      {
        String str2 = str1 + "日";
        int m = i + 1;
        localObject = str2;
        j = 0;
        k = m;
      }
      while (true)
      {
        if (j == 5)
          localObject = "工作日";
        if (k == 7)
          localObject = "每天";
        if (!((String)localObject).equalsIgnoreCase("周"))
          break;
        return " ";
        k = i;
        localObject = str1;
      }
      i = 0;
    }
  }

  private int getSelectIndex()
  {
    return (int)(this.mLastMotionY / this.itemLayout.height);
  }

  public void close(boolean paramBoolean)
  {
    BitmapResourceCache.getInstance().clearResourceCacheOfOne(this, 0);
    super.close(paramBoolean);
  }

  public Object getValue(String paramString, Object paramObject)
  {
    if (paramString.equalsIgnoreCase("day"))
      return Integer.valueOf(this.dayList);
    if (paramString.equalsIgnoreCase("repeat"))
      return Boolean.valueOf(this.isRepeat);
    return super.getValue(paramString, paramObject);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    paramCanvas.save();
    paramCanvas.setDrawFilter(this.filter);
    drawBg(paramCanvas);
    drawRingtone(paramCanvas);
    drawChannel(paramCanvas);
    drawDay(paramCanvas);
    drawLine(paramCanvas);
    paramCanvas.restore();
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    this.standardLayout.scaleToBounds(View.MeasureSpec.getSize(paramInt1), View.MeasureSpec.getSize(paramInt2));
    this.itemLayout.scaleToBounds(this.standardLayout);
    this.textLayout.scaleToBounds(this.standardLayout);
    this.arrowLayout.scaleToBounds(this.standardLayout);
    this.mArrowRect.set(this.arrowLayout.leftMargin, (this.itemLayout.height - this.arrowLayout.height) / 2, this.arrowLayout.leftMargin + this.arrowLayout.width, (this.itemLayout.height + this.arrowLayout.height) / 2);
    setMeasuredDimension(this.standardLayout.width, this.standardLayout.height);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((paramMotionEvent.getAction() != 0) && (!this.mInTouchMode));
    do
    {
      int i;
      do
      {
        do
        {
          return true;
          switch (paramMotionEvent.getAction())
          {
          default:
            return true;
          case 0:
            this.mLastMotionY = paramMotionEvent.getY();
            this.mSelectIndex = getSelectIndex();
            this.mInTouchMode = true;
          case 2:
          case 3:
          case 1:
          }
        }
        while (isItemPressed());
        invalidate();
        return true;
        this.mLastMotionY = paramMotionEvent.getY();
        i = getSelectIndex();
      }
      while ((this.mSelectIndex <= -1) || (i == this.mSelectIndex));
      this.mInTouchMode = false;
      this.mSelectIndex = -1;
      invalidate();
      return true;
      this.mInTouchMode = false;
      this.mSelectIndex = -1;
    }
    while (isItemPressed());
    invalidate();
    return true;
    this.mInTouchMode = false;
    if (this.mSelectIndex == 0)
      dispatchActionEvent("editRingtone", null);
    while (true)
    {
      this.mSelectIndex = -1;
      return true;
      if (this.mSelectIndex == 1)
        dispatchActionEvent("editChannel", null);
      else if (this.mSelectIndex == 2)
        dispatchActionEvent("editDay", null);
    }
  }

  public void setChannel(String paramString)
  {
    this.channelName = paramString;
    invalidate();
  }

  public void setDay(int paramInt)
  {
    this.dayList = paramInt;
    invalidate();
  }

  public void setParam(boolean paramBoolean, int paramInt, String paramString1, String paramString2)
  {
    this.isRepeat = paramBoolean;
    this.dayList = paramInt;
    this.channelName = paramString1;
    this.ringtoneName = paramString2;
    invalidate();
  }

  public void setRepeat(boolean paramBoolean)
  {
    this.isRepeat = paramBoolean;
    invalidate();
  }

  public void setRingtone(String paramString)
  {
    this.ringtoneName = paramString;
    invalidate();
  }
}

/* Location:           /Users/zhangxun-xy/Downloads/qingting2/classes_dex2jar.jar
 * Qualified Name:     fm.qingting.qtradio.view.personalcenter.clock.AlarmDayRingtoneView
 * JD-Core Version:    0.6.2
 */