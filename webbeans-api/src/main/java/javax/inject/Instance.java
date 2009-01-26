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

package javax.inject;

import java.lang.annotation.Annotation;


/**
 * An interface for looking up web beans of a particular type.
 * 
 * @author Gavin King
 * 
 * @param <T>
 *           the type of the event object
 */

public interface Instance<T>
{
   /**
    * Get an instance of a Web Bean of the specified type.
    * 
    * Additional binding annotations may be specified at the injection point.
    * 
    * @param bindings
    *           Additional binding types
    * @return an instance of a Web Bean of the specified type
    * @throws DuplicateBindingTypeException
    *            if two instances of the same binding type are passed
    * @throws IllegalArgumentException
    *            if an instance of an annotation that is not a binding type is
    *            passed
    * 
    */
   public T get(Annotation... bindings);
}