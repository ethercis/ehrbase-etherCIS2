/*
 * Copyright (c) 2019 Vitasystems GmbH and Christian Chevalley (Hannover Medical School).
 *
 * This file is part of project EHRbase
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
package org.ehrbase.aql.sql.queryImpl.attribute.ehr;

/**
 * maintain context for EHR attribute and querying
 */
public class EhrSetup {

    private boolean containsEhrId = false;
    private String ehrIdAlias;

    public boolean isContainsEhrId() {
        return containsEhrId;
    }

    public void setContainsEhrId(boolean containsEhrId) {
        this.containsEhrId = containsEhrId;
    }

    public String getEhrIdAlias() {
        return ehrIdAlias;
    }

    public void setEhrIdAlias(String ehrIdAlias) {
        this.ehrIdAlias = ehrIdAlias;
    }
}