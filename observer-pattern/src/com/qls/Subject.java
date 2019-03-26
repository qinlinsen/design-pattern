package com.qls;

import java.util.List;

/**
 * @author Abraham Qin
 * @since 2019/3/26
 */
public interface Subject{
   void  add(Observer observer);
   void  remove(Observer observer);
   void  notifyObserver();
}
