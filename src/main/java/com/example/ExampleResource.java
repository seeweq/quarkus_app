package com.example;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import static com.example.Coffee.*;

@Consumes(MediaType.APPLICATION_JSON)
@Path("/coffee")
public class ExampleResource {
    int sugars;
    

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String coffee() {
        return "Hello, you can order your coffee";
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public void Order(Coffee coffee){
        var cup = LATTE;
        switch(cup) {
            case CHIA:
                System.out.println("Chia");
                // code block
                break;
            case AMERICANO:
                System.out.println("Americano");
                // code block
                break;
            case MOCHA:
                System.out.println("Mocha");
                // code block
                break;
            case CAPPUCCINO:
                System.out.println("Cappuccino");
                // code block
                break;
            default:
                System.out.println("Latte");
                // code block
        }



    }

}

