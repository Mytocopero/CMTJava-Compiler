#CMTJava

This distribution contains the following files:

* src/test/	Test programs written in CMTJava
	
* src/stm/	CMTJava's transaction support code

* build.sh	Scripts for compiling transaction management code
* test_samples.sh	Script to compile and run the sample programs

##1. REQUIRED SOFTWARE 

 1. Sun's Java(TM) JDK (Java 1.8 or higher)
 2. make

##2. INSTALLATION

First of all, clone the repository or download it as a 
zip file on this [link](https://github.com/rafaelleao/CMTJava/archive/master.zip)


After downloading the files, you can run the installation script (located at the root folder) with this command:

    	$> . ./install.sh

Then you are ready to compile and run CMTJava programs

##3. COMPILE AND RUN THE SAMPLE FILES

In this package, there's a script to compile the sample files. 

To  compile the sample data structures in CMTJava, just run the script "build.sh"

  	$> ./build.sh
    
To test if the sample files are working, execute the "test_samples.sh" script

    	$> ./test_samples.sh

In this script you find a method of execute examples files, after has already generated .class
    
##4. HOW IT WORKS

### COMPILATION
In this folder have a makefile that i suppose compile any program in .cmtjava and generate yours .class, if in own class
its writing is correct. 
Just put this in  folder of files that should be compiled and execute:

	$> make -C ./pathForFolder

To 
compile a file called Foo.cmtjava, you should type:
OBS. pathForClasses is a path to .class of STM classes (./src/stm/)
	
	$> ./compiler/cmtjavac -cp .pathForClasses. Foo.cmtjava

You can also pass arguments to compiler, as we can do with the standard Java compiler.
	
	$> ./compiler/cmtjavac -cp pathForClasses:. -d bin Foo.cmtjava

The CMTJava source files (.cmtjava) are first translated into Java (.java).
Then, these files are compiled with the javac native compiler. 


To generate the code, the CMTJAVA compilation tool will look for the template file (CMTJava.stg) in the folder 

    $CMTJAVAC/CMTJava.stg

### EXECUTION

To run the classes generated, just write the command:

	$> ./cmtjava -cp pathForClasses: Foo


