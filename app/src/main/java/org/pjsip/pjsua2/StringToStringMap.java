/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class StringToStringMap extends java.util.AbstractMap<String, String> {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected StringToStringMap(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(StringToStringMap obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(StringToStringMap obj) {
    long ptr = 0;
    if (obj != null) {
      if (!obj.swigCMemOwn)
        throw new RuntimeException("Cannot release ownership as memory is not owned");
      ptr = obj.swigCPtr;
      obj.swigCMemOwn = false;
      obj.delete();
    }
    return ptr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_StringToStringMap(swigCPtr);
      }
      swigCPtr = 0;
    }
  }


  public int size() {
    return sizeImpl();
  }

  public boolean containsKey(Object key) {
    if (!(key instanceof String)) {
      return false;
    }

    return containsImpl((String)key);
  }

  public String get(Object key) {
    if (!(key instanceof String)) {
      return null;
    }

    Iterator itr = find((String) key);
    if (itr.isNot(end())) {
      return itr.getValue();
    }

    return null;
  }

  public String put(String key, String value) {
    Iterator itr = find((String) key);
    if (itr.isNot(end())) {
      String oldValue = itr.getValue();
      itr.setValue(value);
      return oldValue;
    } else {
      putUnchecked(key, value);
      return null;
    }
  }

  public String remove(Object key) {
    if (!(key instanceof String)) {
      return null;
    }

    Iterator itr = find((String) key);
    if (itr.isNot(end())) {
      String oldValue = itr.getValue();
      removeUnchecked(itr);
      return oldValue;
    } else {
      return null;
    }
  }

  public java.util.Set<Entry<String, String>> entrySet() {
    java.util.Set<Entry<String, String>> setToReturn =
        new java.util.HashSet<Entry<String, String>>();

    Iterator itr = begin();
    final Iterator end = end();
    while (itr.isNot(end)) {
      setToReturn.add(new Entry<String, String>() {
        private Iterator iterator;

        private Entry<String, String> init(Iterator iterator) {
          this.iterator = iterator;
          return this;
        }

        public String getKey() {
          return iterator.getKey();
        }

        public String getValue() {
          return iterator.getValue();
        }

        public String setValue(String newValue) {
          String oldValue = iterator.getValue();
          iterator.setValue(newValue);
          return oldValue;
        }
      }.init(itr));
      itr = itr.getNextUnchecked();
    }

    return setToReturn;
  }

  public StringToStringMap() {
    this(pjsua2JNI.new_StringToStringMap__SWIG_0(), true);
  }

  public StringToStringMap(StringToStringMap other) {
    this(pjsua2JNI.new_StringToStringMap__SWIG_1(StringToStringMap.getCPtr(other), other), true);
  }

  static protected class Iterator {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected Iterator(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(Iterator obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected static long swigRelease(Iterator obj) {
      long ptr = 0;
      if (obj != null) {
        if (!obj.swigCMemOwn)
          throw new RuntimeException("Cannot release ownership as memory is not owned");
        ptr = obj.swigCPtr;
        obj.swigCMemOwn = false;
        obj.delete();
      }
      return ptr;
    }
  
    @SuppressWarnings("deprecation")
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          pjsua2JNI.delete_StringToStringMap_Iterator(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    private Iterator getNextUnchecked() {
      return new Iterator(pjsua2JNI.StringToStringMap_Iterator_getNextUnchecked(swigCPtr, this), true);
    }
  
    private boolean isNot(Iterator other) {
      return pjsua2JNI.StringToStringMap_Iterator_isNot(swigCPtr, this, Iterator.getCPtr(other), other);
    }
  
    private String getKey() {
      return pjsua2JNI.StringToStringMap_Iterator_getKey(swigCPtr, this);
    }
  
    private String getValue() {
      return pjsua2JNI.StringToStringMap_Iterator_getValue(swigCPtr, this);
    }
  
    private void setValue(String newValue) {
      pjsua2JNI.StringToStringMap_Iterator_setValue(swigCPtr, this, newValue);
    }
  
  }

  public boolean isEmpty() {
    return pjsua2JNI.StringToStringMap_isEmpty(swigCPtr, this);
  }

  public void clear() {
    pjsua2JNI.StringToStringMap_clear(swigCPtr, this);
  }

  private Iterator find(String key) {
    return new Iterator(pjsua2JNI.StringToStringMap_find(swigCPtr, this, key), true);
  }

  private Iterator begin() {
    return new Iterator(pjsua2JNI.StringToStringMap_begin(swigCPtr, this), true);
  }

  private Iterator end() {
    return new Iterator(pjsua2JNI.StringToStringMap_end(swigCPtr, this), true);
  }

  private int sizeImpl() {
    return pjsua2JNI.StringToStringMap_sizeImpl(swigCPtr, this);
  }

  private boolean containsImpl(String key) {
    return pjsua2JNI.StringToStringMap_containsImpl(swigCPtr, this, key);
  }

  private void putUnchecked(String key, String value) {
    pjsua2JNI.StringToStringMap_putUnchecked(swigCPtr, this, key, value);
  }

  private void removeUnchecked(Iterator itr) {
    pjsua2JNI.StringToStringMap_removeUnchecked(swigCPtr, this, Iterator.getCPtr(itr), itr);
  }

}
