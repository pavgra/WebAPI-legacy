/*
 * Copyright 2015 fdefalco.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ohdsi.webapi.report;

import java.util.ArrayList;

/**
 *
 * @author fdefalco
 */
public class PackedConceptNode {
  public PackedConceptNode() {
    children = new ArrayList<>();
  }
  
  public String conceptName;
  public long conceptId;
  public long size;
  public ArrayList<PackedConceptNode> children;
  public boolean hasChildren() {
    return children.size() > 0;
  }
}
