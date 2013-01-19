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
#ifndef ARLMS2XXPACKETRECEIVER_H
#define ARLMS2XXPACKETRECEIVER_H

#include "ariaTypedefs.h"
#include "ArDeviceConnection.h"
#include "ArLMS2xxPacket.h"

/// Given a device connection it receives packets from the sick through it
class ArLMS2xxPacketReceiver
{
public:
  /// Constructor without an already assigned device connection
  AREXPORT ArLMS2xxPacketReceiver(unsigned char receivingAddress = 0, 
				bool allocatePackets = false,
				bool useBase0Address = false);
  /// Constructor with assignment of a device connection
  AREXPORT ArLMS2xxPacketReceiver(ArDeviceConnection *deviceConnection, 
				unsigned char receivingAddress = 0,
				bool allocatePackets = false,
				bool useBase0Address = false);
  /// Destructor
  AREXPORT virtual ~ArLMS2xxPacketReceiver();
  
  /// Receives a packet from the robot if there is one available
  AREXPORT ArLMS2xxPacket *receivePacket(unsigned int msWait = 0);

  /// Sets the device this instance receives packets from
  AREXPORT void setDeviceConnection(ArDeviceConnection *deviceConnection);
  /// Gets the device this instance receives packets from
  AREXPORT ArDeviceConnection *getDeviceConnection(void);
  
  /// Gets whether or not the receiver is allocating packets
  AREXPORT bool isAllocatingPackets(void) { return myAllocatePackets; }

protected:
  ArDeviceConnection *myDeviceConn;
  bool myAllocatePackets;
  ArLMS2xxPacket myPacket;
  unsigned char myReceivingAddress;
  bool myUseBase0Address;
  enum { STATE_START, STATE_ADDR, STATE_START_COUNT, STATE_ACQUIRE_DATA };
};

typedef ArLMS2xxPacketReceiver ArSickPacketReceiver;

#endif // ARSICKPACKETRECEIVER_H
