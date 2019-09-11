package com.Jocata;

import java.util.Map;
import java.util.stream.Collectors;

public class DuplicatesCharINString {
	public static void main(String[] args) {
		String name = "Welcome";
		System.out.println(name);
		Map<String, Long> collect = name.chars().mapToObj(i -> (char) i)
				.collect(Collectors.groupingBy(Object::toString, Collectors.counting()));
		System.out.println(collect);

	}
}
