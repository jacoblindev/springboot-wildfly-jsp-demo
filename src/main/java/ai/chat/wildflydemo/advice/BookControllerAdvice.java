package ai.chat.wildflydemo.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import ai.chat.wildflydemo.exception.DuplicateBookException;

@ControllerAdvice
public class BookControllerAdvice {
    @ExceptionHandler(value = DuplicateBookException.class)
    public ModelAndView duplicateBookException(DuplicateBookException e) {
        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("ref", e.getBook().getIsbn());
        modelAndView.addObject("object", e.getBook());
        modelAndView.addObject("message", "Cannot add an already existing book");
        modelAndView.setViewName("error-book");
        return modelAndView;
    }
}
