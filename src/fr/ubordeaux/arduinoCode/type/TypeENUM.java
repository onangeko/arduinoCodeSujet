package fr.ubordeaux.arduinoCode.type;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class TypeENUM extends TypeTree {

	private List<String> keys;
	private Map<String, Integer> map = new HashMap<>();

	public TypeENUM(List<String> keys) {
		super(Tag.ENUM);
		this.keys = keys;
		int val = 0;
		for (String key : keys) {
			map.put(key, val++);
		}
	}

	@Override
	public String toString() {
		String result = "enum (";
		boolean first = true;
		for (String key : keys) {
			if (first) first = false; else result += ", ";
			result += key + ":" + map.get(key);
		}
		return result + ")";
	}

}
