Federated Pub Sub
===========

Example showing how to set up federated exchanges to create a global pub/sub messaging infrastructure that spans
data centers. For example, between your data center and a cloud, or between two Amazon regions (or AZs).

The scripts/s1-rep.sh script can be used to launch the sample. It relies on $REP_PUB_SUB_HOME being set to the root
of the project directory. You will also need the ruby colorize gem for the coloured console output ('gem install colorize').

The scripts are set up to demo brokers federated across Amazon US East and Amazon EU West, but you can of course place the
brokers anywhere you wish. Define amazon.eip.us.east and amazon.eip.eu.west
in /etc/hosts to point to the EIPs of your brokers. Or simply edit the
hostnames in scripts/s1-replicated.conf.

The tmux session is setup with US EAST on the left hand side, and EU WEST on
the right hand side. Publishing processes are at the top, subscribing
processes at the bottom.

Suggested demo flow:

* Start the US EAST publisher (press Enter in the top-left pane).
* Start the US EAST subscriber (press Enter in the bottom-left pane).
  - see messages published in US EAST being received in US EAST
* Start the EU WEST subscriber (press Enter in the bottom-right pane).
  - see that messages published in US EAST are also received in EU WEST
* Start the EU WEST publisher (press Enter in the top-right pane).
  - see that messages published in EU WEST are received in both locations
too


