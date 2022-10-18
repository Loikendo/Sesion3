package miHexagonal.core.driver_ports;

import miHexagonal.core.domain.Book;
import miHexagonal.core.driven_ports.BookRepository;

public class BookServiceImpl implements BookService{
	
	BookRepository  bookRepository;
	
	public BookServiceImpl(BookRepository bookRepository) {
		this.bookRepository=bookRepository;
	}
	
	public Book getBook(Long id){
		return bookRepository.findById(id);
	}

}
