/*
 * Copyright 1999-2018 Alibaba Group Holding Ltd.
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
package com.alibaba.nacos.config.server.utils;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.time.FastDateFormat;
/**
 * Time util
 * @author Nacos
 *
 */
public class TimeUtils {

	public static Timestamp getCurrentTime() {
        Date date = new Date();
        return new Timestamp(date.getTime());
    }
	public static void main(String[] args) {
		System.out.println(getCurrentTime().toString());
	}
	
	static public String getCurrentTimeStr() {
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.get(Calendar.HOUR);
        FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss");
        return format.format(c.getTime());
    }
}