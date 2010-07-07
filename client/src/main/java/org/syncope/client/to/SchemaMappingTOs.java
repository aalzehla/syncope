/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */
package org.syncope.client.to;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SchemaMappingTOs extends AbstractBaseTO
        implements Iterable<SchemaMappingTO> {

    private List<SchemaMappingTO> mappings;

    public List<SchemaMappingTO> getMappings() {
        if (this.mappings == null) {
            this.mappings = new ArrayList<SchemaMappingTO>();
        }
        return this.mappings;
    }

    public void setMappings(List<SchemaMappingTO> mappings) {
        this.mappings = mappings;
    }

    public boolean addMapping(SchemaMappingTO mapping) {
        if (this.mappings == null) {
            this.mappings = new ArrayList<SchemaMappingTO>();
        }

        return this.mappings.add(mapping);
    }

    public boolean addAllMappings(List<SchemaMappingTO> mappings) {
        if (this.mappings == null) {
            this.mappings = new ArrayList<SchemaMappingTO>();
        }

        return this.mappings.addAll(mappings);
    }

    public boolean removeMapping(SchemaMappingTO mapping) {
        if (this.mappings == null) return true;
        return this.mappings.remove(mapping);
    }

    @Override
    public Iterator<SchemaMappingTO> iterator() {
        if (this.mappings == null) {
            this.mappings = new ArrayList<SchemaMappingTO>();
        }

        return this.mappings.iterator();
    }
}
