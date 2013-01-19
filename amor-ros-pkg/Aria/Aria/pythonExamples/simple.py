"""
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
"""
from AriaPy import *
import sys

# Global library initialization, just like the C++ API:
Aria.init()

# Create a robot object:
robot = ArRobot()


# Create a "simple connector" object and connect to either the simulator
# or the robot. Unlike the C++ API which takes int and char* pointers, 
# the Python constructor just takes argv as a list.
print "Connecting..."

con = ArSimpleConnector(sys.argv)
if not con.parseArgs():
    con.logOptions()
    Aria.exit(1)

if not con.connectRobot(robot):
    print "Could not connect to robot, exiting"
    Aria.exit(1)


# Run the robot threads in the background:
print "Running..."
robot.runAsync(1)

# Drive the robot a bit, then exit.
robot.lock()
print "Robot position using ArRobot accessor methods: (", robot.getX(), ",", robot.getY(), ",", robot.getTh(), ")"
pose = robot.getPose()
print "Robot position by printing ArPose object: ", pose
print "Robot position using special python-only ArPose members: (", pose.x, ",", pose.y, ",", pose.th, ")"
print "Sending command to move forward 1 meter..."
robot.enableMotors()
robot.move(1000)
robot.unlock()

print "Sleeping for 5 seconds..."
ArUtil.sleep(5000)

robot.lock()
print "Sending command to rotate 90 degrees..."
robot.setHeading(90)
robot.unlock()

print "Sleeping for 5 seconds..."
ArUtil.sleep(5000)

robot.lock()
print "Robot position (", robot.getX(), ",", robot.getY(), ",", robot.getTh(), ")"
pose = robot.getPose()
print "Robot position by printing ArPose object: ", pose
print "Robot position using special python-only ArPose members: (", pose.x, ",", pose.y, ",", pose.th, ")"
robot.unlock()

print "Exiting."
Aria.shutdown()
