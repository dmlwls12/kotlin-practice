package com.uijin.todolist.controller

import com.uijin.todolist.service.TodoService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class TodoController(private val todoService: TodoService) {

    @GetMapping("/")
    fun index(model: Model):String{
        model.addAttribute("todos", todoService.getAllTodos())
        return "todo"
    }

    @PostMapping("/add")
    fun add(@RequestParam content: String): String{
        todoService.addTodo(content)
        return "redirect:/"
    }

    @PostMapping("/delete/{id}")
    fun delete(@PathVariable id: Long): String{
        todoService.deleteTodo(id)
        return "redirect:/"
    }
}