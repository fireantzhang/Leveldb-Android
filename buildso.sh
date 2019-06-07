#!/usr/bin/env bash

ndk-build -B -C ./leveldb/src/main/jni

cp -rv leveldb/src/main/libs/ leveldb/libs