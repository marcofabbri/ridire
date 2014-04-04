/*******************************************************************************
 * Copyright 2013 Università degli Studi di Firenze
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package it.drwolf.ridire.index.results;

import java.util.Comparator;

public class ItemWithContextRightComparator implements
		Comparator<ItemWithContext> {

	public int compare(ItemWithContext o1, ItemWithContext o2) {
		if (o1 == null || o1.getRightContext() == null) {
			return 1;
		}
		if (o2 == null || o2.getRightContext() == null) {
			return -1;
		}
		return o1.getRightContext().compareTo(o2.getRightContext());
	}

}