package pkg02_generic;

/**
 *  Generic 타입 T : Container 인스턴스 생성 시 전달 되는 타입
 * @param <T> 오직 Reference Type 만 전달 가능.
 */
public class Container<T> {
  
  // field
  private T item;

  // getter, setter
  public T getItem() {
    return item;
  }

  public void setItem(T item) {
    this.item = item;
  }



}
