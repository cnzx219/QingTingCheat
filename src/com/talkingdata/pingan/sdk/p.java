package com.talkingdata.pingan.sdk;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class p
{
  protected byte[] a = new byte[9];
  protected OutputStream b;

  public p(OutputStream paramOutputStream)
  {
    this.b = paramOutputStream;
  }

  public static int b(double paramDouble)
  {
    return 9;
  }

  public static int b(float paramFloat)
  {
    return 5;
  }

  public static int b(boolean paramBoolean)
  {
    return 1;
  }

  public static int b(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
      return 1;
    return c(paramArrayOfByte.length) + paramArrayOfByte.length;
  }

  public static int c(int paramInt)
  {
    if (paramInt < 16)
      return 1;
    if (paramInt < 65536)
      return 3;
    return 5;
  }

  public static int c(long paramLong)
  {
    if (paramLong < -32L)
      if (paramLong < -32768L)
        if (paramLong >= -2147483648L);
    do
    {
      return 9;
      return 5;
      if (paramLong < -128L)
        return 3;
      return 2;
      if (paramLong < 128L)
        return 1;
      if (paramLong < 65536L)
      {
        if (paramLong < 256L)
          return 2;
        return 3;
      }
    }
    while (paramLong >= 4294967296L);
    return 5;
  }

  public static int c(String paramString)
  {
    try
    {
      byte[] arrayOfByte = paramString.getBytes("UTF-8");
      int i = c(arrayOfByte.length);
      int j = arrayOfByte.length;
      return j + i;
    }
    catch (Exception localException)
    {
    }
    return 0;
  }

  public p a()
  {
    this.b.write(-62);
    return this;
  }

  public p a(byte paramByte)
  {
    return b(paramByte);
  }

  public p a(double paramDouble)
  {
    return c(paramDouble);
  }

  public p a(float paramFloat)
  {
    return c(paramFloat);
  }

  public p a(int paramInt)
  {
    return d(paramInt);
  }

  public p a(long paramLong)
  {
    return b(paramLong);
  }

  public p a(g paramg)
  {
    if (paramg == null)
      return b();
    paramg.a(this);
    return this;
  }

  public p a(Boolean paramBoolean)
  {
    if (paramBoolean == null)
      return b();
    if (paramBoolean.booleanValue())
      return c();
    return a();
  }

  public p a(Byte paramByte)
  {
    if (paramByte == null)
      return b();
    return b(paramByte.byteValue());
  }

  public p a(Double paramDouble)
  {
    if (paramDouble == null)
      return b();
    return c(paramDouble.doubleValue());
  }

  public p a(Float paramFloat)
  {
    if (paramFloat == null)
      return b();
    return c(paramFloat.floatValue());
  }

  public p a(Integer paramInteger)
  {
    if (paramInteger == null)
      return b();
    return d(paramInteger.intValue());
  }

  public p a(Long paramLong)
  {
    if (paramLong == null)
      return b();
    return b(paramLong.longValue());
  }

  public p a(Short paramShort)
  {
    if (paramShort == null)
      return b();
    return b(paramShort.shortValue());
  }

  public p a(String paramString)
  {
    if (paramString == null)
      return b("");
    return b(paramString);
  }

  public p a(BigInteger paramBigInteger)
  {
    if (paramBigInteger == null)
      return b();
    return b(paramBigInteger);
  }

  public p a(ByteBuffer paramByteBuffer)
  {
    if (paramByteBuffer == null)
      return b();
    f(paramByteBuffer.remaining());
    return b(paramByteBuffer.array(), paramByteBuffer.arrayOffset() + paramByteBuffer.position(), paramByteBuffer.remaining());
  }

  public p a(List paramList)
  {
    if (paramList == null)
      this = b();
    while (true)
    {
      return this;
      b(paramList.size());
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
        a((String)localIterator.next());
    }
  }

  public p a(Map paramMap)
  {
    if (paramMap == null)
      this = b();
    while (true)
    {
      return this;
      HashMap localHashMap = new HashMap();
      Iterator localIterator1 = paramMap.keySet().iterator();
      while (localIterator1.hasNext())
      {
        String str = (String)localIterator1.next();
        Object localObject2 = paramMap.get(str);
        if ((localObject2 instanceof String))
          localHashMap.put(str, localObject2.toString());
        else if ((localObject2 instanceof Number))
          localHashMap.put(str, Double.valueOf(((Number)localObject2).doubleValue()));
      }
      e(localHashMap.size());
      Iterator localIterator2 = localHashMap.entrySet().iterator();
      while (localIterator2.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator2.next();
        a((String)localEntry.getKey());
        Object localObject1 = localEntry.getValue();
        if ((localObject1 instanceof Number))
          a(((Number)localObject1).doubleValue());
        else if ((localObject1 instanceof String))
          a(localObject1.toString());
      }
    }
  }

  public p a(short paramShort)
  {
    return b(paramShort);
  }

  public p a(boolean paramBoolean)
  {
    if (paramBoolean)
      return c();
    return a();
  }

  public p a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
      return b();
    f(paramArrayOfByte.length);
    return d(paramArrayOfByte);
  }

  public p a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    f(paramInt2);
    return b(paramArrayOfByte, paramInt1, paramInt2);
  }

  public p a(Long[] paramArrayOfLong)
  {
    if ((paramArrayOfLong == null) || (paramArrayOfLong.length == 0))
      this = b();
    while (true)
    {
      return this;
      b(paramArrayOfLong.length);
      int i = paramArrayOfLong.length;
      for (int j = 0; j < i; j++)
        a(paramArrayOfLong[j].longValue());
    }
  }

  public p b()
  {
    this.b.write(-64);
    return this;
  }

  public p b(byte paramByte)
  {
    if (paramByte < -32)
    {
      this.a[0] = -48;
      this.a[1] = paramByte;
      this.b.write(this.a, 0, 2);
      return this;
    }
    this.b.write(paramByte);
    return this;
  }

  public p b(int paramInt)
  {
    if (paramInt < 16)
    {
      int i = paramInt | 0x90;
      this.b.write((byte)i);
      return this;
    }
    if (paramInt < 65536)
    {
      this.a[0] = -36;
      this.a[1] = ((byte)(paramInt >> 8));
      this.a[2] = ((byte)(paramInt >> 0));
      this.b.write(this.a, 0, 3);
      return this;
    }
    this.a[0] = -35;
    this.a[1] = ((byte)(paramInt >> 24));
    this.a[2] = ((byte)(paramInt >> 16));
    this.a[3] = ((byte)(paramInt >> 8));
    this.a[4] = ((byte)(paramInt >> 0));
    this.b.write(this.a, 0, 5);
    return this;
  }

  public p b(long paramLong)
  {
    if (paramLong < -32L)
    {
      if (paramLong < -32768L)
      {
        if (paramLong < -2147483648L)
        {
          this.a[0] = -45;
          this.a[1] = ((byte)(int)(paramLong >> 56));
          this.a[2] = ((byte)(int)(paramLong >> 48));
          this.a[3] = ((byte)(int)(paramLong >> 40));
          this.a[4] = ((byte)(int)(paramLong >> 32));
          this.a[5] = ((byte)(int)(paramLong >> 24));
          this.a[6] = ((byte)(int)(paramLong >> 16));
          this.a[7] = ((byte)(int)(paramLong >> 8));
          this.a[8] = ((byte)(int)(paramLong >> 0));
          this.b.write(this.a, 0, 9);
          return this;
        }
        this.a[0] = -46;
        this.a[1] = ((byte)(int)(paramLong >> 24));
        this.a[2] = ((byte)(int)(paramLong >> 16));
        this.a[3] = ((byte)(int)(paramLong >> 8));
        this.a[4] = ((byte)(int)(paramLong >> 0));
        this.b.write(this.a, 0, 5);
        return this;
      }
      if (paramLong < -128L)
      {
        this.a[0] = -47;
        this.a[1] = ((byte)(int)(paramLong >> 8));
        this.a[2] = ((byte)(int)(paramLong >> 0));
        this.b.write(this.a, 0, 3);
        return this;
      }
      this.a[0] = -48;
      this.a[1] = ((byte)(int)paramLong);
      this.b.write(this.a, 0, 2);
      return this;
    }
    if (paramLong < 128L)
    {
      this.b.write((byte)(int)paramLong);
      return this;
    }
    if (paramLong < 65536L)
    {
      if (paramLong < 256L)
      {
        this.a[0] = -52;
        this.a[1] = ((byte)(int)paramLong);
        this.b.write(this.a, 0, 2);
        return this;
      }
      this.a[0] = -51;
      this.a[1] = ((byte)(int)((0xFF00 & paramLong) >> 8));
      this.a[2] = ((byte)(int)((0xFF & paramLong) >> 0));
      this.b.write(this.a, 0, 3);
      return this;
    }
    if (paramLong < 4294967296L)
    {
      this.a[0] = -50;
      this.a[1] = ((byte)(int)((0xFF000000 & paramLong) >> 24));
      this.a[2] = ((byte)(int)((0xFF0000 & paramLong) >> 16));
      this.a[3] = ((byte)(int)((0xFF00 & paramLong) >> 8));
      this.a[4] = ((byte)(int)((0xFF & paramLong) >> 0));
      this.b.write(this.a, 0, 5);
      return this;
    }
    this.a[0] = -49;
    this.a[1] = ((byte)(int)(paramLong >> 56));
    this.a[2] = ((byte)(int)(paramLong >> 48));
    this.a[3] = ((byte)(int)(paramLong >> 40));
    this.a[4] = ((byte)(int)(paramLong >> 32));
    this.a[5] = ((byte)(int)(paramLong >> 24));
    this.a[6] = ((byte)(int)(paramLong >> 16));
    this.a[7] = ((byte)(int)(paramLong >> 8));
    this.a[8] = ((byte)(int)(paramLong >> 0));
    this.b.write(this.a, 0, 9);
    return this;
  }

  public p b(String paramString)
  {
    byte[] arrayOfByte = paramString.getBytes("UTF-8");
    f(arrayOfByte.length);
    return d(arrayOfByte);
  }

  public p b(BigInteger paramBigInteger)
  {
    if (paramBigInteger.bitLength() <= 63)
      return b(paramBigInteger.longValue());
    if ((paramBigInteger.bitLength() <= 64) && (paramBigInteger.signum() >= 0))
    {
      this.a[0] = -49;
      byte[] arrayOfByte = paramBigInteger.toByteArray();
      this.a[1] = arrayOfByte[(-8 + arrayOfByte.length)];
      this.a[2] = arrayOfByte[(-7 + arrayOfByte.length)];
      this.a[3] = arrayOfByte[(-6 + arrayOfByte.length)];
      this.a[4] = arrayOfByte[(-5 + arrayOfByte.length)];
      this.a[5] = arrayOfByte[(-4 + arrayOfByte.length)];
      this.a[6] = arrayOfByte[(-3 + arrayOfByte.length)];
      this.a[7] = arrayOfByte[(-2 + arrayOfByte.length)];
      this.a[8] = arrayOfByte[(-1 + arrayOfByte.length)];
      this.b.write(this.a, 0, 9);
      return this;
    }
    throw new IOException("can't pack BigInteger larger than 0xffffffffffffffff");
  }

  public p b(ByteBuffer paramByteBuffer)
  {
    f(paramByteBuffer.remaining());
    return b(paramByteBuffer.array(), paramByteBuffer.arrayOffset() + paramByteBuffer.position(), paramByteBuffer.remaining());
  }

  public p b(short paramShort)
  {
    if (paramShort < -32)
    {
      if (paramShort < -128)
      {
        this.a[0] = -47;
        this.a[1] = ((byte)(paramShort >> 8));
        this.a[2] = ((byte)(paramShort >> 0));
        this.b.write(this.a, 0, 3);
        return this;
      }
      this.a[0] = -48;
      this.a[1] = ((byte)paramShort);
      this.b.write(this.a, 0, 2);
      return this;
    }
    if (paramShort < 128)
    {
      this.b.write((byte)paramShort);
      return this;
    }
    if (paramShort < 256)
    {
      this.a[0] = -52;
      this.a[1] = ((byte)paramShort);
      this.b.write(this.a, 0, 2);
      return this;
    }
    this.a[0] = -51;
    this.a[1] = ((byte)(paramShort >> 8));
    this.a[2] = ((byte)(paramShort >> 0));
    this.b.write(this.a, 0, 3);
    return this;
  }

  public p b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.b.write(paramArrayOfByte, paramInt1, paramInt2);
    return this;
  }

  public p c()
  {
    this.b.write(-61);
    return this;
  }

  public p c(double paramDouble)
  {
    this.a[0] = -53;
    long l = Double.doubleToRawLongBits(paramDouble);
    this.a[1] = ((byte)(int)(l >> 56));
    this.a[2] = ((byte)(int)(l >> 48));
    this.a[3] = ((byte)(int)(l >> 40));
    this.a[4] = ((byte)(int)(l >> 32));
    this.a[5] = ((byte)(int)(l >> 24));
    this.a[6] = ((byte)(int)(l >> 16));
    this.a[7] = ((byte)(int)(l >> 8));
    this.a[8] = ((byte)(int)(l >> 0));
    this.b.write(this.a, 0, 9);
    return this;
  }

  public p c(float paramFloat)
  {
    this.a[0] = -54;
    int i = Float.floatToRawIntBits(paramFloat);
    this.a[1] = ((byte)(i >> 24));
    this.a[2] = ((byte)(i >> 16));
    this.a[3] = ((byte)(i >> 8));
    this.a[4] = ((byte)(i >> 0));
    this.b.write(this.a, 0, 5);
    return this;
  }

  public p c(boolean paramBoolean)
  {
    if (paramBoolean)
      return c();
    return a();
  }

  public p c(byte[] paramArrayOfByte)
  {
    f(paramArrayOfByte.length);
    return b(paramArrayOfByte, 0, paramArrayOfByte.length);
  }

  public p d(int paramInt)
  {
    if (paramInt < -32)
    {
      if (paramInt < -32768)
      {
        this.a[0] = -46;
        this.a[1] = ((byte)(paramInt >> 24));
        this.a[2] = ((byte)(paramInt >> 16));
        this.a[3] = ((byte)(paramInt >> 8));
        this.a[4] = ((byte)(paramInt >> 0));
        this.b.write(this.a, 0, 5);
        return this;
      }
      if (paramInt < -128)
      {
        this.a[0] = -47;
        this.a[1] = ((byte)(paramInt >> 8));
        this.a[2] = ((byte)(paramInt >> 0));
        this.b.write(this.a, 0, 3);
        return this;
      }
      this.a[0] = -48;
      this.a[1] = ((byte)paramInt);
      this.b.write(this.a, 0, 2);
      return this;
    }
    if (paramInt < 128)
    {
      this.b.write((byte)paramInt);
      return this;
    }
    if (paramInt < 256)
    {
      this.a[0] = -52;
      this.a[1] = ((byte)paramInt);
      this.b.write(this.a, 0, 2);
      return this;
    }
    if (paramInt < 65536)
    {
      this.a[0] = -51;
      this.a[1] = ((byte)(paramInt >> 8));
      this.a[2] = ((byte)(paramInt >> 0));
      this.b.write(this.a, 0, 3);
      return this;
    }
    this.a[0] = -50;
    this.a[1] = ((byte)(paramInt >> 24));
    this.a[2] = ((byte)(paramInt >> 16));
    this.a[3] = ((byte)(paramInt >> 8));
    this.a[4] = ((byte)(paramInt >> 0));
    this.b.write(this.a, 0, 5);
    return this;
  }

  public p d(byte[] paramArrayOfByte)
  {
    this.b.write(paramArrayOfByte);
    return this;
  }

  public p e(int paramInt)
  {
    if (paramInt < 16)
    {
      int i = paramInt | 0x80;
      this.b.write((byte)i);
      return this;
    }
    if (paramInt < 65536)
    {
      this.a[0] = -34;
      this.a[1] = ((byte)(paramInt >> 8));
      this.a[2] = ((byte)(paramInt >> 0));
      this.b.write(this.a, 0, 3);
      return this;
    }
    this.a[0] = -33;
    this.a[1] = ((byte)(paramInt >> 24));
    this.a[2] = ((byte)(paramInt >> 16));
    this.a[3] = ((byte)(paramInt >> 8));
    this.a[4] = ((byte)(paramInt >> 0));
    this.b.write(this.a, 0, 5);
    return this;
  }

  public p f(int paramInt)
  {
    if (paramInt < 32)
    {
      int i = paramInt | 0xA0;
      this.b.write((byte)i);
      return this;
    }
    if (paramInt < 65536)
    {
      this.a[0] = -38;
      this.a[1] = ((byte)(paramInt >> 8));
      this.a[2] = ((byte)(paramInt >> 0));
      this.b.write(this.a, 0, 3);
      return this;
    }
    this.a[0] = -37;
    this.a[1] = ((byte)(paramInt >> 24));
    this.a[2] = ((byte)(paramInt >> 16));
    this.a[3] = ((byte)(paramInt >> 8));
    this.a[4] = ((byte)(paramInt >> 0));
    this.b.write(this.a, 0, 5);
    return this;
  }
}

/* Location:           /Users/zhangxun-xy/Downloads/qingting2/classes_dex2jar.jar
 * Qualified Name:     com.talkingdata.pingan.sdk.p
 * JD-Core Version:    0.6.2
 */