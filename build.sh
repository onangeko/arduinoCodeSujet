#!/bin/sh
ant parser && ant lexer && ant classes
make "data/test-$1.s" && make "data/test-$1.fuse" && make "data/test-$1.hex"
