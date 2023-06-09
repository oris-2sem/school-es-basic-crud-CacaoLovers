package ru.itis.api;


import org.springframework.web.bind.annotation.*;
import ru.itis.model.Group;
import ru.itis.model.LessonStudentId;
import ru.itis.model.Task;

import java.util.List;
import java.util.UUID;

@RequestMapping("/api/v1/task")
public interface TaskApi {
    @GetMapping("/{uuid}")
    Task findEntityById(@PathVariable LessonStudentId lessonStudentId);

    @GetMapping("/list")
    List<Task> findAll();

    @PostMapping
    Task createEntity(@RequestBody Task entity);

    @PutMapping
    Task updateEntity(@RequestBody Task entity);

    @DeleteMapping("/{uuid}")
    void deleteEntity(@PathVariable LessonStudentId lessonStudentId);
}
