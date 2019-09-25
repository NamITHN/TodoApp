package com.hvcg.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Id;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "todoItem")
@Getter
@Setter
public class TodoItem implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "todoId", unique = true, nullable = false)
    private long todoId;

    @Column(name = "todoTitle", unique = true)
    private String todoTitle;

    @Column(name = "todoDescription", unique = true)
    private String todoDescription;

    @Column(name = "todoTime", unique = true)
    private String todoTime;

    public TodoItem() {
        super();
    }

    public TodoItem(long todoId, String todoTitle, String todoDescription, String todoTime) {
        super();
        this.todoId = todoId;
        this.todoTitle = todoTitle;
        this.todoDescription = todoDescription;
        this.todoTime = todoTime;
    }

}
