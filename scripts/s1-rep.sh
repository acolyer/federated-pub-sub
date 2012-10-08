#!/bin/bash
if [ ${REP_PUB_SUB_HOME+x} ] 
  then tmux -f ${REP_PUB_SUB_HOME}/scripts/s1-replicated.conf attach
  else echo "REP_PUB_SUB_HOME must be set"; exit;
fi
