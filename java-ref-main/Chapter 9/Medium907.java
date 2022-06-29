/* Chapter 9.7 Focus on Problem Solving

	--> Microsoft Excel, like many commercial applications, has the ability to export data to a text file
	--> when the data in a spreadsheet is exported, each row is written to a line, and the values in the cells are separated
		by commas e.g.
				87,70,23,49,43
				82,33,53,56,28
				23,58,86,87,20
				...
	--> this kind of file format is called the 'comma separated value' file format; and when a spreadsheet is saved in this
		format, Excel saves it to a file with the '.csv' extension
	--> a Java program can read the file using the file input and output classes and can use the string class' 'split' method
		to extract items of data from each line (and maybe a wrapper class to convert the tokens to numeric values)
*/