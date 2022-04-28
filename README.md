## Library-Api

### *endpoints*

*POST*
* /api/books
 		 Content: {<br>
		 	"title": "string",
			"author": "string",
			"isbn": "string"<br>
		 }
		 Reseponse: CREATED(201)

*PUT*
* /api/books/id
 		 Content: {
		 	"title": "string",
			"author": "string",
			"isbn": "string"
		 }
		 Reseponse: CREATED(200)

*DELETE*
* /api/books/id
		RESPONSE: No Content(204)

*GET*
* /api/books/id
		RESPONSE: No Content(200)

*GET*
* /api/books?title=*param*&author=*param*&isbn=*param*
		RESPONSE: No Content(200)

Comments:
> API created to practice using the JUNIT5 framework
