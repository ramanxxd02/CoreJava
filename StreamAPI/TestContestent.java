package in.co.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;

public class TestContestent {
	public static void main(String[] args) {
		List<Contestent>list=new ArrayList<>();
		list.add(new Contestent("Raman","98959692005"));
		list.add(new Contestent("aman","98959692006"));
		list.add(new Contestent("Captain","9895969227"));
		list.add(new Contestent("himanshi","9895969268"));
		list.add(new Contestent("megha","9895969256"));
		list.stream().map(e -> e.phone)
		.filter(e -> e.length() == 10).distinct().collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
			Collections.shuffle(e);
			return e.stream();})).limit(3).forEach(e -> {
				System.out.println("Valid Numbers:"+ e);});
        	
         
        }
	}

