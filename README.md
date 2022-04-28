## Library-Api

### *endpoints*

*POST*
* /api/books<br>
 		 Content: {<br>
		 	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"title": "string",<br>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"author": "string",<br>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"isbn": "string"<br>
		 }<br>
		 Reseponse: CREATED(201)

*PUT*
* /api/books/id<br>
 		 Content: {<br>
		 	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"title": "string",<br>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"author": "string",<br>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"isbn": "string"<br>
		 }<br>
		 Reseponse: CREATED(200)

*DELETE*
* /api/books/id<br>
		RESPONSE: No Content(204)

*GET*
* /api/books/id<br>
		RESPONSE: No Content(200)

*GET*
* /api/books?title=*param*&author=*param*&isbn=*param*
		RESPONSE: No Content(200)<br><br><br>
		
*BAD REQUEST (400) POST, PUT, DELETE*<br>
 Content: {<br>
 		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"errors": [<br>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"erro"<br>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;]<br>
	  }

*NOT FOUND (404)*
* /api/books/id<br><br><br>

Comments:
> API created to practice using the JUNIT5 framework
