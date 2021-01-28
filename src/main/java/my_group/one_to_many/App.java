package my_group.one_to_many;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
	
	
//	Session session = MyConnection.getConnection();
//	Transaction tran = session.beginTransaction();
//	Author author=new Author("Shiv", "Khera");
//	session.persist(author);
	//find existing author. get managed entity of author
	
//	  Author author=(Author) session.get(Author.class, 2280);
//	  System.out.println(author);
//	  System.out.println("Books by "+author.getFirstName()); 
//	  for(Book book:author.getBooks()) 
//		  System.out.println(book);
//	 
	
	
//	  Book book=new Book(); 
//	  book.setTitle("I can win"); 
//	  book.setPrice(205.50f); //
//	  // book.setAuthor(author); 
//	  book.getAuthors().add(author);
//	  session.persist(book);
//
	
    public static void main( String[] args )
    {
     Session session = MYConnection.getSession();
//     Person person = new Person();
//     person.setName("Dhruva");
     Person preson = (Person)session.get(Person.class, 820);
     Address add = new Address();
     add.setCity("Meerut");
     add.setDoorNo("D1");
     add.setState("U.P");
     add.setStreet("Tehsil road");
     add.setPerson(preson);
     Transaction trans = session.beginTransaction();
//     Serializable s = session.save(person);
     session.save(add);
     trans.commit();
     session.close();
     System.out.println();
    }
}
