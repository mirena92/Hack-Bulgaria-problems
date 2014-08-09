package com.hackbulgaria.corejava;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Points {

	public static final int ELEMENTS = 1_000;
	public static final int HALF_ELEMENTS = ELEMENTS/2;
	public static final int MAX_COORDINATE = 10_000;
	
	
	public static void main(String[] args) {
		List<Point> generatedPoints = generatePoints();

		long x = System.currentTimeMillis();
		Map<Point, Point> map = getNearestPoints(generatedPoints);
		long y = System.currentTimeMillis();
		System.out.println("Time: " + (y - x));
	}

	public static List<Point> generatePoints() {
		List<Point> points = new ArrayList<>();
		Random random = new Random(MAX_COORDINATE);
		int x;
		int y;

		for (int i = 0; i < ELEMENTS; i++) {
			x = random.nextInt(MAX_COORDINATE);
			y = random.nextInt(MAX_COORDINATE);
			Point p = new Point(x, y);
			points.add(p);
		}
		return points;
	}

	public static Map<Point, Point> getNearestPoints(final List<Point> generatedPoints) {
		final Map<Point, Point> outMap = Collections.synchronizedMap(new HashMap<Point, Point>());
	    
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				doCalculations(generatedPoints, 0, HALF_ELEMENTS, outMap);
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				doCalculations(generatedPoints, HALF_ELEMENTS, ELEMENTS, outMap);
			}
		});
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return outMap;
	}
	
	public static void doCalculations(List<Point> inPoints, int indexFrom, int indexTo, Map<Point, Point> outMap) {
		double minDistance = MAX_COORDINATE;

		for (int i = indexFrom; i < indexTo; i++) {
			Point nearestPoint = new Point();
			Point currentPoint = inPoints.get(i);
			for (int j = 0; j < inPoints.size(); j++) {
				if (i != j) {
					double x = currentPoint.getX() - inPoints.get(j).getX();
					double y = currentPoint.getY() - inPoints.get(j).getY();
					double distance = Math.sqrt(x * x + y * y);
					if (distance < minDistance) {
						minDistance = distance;
						nearestPoint.setLocation(inPoints.get(j));
					}
				}				
			}
			outMap.put(currentPoint, nearestPoint);
		}
	}
}
