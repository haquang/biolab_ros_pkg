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

public class ArRetFunctor_Bool extends ArFunctor {
  /* (begin code from javabody_derived typemap) */

  private long swigCPtr;

  /* for internal use by swig only */
  public ArRetFunctor_Bool(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.SWIGArRetFunctor_BoolUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArRetFunctor_Bool obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody_derived typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      AriaJavaJNI.delete_ArRetFunctor_Bool(swigCPtr);
    }
    swigCPtr = 0;
    super.delete();
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    AriaJavaJNI.ArRetFunctor_Bool_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    AriaJavaJNI.ArRetFunctor_Bool_change_ownership(this, swigCPtr, true);
  }

  public void invoke() {
    if (getClass() == ArRetFunctor_Bool.class) AriaJavaJNI.ArRetFunctor_Bool_invoke(swigCPtr, this); else AriaJavaJNI.ArRetFunctor_Bool_invokeSwigExplicitArRetFunctor_Bool(swigCPtr, this);
  }

  public boolean invokeR() {
    return AriaJavaJNI.ArRetFunctor_Bool_invokeR(swigCPtr, this);
  }

  public ArRetFunctor_Bool() {
    this(AriaJavaJNI.new_ArRetFunctor_Bool(), true);
    AriaJavaJNI.ArRetFunctor_Bool_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}
