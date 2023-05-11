#!/bin/bash
gnome-terminal --window --title="RMI: rmiregistry" -- bash -c 'cd server/; rmiregistry; $SHELL'
gnome-terminal --window --title="Server: Main Server" -- bash -c 'sleep 2; cd server/; java Server; $SHELL'
gnome-terminal --window --title="Client: Main Client" -- bash -c 'sleep 2; cd client/; java Client; $SHELL'