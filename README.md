# File Extension Extractor
A simple Java solution for extracting a file's extension - with or without the dot. This project contains an abstract class with a single argument overloaded method "extractExtension" that returns a files extension - including the dot. This project also contains one child class containing an overloaded method "extract" that will (depending on the arguments) return a file's extension with or without the dot.

<h2>Installation</h2>
<ol>
  <li>Download project's zip</li>
  <li>Compile the project</li>
  <li>Generate jar library</li>
  <li>Add jar as external reference</li>
</ol>

<h2>Motivation</h2>
A previous project I had worked needed the ability to extract a file's extension with or without the dot, so I had created a Java library that facilitates this task and decided to upload the project to Github as a reference or potential library for others.

<h2>Info</h2>
The abstract parent contains a single overloaded method "extractExtension" that returns the full extension - includes the dot portion. The child class contains 3 extra overloaded methods that takes two arguments - the file and a boolean that indicates whether or not to return the file's extension with the dot or not. Both class method's argument can take a Path, File or String path pointing to the file.
