package com.generics;

import java.io.Closeable;
import java.io.IOException;
import java.nio.CharBuffer;

interface IoeThrowingSupplier<S> {
	S get();
}

public class MultipleBounds {

	public static <S extends Readable & Closeable, T extends Appendable & Closeable> void copy(
			IoeThrowingSupplier<S> src, IoeThrowingSupplier<T> tgt, int size) throws IOException {

		try (S s = src.get(); T t = tgt.get()) {
			CharBuffer buf = CharBuffer.allocate(size);
			int i = s.read(buf);
			while (i >= 0) {
				buf.flip(); // prepare buffer for writing
				t.append(buf);
				buf.clear(); // prepare buffer for reading
				i = s.read(buf);
			}//while
		}//try resource
	}//copy
}