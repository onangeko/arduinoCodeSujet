package fr.ubordeaux.arduinoCode.type;

import java.util.Map;
import java.util.Set;

// Type:
// Représentation d'un type simple ou d'un type complexe

//Pour l'instant cet arbre contient:
//- Le code (qu'on trouve dans TypeCode)
//- Sa structure (left, right)
//- Le type (par exemple d'une expression)
//- La ligne et la colonne du code source correspondant


// Pour vérifier un type:
// assertType vérifie que deux types sont égaux ou
// qu'un type soit égal à un type donné

// Cette interface s'utilise avec l'implémentation
// TreeType
//
// Exemple:
// Type type = new TreeType(TypeCode.STRING);

public interface Type {

	enum Tag {
		FIELD, BOOLEAN, LIST, SET, RANGE, STRUCT, STRING, PIN, UINT8_T, 
		UINT16_T, INT16_T, INT32_T, UINT32_T, F32_T, 
		ENUM, INT8_T, FUNCTION, PROCEDURE, FREE};
		
	static Map<Tag, Integer> sizeMap = Map.ofEntries(
			Map.entry(Tag.FREE, -1),
			Map.entry(Tag.BOOLEAN, 1),
			Map.entry(Tag.ENUM, 1),
			Map.entry(Tag.LIST, -1),
			Map.entry(Tag.FIELD, -1),
			Map.entry(Tag.FUNCTION, -1),
			Map.entry(Tag.PROCEDURE, -1),
			Map.entry(Tag.RANGE, -1),
			Map.entry(Tag.SET, -1),
			Map.entry(Tag.STRING, 2),
			Map.entry(Tag.STRUCT, -1),
			Map.entry(Tag.PIN, 1),
			Map.entry(Tag.INT8_T, 1),
			Map.entry(Tag.INT16_T, 2),
			Map.entry(Tag.INT32_T, 4),
			Map.entry(Tag.F32_T, 4),
			Map.entry(Tag.UINT8_T, 1),
			Map.entry(Tag.UINT16_T, 2),
			Map.entry(Tag.UINT32_T, 4)
			);
	
	static Map<Tag, Set<Tag>> equivalenceMap = Map.ofEntries(
			Map.entry(Tag.FREE, Set.of(Tag.BOOLEAN, Tag.ENUM, Tag.FIELD, Tag.FREE, Tag.FUNCTION, 
					Tag.INT16_T, Tag.INT32_T, Tag.PIN, Tag.INT8_T, Tag.LIST, Tag.PROCEDURE,
					Tag.RANGE, Tag.SET, Tag.STRING, Tag.STRUCT, Tag.UINT16_T, Tag.UINT32_T,
					Tag.UINT8_T)),
			Map.entry(Tag.BOOLEAN, Set.of(Tag.FREE)),
			Map.entry(Tag.ENUM, Set.of(Tag.FREE)),
			Map.entry(Tag.LIST, Set.of(Tag.FREE)),
			Map.entry(Tag.FIELD, Set.of(Tag.FREE)),
			Map.entry(Tag.FUNCTION, Set.of(Tag.FREE)),
			Map.entry(Tag.PROCEDURE, Set.of(Tag.FREE)),
			Map.entry(Tag.RANGE, Set.of(Tag.FREE)),
			Map.entry(Tag.SET, Set.of(Tag.FREE)),
			Map.entry(Tag.STRING, Set.of(Tag.FREE)),
			Map.entry(Tag.STRUCT, Set.of(Tag.FREE)),
			Map.entry(Tag.PIN, Set.of(Tag.UINT8_T, Tag.INT8_T, Tag.FREE)),
			Map.entry(Tag.INT8_T, Set.of(Tag.PIN, Tag.UINT8_T, Tag.FREE)),
			Map.entry(Tag.INT16_T, Set.of(Tag.UINT16_T, Tag.FREE)),
			Map.entry(Tag.INT32_T, Set.of(Tag.F32_T, Tag.UINT32_T, Tag.FREE)),
			Map.entry(Tag.F32_T, Set.of(Tag.UINT32_T, Tag.INT32_T, Tag.FREE)),
			Map.entry(Tag.UINT8_T, Set.of(Tag.PIN, Tag.INT8_T, Tag.FREE)),
			Map.entry(Tag.UINT16_T, Set.of(Tag.INT16_T, Tag.FREE)),
			Map.entry(Tag.UINT32_T, Set.of(Tag.F32_T, Tag.INT32_T, Tag.FREE))
			);
	

	Type getLeft();
	Type getRight();
	int getOffset();
	Tag getTag();
	void cast(Tag tag);
	void attestBoolean() throws TypeException;
	void attestEquivalentTo(Type type) throws TypeException;
	int size();
}
