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

public class ArSocket {
  /* (begin code from javabody typemap) */

  private long swigCPtr;
  protected boolean swigCMemOwn;

  /* for internal use by swig only */
  public ArSocket(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArSocket obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      AriaJavaJNI.delete_ArSocket(swigCPtr);
    }
    swigCPtr = 0;
  }

  public ArSocket() {
    this(AriaJavaJNI.new_ArSocket__SWIG_0(), true);
  }

  public ArSocket(String host, int port, ArSocket.Type type) {
    this(AriaJavaJNI.new_ArSocket__SWIG_1(host, port, type.swigValue()), true);
  }

  public ArSocket(int port, boolean doClose, ArSocket.Type type) {
    this(AriaJavaJNI.new_ArSocket__SWIG_2(port, doClose, type.swigValue()), true);
  }

  public static boolean init() {
    return AriaJavaJNI.ArSocket_init();
  }

  public static void shutdown() {
    AriaJavaJNI.ArSocket_shutdown();
  }

  public static void setOurInitialized(boolean value) {
    AriaJavaJNI.ArSocket_ourInitialized_set(value);
  }

  public static boolean getOurInitialized() {
    return AriaJavaJNI.ArSocket_ourInitialized_get();
  }

  public boolean copy(int fd, boolean doclose) {
    return AriaJavaJNI.ArSocket_copy__SWIG_0(swigCPtr, this, fd, doclose);
  }

  public void copy(ArSocket s) {
    AriaJavaJNI.ArSocket_copy__SWIG_1(swigCPtr, this, ArSocket.getCPtr(s), s);
  }

  public void transfer(ArSocket s) {
    AriaJavaJNI.ArSocket_transfer(swigCPtr, this, ArSocket.getCPtr(s), s);
  }

  public boolean connect(String host, int port, ArSocket.Type type, String openOnIP) {
    return AriaJavaJNI.ArSocket_connect__SWIG_0(swigCPtr, this, host, port, type.swigValue(), openOnIP);
  }

  public boolean connect(String host, int port, ArSocket.Type type) {
    return AriaJavaJNI.ArSocket_connect__SWIG_1(swigCPtr, this, host, port, type.swigValue());
  }

  public boolean connect(String host, int port) {
    return AriaJavaJNI.ArSocket_connect__SWIG_2(swigCPtr, this, host, port);
  }

  public boolean open(int port, ArSocket.Type type, String openOnIP) {
    return AriaJavaJNI.ArSocket_open__SWIG_0(swigCPtr, this, port, type.swigValue(), openOnIP);
  }

  public boolean open(int port, ArSocket.Type type) {
    return AriaJavaJNI.ArSocket_open__SWIG_1(swigCPtr, this, port, type.swigValue());
  }

  public boolean create(ArSocket.Type type) {
    return AriaJavaJNI.ArSocket_create(swigCPtr, this, type.swigValue());
  }

  public boolean findValidPort(int startPort, String openOnIP) {
    return AriaJavaJNI.ArSocket_findValidPort__SWIG_0(swigCPtr, this, startPort, openOnIP);
  }

  public boolean findValidPort(int startPort) {
    return AriaJavaJNI.ArSocket_findValidPort__SWIG_1(swigCPtr, this, startPort);
  }

  public boolean connectTo(String host, int port) {
    return AriaJavaJNI.ArSocket_connectTo__SWIG_0(swigCPtr, this, host, port);
  }

  public boolean connectTo(SWIGTYPE_p_sockaddr_in sin) {
    return AriaJavaJNI.ArSocket_connectTo__SWIG_1(swigCPtr, this, SWIGTYPE_p_sockaddr_in.getCPtr(sin));
  }

  public boolean accept(ArSocket sock) {
    return AriaJavaJNI.ArSocket_accept(swigCPtr, this, ArSocket.getCPtr(sock), sock);
  }

  public boolean close() {
    return AriaJavaJNI.ArSocket_close(swigCPtr, this);
  }

  public int write(SWIGTYPE_p_void buff, long len) {
    return AriaJavaJNI.ArSocket_write(swigCPtr, this, SWIGTYPE_p_void.getCPtr(buff), len);
  }

  public int read(SWIGTYPE_p_void buff, long len, long msWait) {
    return AriaJavaJNI.ArSocket_read__SWIG_0(swigCPtr, this, SWIGTYPE_p_void.getCPtr(buff), len, msWait);
  }

  public int read(SWIGTYPE_p_void buff, long len) {
    return AriaJavaJNI.ArSocket_read__SWIG_1(swigCPtr, this, SWIGTYPE_p_void.getCPtr(buff), len);
  }

  public int sendTo(SWIGTYPE_p_void msg, int len) {
    return AriaJavaJNI.ArSocket_sendTo__SWIG_0(swigCPtr, this, SWIGTYPE_p_void.getCPtr(msg), len);
  }

  public int sendTo(SWIGTYPE_p_void msg, int len, SWIGTYPE_p_sockaddr_in sin) {
    return AriaJavaJNI.ArSocket_sendTo__SWIG_1(swigCPtr, this, SWIGTYPE_p_void.getCPtr(msg), len, SWIGTYPE_p_sockaddr_in.getCPtr(sin));
  }

  public int recvFrom(SWIGTYPE_p_void msg, int len, SWIGTYPE_p_sockaddr_in sin) {
    return AriaJavaJNI.ArSocket_recvFrom(swigCPtr, this, SWIGTYPE_p_void.getCPtr(msg), len, SWIGTYPE_p_sockaddr_in.getCPtr(sin));
  }

  public static boolean hostAddr(String host, SWIGTYPE_p_in_addr addr) {
    return AriaJavaJNI.ArSocket_hostAddr(host, SWIGTYPE_p_in_addr.getCPtr(addr));
  }

  public static boolean addrHost(SWIGTYPE_p_in_addr addr, String host) {
    return AriaJavaJNI.ArSocket_addrHost(SWIGTYPE_p_in_addr.getCPtr(addr), host);
  }

  public static SWIGTYPE_p_std__string getHostName() {
    return new SWIGTYPE_p_std__string(AriaJavaJNI.ArSocket_getHostName(), true);
  }

  public boolean getSockName() {
    return AriaJavaJNI.ArSocket_getSockName(swigCPtr, this);
  }

  public SWIGTYPE_p_sockaddr_in sockAddrIn() {
    long cPtr = AriaJavaJNI.ArSocket_sockAddrIn(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_sockaddr_in(cPtr, false);
  }

  public SWIGTYPE_p_in_addr inAddr() {
    long cPtr = AriaJavaJNI.ArSocket_inAddr(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_in_addr(cPtr, false);
  }

  public int inPort() {
    return AriaJavaJNI.ArSocket_inPort(swigCPtr, this);
  }

  public static void inToA(SWIGTYPE_p_in_addr addr, String buff) {
    AriaJavaJNI.ArSocket_inToA(SWIGTYPE_p_in_addr.getCPtr(addr), buff);
  }

  public static long sockAddrLen() {
    return AriaJavaJNI.ArSocket_sockAddrLen();
  }

  public static long maxHostNameLen() {
    return AriaJavaJNI.ArSocket_maxHostNameLen();
  }

  public static long hostToNetOrder(int i) {
    return AriaJavaJNI.ArSocket_hostToNetOrder(i);
  }

  public static long netToHostOrder(int i) {
    return AriaJavaJNI.ArSocket_netToHostOrder(i);
  }

  public boolean setLinger(int time) {
    return AriaJavaJNI.ArSocket_setLinger(swigCPtr, this, time);
  }

  public boolean setBroadcast() {
    return AriaJavaJNI.ArSocket_setBroadcast(swigCPtr, this);
  }

  public boolean setReuseAddress() {
    return AriaJavaJNI.ArSocket_setReuseAddress(swigCPtr, this);
  }

  public boolean setNonBlock() {
    return AriaJavaJNI.ArSocket_setNonBlock(swigCPtr, this);
  }

  public void setDoClose(boolean yesno) {
    AriaJavaJNI.ArSocket_setDoClose(swigCPtr, this, yesno);
  }

  public int getFD() {
    return AriaJavaJNI.ArSocket_getFD(swigCPtr, this);
  }

  public ArSocket.Type getType() {
    return ArSocket.Type.swigToEnum(AriaJavaJNI.ArSocket_getType(swigCPtr, this));
  }

  public SWIGTYPE_p_std__string getErrorStr() {
    return new SWIGTYPE_p_std__string(AriaJavaJNI.ArSocket_getErrorStr(swigCPtr, this), false);
  }

  public ArSocket.Error getError() {
    return ArSocket.Error.swigToEnum(AriaJavaJNI.ArSocket_getError(swigCPtr, this));
  }

  public void setErrorTracking(boolean errorTracking) {
    AriaJavaJNI.ArSocket_setErrorTracking(swigCPtr, this, errorTracking);
  }

  public boolean getErrorTracking() {
    return AriaJavaJNI.ArSocket_getErrorTracking(swigCPtr, this);
  }

  public boolean getBadWrite() {
    return AriaJavaJNI.ArSocket_getBadWrite(swigCPtr, this);
  }

  public boolean getBadRead() {
    return AriaJavaJNI.ArSocket_getBadRead(swigCPtr, this);
  }

  public int writeStringPlain(String str) {
    return AriaJavaJNI.ArSocket_writeStringPlain(swigCPtr, this, str);
  }

  public String readString(long msWait) {
    return AriaJavaJNI.ArSocket_readString__SWIG_0(swigCPtr, this, msWait);
  }

  public String readString() {
    return AriaJavaJNI.ArSocket_readString__SWIG_1(swigCPtr, this);
  }

  public void setReadStringIgnoreReturn(boolean ignore) {
    AriaJavaJNI.ArSocket_setReadStringIgnoreReturn(swigCPtr, this, ignore);
  }

  public void clearPartialReadString() {
    AriaJavaJNI.ArSocket_clearPartialReadString(swigCPtr, this);
  }

  public int comparePartialReadString(String partialString) {
    return AriaJavaJNI.ArSocket_comparePartialReadString(swigCPtr, this, partialString);
  }

  public ArTime getLastStringReadTime() {
    return new ArTime(AriaJavaJNI.ArSocket_getLastStringReadTime(swigCPtr, this), true);
  }

  public void setEcho(boolean echo) {
    AriaJavaJNI.ArSocket_setEcho(swigCPtr, this, echo);
  }

  public boolean getEcho() {
    return AriaJavaJNI.ArSocket_getEcho(swigCPtr, this);
  }

  public void setLogWriteStrings(boolean logWriteStrings) {
    AriaJavaJNI.ArSocket_setLogWriteStrings(swigCPtr, this, logWriteStrings);
  }

  public boolean getLogWriteStrings() {
    return AriaJavaJNI.ArSocket_getLogWriteStrings(swigCPtr, this);
  }

  public void setStringUseWrongEndChars(boolean useWrongEndChars) {
    AriaJavaJNI.ArSocket_setStringUseWrongEndChars(swigCPtr, this, useWrongEndChars);
  }

  public boolean getStringUseWrongEndChars() {
    return AriaJavaJNI.ArSocket_getStringUseWrongEndChars(swigCPtr, this);
  }

  public String getRawIPString() {
    return AriaJavaJNI.ArSocket_getRawIPString(swigCPtr, this);
  }

  public String getIPString() {
    return AriaJavaJNI.ArSocket_getIPString(swigCPtr, this);
  }

  public void setIPString(String ipString) {
    AriaJavaJNI.ArSocket_setIPString(swigCPtr, this, ipString);
  }

  public void setCloseCallback(ArFunctor functor) {
    AriaJavaJNI.ArSocket_setCloseCallback(swigCPtr, this, ArFunctor.getCPtr(functor), functor);
  }

  public ArFunctor getCloseCallback() {
    long cPtr = AriaJavaJNI.ArSocket_getCloseCallback(swigCPtr, this);
    return (cPtr == 0) ? null : new ArFunctor(cPtr, false);
  }

  public int getSends() {
    return AriaJavaJNI.ArSocket_getSends(swigCPtr, this);
  }

  public int getBytesSent() {
    return AriaJavaJNI.ArSocket_getBytesSent(swigCPtr, this);
  }

  public int getRecvs() {
    return AriaJavaJNI.ArSocket_getRecvs(swigCPtr, this);
  }

  public int getBytesRecvd() {
    return AriaJavaJNI.ArSocket_getBytesRecvd(swigCPtr, this);
  }

  public void resetTracking() {
    AriaJavaJNI.ArSocket_resetTracking(swigCPtr, this);
  }

  public boolean setNoDelay(boolean flag) {
    return AriaJavaJNI.ArSocket_setNoDelay(swigCPtr, this, flag);
  }

  public final static class Type {
    public final static Type UDP = new Type("UDP");
    public final static Type TCP = new Type("TCP");
    public final static Type Unknown = new Type("Unknown");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Type swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Type.class + " with value " + swigValue);
    }

    private Type(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Type(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Type(String swigName, Type swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Type[] swigValues = { UDP, TCP, Unknown };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

  public final static class Error {
    public final static Error NoErr = new Error("NoErr");
    public final static Error NetFail = new Error("NetFail");
    public final static Error ConBadHost = new Error("ConBadHost");
    public final static Error ConNoRoute = new Error("ConNoRoute");
    public final static Error ConRefused = new Error("ConRefused");
    public final static Error NameLookup = new Error("NameLookup");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Error swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Error.class + " with value " + swigValue);
    }

    private Error(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Error(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Error(String swigName, Error swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Error[] swigValues = { NoErr, NetFail, ConBadHost, ConNoRoute, ConRefused, NameLookup };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
