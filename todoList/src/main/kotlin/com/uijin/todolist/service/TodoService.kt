package com.uijin.todolist.service

import com.uijin.todolist.domain.Todo
import com.uijin.todolist.repository.TodoRepository
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service


@Service
class TodoService (private val todoRepository: TodoRepository) {

    val logger = LoggerFactory.getLogger(TodoService::class.java)

    fun addTodo(content: String){
        todoRepository.save(Todo(content = content))
        logger.info("=======추가한 내용: $content=======")
    }

    fun getAllTodos(): List<Todo>{
        return todoRepository.findAll()
    }

    fun deleteTodo(id: Long){
        todoRepository.deleteById(id)
        logger.info("--------삭제한 항목: $id---------")
    }
}