/* Chapter 12.2 - Creating Windows

	--> Swing classes can be used to create windows containing various GUI components
	--> a window is a component, but since it contains other components, it's better considered a 'container'; a container is a component that holds other components and in GUI
		terminology, a container that can be displayed as a window is known as a 'frame'; a frame appears as a basic window that has a border around it, a title bar and a set of
		buttons for minimizing, maximizing and closing the window
	--> in a Swing app, a frame object is created from the JFrame class

*/

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Advanced122 {

	public static void main(String[] sth) throws IOException {
		//new SimpleWindow("Searchings");
		other();
		System.out.println("Breaked");
	}

	public static void other() throws IOException {
		x:	{
			int x = 123_321_123;	//easier number writing, underscores ignored by compiler
			int a, b, c, d, h;
			t:	{
				int y = 011;		//octal
				int z = 0b1100;		//binary
				int i = 0x16;		//hex
				int g = y + i;
				h:	{
					h = a = b = c = d = y;
					int t = System.in.read();
					if (t == 'x')
						break x;
					else
						continue t;
					System.out.printf("%,d\n%d\n%d\n%d\n%d\n\n",x ,y, z, i, t);
				}
			}
			System.out.println(h + " " + a + " " + b + " " + c + " " + d);
		}
	}
}