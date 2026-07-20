package com.codegnan.Test;

import java.util.Comparator;

public class BySorted implements Comparator <ComparatorExample>{



@Override
public int compare(ComparatorExample o1, ComparatorExample o2) {
	return o1.name.compareTo(o2.name);
	
}
}
