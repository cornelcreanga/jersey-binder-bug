/*
 *
 *    ADOBE CONFIDENTIAL
 *    ___________________
 *
 *    Copyright 2017 Adobe Systems Incorporated
 *    All Rights Reserved.
 *
 *    NOTICE:  All information contained herein is, and remains
 *    the property of Adobe Systems Incorporated and its suppliers,
 *    if any.  The intellectual and technical concepts contained
 *    herein are proprietary to Adobe Systems Incorporated and its
 *    suppliers and are protected by all applicable intellectual property
 *    laws, including trade secret and copyright laws.
 *    Dissemination of this information or reproduction of this material
 *    is strictly forbidden unless prior written permission is obtained
 *    from Adobe Systems Incorporated.
 *
 */
package com.example.jerseybinderbug;

import javax.inject.Singleton;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

class TestContextBinder extends AbstractBinder {

  @Override
  protected void configure() {
    bindAsContract(TestInterfaceImpl.class).to(TestInterface.class).in(Singleton.class);
  }
}
