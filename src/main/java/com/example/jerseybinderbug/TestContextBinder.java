package com.example.jerseybinderbug;

import javax.inject.Singleton;
//import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.internal.inject.AbstractBinder;

class TestContextBinder extends AbstractBinder {

  @Override
  protected void configure() {
    bindAsContract(TestInterfaceImpl.class).to(TestInterface.class).in(Singleton.class);
  }
}
