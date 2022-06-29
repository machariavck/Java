/* Chapter 12.1 - Introduction to GUI Applications

	--> in Java, Java Foundation Classes (JFC) are used to create a GUI for an application; within JFC, Abstract Windowing Toolkit (AWT) or Swing classes are used to create a GUI
	--> a GUI is a graphical window or a system of graphical windows presented by an application for interaction with the user; GUIs accept input from the keyboard and mouse
	--> a GUI window commonly consists of several components that present data to the user and/or allow interaction with the application e.g. buttons, labels, check boxes
		label - an area that can display text
		text field - an area in which the user may type a single line of input from the keyboard
		combo box - it is a combination of a list and a text field, thus its name
		check box - a component that has a box that may be checked or unchecked
		list - a list from which the user may select an item
		radio button - a component that can either be selected or deselected, allows the user to select one of several options
		slider - allows the user to select a value by moving a slider along a track
		button - causes an action to occur when it's clicked
	--> the JFC has several sets of classes, many of which are beyond the scope here; the ones of consideration are AWT and Swing classes
	--> the AWT has been present since the earliest version of Java, and has been used to draw graphics and create GUIs; however, AWT classes have a serious limitation where they
		can't actually draw UI components on the screen; instead, they communicate with another layer of software, known as peer classes, which directs the underlying OS to draw
		its own built-in components
	--> each version of Java developed for a particular OS has its own set of peer classes; despite that Java programs would have a look consistent with other apps on the same
		system, it also causes some problems
	--> one problem is that not all OSes offer the same set of GUI components e.g. one OS might provide a sophisticated slider bar component not found on any other platform; in
		order for AWT to retain its portability, it has to offer only those components common to all OSes that support Java
	--> another problem is how components behave across various OSes; a component may behave slightly differently on one OS compared to another; moreso, peer classes for some OSes
		reportedly have bugs
	--> another problem is that AWT components aren't easily customizable as they rely on the appearance and behaviour of the underlying OS components
	--> Swing was then introduced as an improved alternative as very few Swing classes rely on peer classes; instead, Swing draws most of its own components on the screen thus its
		components can have a consistent look and predictable behaviour on any OS (Swing apps can have the look of a specific OS, one chooses from various 'look and feel' themes)
	--> Swing components are easily customized and the Swing library provides many sophisticated components not found in the AWT; AWT components are referred to as 'heavyweight'
		components as they are coupled with their underlying peer classes while Swing components are called 'lightweight components' as very few are coupled with peer classes
	--> programs operating in a GUI environment must be 'event-driven'; an 'event' is an action that takes place within a program e.g. clicking a button; an 'event listener' is an
		object that automatically executes one of its methods when a specific event occurs
	--> for now, Swing classes will be used to create all graphical components for the GUIs; also, some of the AWT classes will be used to determine when events take place in
		the applications; both classes are imported as shown below

*/

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;

public class Advanced121 {
	public static void main(String[] sth) throws IOException {
		int sum = 0;
		int i;
		char ch = 88, ignore;
		
		for (i = 1; ch != 'S'; sum += i++) {
			ch = (char) System.in.read();
			do ignore = (char) System.in.read();
			while (ignore != '\n');
		}
		System.out.println("Sum: " + sum + "\ni: " + i);
	}
}