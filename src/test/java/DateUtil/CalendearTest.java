/**
 * Copyright 2015-2016 Debmalya Jash
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package DateUtil;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author debmalyajash
 *
 */
public class CalendearTest {

	/**
	 * Test method for {@link DateUtil.Calendear#convertTimeStampToYearMonth(long)}.
	 */
	@Test
	public void testConvertTimeStampToYearMonth() {
		long actual = Calendear.convertTimeStampToYearMonth(1485873191000L);
		Assert.assertEquals(201701,actual);
	}
	
	@Test
	public void testGetFirstDayOfMonthEpochTime() {
		long actual = Calendear.getFirstDayOfMonthEpochTime(System.currentTimeMillis());
		System.out.println(actual);
	}

}
