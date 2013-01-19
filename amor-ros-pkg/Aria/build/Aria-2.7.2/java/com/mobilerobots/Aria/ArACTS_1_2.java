/*
MobileRobots Advanced Robotics Interface for Applications (ARIA)
Copyright (C) 2004, 2005 ActivMedia Robotics LLC
Copyright (C) 2006, 2007, 2008, 2009 MobileRobots Inc.

     This program is free software; you can redistribute it and/or modify
     it under the terms of the GNU General Public License as published by
     the Free Software Foundation; either version 2 of the License, or
     (at your option) any later version.

     This program is distributed in the hope that it will be useful,
     but WITHOUT ANY WARRANTY; without even the implied warranty of
     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
     GNU General Public License for more details.

     You should have received a copy of the GNU General Public License
     along with this program; if not, write to the Free Software
     Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA

If you wish to redistribute ARIA under different terms, contact 
MobileRobots for information about a commercial version of ARIA at 
robots@mobilerobots.com or 
MobileRobots Inc, 10 Columbia Drive, Amherst, NH 03031; 800-639-9481
*/
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.39
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArACTS_1_2 {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArACTS_1_2(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArACTS_1_2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      AriaJavaJNI.delete_ArACTS_1_2(swigCPtr);
    }
    swigCPtr = 0;
  }

  public ArACTS_1_2() {
    this(AriaJavaJNI.new_ArACTS_1_2(), true);
  }

  public boolean openPort(ArRobot robot, String host, int port) {
    return AriaJavaJNI.ArACTS_1_2_openPort__SWIG_0(swigCPtr, this, ArRobot.getCPtr(robot), robot, host, port);
  }

  public boolean openPort(ArRobot robot, String host) {
    return AriaJavaJNI.ArACTS_1_2_openPort__SWIG_1(swigCPtr, this, ArRobot.getCPtr(robot), robot, host);
  }

  public boolean openPort(ArRobot robot) {
    return AriaJavaJNI.ArACTS_1_2_openPort__SWIG_2(swigCPtr, this, ArRobot.getCPtr(robot), robot);
  }

  public boolean closePort() {
    return AriaJavaJNI.ArACTS_1_2_closePort(swigCPtr, this);
  }

  public boolean isConnected() {
    return AriaJavaJNI.ArACTS_1_2_isConnected(swigCPtr, this);
  }

  public ArRobot getRobot() {
    long cPtr = AriaJavaJNI.ArACTS_1_2_getRobot(swigCPtr, this);
    return (cPtr == 0) ? null : new ArRobot(cPtr, false);
  }

  public void setRobot(ArRobot robot) {
    AriaJavaJNI.ArACTS_1_2_setRobot(swigCPtr, this, ArRobot.getCPtr(robot), robot);
  }

  public boolean requestPacket() {
    return AriaJavaJNI.ArACTS_1_2_requestPacket(swigCPtr, this);
  }

  public boolean requestQuit() {
    return AriaJavaJNI.ArACTS_1_2_requestQuit(swigCPtr, this);
  }

  public boolean receiveBlobInfo() {
    return AriaJavaJNI.ArACTS_1_2_receiveBlobInfo(swigCPtr, this);
  }

  public int getNumBlobs(int channel) {
    return AriaJavaJNI.ArACTS_1_2_getNumBlobs(swigCPtr, this, channel);
  }

  public boolean getBlob(int channel, int blobNumber, ArACTSBlob blob) {
    return AriaJavaJNI.ArACTS_1_2_getBlob(swigCPtr, this, channel, blobNumber, ArACTSBlob.getCPtr(blob), blob);
  }

  public void actsHandler() {
    AriaJavaJNI.ArACTS_1_2_actsHandler(swigCPtr, this);
  }

  public void invert(int width, int height) {
    AriaJavaJNI.ArACTS_1_2_invert__SWIG_0(swigCPtr, this, width, height);
  }

  public void invert(int width) {
    AriaJavaJNI.ArACTS_1_2_invert__SWIG_1(swigCPtr, this, width);
  }

  public void invert() {
    AriaJavaJNI.ArACTS_1_2_invert__SWIG_2(swigCPtr, this);
  }

  public final static class ActsConstants {
    public final static ActsConstants NUM_CHANNELS = new ActsConstants("NUM_CHANNELS", AriaJavaJNI.ArACTS_1_2_NUM_CHANNELS_get());
    public final static ActsConstants MAX_BLOBS = new ActsConstants("MAX_BLOBS", AriaJavaJNI.ArACTS_1_2_MAX_BLOBS_get());
    public final static ActsConstants ACTS_BLOB_DATA_SIZE = new ActsConstants("ACTS_BLOB_DATA_SIZE", AriaJavaJNI.ArACTS_1_2_ACTS_BLOB_DATA_SIZE_get());
    public final static ActsConstants DATA_HEADER = new ActsConstants("DATA_HEADER", AriaJavaJNI.ArACTS_1_2_DATA_HEADER_get());
    public final static ActsConstants MAX_DATA = new ActsConstants("MAX_DATA", AriaJavaJNI.ArACTS_1_2_MAX_DATA_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static ActsConstants swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + ActsConstants.class + " with value " + swigValue);
    }

    private ActsConstants(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private ActsConstants(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private ActsConstants(String swigName, ActsConstants swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static ActsConstants[] swigValues = { NUM_CHANNELS, MAX_BLOBS, ACTS_BLOB_DATA_SIZE, DATA_HEADER, MAX_DATA };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}