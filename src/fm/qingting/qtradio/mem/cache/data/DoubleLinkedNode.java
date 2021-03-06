package fm.qingting.qtradio.mem.cache.data;

public abstract interface DoubleLinkedNode<E>
{
  public abstract DoubleLinkedNode<E> getNext();

  public abstract DoubleLinkedNode<E> getPrev();

  public abstract E getValue();

  public abstract boolean insertAfter(E paramE);

  public abstract boolean insertBefore(E paramE);

  public abstract void removeNext();

  public abstract void removePrev();

  public abstract void removeSelf();

  public abstract void setValue(E paramE);
}

/* Location:           /Users/zhangxun-xy/Downloads/qingting2/classes_dex2jar.jar
 * Qualified Name:     fm.qingting.qtradio.mem.cache.data.DoubleLinkedNode
 * JD-Core Version:    0.6.2
 */