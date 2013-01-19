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
#include "Aria.h"

/* Tests the MOVE command */

int main(int argc, char **argv)
{
  ArRobot robot;
  Aria::init();
  ArSimpleConnector connector(&argc, argv);
  if (!connector.parseArgs() || argc > 1)
  {
    connector.logOptions();
    return 1;
  }
  
  if (!connector.connectRobot(&robot))
  {
    ArLog::log(ArLog::Terse, "moveCommandTest: Could not connect to robot... exiting.");
    return 2;
  }

  robot.runAsync(true);

  robot.lock();
  robot.enableMotors();
  robot.unlock();

  ArLog::log(ArLog::Normal, "moveCommandTest: Sending command to MOVE 500 mm...");
  robot.lock();
  robot.move(500);
  robot.unlock();
  ArLog::log(ArLog::Normal, "moveCommandTest: Sleeping for 5 seconds...\n");
  ArUtil::sleep(5000);

  ArLog::log(ArLog::Normal, "moveCommandTest: Sending command to MOVE 2000 mm...");
  robot.lock();
  robot.move(2000);
  robot.unlock();
  ArLog::log(ArLog::Normal, "moveCommandTest: Sleeping for 10 seconds...\n");
  ArUtil::sleep(10000);

  ArLog::log(ArLog::Normal, "moveCommandTest: Sending command to MOVE 5000 mm...");
  robot.lock();
  robot.move(5000);
  robot.unlock();
  ArLog::log(ArLog::Normal, "moveCommandTest: Sleeping for 15 seconds...\n");
  ArUtil::sleep(15000);

  ArLog::log(ArLog::Normal, "moveCommandTest: Sending command to MOVE 10000 mm... The robot may ignore this command, since the argument is so large.");
  robot.lock();
  robot.move(10000);
  robot.unlock();
  ArLog::log(ArLog::Normal, "moveCommandTest: Sleeping for 30 seconds...\n");
  ArUtil::sleep(30000);
  
  ArLog::log(ArLog::Normal, "moveCommandTest: Ending robot thread and exiting.");
  robot.stopRunning();
  return 0;
}
