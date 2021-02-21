package com.b1a9idps.resource;

import com.b1a9idps.dto.request.UserCreateRequest;
import com.b1a9idps.dto.response.UserResponse;
import com.b1a9idps.service.UserService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

    @Inject
    UserService userService;

    @GET
    public List<UserResponse> list(
            @QueryParam("sort") List<String> sortQuery,
            @QueryParam("page") @DefaultValue("0") int pageIndex,
            @QueryParam("size") @DefaultValue("20") int pageSize) {
        return userService.list();
    }

    @GET
    @Path("{id}")
    public UserResponse get(@PathParam("id") Long id) {
        return userService.get(id);
    }

    @POST
    public void create(UserCreateRequest request){
        userService.create(request);
    }

    @DELETE
    @Path("{id}")
    public void delete(@PathParam("id") Long id) {
        userService.delete(id);
    }


}
