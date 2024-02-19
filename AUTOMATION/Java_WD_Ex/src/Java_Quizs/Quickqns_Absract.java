package Java_Quizs;

abstract class Writer {
	public static void write() {
		System.out.println("WriterClass");
	}
}

class Author extends Writer {
	public static void write() {
		System.out.println("AutherClass");
	}
}

class Programmer extends Writer {
	public static void write() {
		System.out.println("ProgrammerClass");
	}
}

public class Quickqns_Absract {
	public static void main(String[] args) {
		Writer writer = new Programmer();
		Writer.write();
	}
}
