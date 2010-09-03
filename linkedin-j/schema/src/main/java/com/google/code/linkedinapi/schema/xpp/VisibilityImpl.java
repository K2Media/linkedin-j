/*
 * Copyright 2010 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */

package com.google.code.linkedinapi.schema.xpp;

import java.io.Serializable;
import com.google.code.linkedinapi.schema.Visibility;
import com.google.code.linkedinapi.schema.VisibilityType;

public class VisibilityImpl
    implements Serializable, Visibility
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected VisibilityType code;

    public VisibilityType getCode() {
        return code;
    }

    public void setCode(VisibilityType value) {
        this.code = value;
    }

}
