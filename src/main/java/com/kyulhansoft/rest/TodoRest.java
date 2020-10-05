package com.kyulhansoft.rest;

import com.kyulhansoft.entity.Todo;
import com.kyulhansoft.service.TodoService;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("todo")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TodoRest {
    
    @Inject
    TodoService todoService;
    
    @Path("new")
    @POST
    public Response create(Todo todo) {
        todoService.create(todo);
        return Response.ok(todo).build();
    }
    
    @Path("update")
    @PUT
    public Response update(Todo todo) {
        todoService.update(todo);
        return Response.ok(todo).build();
    }
    
    @Path("{id}")
    @GET
    public Todo get(@PathParam("id") long id) {
        return todoService.find(id);
    }
    
    @Path("list")
    @GET
    public List<Todo> getTodos() {
        return todoService.getTodos();
    }
    
}
