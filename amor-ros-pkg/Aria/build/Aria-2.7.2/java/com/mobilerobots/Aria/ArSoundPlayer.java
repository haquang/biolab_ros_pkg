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

public class ArSoundPlayer {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArSoundPlayer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArSoundPlayer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      AriaJavaJNI.delete_ArSoundPlayer(swigCPtr);
    }
    swigCPtr = 0;
  }

  public static boolean playWavFile(String filename, String params) {
    return AriaJavaJNI.ArSoundPlayer_playWavFile(filename, params);
  }

  public static boolean playNativeFile(String filename, String params) {
    return AriaJavaJNI.ArSoundPlayer_playNativeFile(filename, params);
  }

  public static void stopPlaying() {
    AriaJavaJNI.ArSoundPlayer_stopPlaying();
  }

  public static SWIGTYPE_p_ArRetFunctor2T_bool_char_const_p_char_const_p_t getPlayWavFileCallback() {
    long cPtr = AriaJavaJNI.ArSoundPlayer_getPlayWavFileCallback();
    return (cPtr == 0) ? null : new SWIGTYPE_p_ArRetFunctor2T_bool_char_const_p_char_const_p_t(cPtr, false);
  }

  public static ArFunctor getStopPlayingCallback() {
    long cPtr = AriaJavaJNI.ArSoundPlayer_getStopPlayingCallback();
    return (cPtr == 0) ? null : new ArFunctor(cPtr, false);
  }

  public static boolean playSoundPCM16(String data, int numSamples) {
    return AriaJavaJNI.ArSoundPlayer_playSoundPCM16(data, numSamples);
  }

  public ArSoundPlayer() {
    this(AriaJavaJNI.new_ArSoundPlayer(), true);
  }

}
