# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 2.8

#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:

# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list

# Suppress display of executed commands.
$(VERBOSE).SILENT:

# A target that is always out of date.
cmake_force:
.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /usr/bin/cmake

# The command to remove a file.
RM = /usr/bin/cmake -E remove -f

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /home/haquang/fuerte_workspace/sandbox/brl_teleop_controller

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /home/haquang/fuerte_workspace/sandbox/brl_teleop_controller/build

# Utility rule file for test-results.

# Include the progress variables for this target.
include CMakeFiles/test-results.dir/progress.make

CMakeFiles/test-results:
	/opt/ros/fuerte/share/rosunit/bin/summarize_results.py --nodeps brl_teleop_controller

test-results: CMakeFiles/test-results
test-results: CMakeFiles/test-results.dir/build.make
.PHONY : test-results

# Rule to build all files generated by this target.
CMakeFiles/test-results.dir/build: test-results
.PHONY : CMakeFiles/test-results.dir/build

CMakeFiles/test-results.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/test-results.dir/cmake_clean.cmake
.PHONY : CMakeFiles/test-results.dir/clean

CMakeFiles/test-results.dir/depend:
	cd /home/haquang/fuerte_workspace/sandbox/brl_teleop_controller/build && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /home/haquang/fuerte_workspace/sandbox/brl_teleop_controller /home/haquang/fuerte_workspace/sandbox/brl_teleop_controller /home/haquang/fuerte_workspace/sandbox/brl_teleop_controller/build /home/haquang/fuerte_workspace/sandbox/brl_teleop_controller/build /home/haquang/fuerte_workspace/sandbox/brl_teleop_controller/build/CMakeFiles/test-results.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/test-results.dir/depend

