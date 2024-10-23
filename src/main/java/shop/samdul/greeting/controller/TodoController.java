package shop.samdul.greeting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

import shop.samdul.greeting.entity.TodoEntity;
import shop.samdul.greeting.service.TodoService;

public class TodoController {
    TodoService todoService;

    @GetMapping("/list")
    public List<TodoEntity> list(){
            System.out.println("[Controller]");
            List<TodoEntity> r = todoService.getTodos();
            return r;
    }

    @GetMapping("/todos/{id}")
    public TodoEntity find(@PathVariable Integer id){
            TodoEntity r = todoService.findById(id);
            return r;
    }
    //C

    //R
    
    //U

    //D
    
}
