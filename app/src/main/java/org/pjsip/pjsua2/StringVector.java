/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class StringVector extends java.util.AbstractList<String> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected StringVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(StringVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(StringVector obj) {
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
        pjsua2JNI.delete_StringVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StringVector(String[] initialElements) {
    this();
    reserve(initialElements.length);

    for (String element : initialElements) {
      add(element);
    }
  }

  public StringVector(Iterable<String> initialElements) {
    this();
    for (String element : initialElements) {
      add(element);
    }
  }

  public String get(int index) {
    return doGet(index);
  }

  public String set(int index, String e) {
    return doSet(index, e);
  }

  public boolean add(String e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, String e) {
    modCount++;
    doAdd(index, e);
  }

  public String remove(int index) {
    modCount++;
    return doRemove(index);
  }

  protected void removeRange(int fromIndex, int toIndex) {
    modCount++;
    doRemoveRange(fromIndex, toIndex);
  }

  public int size() {
    return doSize();
  }

  public StringVector() {
    this(pjsua2JNI.new_StringVector__SWIG_0(), true);
  }

  public StringVector(StringVector other) {
    this(pjsua2JNI.new_StringVector__SWIG_1(StringVector.getCPtr(other), other), true);
  }

  public long capacity() {
    return pjsua2JNI.StringVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    pjsua2JNI.StringVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return pjsua2JNI.StringVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    pjsua2JNI.StringVector_clear(swigCPtr, this);
  }

  public StringVector(int count, String value) {
    this(pjsua2JNI.new_StringVector__SWIG_2(count, value), true);
  }

  private int doSize() {
    return pjsua2JNI.StringVector_doSize(swigCPtr, this);
  }

  private void doAdd(String x) {
    pjsua2JNI.StringVector_doAdd__SWIG_0(swigCPtr, this, x);
  }

  private void doAdd(int index, String x) {
    pjsua2JNI.StringVector_doAdd__SWIG_1(swigCPtr, this, index, x);
  }

  private String doRemove(int index) {
    return pjsua2JNI.StringVector_doRemove(swigCPtr, this, index);
  }

  private String doGet(int index) {
    return pjsua2JNI.StringVector_doGet(swigCPtr, this, index);
  }

  private String doSet(int index, String val) {
    return pjsua2JNI.StringVector_doSet(swigCPtr, this, index, val);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    pjsua2JNI.StringVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
