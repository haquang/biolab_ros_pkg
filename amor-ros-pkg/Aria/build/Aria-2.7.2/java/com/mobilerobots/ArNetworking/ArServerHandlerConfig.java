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
public class ArServerHandlerConfig {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArServerHandlerConfig(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArServerHandlerConfig obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      ArNetworkingJavaJNI.delete_ArServerHandlerConfig(swigCPtr);
    }
    swigCPtr = 0;
  }

  public ArServerHandlerConfig(ArServerBase server, ArConfig config, String defaultFile, String defaultFileBaseDirectory) {
    this(ArNetworkingJavaJNI.new_ArServerHandlerConfig__SWIG_0(ArServerBase.getCPtr(server), server, ArConfig.getCPtr(config), config, defaultFile, defaultFileBaseDirectory), true);
  }

  public ArServerHandlerConfig(ArServerBase server, ArConfig config, String defaultFile) {
    this(ArNetworkingJavaJNI.new_ArServerHandlerConfig__SWIG_1(ArServerBase.getCPtr(server), server, ArConfig.getCPtr(config), config, defaultFile), true);
  }

  public ArServerHandlerConfig(ArServerBase server, ArConfig config) {
    this(ArNetworkingJavaJNI.new_ArServerHandlerConfig__SWIG_2(ArServerBase.getCPtr(server), server, ArConfig.getCPtr(config), config), true);
  }

  public void reloadConfig(ArServerClient client, ArNetPacket packet) {
    ArNetworkingJavaJNI.ArServerHandlerConfig_reloadConfig(swigCPtr, this, ArServerClient.getCPtr(client), client, ArNetPacket.getCPtr(packet), packet);
  }

  public void getConfigBySections(ArServerClient client, ArNetPacket packet) {
    ArNetworkingJavaJNI.ArServerHandlerConfig_getConfigBySections(swigCPtr, this, ArServerClient.getCPtr(client), client, ArNetPacket.getCPtr(packet), packet);
  }

  public void getConfig(ArServerClient client, ArNetPacket packet) {
    ArNetworkingJavaJNI.ArServerHandlerConfig_getConfig(swigCPtr, this, ArServerClient.getCPtr(client), client, ArNetPacket.getCPtr(packet), packet);
  }

  public void setConfig(ArServerClient client, ArNetPacket packet) {
    ArNetworkingJavaJNI.ArServerHandlerConfig_setConfig(swigCPtr, this, ArServerClient.getCPtr(client), client, ArNetPacket.getCPtr(packet), packet);
  }

  public void getConfigDefaults(ArServerClient client, ArNetPacket packet) {
    ArNetworkingJavaJNI.ArServerHandlerConfig_getConfigDefaults(swigCPtr, this, ArServerClient.getCPtr(client), client, ArNetPacket.getCPtr(packet), packet);
  }

  public void getConfigSectionFlags(ArServerClient client, ArNetPacket packet) {
    ArNetworkingJavaJNI.ArServerHandlerConfig_getConfigSectionFlags(swigCPtr, this, ArServerClient.getCPtr(client), client, ArNetPacket.getCPtr(packet), packet);
  }

  public void addPreWriteCallback(ArFunctor functor, ArListPos.Pos position) {
    ArNetworkingJavaJNI.ArServerHandlerConfig_addPreWriteCallback__SWIG_0(swigCPtr, this, ArFunctor.getCPtr(functor), functor, position.swigValue());
  }

  public void addPreWriteCallback(ArFunctor functor) {
    ArNetworkingJavaJNI.ArServerHandlerConfig_addPreWriteCallback__SWIG_1(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
  }

  public void remPreWriteCallback(ArFunctor functor) {
    ArNetworkingJavaJNI.ArServerHandlerConfig_remPreWriteCallback(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
  }

  public void addPostWriteCallback(ArFunctor functor, ArListPos.Pos position) {
    ArNetworkingJavaJNI.ArServerHandlerConfig_addPostWriteCallback__SWIG_0(swigCPtr, this, ArFunctor.getCPtr(functor), functor, position.swigValue());
  }

  public void addPostWriteCallback(ArFunctor functor) {
    ArNetworkingJavaJNI.ArServerHandlerConfig_addPostWriteCallback__SWIG_1(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
  }

  public void remPostWriteCallback(ArFunctor functor) {
    ArNetworkingJavaJNI.ArServerHandlerConfig_remPostWriteCallback(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
  }

  public void addConfigUpdatedCallback(ArFunctor functor, ArListPos.Pos position) {
    ArNetworkingJavaJNI.ArServerHandlerConfig_addConfigUpdatedCallback__SWIG_0(swigCPtr, this, ArFunctor.getCPtr(functor), functor, position.swigValue());
  }

  public void addConfigUpdatedCallback(ArFunctor functor) {
    ArNetworkingJavaJNI.ArServerHandlerConfig_addConfigUpdatedCallback__SWIG_1(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
  }

  public void remConfigUpdatedCallback(ArFunctor functor) {
    ArNetworkingJavaJNI.ArServerHandlerConfig_remConfigUpdatedCallback(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
  }

  public int lockConfig() {
    return ArNetworkingJavaJNI.ArServerHandlerConfig_lockConfig(swigCPtr, this);
  }

  public int tryLockConfig() {
    return ArNetworkingJavaJNI.ArServerHandlerConfig_tryLockConfig(swigCPtr, this);
  }

  public int unlockConfig() {
    return ArNetworkingJavaJNI.ArServerHandlerConfig_unlockConfig(swigCPtr, this);
  }

  public boolean writeConfig() {
    return ArNetworkingJavaJNI.ArServerHandlerConfig_writeConfig(swigCPtr, this);
  }

  public boolean configUpdated(ArServerClient client) {
    return ArNetworkingJavaJNI.ArServerHandlerConfig_configUpdated__SWIG_0(swigCPtr, this, ArServerClient.getCPtr(client), client);
  }

  public boolean configUpdated() {
    return ArNetworkingJavaJNI.ArServerHandlerConfig_configUpdated__SWIG_1(swigCPtr, this);
  }

  public boolean loadDefaultsFromFile() {
    return ArNetworkingJavaJNI.ArServerHandlerConfig_loadDefaultsFromFile(swigCPtr, this);
  }

  public boolean loadDefaultsFromPacket(ArNetPacket packet) {
    return ArNetworkingJavaJNI.ArServerHandlerConfig_loadDefaultsFromPacket(swigCPtr, this, ArNetPacket.getCPtr(packet), packet);
  }

  public void createEmptyConfigDefaults() {
    ArNetworkingJavaJNI.ArServerHandlerConfig_createEmptyConfigDefaults(swigCPtr, this);
  }

}
