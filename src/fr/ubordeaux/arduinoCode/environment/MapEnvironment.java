package fr.ubordeaux.arduinoCode.environment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Un environnement qui enregistre 
// un objet de type T pour chaque nom
// par exemple le type de chaque nom de type déclaré
// ou encore une expression variable (ExprVar) pour chaque nom de variable
public class MapEnvironment<T> implements Environment<T> {

	private Map<String, T> map;
	private String name;

	public MapEnvironment(String name) {
		super();
		map = new HashMap<String, T>();
		this.name = name;
	}

	public void put(String id, T t) {
		System.err.println ("*** Add " + id + ":" + t + " in " + this);
		map.put(id, t);
	}

	public void put(List<String> list, T t) {
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext())  {
			String id = iterator.next();
			put(id, t);
		}
	}

	public T get(String id) throws EnvironmentException {
		T t = map.get(id);
		System.err.println ("*** Get " + id + ":" + t + " from " + this);
		if (t==null)
			throw new EnvironmentException(id + " unknown");
		return t;
	}

	@Override
	public String toString() {
		return name;
	}

}
