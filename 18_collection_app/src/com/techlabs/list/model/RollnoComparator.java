package com.techlabs.list.model;

import java.util.Comparator;

public class RollnoComparator implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		
		if(student1.getRoll_no()>student2.getRoll_no())
			return 1;
		if(student1.getRoll_no()<student2.getRoll_no())
			return -1;
		return 0;
	}

}
