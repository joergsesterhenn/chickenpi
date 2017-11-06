
## Welcome to chickenpi [![Build Status](https://travis-ci.org/joergsesterhenn/chickenpi.svg?branch=docs)](https://travis-ci.org/joergsesterhenn/chickenpi) ![Quality gate status](https://sonarcloud.io/api/badges/gate?key=de.chickenpi%3Achickenpi)
<img style="float: right;" alt="chickenpi logo" src="https://github.com/joergsesterhenn/chickenpi/raw/master/chickenpi.png" height="200">
Chickenpi is a node.js/raspberry pi chicken coop management solution - currently in inception phase.

# Architecture
<img alt="architecture" src="https://github.com/joergsesterhenn/chickenpi/blob/docs/chickenpi.png" height="400">

# Technology
## Software
### chickenpi-app
* [angular](https://angular.io)
* [angularfire2](https://github.com/angular/angularfire2)
* [socket.io](https://github.com/socketio/socket.io)
* [d3-ng2-service](https://github.com/tomwanzek/d3-ng2-service) 
* [webcam](http://thejackalofjavascript.com/rpi-live-streaming/) (?) 

### chickenpi-server
* [firebase](https://console.firebase.google.com/project/chickenpi-server/overview) hosting and datastore

### cickenpi-client (on raspberry pi)
* [agenda](https://github.com/agenda/agenda) 
* [onoff](https://github.com/fivdi/onoff) 
* [socket.io](https://github.com/socketio/socket.io)
* [firebase-sdk](https://firebase.google.com/support/release-notes/js)

## Hardware
* raspberry pi 2 + edimax USB Wifi dongle
* temperature and humidity sensor DHT22
* motor controller board L98N + servo motor (for coop door)
* 4 relay module (for lights, ...)

_Ideas for later_
* [RFID](http://www.sunspot.co.uk/Projects/RFID/Chickens_RFID.html)
