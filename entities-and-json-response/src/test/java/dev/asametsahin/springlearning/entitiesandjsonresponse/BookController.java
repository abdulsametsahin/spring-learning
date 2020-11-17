package dev.asametsahin.springlearning.entitiesandjsonresponse;

import dev.asametsahin.springlearning.entitiesandjsonresponse.entities.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class BookController {

    @GetMapping
    public Book show() {
        Book book1 = new Book(123, "Abdulsamet Şahin", 99);

        return book1;
    }
}
