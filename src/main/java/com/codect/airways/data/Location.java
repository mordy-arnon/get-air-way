package com.codect.airways.data;

public class Location {

	private static final double EARTH_RADIUS = 6371;
	private double lat;
	private double lon;
	private int h;
	private long time;
	
	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public static double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
	    double lat1Rad = Math.toRadians(lat1);
	    double lat2Rad = Math.toRadians(lat2);
	    double lon1Rad = Math.toRadians(lon1);
	    double lon2Rad = Math.toRadians(lon2);

	    double x = (lon2Rad - lon1Rad) * Math.cos((lat1Rad + lat2Rad) / 2);
	    double y = (lat2Rad - lat1Rad);
	    double distance = Math.sqrt(x * x + y * y) * EARTH_RADIUS;

	    return distance;
	}
}
