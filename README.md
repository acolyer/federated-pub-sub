Federated Pub Sub
===========

Example showing how to set up federated exchanges to create a global pub/sub messaging infrastructure that spans
data centers. For example, between your data center and a cloud, or between two Amazon regions (or AZs).

The scripts/s1-rep.sh script can be used to launch the sample. It relies on $REP_PUB_SUB_HOME being set to the root
of the project directory. You will also need the ruby colorize gem for the coloured console output ('gem install colorize').

The scripts are set up to demo brokers federated across Amazon US East and Amazon EU West, but you can of course place the
brokers anywhere you wish. Change hostname from 'localhost' in scripts/s1-replicated.conf to point at your actual broker
locations. 