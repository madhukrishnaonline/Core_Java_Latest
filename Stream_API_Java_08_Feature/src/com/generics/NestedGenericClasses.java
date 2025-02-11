package com.generics;

class Seq<T> {
	T head;
	Seq<T> tail;

	Seq() {
		this(null, null);
	}

	Seq(T head, Seq<T> tail) {
		this.head = head;
		this.tail = tail;
	}

	boolean isEmpty() {
		return tail == null;
	}

	class Zipper<S> {
		Seq<Pair<T, S>> zip(Seq<S> that) {
			if (isEmpty() || that.isEmpty()) {
				return new Seq<>();
			}
			Seq<T>.Zipper<S> tailZipper = tail.new Zipper<>();
			return new Seq<>(new Pair<>(head, that.head), tailZipper.zip(that.tail));
		}
	}
}

class Pair<T, S> {
	T fst;
	S snd;

	Pair(T f, S s) {
		fst = f;
		snd = s;
	}
}

class NestedGenericClasses {
	public static void main(String[] args) {
		Seq<String> strs = new Seq<>("a", new Seq<>("b", new Seq<>()));
		Seq<Number> nums = new Seq<>(1, new Seq<>(1.5, new Seq<>()));

		Seq<String>.Zipper<Number> zipper = strs.new Zipper<Number>();

		Seq<Pair<String, Number>> combined = zipper.zip(nums);
		combined.hashCode();
	}
}
