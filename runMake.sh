#!/bin/bash
step=$1
testString="test^clj^$step"

cd impls/clj/
make step0
cd ../..
make $testString
