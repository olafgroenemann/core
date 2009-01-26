/*
 * JBoss, Home of Professional Open Source
 * Copyright 2008, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,  
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package javax.inject.manager;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;

import javax.context.Contextual;

/**
 * The contract between the Web Bean manager and a Web Bean. This interface
 * should not be called directly by the application.
 * 
 * @author Gavin King
 * 
 * @param <T> an API type of the Web Bean
 */
public abstract class Bean<T> implements Contextual<T>
{
   private final Manager manager;

   protected Bean(Manager manager)
   {
      this.manager = manager;
   }

   protected Manager getManager()
   {
      return manager;
   }

   public abstract Set<Type> getTypes();

   public abstract Set<Annotation> getBindings();

   public abstract Class<? extends Annotation> getScopeType();

   public abstract Class<? extends Annotation> getDeploymentType();

   public abstract String getName();

   public abstract boolean isSerializable();

   public abstract boolean isNullable();

   public abstract Set<? extends InjectionPoint> getInjectionPoints();

}