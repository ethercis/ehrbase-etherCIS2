/*
 * Modifications copyright (C) 2019 Christian Chevalley, Vitasystems GmbH and Hannover Medical School.

 * This file is part of Project EHRbase

 * Copyright (c) 2015 Christian Chevalley
 * This file is part of Project Ethercis
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ehrbase.ehr.encode.wrappers.json.writer.translator_db2raw;

/**
 * Created by christian on 6/22/2017.
 */
public class NodeId {

    String key;

    public NodeId(String theKey) {
        this.key = theKey;
    }

    public String predicate() {
        int closingIndex = key.length();
        if (key.contains(" and name/value"))
            closingIndex = key.indexOf(" and name/value");
        else if (key.contains("]"))
            closingIndex = key.indexOf("]");

        if (key.contains("[") && key.contains("]"))
            return key.substring(key.indexOf("[") + 1, closingIndex);
        return key;
    }
}
