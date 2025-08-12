# Spring-api
The delete method doesn’t work because of JPA. I know that I can use cascade = CascadeType.REMOVE, but in my point of view this is a bad solution. I would prefer to set the personal data to null. However, since this is just a learning project and the database is currently in H2, I prefer to leave it this way
