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

public class ArLMS2xxPacket extends ArBasePacket {
  /* (begin code from javabody_derived typemap) */

  private long swigCPtr;

  /* for internal use by swig only */
  public ArLMS2xxPacket(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.SWIGArLMS2xxPacketUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArLMS2xxPacket obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody_derived typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      AriaJavaJNI.delete_ArLMS2xxPacket(swigCPtr);
    }
    swigCPtr = 0;
    super.delete();
  }

  public ArLMS2xxPacket(short sendingAddress) {
    this(AriaJavaJNI.new_ArLMS2xxPacket__SWIG_0(sendingAddress), true);
  }

  public ArLMS2xxPacket() {
    this(AriaJavaJNI.new_ArLMS2xxPacket__SWIG_1(), true);
  }

  public void setSendingAddress(short address) {
    AriaJavaJNI.ArLMS2xxPacket_setSendingAddress(swigCPtr, this, address);
  }

  public short getSendingAddress() {
    return AriaJavaJNI.ArLMS2xxPacket_getSendingAddress(swigCPtr, this);
  }

  public short getReceivedAddress() {
    return AriaJavaJNI.ArLMS2xxPacket_getReceivedAddress(swigCPtr, this);
  }

  public boolean verifyCRC() {
    return AriaJavaJNI.ArLMS2xxPacket_verifyCRC(swigCPtr, this);
  }

  public short getID() {
    return AriaJavaJNI.ArLMS2xxPacket_getID(swigCPtr, this);
  }

  public short calcCRC() {
    return AriaJavaJNI.ArLMS2xxPacket_calcCRC(swigCPtr, this);
  }

  public void finalizePacket() {
    AriaJavaJNI.ArLMS2xxPacket_finalizePacket(swigCPtr, this);
  }

  public void resetRead() {
    AriaJavaJNI.ArLMS2xxPacket_resetRead(swigCPtr, this);
  }

  public ArTime getTimeReceived() {
    return new ArTime(AriaJavaJNI.ArLMS2xxPacket_getTimeReceived(swigCPtr, this), true);
  }

  public void setTimeReceived(ArTime timeReceived) {
    AriaJavaJNI.ArLMS2xxPacket_setTimeReceived(swigCPtr, this, ArTime.getCPtr(timeReceived), timeReceived);
  }

  public void duplicatePacket(ArLMS2xxPacket packet) {
    AriaJavaJNI.ArLMS2xxPacket_duplicatePacket(swigCPtr, this, ArLMS2xxPacket.getCPtr(packet), packet);
  }

}
