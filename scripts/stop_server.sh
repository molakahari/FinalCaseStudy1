#!/bin/bash
isExistApp=`pgrep java`
if [[ -n  $isExistApp ]]; then
   /apache-tomcat-9.0.68/bin/catalina.sh stop
fi

