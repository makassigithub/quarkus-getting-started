package com.makassi;

import java.util.List;
import java.util.Optional;

import org.jboss.logging.Logger;
import org.jboss.logging.annotations.Param;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api/books")
@Produces(MediaType.APPLICATION_JSON)
public class BookResource {

    @Inject
    BookRepository bookRepository;

    @Inject
    Logger logger;

    @GET
    // @Produces(MediaType.TEXT_PLAIN)
    public List<Book> getAllBooks() {
        logger.info("getAllBooks()");
        return bookRepository.getAllBooks();
    }

    @GET
    @Path("/count")
    @Produces(MediaType.TEXT_PLAIN)
    public int getCountBooks() {
        logger.info("getCountBooks()");
        return bookRepository.getCountBooks();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public Optional<Book> getBookById(@PathParam("id") int id) {
        logger.info("getBookById()");
        return bookRepository.getBookById(id);
    }
}
