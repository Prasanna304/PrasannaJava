package a_ExceptionHandling;
/*
 * Throwable (c)
  		|
  		|
  		|->	Error (c) (int i = "abc")
  		|		|
  		|		|
  		|		|-> Memory out error(c)
  		|		|
  		|		|
  		|		|-> Linkage error (c)
  		|
  		|
  		|
  		|-> Exception (c) (int i = 1/0)
  				|
  				|
  				|-> Compile time Exception (c)
  				|		|
  				|		|
  				|		|-> File not found Exception
  				|		|
  				|		|-> I/O Exception
  				|		|
  				|		|-> Interrupted Exception
  				|		|
  				|		|-> Etc,..
  				|
  				|
  				|-> Run time Exception (c)
  						|
  						|
  						|-> Arithmetic Exception 
  						|
  						|-> Array Index out of bound
  						|
  						|-> Null pointer Exception 
  				
  				
 */