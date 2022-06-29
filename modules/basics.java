/*
MODULES
=======
	~ fundamentally, a module is a grouping of packages and resources that can be collectively referred to by the module's name
	~ a module declaration is contained in a file called 'module-info.java'
	~ the file is compiled by javac into a class file called a 'module descriptor'
	~ a general module declaration form:
			module moduleName {
				//module definition
			}
	~ 'moduleName' must be a valid java identifier or a sequence of identifiers separated by periods
	~ module definition can be empty or typically specify one or more clauses that define the characteristics of the module
	~ module-related keywords are formally called 'restricted keywords'
	~ a good way of naming modules is to use the reverse domain name method where the reverse domain name is used as a prefix i.e.
			victorkuria.com		==> would use ==>		com.victorkuria		==> as the module prefix
	~ the same naming system is passed down to package names
	~ since JDK 9, the Java API packages have been incorporated into modules and referred to as 'platform modules'
			i.e.	java.base, java.desktop, java.xml
	~ java.base is the most important as it includes fundamental packages e.g. java.lang, java.io, java.util
	~ because of its importance, java.base is automatically accessible to all modules
	~ just as java.lang is used without an import statement, java.base is used without explicitly requesting it
	~ to support legacy code, two key features are used; the unnamed module and class path automatic usage
	~ code that is not part of a named module automatically becomes part of the unnamed module
	~ an unnamed module has two essential features;
			+ all packages in the unnamed module are automatically exported
			+ the unnamed module can access any and all other modules
	~ modularizing simple programs adds clutter and complicates code for no reason, use them for commercial programs

EXPORTING TO A SPECIFIC MODULE
==============================
	~ a package can be made accessible to only a specific set of modules (i.e. not all other modules)
	~ to accomplish this, a 'to' clause is added to the exports statement, creating a 'qualified export'
	~ a 'to' clause specifies a list of one or more modules that have access to the exported package i.e.
			exports {package name} to {a comma-separated list of modules};
	~ javac has a form called 'multimodule mode' that enables more than one module to be compiled at a time
	~ 'multimodule mode' utilizes the '--module-source-path' option together with the '-d' option
	~ a qualified export can be misused by malicious code that masquerades as the targeted module
	~ to prevent this, security techniques should be implemented

USING REQUIRES TRANSITIVE
=========================
	~ for three modules A, B and C where A requires B and B requires C, A depends on C indirectly i.e.
			module A {			// here A does not use anything from C
				requires B;
			}

			module B {
				exports {some package};
				requires C;
			}
	~ if A does want to access a type in C, two solutions can be used, one solution is shown below i.e.
			module A {
				requires B;
				requires C;	// simply include this statement to A's file 
			}
	~ the solution is not optimal if B is used by many modules, due to repetition
	~ a better solution is to create an 'implied dependence' or 'implied readability' i.e.
			module B {
				exports {some package};
				requires transitive C; 	// include the 'transitive' keyword
			}
	~ any module depending on B will now automatically depend on C and thus have access to C

	USE SERVICES
	============
	~ separating what must be done from how it is done is accomplished through the use of interfaces
	~ this concept is expanded so that the implementing class is provided by code outside the program, called 'plug-in'
	~ using plugins, the capabilities of an app can be enhanced or upgraded by simply changing the plug-in
	~ the core of the application itself remains unchanged
	~ Java supports pluggable application architecture through the use of 'services' and 'service providers'
	~ a 'service' is a program unit whose functionality is defined by an interface or an abstract class
	~ a concrete implementation of a service is supplied by a 'service provider'
		e.g. service -> language translation, service provider -> specific translation (.e.g Spanish to Urdu)
	~ Service providers are supported by the java.util.ServiceLoader generic class i.e.
			class ServiceLoader<S>		where S represents the service type
	~ Service providers are loaded by the load() method, which has several forms i.e.
			public static <S> ServiceLoader<S> load(Class <S> serviceType)
	~ serviceType specifies the Class object for the desired service type, which is a specified class literal i.e.
			className.class
	~ load() returns a ServiceLoader instance for the application, which is an iterable object
	~ to find a specific provider, you simply search for it using a loop
	~ modules support services through the use of the keywords 'provides', 'uses' and 'with' i.e.
			provides { service type } with { implementation types };
			uses { service type };
	~ service type could be an interface or an abstract class, implementation types could be a comma-separated list
	
	ADDITIONAL MODULE FEATURES
	==========================
	OPEN
	----
	~ by default, the types in a module's packages are accessible only if they are explicitly exported via an exports statement
	~ sometimes, there are situations in which one would need to enable run-time access to all module packages, whether exported or not
	~ this is possible via creating an 'open' module i.e.
			open module moduleName {
				//module definition
			}
	~ packages that are explicitly exported are available at compile time only; the 'open' modifier only affects runtime accessibility
	~ the primary reason for an open module is to enable package access through 'reflection'
	~ Reflection is a feature that lets a program (possibly a third-party library) analyze code at run time
	OPENS
	-----
	~ it's possible to open a specific package for run-time access by other modules and for reflective access rather than opening an entire module
	~ this can be done using the 'opens' statement;
			opens packageName;	// packageName specifies package to open
			opens packageName to moduleName;	//	a 'to' clause can be included to name the modules for which the package is opened
	~ 'opens' doesn't grant compile-time access, only opens a package for run-time and reflective access
	~ an 'opens' statement cannot be used in an open module - all packages in an open module are already open
	REQUIRES STATIC
	---------------
	~ 'requires' specifies a dependence that, by default, is enforced both during compilation and at run time
	~ however, it's possible to relax this requirement in such a way that a module is not required at run time
	~ this is accomplished by the use of a 'requires static' statement i.e.
			requires static mymod;		// specifies mymod is required for compilation, but not at run time
	~ the addition of 'static' makes mymod optional at runtime - a program can utilize functionality if its present, but not require it
	MODULE GRAPHS
	=============
	~ during compilation, the compiler resolves dependence relationships between modules by creating a module graph that represents the dependencies
	~ the process ensures all dependencies are resolved, including those that occur indirectly
*/