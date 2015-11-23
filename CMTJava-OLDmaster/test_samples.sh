#!/bin/bash

if [ -z "$CMTJAVAC" ]; then
    echo "Please run this command first:"
    echo "$ . ./install.sh" 
    exit 1
fi  

compiler=$CMTJAVAC/cmtjava
parameters="-ea -cp build"


echo "testig LINKEDBLOCKED"
$compiler $parameters test.LinkedBlockingQueue.Main 2 2


