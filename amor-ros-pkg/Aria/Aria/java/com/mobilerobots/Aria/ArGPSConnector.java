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

public class ArGPSConnector {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArGPSConnector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArGPSConnector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      AriaJavaJNI.delete_ArGPSConnector(swigCPtr);
    }
    swigCPtr = 0;
  }

  public ArGPSConnector(ArArgumentParser argParser) {
    this(AriaJavaJNI.new_ArGPSConnector(ArArgumentParser.getCPtr(argParser), argParser), true);
  }

  public boolean parseArgs() {
    return AriaJavaJNI.ArGPSConnector_parseArgs(swigCPtr, this);
  }

  public ArGPS createGPS(ArRobot robot) {
    long cPtr = AriaJavaJNI.ArGPSConnector_createGPS__SWIG_0(swigCPtr, this, ArRobot.getCPtr(robot), robot);
    return (cPtr == 0) ? null : new ArGPS(cPtr, false);
  }

  public ArGPS createGPS() {
    long cPtr = AriaJavaJNI.ArGPSConnector_createGPS__SWIG_1(swigCPtr, this);
    return (cPtr == 0) ? null : new ArGPS(cPtr, false);
  }

  public ArGPS create(ArRobot robot) {
    long cPtr = AriaJavaJNI.ArGPSConnector_create__SWIG_0(swigCPtr, this, ArRobot.getCPtr(robot), robot);
    return (cPtr == 0) ? null : new ArGPS(cPtr, false);
  }

  public ArGPS create() {
    long cPtr = AriaJavaJNI.ArGPSConnector_create__SWIG_1(swigCPtr, this);
    return (cPtr == 0) ? null : new ArGPS(cPtr, false);
  }

  public ArGPSConnector.GPSType getGPSType() {
    return ArGPSConnector.GPSType.swigToEnum(AriaJavaJNI.ArGPSConnector_getGPSType(swigCPtr, this));
  }

  public final static class GPSType {
    public final static GPSType Standard = new GPSType("Standard");
    public final static GPSType Novatel = new GPSType("Novatel");
    public final static GPSType Trimble = new GPSType("Trimble");
    public final static GPSType Invalid = new GPSType("Invalid");
    public final static GPSType NovatelSPAN = new GPSType("NovatelSPAN");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static GPSType swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + GPSType.class + " with value " + swigValue);
    }

    private GPSType(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private GPSType(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private GPSType(String swigName, GPSType swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static GPSType[] swigValues = { Standard, Novatel, Trimble, Invalid, NovatelSPAN };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
