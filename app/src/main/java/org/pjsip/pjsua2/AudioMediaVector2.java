/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class AudioMediaVector2 extends java.util.AbstractList<AudioMedia> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected AudioMediaVector2(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AudioMediaVector2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(AudioMediaVector2 obj) {
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
        pjsua2JNI.delete_AudioMediaVector2(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public AudioMediaVector2(AudioMedia[] initialElements) {
    this();
    reserve(initialElements.length);

    for (AudioMedia element : initialElements) {
      add(element);
    }
  }

  public AudioMediaVector2(Iterable<AudioMedia> initialElements) {
    this();
    for (AudioMedia element : initialElements) {
      add(element);
    }
  }

  public AudioMedia get(int index) {
    return doGet(index);
  }

  public AudioMedia set(int index, AudioMedia e) {
    return doSet(index, e);
  }

  public boolean add(AudioMedia e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, AudioMedia e) {
    modCount++;
    doAdd(index, e);
  }

  public AudioMedia remove(int index) {
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

  public AudioMediaVector2() {
    this(pjsua2JNI.new_AudioMediaVector2__SWIG_0(), true);
  }

  public AudioMediaVector2(AudioMediaVector2 other) {
    this(pjsua2JNI.new_AudioMediaVector2__SWIG_1(AudioMediaVector2.getCPtr(other), other), true);
  }

  public long capacity() {
    return pjsua2JNI.AudioMediaVector2_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    pjsua2JNI.AudioMediaVector2_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return pjsua2JNI.AudioMediaVector2_isEmpty(swigCPtr, this);
  }

  public void clear() {
    pjsua2JNI.AudioMediaVector2_clear(swigCPtr, this);
  }

  public AudioMediaVector2(int count, AudioMedia value) {
    this(pjsua2JNI.new_AudioMediaVector2__SWIG_2(count, AudioMedia.getCPtr(value), value), true);
  }

  private int doSize() {
    return pjsua2JNI.AudioMediaVector2_doSize(swigCPtr, this);
  }

  private void doAdd(AudioMedia x) {
    pjsua2JNI.AudioMediaVector2_doAdd__SWIG_0(swigCPtr, this, AudioMedia.getCPtr(x), x);
  }

  private void doAdd(int index, AudioMedia x) {
    pjsua2JNI.AudioMediaVector2_doAdd__SWIG_1(swigCPtr, this, index, AudioMedia.getCPtr(x), x);
  }

  private AudioMedia doRemove(int index) {
    return new AudioMedia(pjsua2JNI.AudioMediaVector2_doRemove(swigCPtr, this, index), true);
  }

  private AudioMedia doGet(int index) {
    return new AudioMedia(pjsua2JNI.AudioMediaVector2_doGet(swigCPtr, this, index), false);
  }

  private AudioMedia doSet(int index, AudioMedia val) {
    return new AudioMedia(pjsua2JNI.AudioMediaVector2_doSet(swigCPtr, this, index, AudioMedia.getCPtr(val), val), true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    pjsua2JNI.AudioMediaVector2_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
