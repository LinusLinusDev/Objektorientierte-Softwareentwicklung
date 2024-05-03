## HW1 Excercise 3

Pointer to objects are stored in the stack. They point to their respecting object in the heap. Objects in memory only have a reference to their class and their attributes. 
- Each object's memory consists of a list of its attributes (from own class and inherited), in the order of the highest to lowest class in the hierarchy. 
- Each attribute has a dedicated index. 
- Inherited attributes have the same index in the 
current class as in the super classes. 
- Own attributes follow after all superclass 
attributes

The first index of an object points to their class in the static memory for classes. Those point to a vTable in the static memory for vTables containing an index for each methode of the class (including inherited methodes). These indexes point to their respective method implementations in the static memory for instance method implementations. Inherited methods point to the method implementations from the parent. Overriden Methods instead point to their own method implementations.