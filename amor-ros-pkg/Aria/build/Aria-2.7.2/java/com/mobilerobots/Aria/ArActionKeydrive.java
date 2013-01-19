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

public class ArActionKeydrive extends ArAction {
  /* (begin code from javabody_derived typemap) */

  private long swigCPtr;

  /* for internal use by swig only */
  public ArActionKeydrive(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.SWIGArActionKeydriveUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArActionKeydrive obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody_derived typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      AriaJavaJNI.delete_ArActionKeydrive(swigCPtr);
    }
    swigCPtr = 0;
    super.delete();
  }

  public ArActionKeydrive(String name, double transVelMax, double turnAmountMax, double velIncrement, double turnIncrement) {
    this(AriaJavaJNI.new_ArActionKeydrive__SWIG_0(name, transVelMax, turnAmountMax, velIncrement, turnIncrement), true);
  }

  public ArActionKeydrive(String name, double transVelMax, double turnAmountMax, double velIncrement) {
    this(AriaJavaJNI.new_ArActionKeydrive__SWIG_1(name, transVelMax, turnAmountMax, velIncrement), true);
  }

  public ArActionKeydrive(String name, double transVelMax, double turnAmountMax) {
    this(AriaJavaJNI.new_ArActionKeydrive__SWIG_2(name, transVelMax, turnAmountMax), true);
  }

  public ArActionKeydrive(String name, double transVelMax) {
    this(AriaJavaJNI.new_ArActionKeydrive__SWIG_3(name, transVelMax), true);
  }

  public ArActionKeydrive(String name) {
    this(AriaJavaJNI.new_ArActionKeydrive__SWIG_4(name), true);
  }

  public ArActionKeydrive() {
    this(AriaJavaJNI.new_ArActionKeydrive__SWIG_5(), true);
  }

  public ArActionDesired fire(ArActionDesired currentDesired) {
    long cPtr = AriaJavaJNI.ArActionKeydrive_fire(swigCPtr, this, ArActionDesired.getCPtr(currentDesired), currentDesired);
    return (cPtr == 0) ? null : new ArActionDesired(cPtr, false);
  }

  public void setSpeeds(double transVelMax, double turnAmountMax) {
    AriaJavaJNI.ArActionKeydrive_setSpeeds(swigCPtr, this, transVelMax, turnAmountMax);
  }

  public void setIncrements(double velIncrement, double turnIncrement) {
    AriaJavaJNI.ArActionKeydrive_setIncrements(swigCPtr, this, velIncrement, turnIncrement);
  }

  public ArActionDesired getDesired() {
    long cPtr = AriaJavaJNI.ArActionKeydrive_getDesired(swigCPtr, this);
    return (cPtr == 0) ? null : new ArActionDesired(cPtr, false);
  }

  public void setRobot(ArRobot robot) {
    AriaJavaJNI.ArActionKeydrive_setRobot(swigCPtr, this, ArRobot.getCPtr(robot), robot);
  }

  public void activate() {
    AriaJavaJNI.ArActionKeydrive_activate(swigCPtr, this);
  }

  public void deactivate() {
    AriaJavaJNI.ArActionKeydrive_deactivate(swigCPtr, this);
  }

  public void takeKeys() {
    AriaJavaJNI.ArActionKeydrive_takeKeys(swigCPtr, this);
  }

  public void giveUpKeys() {
    AriaJavaJNI.ArActionKeydrive_giveUpKeys(swigCPtr, this);
  }

  public void up() {
    AriaJavaJNI.ArActionKeydrive_up(swigCPtr, this);
  }

  public void down() {
    AriaJavaJNI.ArActionKeydrive_down(swigCPtr, this);
  }

  public void left() {
    AriaJavaJNI.ArActionKeydrive_left(swigCPtr, this);
  }

  public void right() {
    AriaJavaJNI.ArActionKeydrive_right(swigCPtr, this);
  }

  public void space() {
    AriaJavaJNI.ArActionKeydrive_space(swigCPtr, this);
  }

}
