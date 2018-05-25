/*
   Copyright (c) 2017 TOSHIBA Digital Solutions Corporation

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
package com.toshiba.mwcloud.gs;

/**
 * Represents the type(s) of indexes set on a {@link Container}.
 */
public enum IndexType {

	/**
	 * Indicates a tree index.
	 *
	 * <p>This index type can be applied to following types of Columns of any type of
	 * {@link Container}, except the Column corresponding to the Row key of
	 * TimeSeries.</p>
	 * <ul>
	 * <li>STRING</li>
	 * <li>BOOL</li>
	 * <li>BYTE</li>
	 * <li>SHORT</li>
	 * <li>INTEGER</li>
	 * <li>LONG</li>
	 * <li>FLOAT</li>
	 * <li>DOUBLE</li>
	 * <li>TIMESTAMP</li>
	 * </ul>
	 */
	TREE,

	/**
	 * Indicates a hash index.
	 *
	 * <p>This index type can be set on the following types of Columns in {@link Collection}</p>
	 * <ul>
	 * <li>STRING</li>
	 * <li>BOOL</li>
	 * <li>BYTE</li>
	 * <li>SHORT</li>
	 * <li>INTEGER</li>
	 * <li>LONG</li>
	 * <li>FLOAT</li>
	 * <li>DOUBLE</li>
	 * <li>TIMESTAMP</li>
	 * </ul>
	 * <p>It cannot be set on Columns in {@link TimeSeries}.
	 * </p>
	 */
	HASH,

	/**
	 * Indicates a spatial index.
	 *
	 * TODO
	 * <p>This index type can be applied to only GEOMETRY type of Columns in
	 * {@link Collection}. It cannot be set on Columns in {@link TimeSeries}.
	 * </p>
	 *
	 */
	SPATIAL,

	/**
	 * Indicates the default index type.
	 *
	 * <p>This index type is used when it is necessary to manipulate the index
	 * without specifying a type, and the existing index is classified as another type</p>
	 *
	 */
	DEFAULT

}
