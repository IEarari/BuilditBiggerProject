package com.udacity.gradle.builditbigger.backend;

import com.example.joketeller.Joke;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {
    @ApiMethod(name = "sayHi")
    public MyBean sayHi(@Named("name") String name) {
        Joke TheJoke = new Joke();
        MyBean response = new MyBean();
        response.setData(TheJoke.getJoke());
        return response;
    }

}
