/*

    Since arrays are objects in Java, we can find their length using the object property length. This is different from C/C++, where we find length using sizeof.

    The size of an array must be specified by int or short value and not long.

    The direct superclass of an array type is Object.

    Every array type implements the interfaces Cloneable and java.io.Serializable.

*/

//========Initializing an Array =====================

    int intArray[]; 
    int[] intArray; // both are valid declarations
    //---------------------------------------

    int intArray[];    //declaring array
    intArray = new int[20];  // allocating memory to array
    int[] intArray = new int[20]; // combining both statements in one

//---------------------------------------------------------------

    // an array of references to objects of
    // the class MyClass (a class created by user)
    MyClass myClassArray[]; 

    Object[]  ao,        // array of Object
    Collection[] ca;  // array of Collection
                        // of unknown type

//---------------------------------------------------------------------

