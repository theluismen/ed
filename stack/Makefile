./bin/EmptyStackException.class: ./src/EmptyStackException.java
	javac -d . $<
./bin/FullStackException.class: ./src/FullStackException.java
	javac -d . $<

stackExceptions: ./bin/EmptyStackException.class ./bin/FullStackException.class

./bin/StaticStack.class: ./src/StaticStack.java stackExceptions
	javac -d . $<
./bin/StackApp.class: ./src/StackApp.java ./bin/StaticStack.class
	javac -d . $<

run: ./bin/StackApp.class
	java $(basename $<)

clean:
	@ rm -rf bin/*
