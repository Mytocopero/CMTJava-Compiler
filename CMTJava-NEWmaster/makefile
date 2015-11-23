JCC = $(CMTJAVAC)/cmtjavac

	     #pathForClasses, CLASSES OF CMTJAVA CMTJava~/build 
JFLAGS = -verbose -cp ./build:. -d ./build/


CLASSES = $(wildcard *.cmtjava)


.SUFFIXES: .cmtjava .class

.cmtjava.class:
	$(JCC) $(JFLAGS) $*.cmtjava

.PHONY: all
all: classes

.PHONY: classes
classes: $(CLASSES:.cmtjava=.class)

.PHONY: clean
clean:
	$(RM) *.class
		
