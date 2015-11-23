#!/bin/bash

if [ -z "$CMTJAVAC" ]; then
    echo "Please run this command first:"
    echo "$ . ./install.sh" 
    exit 1
fi  

mkdir -p build/

echo "*****************"
echo "Compiling CMTJava"
echo "*****************"
make -C src/stm/

