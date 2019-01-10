package com.example.jerseybinderbug;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.Context;

public class TestFilter implements ContainerResponseFilter {

    private final TestInterface testInterface;


    public TestFilter(@Context TestInterface t) {
        if (t==null){
            throw new IllegalArgumentException("null testinterface, this used to work in jersey 2.25.1");
        }
        this.testInterface = t;

    }

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) {
    }
}
