package org.springsource.samples.federation;

public class Publisher {

	private static int msgNo = 1;

	private final String regionName;

	public Publisher(String regionName) {
		System.out.println("Publishing from " + regionName);
		this.regionName = regionName;
	}

	public String createMessage() {
		String msg = "Message " + msgNo++ + " from " + this.regionName;
		System.out.println(this.regionName + " publishing '" + msg + "'");
		return msg;
	}

}
