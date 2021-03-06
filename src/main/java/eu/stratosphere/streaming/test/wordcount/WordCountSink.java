/***********************************************************************************************************************
 *
 * Copyright (C) 2010-2014 by the Stratosphere project (http://stratosphere.eu)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 **********************************************************************************************************************/

package eu.stratosphere.streaming.test.wordcount;

import eu.stratosphere.streaming.api.invokable.UserSinkInvokable;
import eu.stratosphere.types.IntValue;
import eu.stratosphere.types.Record;
import eu.stratosphere.types.StringValue;

public class WordCountSink implements UserSinkInvokable {

	private StringValue word = new StringValue("");
	private IntValue count = new IntValue(1);

	@Override
	public void invoke(Record record) throws Exception {

		record.getFieldInto(0, word);
		record.getFieldInto(1, count);

		System.out.println(word.getValue() + " " + count.getValue());

	}
}
