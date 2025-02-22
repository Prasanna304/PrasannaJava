package a_intro;
/*
 * There are two types of modifiers in Java: 
 		* access modifiers
 		* non-access modifiers.
 		
 * The access modifiers in Java specifies the accessibility or scope of a field, method, constructor, or class.
 * We can change the access level of fields, constructors, methods, and class by applying the access modifier on it.
 * There are four types of Java access modifiers:
 		* Private: 
 				* The access level of a private modifier is only within the class. 
 				* It cannot be accessed from outside the class.
 				
 		* Default: 
 				* The access level of a default modifier is only within the package.
 				* It cannot be accessed from outside the package. 
 				* If you do not specify any access level, it will be the default.
 				
 		* Protected: 
 				* The access level of a protected modifier is within the package and outside the package through child class. 
 				* If you do not make the child class, it cannot be accessed from outside the package.
 				
 		* Public: 
 				* The access level of a public modifier is everywhere. 
 				* It can be accessed from within the class, outside the class, within the package and outside the package.
 */

/*
 * Understanding Java Access Modifiers
 * Let's understand the access modifiers in Java by a simple table.
 
 * 	Access 		within		within		outside				outside
	Modifier	class		package		package by 			package
										subclass only

	Private		Y			N			N					N
	
	Default		Y			Y			N					N
	
	Protected	Y			Y			Y					N
	
	Public		Y			Y			Y					Y
 * 
*/
