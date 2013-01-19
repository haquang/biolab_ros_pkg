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

public class ArPTZ {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArPTZ(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArPTZ obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      AriaJavaJNI.delete_ArPTZ(swigCPtr);
    }
    swigCPtr = 0;
  }

  public boolean init() {
    return AriaJavaJNI.ArPTZ_init(swigCPtr, this);
  }

  public void reset() {
    AriaJavaJNI.ArPTZ_reset(swigCPtr, this);
  }

  public boolean pan(double degrees) {
    return AriaJavaJNI.ArPTZ_pan(swigCPtr, this, degrees);
  }

  public boolean panRel(double degrees) {
    return AriaJavaJNI.ArPTZ_panRel(swigCPtr, this, degrees);
  }

  public boolean tilt(double degrees) {
    return AriaJavaJNI.ArPTZ_tilt(swigCPtr, this, degrees);
  }

  public boolean tiltRel(double degrees) {
    return AriaJavaJNI.ArPTZ_tiltRel(swigCPtr, this, degrees);
  }

  public boolean panTilt(double degreesPan, double degreesTilt) {
    return AriaJavaJNI.ArPTZ_panTilt(swigCPtr, this, degreesPan, degreesTilt);
  }

  public boolean panTiltRel(double degreesPan, double degreesTilt) {
    return AriaJavaJNI.ArPTZ_panTiltRel(swigCPtr, this, degreesPan, degreesTilt);
  }

  public boolean canZoom() {
    return AriaJavaJNI.ArPTZ_canZoom(swigCPtr, this);
  }

  public boolean zoom(int zoomValue) {
    return AriaJavaJNI.ArPTZ_zoom(swigCPtr, this, zoomValue);
  }

  public boolean zoomRel(int zoomValue) {
    return AriaJavaJNI.ArPTZ_zoomRel(swigCPtr, this, zoomValue);
  }

  public double getPan() {
    return AriaJavaJNI.ArPTZ_getPan(swigCPtr, this);
  }

  public double getTilt() {
    return AriaJavaJNI.ArPTZ_getTilt(swigCPtr, this);
  }

  public int getZoom() {
    return AriaJavaJNI.ArPTZ_getZoom(swigCPtr, this);
  }

  public boolean canGetRealPanTilt() {
    return AriaJavaJNI.ArPTZ_canGetRealPanTilt(swigCPtr, this);
  }

  public boolean canGetRealZoom() {
    return AriaJavaJNI.ArPTZ_canGetRealZoom(swigCPtr, this);
  }

  public double getMaxPosPan() {
    return AriaJavaJNI.ArPTZ_getMaxPosPan(swigCPtr, this);
  }

  public double getMaxNegPan() {
    return AriaJavaJNI.ArPTZ_getMaxNegPan(swigCPtr, this);
  }

  public double getMaxPosTilt() {
    return AriaJavaJNI.ArPTZ_getMaxPosTilt(swigCPtr, this);
  }

  public double getMaxNegTilt() {
    return AriaJavaJNI.ArPTZ_getMaxNegTilt(swigCPtr, this);
  }

  public int getMaxZoom() {
    return AriaJavaJNI.ArPTZ_getMaxZoom(swigCPtr, this);
  }

  public int getMinZoom() {
    return AriaJavaJNI.ArPTZ_getMinZoom(swigCPtr, this);
  }

  public boolean canGetFOV() {
    return AriaJavaJNI.ArPTZ_canGetFOV(swigCPtr, this);
  }

  public double getFOVAtMaxZoom() {
    return AriaJavaJNI.ArPTZ_getFOVAtMaxZoom(swigCPtr, this);
  }

  public double getFOVAtMinZoom() {
    return AriaJavaJNI.ArPTZ_getFOVAtMinZoom(swigCPtr, this);
  }

  public boolean setGain(double gain) {
    return AriaJavaJNI.ArPTZ_setGain(swigCPtr, this, gain);
  }

  public double getGain(double gain) {
    return AriaJavaJNI.ArPTZ_getGain(swigCPtr, this, gain);
  }

  public boolean canSetGain() {
    return AriaJavaJNI.ArPTZ_canSetGain(swigCPtr, this);
  }

  public boolean setFocus(double focus) {
    return AriaJavaJNI.ArPTZ_setFocus(swigCPtr, this, focus);
  }

  public double getFocus(double focus) {
    return AriaJavaJNI.ArPTZ_getFocus(swigCPtr, this, focus);
  }

  public boolean canSetFocus() {
    return AriaJavaJNI.ArPTZ_canSetFocus(swigCPtr, this);
  }

  public boolean setDeviceConnection(ArDeviceConnection connection, boolean driveFromRobotLoop) {
    return AriaJavaJNI.ArPTZ_setDeviceConnection__SWIG_0(swigCPtr, this, ArDeviceConnection.getCPtr(connection), connection, driveFromRobotLoop);
  }

  public boolean setDeviceConnection(ArDeviceConnection connection) {
    return AriaJavaJNI.ArPTZ_setDeviceConnection__SWIG_1(swigCPtr, this, ArDeviceConnection.getCPtr(connection), connection);
  }

  public ArDeviceConnection getDeviceConnection() {
    long cPtr = AriaJavaJNI.ArPTZ_getDeviceConnection(swigCPtr, this);
    return (cPtr == 0) ? null : new ArDeviceConnection(cPtr, false);
  }

  public boolean setAuxPort(int auxPort) {
    return AriaJavaJNI.ArPTZ_setAuxPort(swigCPtr, this, auxPort);
  }

  public int getAuxPort() {
    return AriaJavaJNI.ArPTZ_getAuxPort(swigCPtr, this);
  }

  public ArBasePacket readPacket() {
    long cPtr = AriaJavaJNI.ArPTZ_readPacket(swigCPtr, this);
    return (cPtr == 0) ? null : new ArBasePacket(cPtr, false);
  }

  public boolean sendPacket(ArBasePacket packet) {
    return AriaJavaJNI.ArPTZ_sendPacket(swigCPtr, this, ArBasePacket.getCPtr(packet), packet);
  }

  public boolean packetHandler(ArBasePacket packet) {
    return AriaJavaJNI.ArPTZ_packetHandler(swigCPtr, this, ArBasePacket.getCPtr(packet), packet);
  }

  public boolean robotPacketHandler(ArRobotPacket packet) {
    return AriaJavaJNI.ArPTZ_robotPacketHandler(swigCPtr, this, ArRobotPacket.getCPtr(packet), packet);
  }

  public void connectHandler() {
    AriaJavaJNI.ArPTZ_connectHandler(swigCPtr, this);
  }

  public void sensorInterpHandler() {
    AriaJavaJNI.ArPTZ_sensorInterpHandler(swigCPtr, this);
  }

}
