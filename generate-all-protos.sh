#!/bin/bash

set -e

prototool all proto

prototool generate proto

./generatepb-javascript.sh
