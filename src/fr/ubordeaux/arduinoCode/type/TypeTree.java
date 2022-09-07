package fr.ubordeaux.arduinoCode.type;

public class TypeTree implements Type {

	private Tag tag;
	protected Type left;
	protected Type right;
	private Object data;
	private int offset;
	
	public TypeTree(Tag tag) {
		this.tag = tag;
	}

	public TypeTree(Tag tag, Type left) {
		this(tag);
		this.left = left;
	}

	public TypeTree(Tag tag, Type left, Type right) {
		this(tag, left);
		this.right = right;
	}

	public TypeTree(Tag tag, String name, Type left) {
		this(tag, left);
		this.data = name;
	}

	public TypeTree(Tag tag, Object data) {
		this(tag);
		this.data = data;
	}

	@Override
	public int getOffset() {
		return offset;
	}

	@Override
	public int size() {
		return sizeMap.get(tag);
	}

	@Override
	public Type getLeft() {
		return left;
	}

	@Override
	public Type getRight() {
		return right;
	}

	@Override
	public Tag getTag() {
		return tag;
	}

	public Object getData() {
		return data;
	}

	@Override
	public void cast(Tag tag) {
		this.tag = tag;
	}

	@Override
	public String toString() {
		return "TypeTree [tag=" + tag + "]";
	}

	@Override
	public void attestEquivalentTo(Type type) throws TypeException {
		System.err.println("Equ? " + this + "~" + type);
		if (	(this.tag != type.getTag())
				&& (!equivalenceMap.containsKey(tag) || !equivalenceMap.get(tag).contains(type.getTag()))) {
			throw new TypeException("types should be equivalent: " + this + "<>" + type);
		}
		if ((tag != Tag.FREE) && (type.getTag() != Tag.FREE)) {
			if (	(left == null && type.getLeft() != null) 
				||	(right == null && type.getRight() != null) 
				||	(right != null && type.getRight() == null)
				||	(left != null && type.getRight() == null)){
				throw new TypeException("types should be not null");
			}
		}
		if (	left != null 
				&& tag != Tag.FREE 
				&& type.getLeft() != null 
				&& type.getTag() != Tag.FREE) {
				left.attestEquivalentTo(type.getLeft());
		}
		if (	right != null 
				&& tag != Tag.FREE 
				&& type.getRight() != null 
				&& type.getTag() != Tag.FREE) {
				right.attestEquivalentTo(type.getRight());
		}
	}

	@Override
	public void attestBoolean() throws TypeException {
		if (tag != Tag.BOOLEAN) {
			throw new TypeException("types should be boolean: ");
		}
	}

}
