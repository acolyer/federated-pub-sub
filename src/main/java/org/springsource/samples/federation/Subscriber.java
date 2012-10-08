package org.springsource.samples.federation;

public class Subscriber {

	private final String regionName;

	public Subscriber(String regionName) {
		this.regionName = regionName;
	}

	public void onMessage(String message) {
		System.out.println(regionName + " received " + message);
	}

}
