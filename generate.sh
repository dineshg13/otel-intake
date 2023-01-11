#!/bin/bash
set +x
BASEDIR=$(dirname "$0")
echo $BASEDIR
WORKING_DIR=$BASEDIR

OUTPUT_DIR=src/main/java
mkdir -p $OUTPUT_DIR
for file in `find $WORKING_DIR -type f -iname '*.proto'`
do
    if [[ -f $file ]]; then
      echo "Running file" $file
       protoc -I=$WORKING_DIR  --java_out=$OUTPUT_DIR $file
    fi
done
