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

package com.mobilerobots.ArNetworking;
import com.mobilerobots.Aria.*;
public class ArServerMode {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArServerMode(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArServerMode obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      ArNetworkingJavaJNI.delete_ArServerMode(swigCPtr);
    }
    swigCPtr = 0;
  }

  public ArActionGroup getActionGroup() {
    long cPtr = ArNetworkingJavaJNI.ArServerMode_getActionGroup(swigCPtr, this);
    return (cPtr == 0) ? null : new ArActionGroup(cPtr, false);
  }

  public void activate() {
    ArNetworkingJavaJNI.ArServerMode_activate(swigCPtr, this);
  }

  public void deactivate() {
    ArNetworkingJavaJNI.ArServerMode_deactivate(swigCPtr, this);
  }

  public void activationDenied() {
    ArNetworkingJavaJNI.ArServerMode_activationDenied(swigCPtr, this);
  }

  public void userTask() {
    ArNetworkingJavaJNI.ArServerMode_userTask(swigCPtr, this);
  }

  public void requestUnlock() {
    ArNetworkingJavaJNI.ArServerMode_requestUnlock(swigCPtr, this);
  }

  public void forceUnlock() {
    ArNetworkingJavaJNI.ArServerMode_forceUnlock(swigCPtr, this);
  }

  public void lockMode(boolean willUnlockIfRequested) {
    ArNetworkingJavaJNI.ArServerMode_lockMode__SWIG_0(swigCPtr, this, willUnlockIfRequested);
  }

  public void lockMode() {
    ArNetworkingJavaJNI.ArServerMode_lockMode__SWIG_1(swigCPtr, this);
  }

  public void unlockMode() {
    ArNetworkingJavaJNI.ArServerMode_unlockMode(swigCPtr, this);
  }

  public String getMode() {
    return ArNetworkingJavaJNI.ArServerMode_getMode(swigCPtr, this);
  }

  public String getStatus() {
    return ArNetworkingJavaJNI.ArServerMode_getStatus(swigCPtr, this);
  }

  public String getName() {
    return ArNetworkingJavaJNI.ArServerMode_getName(swigCPtr, this);
  }

  public boolean isActive() {
    return ArNetworkingJavaJNI.ArServerMode_isActive(swigCPtr, this);
  }

  public static boolean willUnlockIfRequested() {
    return ArNetworkingJavaJNI.ArServerMode_willUnlockIfRequested();
  }

  public static ArServerMode getActiveMode() {
    long cPtr = ArNetworkingJavaJNI.ArServerMode_getActiveMode();
    return (cPtr == 0) ? null : new ArServerMode(cPtr, false);
  }

  public boolean hasSetActivityTime() {
    return ArNetworkingJavaJNI.ArServerMode_hasSetActivityTime(swigCPtr, this);
  }

  public ArTime getActivityTime() {
    return new ArTime(ArNetworkingJavaJNI.ArServerMode_getActivityTime(swigCPtr, this), true);
  }

  public void setActivityTimeToNow() {
    ArNetworkingJavaJNI.ArServerMode_setActivityTimeToNow(swigCPtr, this);
  }

  public static int getActiveModeActivityTimeSecSince() {
    return ArNetworkingJavaJNI.ArServerMode_getActiveModeActivityTimeSecSince();
  }

  public void addAsDefaultMode(ArListPos.Pos pos) {
    ArNetworkingJavaJNI.ArServerMode_addAsDefaultMode__SWIG_0(swigCPtr, this, pos.swigValue());
  }

  public void addAsDefaultMode() {
    ArNetworkingJavaJNI.ArServerMode_addAsDefaultMode__SWIG_1(swigCPtr, this);
  }

  public void checkDefault() {
    ArNetworkingJavaJNI.ArServerMode_checkDefault(swigCPtr, this);
  }

  public void setMode(String str) {
    ArNetworkingJavaJNI.ArServerMode_setMode(swigCPtr, this, str);
  }

  public void setStatus(String str) {
    ArNetworkingJavaJNI.ArServerMode_setStatus(swigCPtr, this, str);
  }

  public boolean isAutoResumeAfterInterrupt() {
    return ArNetworkingJavaJNI.ArServerMode_isAutoResumeAfterInterrupt(swigCPtr, this);
  }

  public boolean addModeData(String name, String description, ArFunctor_ServerData functor, String argumentDescription, String returnDescription, String commandGroup, String dataFlags) {
    return ArNetworkingJavaJNI.ArServerMode_addModeData__SWIG_0(swigCPtr, this, name, description, ArFunctor_ServerData.getCPtr(functor), functor, argumentDescription, returnDescription, commandGroup, dataFlags);
  }

  public boolean addModeData(String name, String description, ArFunctor_ServerData functor, String argumentDescription, String returnDescription, String commandGroup) {
    return ArNetworkingJavaJNI.ArServerMode_addModeData__SWIG_1(swigCPtr, this, name, description, ArFunctor_ServerData.getCPtr(functor), functor, argumentDescription, returnDescription, commandGroup);
  }

  public boolean addModeData(String name, String description, ArFunctor_ServerData functor, String argumentDescription, String returnDescription) {
    return ArNetworkingJavaJNI.ArServerMode_addModeData__SWIG_2(swigCPtr, this, name, description, ArFunctor_ServerData.getCPtr(functor), functor, argumentDescription, returnDescription);
  }

  public static void getModeDataList(ArServerClient client, ArNetPacket packet) {
    ArNetworkingJavaJNI.ArServerMode_getModeDataList(ArServerClient.getCPtr(client), client, ArNetPacket.getCPtr(packet), packet);
  }

  public static void getModeInfo(ArServerClient client, ArNetPacket packet) {
    ArNetworkingJavaJNI.ArServerMode_getModeInfo(ArServerClient.getCPtr(client), client, ArNetPacket.getCPtr(packet), packet);
  }

  public static void getModeBusy(ArServerClient client, ArNetPacket packet) {
    ArNetworkingJavaJNI.ArServerMode_getModeBusy(ArServerClient.getCPtr(client), client, ArNetPacket.getCPtr(packet), packet);
  }

  public void addActivateCallback(ArFunctor functor, int position) {
    ArNetworkingJavaJNI.ArServerMode_addActivateCallback__SWIG_0(swigCPtr, this, ArFunctor.getCPtr(functor), functor, position);
  }

  public void addActivateCallback(ArFunctor functor) {
    ArNetworkingJavaJNI.ArServerMode_addActivateCallback__SWIG_1(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
  }

  public void remActivateCallback(ArFunctor functor) {
    ArNetworkingJavaJNI.ArServerMode_remActivateCallback(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
  }

  public void addDeactivateCallback(ArFunctor functor, int position) {
    ArNetworkingJavaJNI.ArServerMode_addDeactivateCallback__SWIG_0(swigCPtr, this, ArFunctor.getCPtr(functor), functor, position);
  }

  public void addDeactivateCallback(ArFunctor functor) {
    ArNetworkingJavaJNI.ArServerMode_addDeactivateCallback__SWIG_1(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
  }

  public void remDeactivateCallback(ArFunctor functor) {
    ArNetworkingJavaJNI.ArServerMode_remDeactivateCallback(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
  }

  public void addSingleShotDeactivateCallback(ArFunctor functor, int position) {
    ArNetworkingJavaJNI.ArServerMode_addSingleShotDeactivateCallback__SWIG_0(swigCPtr, this, ArFunctor.getCPtr(functor), functor, position);
  }

  public void addSingleShotDeactivateCallback(ArFunctor functor) {
    ArNetworkingJavaJNI.ArServerMode_addSingleShotDeactivateCallback__SWIG_1(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
  }

  public void remSingleShotDeactivateCallback(ArFunctor functor) {
    ArNetworkingJavaJNI.ArServerMode_remSingleShotDeactivateCallback(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
  }

  public static ArServerModeIdle getIdleMode() {
    long cPtr = ArNetworkingJavaJNI.ArServerMode_getIdleMode();
    return (cPtr == 0) ? null : new ArServerModeIdle(cPtr, false);
  }

}
