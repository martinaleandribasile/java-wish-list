package org.lessons.java.christmas.comparator;

import java.util.Comparator;

public class RegaloComparator implements Comparator<Regalo>{

	@Override
	public int compare(Regalo o1, Regalo o2) {
		return Float.compare(o1.getPrezzo(), o2.getPrezzo());
	}

}
