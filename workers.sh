#!/bin/bash
gnome-terminal --window --title="Worker: output" -- bash -c 'cd ../; cd workers/; java Worker; $SHELL'
sleep 10
kill $(pgrep bash)
