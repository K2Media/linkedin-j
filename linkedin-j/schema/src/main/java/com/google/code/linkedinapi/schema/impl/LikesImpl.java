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

package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.google.code.linkedinapi.schema.Adapter1;
import com.google.code.linkedinapi.schema.Like;
import com.google.code.linkedinapi.schema.Likes;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "likeList"
})
@XmlRootElement(name = "likes")
public class LikesImpl
    implements Serializable, Likes
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "like", required = true, type = LikeImpl.class)
    protected List<Like> likeList;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long total;

    public List<Like> getLikeList() {
        if (likeList == null) {
            likeList = new ArrayList<Like>();
        }
        return this.likeList;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long value) {
        this.total = value;
    }

}
