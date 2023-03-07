package ir.webapp.startup.controller.api;

import com.google.gson.Gson;
import ir.webapp.startup.controller.app.TokenController;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/person")
public class PersonApi {

    @GET
    @Path("/getAllPerson/{token}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAll(@PathParam("token") String token){
        if (TokenController.getTokenController().checkToken(token))
            return null;
        else
            return "AccessDenied";
    }


//    @POST
//    @Produces(MediaType.APPLICATION_JSON)
//    public Person save(@FormParam("user") String name, @FormParam("lastname") String family,@FormParam("national-code")String nationalCode){
//        return PersonController.save(name,family,nationalCode);
//    }


//    @GET
//    @Path("/test")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response test(){
//        return Response.ok(PersonController.findAll()).build();
//    }

}
